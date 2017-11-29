package interfaz;

import clases.Artista;
import clases.Cliente;
import clases.PorDefecto;
import clases.Suscripciones;
import clases.Usuario;
import dataType.DtAlbum;
import dataType.DtArbol;
import dataType.DtArtista;
import dataType.DtCliente;
import dataType.DtListaReproduccionDefecto;
import dataType.DtListaReproduccionPersonalizada;
import dataType.DtPertenece;
import dataType.DtTema;
import java.util.ArrayList;
import java.util.List;

/*
 * @author Leandro
 */

public interface Interfaz {
    // Alta perfil
    public void altaPerfil(DtArtista a);
    public void altaPerfil(DtCliente c);
    // Alta genero
    
    public void altaGenero(String nombreGenero,String nombrePadre);
    public void altaGenero(String nombreGenero);
    
    // Alta album
    
    public boolean verificarArtista(String nick, String nombreAlbum);
    public void altaAlbum(DtAlbum albumNuevo);
    
    // Crear lista de reproduccion
    public void crearListaReproduccion(DtListaReproduccionPersonalizada LR);
    public void crearListaReproduccion(DtListaReproduccionDefecto LR);
    
    // Agregar tema a lista

        /*Lista Personalizada*/
    
    public void agregarTemaListaPersonalizada(DtPertenece listaPropietario,DtPertenece ruta, int numeroCancion);
    public void agregarTemaListaDefecto(DtPertenece listaPropietario,DtPertenece ruta, int numeroCancion);

    // Quitar tema de lista
    
    public void quitarTemaListaPersonalizada(DtPertenece listaPropietario,DtPertenece ruta, int numeroCancion);
    public void quitarTemaListaDefecto(DtPertenece listaPropietario,DtPertenece ruta, int numeroCancion);
    
    // Publicar lista
    
    public void hacerPublica(String nick,String nombreLista);
    
    // Seguir usuario
    
    public void seguirUsuario(String nickCliente,String nickUsuario);
    
    // Dejar de seguir a usuario
    
    public void dejarSeguir(String nickCliente,String nickUsuario);
    
    // Guardar tema/lista/album
    
    public void agregarTemaFavAlbum(String nick, int numeroCancion, String nombreAlbum, String nombreArtista);
    public void agregarAlbumFav(String nick, String nombreAl, String nombreArtista);
    public void agregarListaFavPersonalizada(String nickPropietario, String nombreLista, String nombreUsuario);
    public void agregarListaFavDefecto(String nickPropietario, String nombreLista, String nombreGenero);
    
    // Eliminar tema/lista/album
    
    public ArrayList<DtTema> listarTemaFav(String nick);
    public ArrayList<DtAlbum> listarAlbumFav(String nick);
    public ArrayList<String> listarListasFav(String nick);
    
    public void quitarTemaFavorito(String nick, DtTema t);
    public void quitarAlbumFavorito(String nick, DtPertenece a);
    public void quitarListaFavorito(String nick, DtPertenece lista);
    
    // Consulta de perfil de cliente
    public ArrayList<String> consultarPerfilCliente();
    public DtCliente elegirCliente(String nick); 
    
    // Consulta de perfil de artista
    public ArrayList<String> consultarPerfilArtista();
    public DtArtista elegirArtista(String nick);
    
    // Consulta de album
    
            /* Por Genero */
    public ArrayList<DtPertenece> seleccionarGeneroAlbum(String nombre);                          // Devuelve una lista de DtPertenece
    public DtAlbum seleccionarAlbumGenero(DtPertenece a);
            /* Por Artista */
    public ArrayList<String> consultaAlbumArtista();
    public ArrayList<String> seleccionarArtista(String nick);   
    public DtAlbum seleccionarAlbumArtista(DtPertenece a);
    
    // Consulta de lista de reproduccion
    
              /* Por Genero */
    public ArrayList<String> seleccionarGeneroLR(String nombre);
    public PorDefecto seleccionarListaReproduccion(String nombreGenero,String nombreLista);     // Las listas por defecto no pueden tener el mismo nombre
              /* Por Cliente */
    public ArrayList<String> consultaListaReproduccionCliente();
    public ArrayList<String> seleccionarCliente(String nick);
    
    public DtListaReproduccionPersonalizada seleccionarListaReproduccion(DtPertenece LR);    // Las listas personalizadas pueden tener el mismo nombre pero no pertenecer al mismo cliente
    public DtListaReproduccionDefecto seleccionarListaReproduccionDefecto(DtPertenece LR);
    
    // Funciones usadas en distintos casos
    public ArrayList<String> listarGenero();
    public DtArbol listarArbolGenero();

    public ArrayList<String> listarSeguidos(String nick);

    public ArrayList<String> darTemasFavoritos(String toString);

    public ArrayList<String> darAlbumesFavoritos(String toString);

    public ArrayList<String> darListasFavoritas(String toString);
    
    public ArrayList<String> darTemasAlbum(String toString,String s);

    public boolean verificarCliente(String nick);
    
    public Usuario buscarUsuario(String nickmail);
    
    public void IniciarValores();
    
    public List<Usuario> ListaUsuarios();

    /*Funciones que hicimos al pedo*/
    
/*      public void agregarTemaListaAlbum(DtPertenece listaPropietario,DtPertenece ruta, DtTema tema);
    public ArrayList<String> listarListas(String nick);     // Lista las listas de un cliente
    public ArrayList<String> listarListasGenero(String nombreGenero);
    public ArrayList<String> listarListas();                // Lista las listas de de todos los generos 

*/
    public Artista buscarArtista(String nick);
    
    public Cliente buscarCliente(String nick);

    public ArrayList<Usuario> getUsuarios();
    
    public void altaSuscripcion(String nick, float monto, String tipo);
    
    public ArrayList<Suscripciones> listarSuscripciones(String nick);

    public List<PorDefecto> listarListasGenero(String genero);
    
    public List<String> listarClientes();
}

