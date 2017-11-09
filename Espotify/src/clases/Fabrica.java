package clases;

import interfaz.Interfaz;

/*
 * @author Leandro
 */

public class Fabrica {
    
    static private Fabrica instance = null;
    private Fabrica(){}
    
    public static Fabrica getInstance(){
        if(instance==null){
            instance = new Fabrica();
        }
        return instance;
    }
    
    public Interfaz getInterfaz() {
        Interfaz sistema = new Sistema();
        return sistema;
    }
}
