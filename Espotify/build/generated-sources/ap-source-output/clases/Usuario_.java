package clases;

import clases.Cliente;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-29T21:05:44")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> nick;
    public static volatile SingularAttribute<Usuario, String> foto;
    public static volatile SingularAttribute<Usuario, String> fechaNacimiento;
    public static volatile SingularAttribute<Usuario, String> apellido;
    public static volatile SingularAttribute<Usuario, String> contrasenia;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile ListAttribute<Usuario, Cliente> seguidores;
    public static volatile SingularAttribute<Usuario, String> email;

}