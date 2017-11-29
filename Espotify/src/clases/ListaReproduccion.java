package clases;

import dataType.DtTema;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.Icon;


/*
 * @author Pc
 */
@Entity
@DiscriminatorColumn(name="tipo",discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ListaReproduccion implements Serializable {

    private transient Icon imagen;
    
    @Id 
    @Column (name = "NOMBRE")
    private String nombre;
    
    @ManyToMany(targetEntity = Tema.class)
    @JoinTable(name ="TEMA_LISTA",
            joinColumns=@JoinColumn(name = "ID_LISTA"),
            inverseJoinColumns=@JoinColumn(name = "ID_TEMA"))
    private List temas;

    public Icon getImagen() {
        return imagen;
    }
    
    public ListaReproduccion(){
    }

    public List getTemas() {
        return temas;
    }

    public void setTemas(ArrayList<Tema> temas) {
        this.temas = temas;
    }


    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public ListaReproduccion(String nombre, Icon img) {
        this.nombre = nombre;
        this.temas = new ArrayList<Tema>();
        this.imagen = img;
    }
    
    void quitarTema(DtTema temaQuitar){
        Iterator<Tema> it = temas.iterator();
        Tema p = null;
        boolean encontrado = false;
        while(it.hasNext() && !encontrado){
             p = it.next();
            if(p.getNombre().equals(temaQuitar.getNombre()) && p.getNumeroCancion() == temaQuitar.getNumeroAlbum() && p.getDuracion().equals(temaQuitar.getDuracion()))
                encontrado = true;
        }
        if(p != null && encontrado)
            temas.remove(p);
        else 
            throw new UnsupportedOperationException("No existe el tema que quiere quitar en esta lista.");
    }
    
    public ArrayList<DtTema> darTemas(){
        ArrayList<DtTema> ret = new ArrayList();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
        EntityManager em = emf.createEntityManager();
        Query q= em.createNativeQuery("SELECT * FROM TEMA T, TEMA_LISTA L WHERE T.IDTEMA = L.ID_TEMA AND L.ID_LISTA = '"+ this.nombre +"'", Tema.class);
        List<Tema> l = q.getResultList();
        Iterator<Tema> it = l.iterator();
        while(it.hasNext()){
            Tema tema = (Tema) it.next();
            DtTema nodo = new DtTema(tema.getIdTema(),tema.getNombre(), tema.getNumeroCancion(), tema.getDuracion(), tema.getAlbum().getNombre(),tema.getAlbum().getPropietario().getNombre() );
            ret.add(nodo);
        }
        return ret;
    }
        public Tema buscarTema(DtTema nombreTema){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
        EntityManager em = emf.createEntityManager();
        Query q = em.createNamedQuery("SELECT T FROM TEMA T, TEMA_LISTA L, ALBUM A WHERE L.ID_TEMA = T.IDTEMA AND T.ID_ALBUM = A.ID AND A.NOMBRE = '"+ nombreTema.getAlbum() +"' AND NICK_ARTISTA = '"+ nombreTema.getArtista()  +"'", Tema.class);
        List tt = q.getResultList();
        em.close();
        emf.close();
        Iterator it = tt.iterator();
        if(it.hasNext()){
            Tema ret = (Tema)it.next();
            return ret;
        }else
            return null;
        }
        
    public void setTemaLista(Tema t) {
                    EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
                    EntityManager em = emf.createEntityManager();   
                    em.getTransaction().begin();
                    Query q = em.createNativeQuery("INSERT INTO TEMA_LISTA (ID_LISTA,ID_TEMA) VALUES ('"+ this.nombre +"',"+ t.getIdTema() +")");
                    q.executeUpdate();
                    em.getTransaction().commit();
                    em.close();
                    emf.close();

        this.temas.add(t);
    }

    public void quitarTemaLista(Tema tema) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
                    EntityManager em = emf.createEntityManager();   
                    em.getTransaction().begin();
                    Query q = em.createNativeQuery("DELETE FROM TEMA_LISTA WHERE ID_LISTA = '"+ this.nombre +"' AND ID_TEMA = "+ tema.getIdTema() );
                    q.executeUpdate();
                    em.getTransaction().commit();
                    em.close();
                    emf.close();
        this.temas.remove(tema);
    }
}
