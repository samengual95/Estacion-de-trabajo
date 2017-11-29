package clases;

import clases.Cliente;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-29T12:52:53")
@StaticMetamodel(Suscripciones.class)
public class Suscripciones_ { 

    public static volatile SingularAttribute<Suscripciones, String> fecha;
    public static volatile SingularAttribute<Suscripciones, Cliente> cliente;
    public static volatile SingularAttribute<Suscripciones, String> estado;
    public static volatile SingularAttribute<Suscripciones, String> tipo;
    public static volatile SingularAttribute<Suscripciones, Float> monto;
    public static volatile SingularAttribute<Suscripciones, Integer> idSuscripcion;

}