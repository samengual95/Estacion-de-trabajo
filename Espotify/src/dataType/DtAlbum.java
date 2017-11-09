package dataType;

import java.util.ArrayList;
import javax.swing.Icon;

/*
 *
 * @author Leandro
 */
public class DtAlbum {
    private final String nombre;  
    private final Icon imagen;         // Imagen del album
    private final Integer anioCreacion; 
    private final ArrayList<DtTema> temas; 
    private final String nombreArtista;
    private final ArrayList<String> generos;

    public DtAlbum(String nombre, Integer anioCreacion, ArrayList<DtTema> temas, String nombreArtista,ArrayList<String> gene, Icon img) {
        this.nombre = nombre;
        this.anioCreacion = anioCreacion;
        this.temas = temas;
        this.nombreArtista = nombreArtista;
        this.generos=gene;
        this.imagen = img;
    }
    public Icon getImagen() {
        return imagen;
    }
    public String getNombre() {
        return nombre;
    }
    public Integer getAnioCreacion() {
        return anioCreacion;
    }
    public ArrayList<String> getGeneros() {
        return generos;
    }
    public ArrayList<DtTema> getTemas() {
        return temas;
    }
    public String getNombreArtista() {
        return nombreArtista;
    }

}
