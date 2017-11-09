package dataType;

/*
 * @author Leandro
 */
public class DtPertenece {
    private final String nombre;                      // La palabra 'final' hace que solo se le pueda otorgar un valor el cual permanecera y no podra ser cambiado
    private final String nombrePertenece;             // Puede ser un nombre de artista como un nombre de genero (segun donde se use)
    
    public DtPertenece(String nombre,String nP){
        this.nombre=nombre;
        this.nombrePertenece=nP;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getNombrePertenece(){
        return this.nombrePertenece;
    }
}