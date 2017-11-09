package clases;

import dataType.DtListaReproduccionPersonalizada;
import dataType.DtTema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.Icon;


/*
 * @author Pc
 */
@Entity
@DiscriminatorValue(value="Cliente")
public class Cliente extends Usuario{
    
    @ManyToMany(targetEntity = Usuario.class)
    @JoinTable(name ="CLIENTE_SEGUIDOR",
            joinColumns=@JoinColumn(name = "NICK_CLIENTE"),
            inverseJoinColumns=@JoinColumn(name = "NICK_SEGUIDO"))
    private List<Usuario> seguidos;
    
    @OneToMany (mappedBy = "creador" , targetEntity=Personalizada.class)
    private List<Personalizada> listas;
    
    @OneToMany
    @JoinTable(name ="TEMAS_FAVORITOS",
            joinColumns=@JoinColumn(name = "NICK_CLIENTE"),
            inverseJoinColumns=@JoinColumn(name = "ID_TEMA"))
    private List<Tema> temasFavoritos;
    
    @OneToMany
    @JoinTable(name ="ALBUMES_FAVORITOS",
            joinColumns=@JoinColumn(name = "NICK_CLIENTE"),
            inverseJoinColumns=@JoinColumn(name = "ID_ALBUM"))
    private List<Album> albumesFavoritos;
    
    @OneToMany
    @JoinTable(name ="LISTAS_FAVORITAS",
            joinColumns=@JoinColumn(name = "NICK_CLIENTE"),
            inverseJoinColumns=@JoinColumn(name = "NOMBRE_LISTA"))
    private List<ListaReproduccion> listasFavoritas;
    
    @OneToMany
    @JoinTable(name ="CLIENTE_SUSCRIPCION",
            joinColumns=@JoinColumn(name = "NICK_CLIENTE",referencedColumnName = "NICKNAME"),
            inverseJoinColumns=@JoinColumn(name = "ID_SUSCRIPCION",referencedColumnName = "ID"))
    private List<Suscripciones> suscripciones;
    
    public Cliente(){
    }

    public List<Suscripciones> getSuscripciones() {
        return suscripciones;
    }

    public void setSuscripciones(Suscripciones s) {
        this.suscripciones.add(s);
    }
    
    public Cliente(String nick, String nombre, String apellido, String email, String fechaNacimiento, Icon foto, String pass) {
        super(nick, nombre, apellido, email, fechaNacimiento, foto, pass);
        this.seguidos = new ArrayList<Usuario>();
        this.listasFavoritas = new ArrayList<ListaReproduccion>();
        this.albumesFavoritos = new ArrayList<Album>();
        this.temasFavoritos = new ArrayList<Tema>();
        this.listas = new ArrayList<Personalizada>();
        this.suscripciones = new ArrayList<Suscripciones>();
    }

    ArrayList<String> listarListasReproduccion() {
        ArrayList<String> ret = new ArrayList<>();
        Iterator<Personalizada> it = listas.iterator();
        while(it.hasNext())
            ret.add(it.next().getNombre());
        return ret;
    }

    public List<Usuario> getSeguidos() {
        return seguidos;
    }

    public List<Personalizada> getListas() {
        return listas;
    }

    public List<Tema> getTemasFavoritos() {
        return temasFavoritos;
    }
    
    public void setTemasFavoritos(Tema t){
        Iterator<Tema> it = temasFavoritos.iterator();
        boolean yaEsta = false;
        while(it.hasNext() && !yaEsta){
            Tema tema = it.next();
            if(tema.equals(t))
                yaEsta = true;
        }
        if(!yaEsta){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();   
            em.getTransaction().begin();
            Query q = em.createNativeQuery("INSERT INTO TEMAS_FAVORITOS (NICK_CLIENTE,ID_TEMA) VALUES ('"+ this.getNick() +"',"+ t.getIdTema()+")");
            q.executeUpdate();
            em.getTransaction().commit();
            em.close();
            emf.close();
            temasFavoritos.add(t);
        } else
            throw new UnsupportedOperationException("Ese tema ya estaba en su lista de temas favoritos.");
    }

    public List<Album> getAlbumesFavoritos() {
        return albumesFavoritos;
    }
    
    public void setAlbumesFavoritos(Album al){
        Iterator<Album> it = albumesFavoritos.iterator();
        boolean yaEsta = false;
        while(it.hasNext() && !yaEsta){
            Album album = it.next();
            if(album.equals(al))
                yaEsta = true;
        }
        if(!yaEsta){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();   
            em.getTransaction().begin();
            Query q = em.createNativeQuery("INSERT INTO ALBUMES_FAVORITOS (NICK_CLIENTE,ID_ALBUM) VALUES ('"+ this.getNick() +"',"+ al.getId() +")");
            q.executeUpdate();
            em.getTransaction().commit();
            em.close();
            emf.close();
            albumesFavoritos.add(al);
        }
        else
            throw new UnsupportedOperationException("Ese album ya estaba en su lista de albumes favoritos.");
    }
    
    public void quitarAlbumFavorito(Album al){
        Iterator<Album> it = albumesFavoritos.iterator();
        boolean yaEsta = false;
        while(it.hasNext() && !yaEsta){
            Album album = it.next();
            if(album.equals(al))
                yaEsta = true;
        }
        if(yaEsta)
            albumesFavoritos.remove(al);
        else
            throw new UnsupportedOperationException("Ese album no se encuentra en su lista de albumes favoritos.");
    }

    public List<ListaReproduccion> getListasFavoritas() {
        return listasFavoritas;
    }
    
    public void setListaReproduccionFavorita(ListaReproduccion lis){
        Iterator<ListaReproduccion> it = listasFavoritas.iterator();
        boolean yaEsta = false;
        while(it.hasNext() && !yaEsta){
            ListaReproduccion LR = it.next();
            if(LR.equals(lis))
                yaEsta = true;
        }
        if(!yaEsta){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();   
            em.getTransaction().begin();
            Query q = em.createNativeQuery("INSERT INTO LISTAS_FAVORITAS (NICK_CLIENTE,NOMBRE_LISTA) VALUES ('"+ this.getNick() +"','"+ lis.getNombre() +"')");
            q.executeUpdate();
            em.getTransaction().commit();
            em.close();
            emf.close();
            listasFavoritas.add(lis);
        }else
            throw new UnsupportedOperationException("Esa lista ya estaba en su lista de favoritos.");
    }

    public DtListaReproduccionPersonalizada darLista(String nombre) {
        Iterator<Personalizada> it = listas.iterator();
        Personalizada p = null;
        boolean encontrada = false;
        while(it.hasNext() && !encontrada){
             p = it.next();
            if(p.getNombre().equals(nombre))
                encontrada = true;
        }
        if(p != null && encontrada)
            return p.darInfo();
        else 
            throw new UnsupportedOperationException("No existe la lista perteneciente a ese cliente");
    }

    void setLista(Personalizada nueva) {
        listas.add(nueva);
    }

    void publicarLista(String nombreLista) {
        Iterator<Personalizada> it = listas.iterator();
        Boolean encontrado = false;
        Personalizada p = null;
        while(it.hasNext() && !encontrado){
            p = (Personalizada) it.next();
            if(p != null && p.getNombre().equals(nombreLista))
                encontrado=true;
        }
        if(encontrado && p != null)
            p.setPrivado(false);
        else
            throw new UnsupportedOperationException("Lista no encontrada!"); 
    }

    public ArrayList<String> darSeguidos() {
        ArrayList<String> ret = new ArrayList<String>();
        try {
            Iterator<Usuario> it = seguidos.iterator();
            String tipo;
            while (it.hasNext()) {
                Usuario u = it.next();
                if (u instanceof Artista) {
                    tipo = "Artista";
                } else {
                    tipo = "Cliente";
                }
                ret.add(u.getNick() + " - " + tipo);
            }
            return ret;
        } catch (Exception e){
            return new ArrayList<String>();
        }
        
    }

    public ArrayList<String> darListas() {
        ArrayList<String> ret = new ArrayList<String> ();
        try{
            Iterator<Personalizada> it = listas.iterator();
            while (it.hasNext()) {
                ret.add(it.next().getNombre());
            }
            return ret;
        }catch(Exception e){
            return new ArrayList<String>();
        }
        
        
    }

    public ArrayList<String> darTemasFavoritos() {
        ArrayList<String> ret = new ArrayList<String> ();
        try{
            Iterator<Tema> it = temasFavoritos.iterator();
            while (it.hasNext()) {
                ret.add(it.next().getNombre());
            }
            return ret;
        }catch(Exception e){
            return new ArrayList<String>();
        }
        
    }

    public ArrayList<String> darAlbumesFavoritos() {
        ArrayList<String> ret = new ArrayList<String> ();
        try{
            Iterator<Album> it = albumesFavoritos.iterator();
            while (it.hasNext()) {
                ret.add(it.next().getNombre());
            }
            return ret;
        }catch (Exception e){
            return new ArrayList<String>();
        }
        
    }

    public ArrayList<String> darListasFavoritas() {
        ArrayList<String> ret = new ArrayList<String> ();
        try{
            Iterator<ListaReproduccion> it = listasFavoritas.iterator();
            while (it.hasNext()) {
                ret.add(it.next().getNombre());
            }
            return ret;
        }catch(Exception e){
            return new ArrayList<String>();
        }
        
    }

    void setSeguido(Usuario u) {
        Iterator<Usuario> it = seguidos.iterator();
        Boolean yaExiste=false;
        Usuario s;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
        EntityManager em = emf.createEntityManager(); 
        while(!yaExiste && it.hasNext()){
            s = it.next();
            if(s.getNick().equals(u.getNick()))
                yaExiste = true;
        }
        if(yaExiste)
            throw new UnsupportedOperationException("El cliente ya seguia a ese usuario!");
        else {
            em.getTransaction().begin();
            seguidos.add(u);
            em.getTransaction().commit();
            em.close();
            emf.close();
        }
    }

    boolean comprobarLista(String nombre) {
        Iterator<Personalizada> it = listas.iterator();
        while(it.hasNext()){
            if(nombre.equals(it.next().getNombre())) {
                return true;
            }
        }
        return false;
    }

    void darDeBajaSeguido(Usuario u) {
        Iterator<Usuario> it = seguidos.iterator();
        Boolean encontrado=false;
        Usuario s = null;
        while(!encontrado && it.hasNext()){
            s = it.next();
            if(s.getNick().equals(u.getNick()))
                encontrado = true;
        }
        if(!encontrado)
            throw new UnsupportedOperationException("El usuario no era seguido por ese cliente!");
        else{
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();
            Query q = em.createNativeQuery("DELETE FROM CLIENTE_SEGUIDOR WHERE NICK_CLIENTE = '" + this.getNick()+ "' AND NICK_SEGUIDO = '" + s.getNick() + "'");
            seguidos.remove(s);                                                // Tal vez solo podria ir esta linea de codigo en esta funcion
            
        }
    }

    void quitarTemaLista(String nombreLista, DtTema temaQuitar) {
        Iterator<Personalizada> it = listas.iterator();
        Personalizada p = null;
        boolean encontrada = false;
        while(it.hasNext() && !encontrada){
             p = it.next();
            if(p.getNombre().equals(nombreLista))
                encontrada = true;
        }
        if(p != null && encontrada)
            p.quitarTema(temaQuitar);
        else 
            throw new UnsupportedOperationException("No existe la lista con ese nombre perteneciente a ese cliente");
    }
    
    public ListaReproduccion buscarLista(String nombreLista) {
        ListaReproduccion ret=null;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
        EntityManager em = emf.createEntityManager();
        Query q = em.createNativeQuery("SELECT * FROM LISTAREPRODUCCION WHERE NOMBRE = '"+nombreLista+"'", ListaReproduccion.class);
        List l = q.getResultList();
        em.close();
        emf.close();
        Iterator it = l.iterator();
        if (it.hasNext()){
            ret = (ListaReproduccion) it.next();
            return ret;
        }else
            throw new UnsupportedOperationException("Lista no encontrada.");
        
    }
    
}
    