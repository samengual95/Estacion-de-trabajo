package dataType;

import java.util.ArrayList;
import javax.swing.Icon;

/*
 * @author Leandro
 */
public class DtListaReproduccionPersonalizada extends DtListaReproduccion{
    //private png imagen;
    private final ArrayList<DtTema> temas;
    private final String clienteAutor;
    private final boolean privada;                // true = privada
    
    public DtListaReproduccionPersonalizada(String nombre, ArrayList temas, String clienteAutor, boolean privada, Icon img) {
        super(nombre, img);
        this.temas = temas;
        this.clienteAutor = clienteAutor;
        this.privada=privada;
    }

    public boolean isPrivada() {
        return privada;
    }
    
    public ArrayList<DtTema> getTemas() {
        return temas;
    }

    public String getClienteAutor() {
        return clienteAutor;
    }
    
}
