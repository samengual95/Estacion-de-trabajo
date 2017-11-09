package clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.Icon;

/*
 * @author Pc
 */

@Entity
@DiscriminatorColumn(name="tipo",discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Usuario implements Serializable{
    @Id @Column (name = "NICKNAME")
    private String nick;
    
    @Column (name = "NOMBRE")
    private String nombre;
    
    @Column (name = "APELLIDO")
    private String apellido;
    
    @Column (name = "EMAIL")
    private String email;
    
    @Column (name = "CONTRASEÑA")
    private String contrasenia;
    
    @Column (name = "FECHANACIMIENTO")
    private String fechaNacimiento;
    
    @ManyToMany(targetEntity = Cliente.class)
    private List<Cliente> seguidores;
    
    private transient Icon foto;

    public Usuario(){
    }
    
    public Usuario(String nick, String nombre, String apellido, String email, String fechaNacimiento, Icon foto, String pass) {
        this.nick = nick;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.seguidores = new ArrayList<Cliente>();
        this.foto = foto;
        this.contrasenia = pass;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Icon getFoto() {
        return foto;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<String> darSeguidores() {
        ArrayList<String> ret = new ArrayList();
        try{
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();
            Query q = em.createNativeQuery("SELECT U FROM USUARIO USUARIO U, CLIENTE_SEGUIDOR S WHERE U.NICNAME = NICK_CLIENTE AND NICK_SEGUIDO = '"+ this.nick +"'", Usuario.class);
            List l = q.getResultList();
            Iterator it = l.iterator();
            Usuario u;
            while (it.hasNext()) {
                u= (Usuario) it.next();
                ret.add(u.getNick());
            }
            em.close();
            emf.close();
            return ret;
        } catch ( Exception e){
            return new ArrayList<String>();
        }
        
    }

    public void setSeguidor(Cliente c) {
        Boolean yaExiste = false;
        Cliente cl=null;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
        EntityManager em = emf.createEntityManager();
        Query qq = em.createNativeQuery("SELECT NICK_SEGUIDO FROM CLIENTE_SEGUIDOR WHERE NICK_CLIENTE = '"+ c.getNick() +"' AND NICK_SEGUIDO = '"+ this.nick +"'");
        List<String> asd = qq.getResultList();
        if(!asd.isEmpty())
            yaExiste=true;
        if(!yaExiste){
            em.getTransaction().begin();
            Query q = em.createNativeQuery("INSERT INTO CLIENTE_SEGUIDOR (NICK_CLIENTE, NICK_SEGUIDO)"+ " VALUES ('"+ c.getNick() +"','"+ this.nick +"')");
            q.executeUpdate();
            seguidores.add(c);
            em.getTransaction().commit();
            em.close();
            emf.close();
        }
        else
            throw new UnsupportedOperationException("El usuario ya estaba siendo seguido por el cliente ingresado!");
    }

    public void darDeBajaSeguidor(Cliente c) {                           // Tal vez solo podria ir esta linea de codigo en esta funcion
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query qq = em.createNativeQuery("DELETE FROM CLIENTE_SEGUIDOR WHERE NICK_CLIENTE = '"+ c.getNick() +"' AND NICK_SEGUIDO = '"+ this.nick +"'");
        qq.executeUpdate();
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}