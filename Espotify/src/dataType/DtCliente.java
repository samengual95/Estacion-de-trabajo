package dataType;

import java.util.ArrayList;
import javax.swing.Icon;

/*
 * @author Leandro
 */
public class DtCliente {
    private final String nick;
    private final String pass;
    private final String nombre;
    private final String apellido;
    private final String email;
    private final String fechaNacimiento;
    private final String imagen;
    private final ArrayList<String> seguidores;
    
    private final ArrayList<String> seguidos;
    private final ArrayList<String> albumFavoritos;
    private final ArrayList<String> temaFavoritos;
    private final ArrayList<String> listaFavoritos;
    private final ArrayList<String> listaPropias;

    public DtCliente(String nick, String nombre, String apellido, String email, String fechaNacimiento, String img, ArrayList<String> seguidores, ArrayList<String> seguidos, ArrayList<String> albumFavoritos, ArrayList<String> temaFavoritos, ArrayList<String> listaFavoritos, ArrayList<String> listaPropias, String pass) {
        this.nick = nick;
        this.pass = pass;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.imagen=img;
        this.seguidores = seguidores;
        this.seguidos = seguidos;
        this.albumFavoritos = albumFavoritos;
        this.temaFavoritos = temaFavoritos;
        this.listaFavoritos = listaFavoritos;
        this.listaPropias = listaPropias;
    }
    public DtCliente(String nick, String nombre, String apellido, String email, String fechaNacimiento, String img, String pass){
        this.nick = nick;
        this.pass = pass;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.imagen=img;        
        this.seguidores=null;
        this.seguidos = null;
        this.albumFavoritos = null;
        this.temaFavoritos = null;
        this.listaFavoritos = null;
        this.listaPropias = null;
    }

    public String getPass() {
        return pass;
    }

    public String getImagen() {
        return imagen;
    }
    public String getNick() {
        return nick;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getEmail() {
        return email;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public ArrayList<String> getSeguidores() {
        return seguidores;
    }
    
    public ArrayList<String> getSeguidos() {
        return seguidos;
    }
    public ArrayList<String> getAlbumFavoritos() {
        return albumFavoritos;
    }
    public ArrayList<String> getTemaFavoritos() {
        return temaFavoritos;
    }
    public ArrayList<String> getListaFavoritos() {
        return listaFavoritos;
    }
    public ArrayList<String> getListaPropias() {
        return listaPropias;
    }
}