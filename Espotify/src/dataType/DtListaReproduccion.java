/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataType;

import javax.swing.Icon;

/**
 *
 * @author Santi
 */
public class DtListaReproduccion {
    private final String nombre;
    
    private final Icon imagen;

    public DtListaReproduccion(String nombre, Icon img) {
        this.nombre = nombre;
        this.imagen = img;
    }

    public Icon getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }
    
}
