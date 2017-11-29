package clases;

import dataType.DtAlbum;
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
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.Icon;

/*
 * @author Pc
 */

@Entity
public class Album implements Serializable {
    
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Column (name="NOMBRE")
    private String nombre;
    
    @Column(name = "AÑO_CREACION")
    private int anioCreacion;
   
    @OneToMany(mappedBy="album",targetEntity=Tema.class)
    private List temas;
    
    @ManyToMany(targetEntity = Genero.class)
    @JoinTable(name ="ALBUM_GENERO",
            joinColumns=@JoinColumn(name = "ID_ALBUM"),
            inverseJoinColumns=@JoinColumn(name = "ID_GENERO"))
    private List generos;
    
    @ManyToOne
    @JoinColumn(name="NICK_ARTISTA")
    private Artista propietario;
    
    private transient Icon imagen;
    
    public Album(){
    }
    
    public Album(String nombre, int anioCreacion, ArrayList<Tema> temas, ArrayList<Genero> generos, Artista propietario, Icon img) {
        this.nombre = nombre;
        this.anioCreacion = anioCreacion;
        this.temas = temas;
        this.generos = generos;
        this.propietario = propietario;
        this.imagen = img;
    }

    public Icon getImagen() {
        return imagen;
    }
    
    public Usuario getPropietario() {
        return propietario;
    }
    
    public int getId() {
        return id;
    }
    public void setPropietario(Artista propietario) {
        this.propietario = propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public List getTemas() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
        EntityManager em = emf.createEntityManager();
        Query q = em.createNativeQuery("SELECT * FROM TEMA WHERE ID_ALBUM ="+ this.id , Tema.class);
        List<Tema> ret =  q.getResultList();
        em.close();
        emf.close();
        if(!ret.isEmpty())
            return ret;
        else
            return null;
    }
    
    public ArrayList<String> listarTemas(){
        Iterator<Tema> it = this.getTemas().iterator();
        ArrayList<String> ret = new ArrayList();
        while(it.hasNext())
            ret.add(it.next().getNombre());
        return ret;
    }

    public void setTemas(ArrayList<Tema> temas) {
        this.temas = temas;
    }

    public List getGeneros() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
        EntityManager em = emf.createEntityManager();
        Query q = em.createNativeQuery("SELECT G FROM GENERO G, ALBUM_GENERO A WHERE A.ID = " + this.id + " AND G.ID_GENERO = A.ID_GENERO", Genero.class);
        ArrayList<Genero> ret = (ArrayList<Genero>) q.getResultList();
        em.close();
        emf.close();
        return ret;
    }

    public void setGeneros( ArrayList<Genero> generos) {
        this.generos = generos;
    }

    public Album(String nombre, int anioCreacion,  ArrayList<Tema> temas,  ArrayList<Genero> generos) {
        this.nombre = nombre;
        this.anioCreacion = anioCreacion;
        this.temas = temas;
        this.generos = generos;
    }
    DtAlbum darInfoAlbum() {
        DtAlbum ret = new DtAlbum(this.getNombre(), this.getAnioCreacion(), this.darTemas(), this.getPropietario().getNombre(), this.darGeneros(), this.imagen);
        return ret;
    }
    
    private ArrayList<DtTema> darTemas(){
        ArrayList<DtTema> ret = new ArrayList();
        Iterator<Tema> it = this.getTemas().iterator();
        while(it.hasNext()){
            Tema t = it.next();
            DtTema nodo = new DtTema(t.getIdTema(),t.getNombre(), t.getNumeroCancion(), t.getDuracion(), t.getAlbum().getNombre(),t.getAlbum().getPropietario().getNombre());
            ret.add(nodo);
        }
        return ret;
    }
    private ArrayList<String> darGeneros(){
        ArrayList<String> ret = new ArrayList();
        Iterator<Genero> it = this.getGeneros().iterator();
        while (it.hasNext())
            ret.add(it.next().getNombre());
        return ret;
    }
       public Tema buscarTemaAlbum(int numeroCancion) {
        Iterator<Tema> it = this.getTemas().iterator();
        Tema t = null;
        boolean encontro = false;
        while(it.hasNext() && !encontro){
            t = it.next();
            if (t.getNumeroCancion() == numeroCancion)
                encontro=true;
        }
        if(!encontro)
            throw new UnsupportedOperationException("Tema no encontrado.");
        else
            return t;
    }
       public List<Tema> darTemasAlbum(){
           List<Tema> ret;
           EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
           EntityManager em = emf.createEntityManager();
           Query q = em.createNativeQuery("SELECT * FROM TEMA WHERE ID_ALBUM = " + this.id + "", Tema.class);
           ret = (List<Tema>) q.getResultList();
           em.close();
           emf.close();
           return ret;
       }
}