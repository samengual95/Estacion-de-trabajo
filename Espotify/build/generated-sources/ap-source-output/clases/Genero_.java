package clases;

import clases.Album;
import clases.Genero;
import clases.PorDefecto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-29T21:05:44")
@StaticMetamodel(Genero.class)
public class Genero_ { 

    public static volatile ListAttribute<Genero, PorDefecto> listaPorDefecto;
    public static volatile SingularAttribute<Genero, Genero> padre;
    public static volatile ListAttribute<Genero, Genero> hijos;
    public static volatile SingularAttribute<Genero, Integer> id;
    public static volatile SingularAttribute<Genero, String> nombre;
    public static volatile ListAttribute<Genero, Album> albumes;

}