package clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/*
 * @author Pc
 */

@Entity
public class Tema implements Serializable{
    
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column (name ="IDTEMA")
    private int idTema;
    
    @Column (name="NUMEROCANCION")
    private int numeroCancion;
    @Column (name="NOMBRE")
    private String nombre;
    @Column (name="DURACION")
    private String duracion;
    
    @ManyToOne
    @JoinColumn(name="ID_ALBUM")
    private Album album;
    
    @ManyToMany(targetEntity = ListaReproduccion.class)
    private List<ListaReproduccion> listas;

    public Tema(){
    }
    
    public Tema(String nombre, String duracion, int numeroCancion, Album album) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.numeroCancion = numeroCancion;
        this.album = album;
        this.listas = new ArrayList<ListaReproduccion>();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void asocioar(ListaReproduccion l){
        this.listas.add(l);
    }

    public int getIdTema() {
        return idTema;
    }

    public void setIdTema(int idTema) {
        this.idTema = idTema;
    }

    public List<ListaReproduccion> getListas() {
        return listas;
    }

    public void setListas(List<ListaReproduccion> listas) {
        this.listas = listas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getNumeroCancion() {
        return numeroCancion;
    }

    public void setNumeroCancion(int numeroCancion) {
        this.numeroCancion = numeroCancion;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
    
}
