package clases;

import dataType.DtArbol;
import dataType.DtListaReproduccionDefecto;
import dataType.DtPertenece;
import dataType.DtTema;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;
import javax.persistence.Query;

/*
 * @author Pc
 */

@Entity
public class Genero implements Serializable{
    
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Column (name = "NOMBRE")
    private String nombre;
    
    @OneToMany(targetEntity=Genero.class)
    private List<Genero> hijos;
    
    @ManyToMany(targetEntity = Album.class)
    private List<Album> albumes;
    
    @OneToMany(mappedBy="genero", targetEntity=PorDefecto.class)    
    private List<PorDefecto> listaPorDefecto;
    
    @ManyToOne
    @JoinColumn(name="ID_PADRE")
    private Genero padre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Genero(){
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Genero> hijos) {
        this.hijos = hijos;
    }

    public List getAlbumes() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
        EntityManager em = emf.createEntityManager();
        Query q = em.createNativeQuery("SELECT A FROM ALBUM A, ALBUM_GENERO G WHERE A.ID = ID_ALBUM AND G.ID_GENERO = "+this.id, Album.class);
        ArrayList<Tema> ret = (ArrayList<Tema>) q.getResultList();
        return ret;    
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    public List<PorDefecto> getListaPorDefecto() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
        EntityManager em = emf.createEntityManager();
        Query q = em.createNativeQuery("SELECT * FROM LISTAREPRODUCCION WHERE TIPO = 'PorDefecto' AND GENERO = " + this.id, PorDefecto.class);
        List<PorDefecto> ret = q.getResultList();
        return ret;
    }

    public void setListaPorDefecto(ArrayList<PorDefecto> listaPorDefecto) {
        this.listaPorDefecto = listaPorDefecto;
    }

    public Genero(String nombre) {
        this.nombre = nombre;
        this.hijos = new ArrayList<Genero>();
        this.albumes = new ArrayList<Album>();
        this.listaPorDefecto = new ArrayList<PorDefecto>();
    }

    void agregarGenero(Genero g) {
        this.hijos.add(g);
    }

    public Genero getPadre() {
        return padre;
    }

    public void setPadre(Genero padre) {
        this.padre = padre;
    }

    ArrayList<String> listarListasReproduccion() {
        ArrayList<String> ret = new ArrayList();
        Iterator<PorDefecto> it = this.getListaPorDefecto().iterator();
        while(it.hasNext()){
            ret.add(it.next().getNombre());
        }
        return ret;
    }

    public DtListaReproduccionDefecto darLista(String nombre) {
        Iterator<PorDefecto> it = this.getListaPorDefecto().iterator();
        boolean encontrado = false;
        PorDefecto p = null;
        while(it.hasNext() && !encontrado){
            p = it.next();
            if(p != null && p.getNombre().equals(nombre))
                       encontrado = true;
        }
        if(!encontrado)
            throw new UnsupportedOperationException("No existe la lista perteneciente a ese genero.");
        else
            return p.darInfo();
    }
    
    void setLista(PorDefecto LD){
        listaPorDefecto.add(LD);
    }

    boolean comprobarLista(String nombre) {
        Iterator<PorDefecto> it = this.getListaPorDefecto().iterator();
        while(it.hasNext()){
            if(nombre.equals(it.next().getNombre())) {
                return true;
            }
        }
        return false;
    }

    void asociar(Album nuevo) {
        this.albumes.add(nuevo);
    }

    ArrayList<DtPertenece> listarAlbumesGenero() {
        ArrayList<DtPertenece> ret = new ArrayList();
        Iterator<Album> it = this.getAlbumes().iterator();
        DtPertenece p;
        Album a;
        while(it.hasNext()){
            a = it.next();
            p = new DtPertenece(a.getNombre(), a.getPropietario().getNick());
            ret.add(p);
        }
        return ret;
    }

    public ArrayList<String> darListas() {
        Iterator<PorDefecto> it = this.getListaPorDefecto().iterator();
        ArrayList<String> ret = new ArrayList();
        while(it.hasNext())
            ret.add(it.next().getNombre());
        return ret;
    }

    ArrayList<DtTema> obtenerTemasLista(String nombreLista) {
        Iterator<PorDefecto> it = this.getListaPorDefecto().iterator();
        ArrayList<DtTema> ret = new ArrayList<DtTema>();
        boolean encontrada = false;
        PorDefecto l = null;
        while(it.hasNext() && !encontrada){
            l = it.next();
            if(l.getNombre().equals(nombreLista))
                encontrada = true;
        }
        if(encontrada && l != null)
            return l.darTemas();
        else
            throw new UnsupportedOperationException("Imposible acceder a esa lista.");
    }

    void quitarTemaLista(String nombreLista, DtTema temaQuitar) {
        Iterator<PorDefecto> it = this.getListaPorDefecto().iterator();
        ArrayList<DtTema> ret = new ArrayList<DtTema>();
        boolean encontrada = false;
        PorDefecto l = null;
        while(it.hasNext() && !encontrada){
            l = it.next();
            if(l.getNombre().equals(nombreLista))
                encontrada = true;
        }
        if(encontrada && l != null)
            l.quitarTema(temaQuitar);
        else
            throw new UnsupportedOperationException("Imposible acceder a esa lista.");
    }
    
    public PorDefecto buscarLista(String nombreLista) {   
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
        EntityManager em = emf.createEntityManager();
        Query q = em.createNativeQuery("SELECT * FROM LISTAREPRODUCCION WHERE NOMBRE = '" + nombreLista + "' AND TIPO = 'PorDefecto' AND GENERO = " + this.getId() + "", PorDefecto.class);
        List<PorDefecto> t = q.getResultList();
        if (!t.isEmpty()){
            PorDefecto p;
            Iterator<PorDefecto> it = t.iterator();
            if (it.hasNext()){
                p = (PorDefecto) it.next();
                return p;
            }
        }
        return null;
        /*Iterator<PorDefecto> it = listaPorDefecto.iterator();
        boolean encontro=false;     
        PorDefecto l=null;
        while(it.hasNext() && !encontro){
            l=it.next();
            if(l.getNombre().equals(nombreLista))
                encontro=true;
        }
        if(!encontro)
            throw new UnsupportedOperationException("Lista no encontrada.");
        else
            return l;*/
        
    }

    public DtArbol listarArbolGenero() {
        DtArbol ret = new DtArbol(this.nombre);
        Iterator<Genero> it = this.hijos.iterator();
        while(it.hasNext())
            ret.agregarHijos(it.next().listarArbolGenero());
        return ret;
    }
}

