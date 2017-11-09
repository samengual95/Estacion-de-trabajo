package dataType;

import java.util.ArrayList;
import javax.swing.Icon;

/*
 * @author Leandro
 */
public class DtArtista {
    private final String nick;
    private final String nombre;
    private final String pass;
    private final String apellido;
    private final String email;
    private final String fechaNacimiento;
    private final Icon imagen;
    private final ArrayList<String> seguidores;
    private final ArrayList<String> album;
    
    private final String biografia;
    private final String direccionWeb;

    public DtArtista(String nick, String nombre, String apellido, String email, String fechaNacimiento, ArrayList<String> seguidores, String biografia, String direccionWeb, ArrayList<String> albumes, Icon imagen, String pass) {
        this.nick = nick;
        this.nombre = nombre;
        this.pass = pass;
        this.apellido = apellido;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.imagen=imagen;
        this.seguidores = seguidores;
        this.biografia = biografia;
        this.direccionWeb = direccionWeb;
        this.album = albumes;
    }

    public String getPass() {
        return pass;
    }

    public Icon getImagen() {
        return imagen;
    }

    public ArrayList<String> getAlbum() {
        return album;
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

    public String getBiografia() {
        return biografia;
    }
    public String getDireccionWeb() {
        return direccionWeb;
    }
}
