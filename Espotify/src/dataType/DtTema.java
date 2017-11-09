package dataType;

/*
 * @author Leandro
 */

public class DtTema {
    
    private final Integer idTema;


    private final String nombre;
    private final int numeroAlbum;
    private final String duracion;
    
    private final String album;
    private final String artista;
    
    public DtTema(Integer idTema, String nombre, int numeroAlbum, String duracion, String album, String artista) {
        this.idTema = idTema;
        this.nombre = nombre;
        this.numeroAlbum = numeroAlbum;
        this.duracion = duracion;
        this.album = album;
        this.artista = artista;
    }
    
    public Integer getIdTema() {
        return idTema;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroAlbum() {
        return numeroAlbum;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtista() {
        return artista;
    }

    
}