    package clases;

import dataType.DtListaReproduccionDefecto;
import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.swing.Icon;


/*
 * @author Pc
 */

@Entity
@DiscriminatorValue(value="PorDefecto")
public class PorDefecto extends ListaReproduccion{
    
    @ManyToOne(targetEntity=Genero.class)
    @JoinColumn(name="GENERO")
    private Genero genero;
    
    public PorDefecto(){
    }
    
    public PorDefecto(String nombre,Genero g, Icon img) {
        super(nombre, img);
        this.genero = g;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    DtListaReproduccionDefecto darInfo() {
        return new DtListaReproduccionDefecto(this.getNombre(), this.darTemas(), this.getGenero().getNombre(), this.getImagen());
    }
}