package clases;

import dataType.DtAlbum;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Column;
import javax.persistence.EntityManagerFactory;
import javax.persistence.OneToMany;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.Icon;

/*
 * @author Pc
 */

@Entity
@DiscriminatorValue(value="Artista")
public class Artista extends Usuario{
    @Column(name = "BIOGRAFIA")
    private String biografia;
    @Column (name = "DIRECCIONWEB")
    private  String dirWeb;
    
    @OneToMany(mappedBy="propietario", targetEntity=Album.class)
    private List<Album> albumes;
    
    public Artista(){
    }
    
    public Artista(String nick, String nombre, String apellido, String email, String fechaNacimiento, String biografia, String sitioWeb, String foto, String pass) {
        super(nick, nombre, apellido, email, fechaNacimiento, foto, pass);
        this.biografia=biografia;
        this.dirWeb=sitioWeb;
        this.albumes= new ArrayList<Album>();
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getDirWeb() {
        return dirWeb;
    }

    public void setDirWeb(String dirWeb) {
        this.dirWeb = dirWeb;
    }

    public List getAlbumes() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
        EntityManager em = emf.createEntityManager();
        Query q = em.createNativeQuery("SELECT * FROM ALBUM WHERE NICK_ARTISTA = '"+ this.getNick() +"'", Album.class);
        List<Album> ret = (List<Album>) q.getResultList();
        em.close();
        emf.close();
        return ret;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    void agregarAlbum(Album nuevo) {
        this.albumes.add(nuevo);
    }
    public ArrayList<String> listarAlbumesArtista() {
        ArrayList<String> ret = new ArrayList();
        Iterator<Album> it = this.getAlbumes().iterator();
        Album a;
        while(it.hasNext()){
            a = (Album) it.next();
            ret.add(a.getNombre());
        }
        return ret;
    }

    DtAlbum darAlbum(String nombreAlbum) {
        Album a = buscarAlbum(nombreAlbum);
        if(a != null )
            return a.darInfoAlbum();
        else
            throw new UnsupportedOperationException("No existe el album perteneciente a ese artista"); 
    }
        public Album buscarAlbum(String nombreAl) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();
            Query q = em.createNativeQuery("SELECT * FROM ALBUM WHERE NOMBRE = '"+nombreAl+"'", Album.class);
            List<Album> a = q.getResultList();
            em.close();
            emf.close();
            if(!a.isEmpty()){
                Iterator<Album> it = a.iterator();
                Album al = (Album) it.next();
                return al;
            }
            else
                throw new UnsupportedOperationException("Album no encontrado : "+nombreAl ); 
            
    }
    public ArrayList<String> darAlbumesPublicados() {
        Iterator it = this.getAlbumes().iterator();
        ArrayList<String> ret = new ArrayList();
        Album al;
        while(it.hasNext()){
            al = (Album) it.next();
            ret.add(al.getNombre());        
        }
        return ret;
    }
    
    public ArrayList<String> darNombreAlbumes(){
        ArrayList<String> ret = new ArrayList<>();
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();
            Query query = em.createNativeQuery("SELECT * FROM ALBUM WHERE NICK_ARTISTA = '" + this.getNick() + "'",Album.class);
            List<Album> lista = query.getResultList();
            em.close();
            emf.close();
            Album g = null;
            if(!lista.isEmpty()){
                Iterator<Album> it2 = lista.iterator();
                while(it2.hasNext()){
                   g = (Album) it2.next();
                   ret.add(g.getNombre());
                }
            }else
                return null;
        return ret;
    }
    
}



