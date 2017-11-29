package clases;

import clases.Artista;
import clases.Genero;
import clases.Tema;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-29T12:52:53")
@StaticMetamodel(Album.class)
public class Album_ { 

    public static volatile SingularAttribute<Album, Artista> propietario;
    public static volatile SingularAttribute<Album, Integer> anioCreacion;
    public static volatile ListAttribute<Album, Genero> generos;
    public static volatile SingularAttribute<Album, Integer> id;
    public static volatile ListAttribute<Album, Tema> temas;
    public static volatile SingularAttribute<Album, String> nombre;

}