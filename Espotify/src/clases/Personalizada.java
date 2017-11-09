package clases;

import dataType.DtListaReproduccionPersonalizada;
import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.Icon;


/*
 * @author Pc
 */

@Entity
@DiscriminatorValue(value="Personalizada")
public class Personalizada extends ListaReproduccion {
    
    @ManyToOne
    @JoinColumn(name = "NICK_CREADOR")
    private Cliente creador;
    
    private Boolean privado;            // true = privado

    public Personalizada() {
    }
    
    public Personalizada(String nombre,Cliente c, Boolean priv, Icon img) {
        super(nombre,img);
        this.creador = c;
        this.privado=priv;
    }

    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query q = em.createNativeQuery("UPDATE LISTAREPRODUCCION SET PRIVADO = "+ privado +" WHERE NOMBRE = '"+ this.getNombre() +"'");
        em.getTransaction().commit();
        this.privado = privado;
    }

    public Cliente getCreador() {
        return creador;
    }

    public void setCreador(Cliente creador) {
        this.creador = creador;
    }

    DtListaReproduccionPersonalizada darInfo() {
        DtListaReproduccionPersonalizada ret = new DtListaReproduccionPersonalizada(this.getNombre(), this.darTemas(), this.getCreador().getNick(),this.privado, this.getImagen());
        return ret;
    }
}