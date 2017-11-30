package clases;

import clases.Album;
import clases.ListaReproduccion;
import clases.Personalizada;
import clases.Suscripciones;
import clases.Tema;
import clases.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-29T21:05:44")
@StaticMetamodel(Cliente.class)
public class Cliente_ extends Usuario_ {

    public static volatile ListAttribute<Cliente, Suscripciones> suscripciones;
    public static volatile ListAttribute<Cliente, Album> albumesFavoritos;
    public static volatile ListAttribute<Cliente, Personalizada> listas;
    public static volatile ListAttribute<Cliente, ListaReproduccion> listasFavoritas;
    public static volatile ListAttribute<Cliente, Tema> temasFavoritos;
    public static volatile ListAttribute<Cliente, Usuario> seguidos;

}