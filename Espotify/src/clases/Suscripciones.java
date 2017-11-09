package clases;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Leandro
 */

@Entity
public class Suscripciones implements Serializable{
    
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column (name ="ID")
    private int idSuscripcion;
    
    @Column (name ="ESTADO")
    private String estado;
    
    @Column (name ="FECHA")
    private String fecha;
    
    @Column (name ="MONTO")
    private float monto;
    
    @Column (name ="TIPO")
    private String tipo;
    
    @OneToOne
    @JoinColumn (name="NICK_CLIENTE")
    private Cliente cliente;
    
    public Suscripciones() {
    }

    public Suscripciones(String estado, String fecha, float monto, String tipo,Cliente cli) {
        this.estado = estado;
        this.fecha = fecha;
        this.monto = monto;
        this.tipo = tipo;
        this.cliente = cli;
    }

    public int getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(int idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
