package dataType;

import java.util.ArrayList;
import javax.swing.Icon;

/*
 * @author Leandro
 */
public class DtListaReproduccionDefecto extends DtListaReproduccion{
    //private png imagen;
    private final ArrayList<DtTema> temas;
    
    private final String genero;

    public DtListaReproduccionDefecto(String nombre, ArrayList<DtTema> temas, String genero, Icon img) {
        super(nombre, img);
        this.temas = temas;
        this.genero = genero;
    }
    
    public ArrayList<DtTema> getTemas() {
        return temas;
    }

    public String getGenero() {
        return genero;
    }
}
