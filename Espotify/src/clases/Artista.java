package clases;

import dataType.DtAlbum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
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
    
    private transient String biografia;
    
    private transient String dirWeb;
    
    @OneToMany(mappedBy="propietario", targetEntity=Album.class)
    private List<Album> albumes;
    
    public Artista(){
    }
    
    public Artista(String nick, String nombre, String apellido, String email, String fechaNacimiento, String biografia, String sitioWeb, Icon foto, String pass) {
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
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    void agregarAlbum(Album nuevo) {
        this.albumes.add(nuevo);
    }
    
    ArrayList<String> listarAlbumesArtista() {
        ArrayList<String> ret = new ArrayList();
        Iterator<Album> it = albumes.iterator();
        Album a;
        while(it.hasNext()){
            a = (Album) it.next();
            ret.add(a.getNombre());
        }
        return ret;
    }

    DtAlbum darAlbum(String nombreAlbum) {
        Iterator<Album> it = albumes.iterator();
        boolean parar = false;
        Album a = null;
        while(it.hasNext() && !parar){
            a = it.next();
            if(a!=null && a.getNombre().equals(nombreAlbum))
                parar = true;
        }
        if(a != null && parar)
            return a.darInfoAlbum();
        else
            throw new UnsupportedOperationException("No existe el album perteneciente a ese artista"); 
    }
        public Album buscarAlbum(String nombreAl) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();
            Query q = em.createNativeQuery("SELECT * FROM ALBUM WHERE NOMBRE = '"+nombreAl+"'", Album.class);
            List a = q.getResultList();
            em.close();
            emf.close();
            Iterator it = a.iterator();
            if(it.hasNext())
                return (Album) it.next();
            else
                throw new UnsupportedOperationException("Album no encontrado."); 
            
    }

    ArrayList<String> darAlbumesPublicados() {
        Iterator<Album> it = albumes.iterator();
        ArrayList<String> ret = new ArrayList();
        while(it.hasNext())
            ret.add(it.next().getNombre());
        return ret;
    }
}



