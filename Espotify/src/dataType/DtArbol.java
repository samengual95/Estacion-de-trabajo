package dataType;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leandro
 */
public class DtArbol {
    private String nombre;
    private List<DtArbol> hijos;

    public DtArbol(String nombre) {
        this.nombre = nombre;
        hijos = new ArrayList();
    }

    public DtArbol() {
    }

    public String getNombre() {
        return nombre;
    }

    public List<DtArbol> getHijos() {
        return hijos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHijos(List<DtArbol> hijos) {
        this.hijos = hijos;
    }
    
    public void agregarHijos(DtArbol hijo){
        this.hijos.add(hijo);
    }
}
