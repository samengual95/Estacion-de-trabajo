package clases;

import clases.Album;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-30T09:25:45")
@StaticMetamodel(Artista.class)
public class Artista_ extends Usuario_ {

    public static volatile SingularAttribute<Artista, String> dirWeb;
    public static volatile SingularAttribute<Artista, String> biografia;
    public static volatile ListAttribute<Artista, Album> albumes;

}