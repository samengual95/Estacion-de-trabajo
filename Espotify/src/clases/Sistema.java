package clases;

import dataType.DtAlbum;
import dataType.DtArbol;
import dataType.DtArtista;
import dataType.DtCliente;
import dataType.DtListaReproduccionDefecto;
import dataType.DtListaReproduccionPersonalizada;
import dataType.DtPertenece;
import dataType.DtTema;
import interfaz.Interfaz;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/*
 * @author Leandro
 */

public class Sistema implements Interfaz{
    private ArrayList<Usuario> usuarios; 
    private ArrayList<Genero> generos;
    private ArrayList<Album> albumes;

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Genero> getGeneros() {
        return generos;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }
    
    public Sistema(){
        usuarios = new ArrayList();
        generos = new ArrayList();
        albumes = new ArrayList();
    }

    @Override
    public void altaPerfil(DtArtista a) {
        Usuario ar = buscarUsuario(a.getNick());
        if(ar == null){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            Artista nuevo = new Artista(a.getNick(), a.getNombre(), a.getApellido(), a.getEmail(), a.getFechaNacimiento(), a.getBiografia(), a.getDireccionWeb(), a.getImagen(), a.getPass());
            usuarios.add(nuevo);
            em.persist(nuevo);
//            em.flush();
            em.getTransaction().commit();
            em.close();
            emf.close();
        } else{
            throw new UnsupportedOperationException("El correo ya esta registrado en el sistema,\n por favor cambielo o asegure que lo ingreso correctamente.");
        }
    }

    @Override
    public void altaPerfil(DtCliente c) {
        Usuario cl = buscarUsuario(c.getNick());
        if(cl == null){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            Cliente nuevo=new Cliente(c.getNick(), c.getNombre(), c.getApellido(), c.getEmail(), c.getFechaNacimiento(), c.getImagen(), c.getPass());
            usuarios.add(nuevo);
            em.persist(nuevo);
//            em.flush();
            em.getTransaction().commit();
            em.close();
            emf.close();
        } else{
                throw new UnsupportedOperationException("El nick de usuario ya esta registrado en el sistema,\n por favor cambie su nombre de usuario.");
        }
    }
    
    @Override
    public void altaGenero(String nombreGenero){                                // Esta funcion es para introducir el genero raiz
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("EspotifyPersistence");
        EntityManager em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            Genero g = new Genero("Genero");            
            g.setPadre(null);
            em.persist(g);
            generos.add(g);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
            factory.close();
        }
    }
    
    @Override
    public void altaGenero(String nombreGenero, String nombrePadre) {
        Iterator<Genero> it = generos.iterator();
        Genero g = null;
        boolean yaExiste = false;
        while (it.hasNext() && !yaExiste) {
            g = it.next();
            if (g.getNombre().equals(nombreGenero)) {
                yaExiste = true;
            }
        }
        if (!yaExiste) {
            yaExiste = false;
            //Busca en la base de datos si el genero esta registrado
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();
//            em.getTransaction().begin();
            Query query = em.createNativeQuery("SELECT NOMBRE FROM GENERO WHERE NOMBRE = '" + nombreGenero +"'",Genero.class);
            List<Genero> lista = query.getResultList();
//            em.getTransaction().commit();
            if (!lista.isEmpty()) {
                yaExiste = true;
            } else {
                yaExiste = false;
            }
        }
        if (!yaExiste) {
            it = generos.iterator();
            boolean padre = false;
            while (it.hasNext() && !padre) {
                g = it.next();
                if (g.getNombre().equals(nombrePadre)) {
                    padre = true;
                }
            }
            if (!padre) {
                // Busca el padre en la base de datos
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
                EntityManager em = emf.createEntityManager();
//                em.getTransaction().begin();
                Query query = em.createNativeQuery("SELECT * FROM GENERO WHERE NOMBRE = '" + nombrePadre + "'",Genero.class);
                List<Genero> lista = query.getResultList();
//                em.getTransaction().commit();
                if (!lista.isEmpty()) {
                    Iterator it4 = lista.iterator();
                    padre = true;
                    if(it4.hasNext())
                        g = (Genero) it4.next();
                } else {
                    padre = false;
                }
            }
            if (padre && g != null) {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
                EntityManager em = emf.createEntityManager();
                em.getTransaction().begin();
                Genero nuevo = new Genero(nombreGenero);
                em.persist(nuevo);
                g.agregarGenero(nuevo);
                nuevo.setPadre(g);
//                em.flush();
                em.getTransaction().commit();
                em.close();
                emf.close();
            } else {
                throw new UnsupportedOperationException("El nombre del genero padre no es valido");
            }
        } else {
            throw new UnsupportedOperationException("El genero ingresado ya esta registrado en el sistema.");
        }
    }
    
    @Override
    public void altaAlbum(DtAlbum albumNuevo){
        Artista a = buscarArtista(albumNuevo.getNombreArtista());
        if (a != null){
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = factory.createEntityManager();
            Query q = em.createNativeQuery("SELECT * FROM ALBUM WHERE NOMBRE = '"+ albumNuevo.getNombre()+"' AND NICK_ARTISTA = '"+ a.getNick()+"'", Album.class);
            List esta = q.getResultList();
            if(esta.isEmpty()){
                try{
                    Album nuevo = new Album(albumNuevo.getNombre(),albumNuevo.getAnioCreacion(),null,null,a,albumNuevo.getImagen());
                    em.getTransaction().begin();                    
                    em.persist(nuevo);
                    ArrayList<Tema> nuevos = new ArrayList();
                    Iterator<DtTema> it3 = albumNuevo.getTemas().iterator();
                    DtTema t;
                    while(it3.hasNext()){
                        t = it3.next();
                        Tema tNuevo = new Tema(t.getNombre(),t.getDuracion(),t.getNumeroAlbum(), nuevo);
                        em.persist(tNuevo);
                        nuevos.add(tNuevo);
                    }
                    nuevo.setTemas(nuevos);
                    Iterator<String> it4 = albumNuevo.getGeneros().iterator();
                    ArrayList<Genero> listG = new ArrayList();
                    Genero g;
                    while(it4.hasNext()){
                        g=buscarGenero(it4.next());
                        if(g!=null){
                            g.asociar(nuevo);
                            listG.add(g);
                        }
                    }
                    nuevo.setPropietario(a);
                    nuevo.setGeneros(listG);
                    a.agregarAlbum(nuevo);
                    this.albumes.add(nuevo);
                    em.getTransaction().commit();
                }catch (Exception e) {
                    e.printStackTrace();
                    em.getTransaction().rollback();
                } finally {
                    em.close();
                    factory.close();
                }
                
            }
            else
                throw new UnsupportedOperationException("Ya existe un album con ese nombre en el artista.");
        }
        else
            throw new UnsupportedOperationException("El nick ingresado hace referencia a un cliente.");
    }

    @Override
    public void crearListaReproduccion(DtListaReproduccionPersonalizada LR) {
        Usuario u = buscarUsuario(LR.getClienteAutor());
        if(u instanceof Cliente){
            Cliente c = (Cliente) u;
            if(!(c.comprobarLista(LR.getNombre()))){
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
                EntityManager em = emf.createEntityManager();
                Personalizada nueva = new Personalizada(LR.getNombre(),c, LR.isPrivada(), LR.getImagen());
                em.getTransaction().begin();
                nueva.setCreador(c);
                c.setLista(nueva);                                
                em.persist(nueva);
                em.getTransaction().commit();
                em.close();
                emf.close();
            } else
                throw new UnsupportedOperationException("La lista ya existe!"); 
        } else
            throw new UnsupportedOperationException("El nick pertenece a un artista!"); 
    }

    @Override
    public void crearListaReproduccion(DtListaReproduccionDefecto LR) {
        Genero g = buscarGenero(LR.getGenero());
        if (g!=null){
            if (!(g.comprobarLista(LR.getNombre()))) {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
                EntityManager em = emf.createEntityManager();
                PorDefecto nueva = new PorDefecto(LR.getNombre(),g, LR.getImagen());
                em.getTransaction().begin();
                nueva.setGenero(g);
                g.setLista(nueva);
                em.persist(nueva);
                em.getTransaction().commit();
                em.close();
                emf.close();
            } else
                throw new UnsupportedOperationException("Ya existe una lista perteneciente a ese genero!");
        }
    } 

    @Override
    public void agregarTemaListaPersonalizada(DtPertenece listaPropietario, DtPertenece ruta, int numeroCancion) {
        Usuario u = buscarUsuario(listaPropietario.getNombrePertenece());
        if(u instanceof Cliente){
            Cliente c = (Cliente) u;
            ListaReproduccion l = c.buscarLista(listaPropietario.getNombre());
            if(l instanceof Personalizada){
                Personalizada p = (Personalizada) l;
                Usuario u2 = buscarUsuario(ruta.getNombrePertenece());
                if(u2 instanceof Artista){
                    EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
                    EntityManager em = emf.createEntityManager();                    
                    Artista a = (Artista) u2;
                    Album al = a.buscarAlbum(ruta.getNombre());
                    Tema t = al.buscarTemaAlbum(numeroCancion);
                    em.getTransaction().begin();                    
                    t.asocioar(p);
                    p.setTemaLista(t);
                    em.getTransaction().commit();
                    em.close();
                    emf.close();
                }else
                    throw new UnsupportedOperationException("El nick pertenece es de un cliente!");
            }else
                throw new UnsupportedOperationException("Error incorrecto!");
        }else
            throw new UnsupportedOperationException("El nick de propietario es de un artista!");
    }

    @Override
    public void agregarTemaListaDefecto(DtPertenece listaPropietario,DtPertenece ruta, int numeroCancion) {
        Genero g = buscarGenero(listaPropietario.getNombrePertenece());
        ListaReproduccion LR = g.buscarLista(listaPropietario.getNombre());
        if(LR instanceof PorDefecto){
            PorDefecto p = (PorDefecto) LR;
            Usuario u = buscarUsuario(ruta.getNombrePertenece());
            if(u instanceof Artista){
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
                EntityManager em = emf.createEntityManager();
                Artista a = (Artista) u;
                Album al = a.buscarAlbum(ruta.getNombre());
                Tema t = al.buscarTemaAlbum(numeroCancion);
                em.getTransaction().begin();
                t.asocioar(p);
                p.setTemaLista(t);
                em.getTransaction().commit();
                em.close();
                emf.close();
            }else
                throw new UnsupportedOperationException("El nick pertenece es de un cliente!");
        }else
            throw new UnsupportedOperationException("Error incorrecto!");
    }
    
    @Override
    public void quitarTemaListaPersonalizada(DtPertenece listaPropietario,DtPertenece ruta, int numeroCancion){
        Usuario u = buscarUsuario(listaPropietario.getNombrePertenece());
        if(u instanceof Cliente){
            Cliente c = (Cliente) u;
            ListaReproduccion l = c.buscarLista(listaPropietario.getNombre());
            if(l instanceof Personalizada){
                Usuario u2 = buscarUsuario(ruta.getNombrePertenece());
                if(u2 instanceof Artista){
                    Artista a = (Artista) u2;
                    Album al = a.buscarAlbum(ruta.getNombre());
                    l.quitarTemaLista(al.buscarTemaAlbum(numeroCancion));
                }else
                    throw new UnsupportedOperationException("El nick pertenece es de un cliente!");
            }else
                throw new UnsupportedOperationException("Error incorrecto!");
        }else
            throw new UnsupportedOperationException("El nick de propietario es de un artista!");
    }
    
    @Override
    public void quitarTemaListaDefecto(DtPertenece listaPropietario,DtPertenece ruta, int numeroCancion){
        Genero g = buscarGenero(listaPropietario.getNombrePertenece());
        ListaReproduccion LR = g.buscarLista(listaPropietario.getNombre());
        if(LR instanceof PorDefecto){
            Usuario u = buscarUsuario(ruta.getNombrePertenece());
            if(u instanceof Artista){
                Artista a = (Artista) u;
                Album al = a.buscarAlbum(ruta.getNombre());
                LR.quitarTemaLista(al.buscarTemaAlbum(numeroCancion));
            }else
                throw new UnsupportedOperationException("El nick pertenece es de un cliente!");
        }else
            throw new UnsupportedOperationException("Error incorrecto!");
    }
    
    @Override
    public void hacerPublica(String nick, String nombreLista) {
        Iterator<Usuario> it = usuarios.iterator();
        Boolean encontrado = false;
        Usuario u;
        Cliente c = null;
        while(it.hasNext() && !encontrado){
            u =  it.next();
            if(u instanceof Cliente){
                c = (Cliente) u;
                if(c.getNick().equals(nick))
                    encontrado=true;
            }
        }
        if(encontrado && c != null)
            c.publicarLista(nombreLista);
        else
            throw new UnsupportedOperationException("Cliente no encontrado!"); 
    }

    @Override
    public void seguirUsuario(String nickCliente, String nickUsuario) {
        Usuario u = buscarUsuario(nickCliente);
        if(u instanceof Cliente){      
            Cliente c = (Cliente) u;
            Usuario l = buscarUsuario(nickUsuario);
            //c.setSeguido(l);
            l.setSeguidor(c);
        } else
            throw new UnsupportedOperationException("El nick de cliente que realizara el seguimiento\n     corresponde a un nick de artista!"); 
    }

    @Override
    public void dejarSeguir(String nickCliente, String nickUsuario) {
        Usuario u = buscarUsuario(nickCliente);
        if(u instanceof Cliente){
            Cliente c = (Cliente) u;
            u = buscarUsuario(nickUsuario);
            c.darDeBajaSeguido(u);
            u.darDeBajaSeguidor(c);
        }else
            throw new UnsupportedOperationException("El nick ingresado no hace referencia a un cliente!"); 
    }

    @Override
    public ArrayList<String> consultarPerfilCliente() {
        ArrayList<String> ret = new ArrayList();
        Iterator<Usuario> it = usuarios.iterator();
        Usuario u;
        while(it.hasNext()){
            u = it.next();
            if(u instanceof Cliente){
                Cliente c = (Cliente) u;
                ret.add(c.getNick());
            }
        }
        return ret;
    }

    @Override
    public DtCliente elegirCliente(String nick) {
        Usuario u = buscarUsuario(nick);
        if(u instanceof Cliente){
            Cliente c = (Cliente) u;
            ArrayList<String> seguidores, seguidos, albumFavoritos, temaFavoritos, listaFavoritos, listaPropias;
            seguidores = c.darSeguidores();
            seguidos = c.darSeguidos();
            albumFavoritos = c.darAlbumesFavoritos();
            temaFavoritos = c.darTemasFavoritos();
            listaFavoritos = c.darListasFavoritas();
            listaPropias = c.darListas();
            DtCliente ret = new DtCliente(c.getNick(), c.getNombre(), c.getApellido(), c.getEmail(), c.getFechaNacimiento(), c.getFoto(), seguidores, seguidos, albumFavoritos, temaFavoritos, listaFavoritos, listaPropias, c.getContrasenia());
            return ret;
        }
        else
            throw new UnsupportedOperationException("El nick ingresado hace referencia a un perfil de artista."); 
    }

    @Override
    public ArrayList<String> consultarPerfilArtista() {
        ArrayList<String> ret = new ArrayList();
        Iterator<Usuario> it = usuarios.iterator();
        Artista a;
        Usuario u;
        while(it.hasNext()){
            u = it.next();
            if(u instanceof Artista){
                a = (Artista) u;
                ret.add(a.getNick());
            }
        }
        return ret;
    }

    @Override
    public DtArtista elegirArtista(String nick) {
        Usuario u = buscarUsuario(nick);
        if(u instanceof Artista){
            Artista a = (Artista) u;
            return new DtArtista(a.getNick(), a.getNombre(), a.getApellido(), a.getEmail(), a.getFechaNacimiento(), a.darSeguidores(), a.getBiografia(), a.getDirWeb(), a.darAlbumesPublicados(), a.getFoto(), a.getContrasenia());
        }else
            throw new UnsupportedOperationException("El nick ingresado hace referencia a un perfil de cliente."); 
    }

    @Override
    public ArrayList<DtPertenece> seleccionarGeneroAlbum(String nombre) {
        Iterator<Genero> it = generos.iterator();
        boolean encontrado = false;
        Genero g = null;
        while(it.hasNext() && !encontrado){
            g = (Genero) it.next();
            if(g!=null && g.getNombre().equals(nombre))
                encontrado=true;
        }
        if(g == null || !encontrado)
            throw new UnsupportedOperationException("No existe un genero correspondiente al nombre ingresado.");
        else 
            return g.listarAlbumesGenero();
    }
    
    @Override
    public DtAlbum seleccionarAlbumGenero(DtPertenece al){
        Genero g = buscarGenero(al.getNombrePertenece());
        if (g!=null){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();
            Query q = em.createNativeQuery("SELECT A FROM ALBUM A, ALBUM_GENERO B, GENERO G WHWRE A.NOMBRE = '"+ al.getNombre() +"' AND A.ID = B.ID_ALBUM AND G.NOMBRE = '"+ g.getNombre() +"' AND G.ID = B.ID_GENERO", Album.class);
            List a = q.getResultList();
            Iterator it = a.iterator();
            if(it.hasNext()){
                Album alb = (Album) it.next();
                return alb.darInfoAlbum();
            }else
                throw new UnsupportedOperationException("No existe un album correspondiente al nombre ingresado.");
        }else
            throw new UnsupportedOperationException("No existe un GENERO correspondiente al nombre ingresado.");
        
    }


    @Override
    public ArrayList<String> consultaAlbumArtista() {
        ArrayList<String> ret = new ArrayList();
        Artista a;        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
        EntityManager em = emf.createEntityManager();
        Query q = em.createNativeQuery("SELECT * FROM USUARIO WHERE TIPO = 'Artista'", Usuario.class);
        List <Usuario> l = q.getResultList();
        em.close();
        emf.close();
        Iterator it = l.iterator();
        while (it.hasNext()){
            a= (Artista) it.next();
            ret.add(a.getNick());
        }
        return ret;         
    }
    
    @Override
    public ArrayList<String> seleccionarArtista(String nick) {
        Artista a = buscarArtista(nick);
        if (a != null){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();
            Query q = em.createNativeQuery("SELECT * FROM ALBUM WHERE NICK_ARTISTA = '" + a.getNick() +"'", Album.class);
            List al = q.getResultList();
            em.close();
            emf.close();
            if (!al.isEmpty()){
                Iterator it = al.iterator();
                ArrayList<String> ret = new ArrayList<String>();
                Album alb = null;
                while (it.hasNext()){
                    alb = (Album) it.next();
                    ret.add(alb.getNombre());
                }            
                return ret;
            }else
                throw new UnsupportedOperationException("El Artsita no tiene Albumnes publicados.");
        }else
            throw new UnsupportedOperationException("El nick ingresado no hace referencia a un Artsita.");
      
    }

    @Override
    public DtAlbum seleccionarAlbumArtista(DtPertenece al) {
        Artista a = buscarArtista(al.getNombrePertenece());
        if(a != null){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();
            Query q = em.createNativeQuery("SELECT * FROM ALBUM WHERE NOMBRE = '"+ al.getNombre() +"'AND NICK_ARTISTA = '" + a.getNick() +"'", Album.class);
            List alb = q.getResultList();
            Iterator it = alb.iterator();
            if(it.hasNext()){
                Album albu = (Album) it.next();
                return albu.darInfoAlbum();
            }else
                throw new UnsupportedOperationException("El Artista ingresado no tiene album con el nombre ingresado.");
        }else
            throw new UnsupportedOperationException("El nick ingresado no hace referencia a un Artista.");
            
    }
   

    @Override
    public ArrayList<String> seleccionarGeneroLR(String nombre) {
        Iterator<Genero> it = generos.iterator();
        boolean encontrado = false;
        Genero g = null;
        while(it.hasNext() && !encontrado){
            g = it.next();
            if(g!=null && g.getNombre().equals(nombre))
                encontrado=true;
        }
        if(g == null || !encontrado){
            throw new UnsupportedOperationException("No existe genero registrado con ese nombre.");
        } else {
            return g.listarListasReproduccion();
        }    
    }

    @Override
    public DtListaReproduccionDefecto seleccionarListaReproduccion(String nombreGenero,String nombreLista) {
        Iterator<Genero> it = generos.iterator();
        boolean encontrado = false;
        Genero g = null;
        while(it.hasNext() && !encontrado){
            g = it.next();
            if(g!=null && g.getNombre().equals(nombreGenero))
                encontrado=true;
        }
        if(g == null || !encontrado)
            throw new UnsupportedOperationException("No existe genero registrado con ese nombre.");
        else
            return g.darLista(nombreLista);
    }

    @Override
    public ArrayList<String> consultaListaReproduccionCliente() {
        ArrayList<String> ret = new ArrayList();
        Iterator<Usuario> it = usuarios.iterator();
        Usuario u;
        Cliente c;
        while(it.hasNext()){
            u =  it.next();
            if(u instanceof Cliente){
                c = (Cliente) u;
                ret.add(c.getNick());
            }
        }
        return ret;   
    }
    
    @Override
    public ArrayList<String> seleccionarCliente(String nick) {
        Usuario u = buscarUsuario(nick);
        if(u instanceof Cliente){
            Cliente c = (Cliente) u; 
            return c.listarListasReproduccion();
        }else
            throw new UnsupportedOperationException("El nick se corresponde a un artista.");
    }

    @Override
    public DtListaReproduccionPersonalizada seleccionarListaReproduccion(DtPertenece LR) {      // LR almaenara el nombre del artista y el nombre de la lista
        Iterator<Usuario> it = usuarios.iterator();
        boolean encontrado = false;
        Cliente c = null;
        Usuario u;
        while(it.hasNext() && !encontrado){
            u = it.next();
            if(u instanceof Cliente){
                c = (Cliente) u;
                if(c.getNick().equals(LR.getNombrePertenece()))
                           encontrado=true;
            }
        }
        if(c == null || !encontrado){
            throw new UnsupportedOperationException("No existe un usuario correspondiente al nick ingresado.");
        } else {
            return c.darLista(LR.getNombre());
        }    
    }
    
    @Override
    public DtListaReproduccionDefecto seleccionarListaReproduccionDefecto(DtPertenece LR) {     // LR almaenara el nombre del genero y el nombre de la lista
        Iterator<Genero> it = generos.iterator();
        boolean encontrado = false;
        Genero g = null;
        while(it.hasNext() && !encontrado){
            g = (Genero) it.next();
            if(g!=null && g.getNombre().equals(LR.getNombrePertenece()))
                encontrado=true;
        }
        if(g == null || !encontrado)
            throw new UnsupportedOperationException("Genero no encontrado.");
        else
            return g.darLista(LR.getNombre());
    }

    @Override
    public ArrayList<String> listarSeguidos(String nick) {
        Usuario u = buscarUsuario(nick);
        if(u instanceof Cliente){
            Cliente c = (Cliente) u;
            return c.darSeguidos();
        }else
            throw new UnsupportedOperationException("El nick ingresado pertenece a un artista.");
    }
    
    @Override
    public ArrayList<String> listarGenero() {
            // Sino se encontro se buscara en la base de datos
            ArrayList<String> ret = new ArrayList<>();
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();
            Query query = em.createNativeQuery("SELECT * FROM GENERO",Genero.class);
            List<Genero> lista = query.getResultList();
            em.close();
            emf.close();
            Genero g = null;
            if(!lista.isEmpty()){
                Iterator<Genero> it2 = lista.iterator();
                while(it2.hasNext()){
                   g = (Genero) it2.next();
                   ret.add(g.getNombre());
                }
            }else
                return null;
        return ret;
    }

    @Override
    public DtArbol listarArbolGenero() {
        Genero g = buscarGenero("Genero");
        return g.listarArbolGenero();
    }
    
    private Genero buscarGenero(String nombre){
                   // Sino se encontro se buscara en la base de datos
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();
            Query query = em.createNativeQuery("SELECT * FROM GENERO WHERE NOMBRE = '" + nombre + "'" ,Genero.class);
            List<Genero> lista = query.getResultList();
            em.close();
            emf.close();
            Genero g = null;
            if(!lista.isEmpty()){
                Iterator<Genero> it2 = lista.iterator();
                if(it2.hasNext())
                   g = (Genero) it2.next();
                return g;
            }else
                return null;
        
    }
    
    @Override
    public ArrayList<String> darTemasFavoritos(String toString){
        Usuario u = buscarUsuario(toString);
        if(u instanceof Cliente){
            Cliente c = (Cliente) u;
            return c.darTemasFavoritos();
        }
        else
            throw new UnsupportedOperationException("El nick ingresado hace referencia a un artista.");
    }
    
    @Override
    public ArrayList<String> darAlbumesFavoritos(String toString){
        Usuario u = buscarUsuario(toString);
        if(u instanceof Cliente){
            Cliente c = (Cliente) u;
            return c.darAlbumesFavoritos();
        }
        else
            throw new UnsupportedOperationException("El nick ingresado pertenece a un artista.");
    }
    
    @Override
    public ArrayList<String> darListasFavoritas(String toString){
        Usuario u = buscarUsuario(toString);
        if(u instanceof Cliente){
            Cliente c = (Cliente) u;
            return c.darListasFavoritas();
        }
        else
            throw new UnsupportedOperationException("El nick ingresado pertenece a un artista.");
    }

    

    @Override
    public ArrayList<String> darTemasAlbum(String toString, String s) {
        Usuario u = buscarUsuario(toString);
        if(u instanceof Artista){
            Artista c = (Artista) u;
            return c.buscarAlbum(s).listarTemas();
        }else
            throw new UnsupportedOperationException("El nick ingresado hace referencia a un artista.");
    }

    @Override
    public boolean verificarArtista(String nick, String nombreAlbum) {
        Artista a = buscarArtista(nick);
        if(a!=null){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();
            Query q = em.createNativeQuery("SELECT * FROM ALBUM WHERE NOMBRE = '" + nombreAlbum +"' AND NICK_ARTISTA = '"  + a.getNick() +"'", Album.class);
            List l;
            l = q.getResultList();
            em.close();
            emf.close();
            if(!l.isEmpty())
                return false;
            else
                return true;
        
        }else
            throw new UnsupportedOperationException("El artista ingresado no existe.");
    }


    @Override
    public ArrayList<DtTema> listarTemaFav(String nick) {
        Usuario u = buscarUsuario(nick);
        if(u instanceof Cliente){
            Cliente c;
            c = (Cliente) u;
            ArrayList<DtTema> ret = new ArrayList();
            Iterator<Tema> it2 = c.getTemasFavoritos().iterator();
            while(it2.hasNext()){
                Tema t = it2.next();
                ret.add(new DtTema(t.getIdTema(),t.getNombre(), t.getNumeroCancion(), t.getDuracion(), t.getAlbum().getNombre(), t.getAlbum().getPropietario().getNick()));
            }
            return ret; 
        }
           
        else
            throw new UnsupportedOperationException("El Cliente ingresado no existe.");
    }

    @Override
    public ArrayList<DtAlbum> listarAlbumFav(String nick) {
        Usuario u = buscarUsuario(nick);
        if(u instanceof Cliente){
            Cliente c;
            c = (Cliente) u;
            ArrayList<DtAlbum> ret = new ArrayList();
            Iterator<Album> it2 = c.getAlbumesFavoritos().iterator();
            while(it2.hasNext()){
                Album a = it2.next();
                ret.add(a.darInfoAlbum());
            }
        return ret;
        }else{
             throw new UnsupportedOperationException("El Cliente ingresado no existe.");
        }
    }

    @Override
    public ArrayList<String> listarListasFav(String nick) {
        Usuario u = buscarUsuario(nick);
        if(u instanceof Cliente){
            Cliente c;
            c = (Cliente) u;
            ArrayList<String> ret = new ArrayList();
            Iterator<ListaReproduccion> it2 = c.getListasFavoritas().iterator();
            while(it2.hasNext()){
                ListaReproduccion l = it2.next();
                ret.add(l.getNombre());
            }
        return ret;
        }
        else
            throw new UnsupportedOperationException("El nick ingresado pertenece a un artista.");
    }
    
    @Override
    public void agregarTemaFavAlbum(String nick, int numeroCancion, String nombreAlbum, String nombreArtista) {
        Usuario u = buscarUsuario(nick);
        Usuario a = buscarUsuario(nombreArtista);
        Artista as = (Artista) a;
        if(u instanceof Cliente){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();
            Cliente c = (Cliente) u;
            Album al = as.buscarAlbum(nombreAlbum);
            Tema t = al.buscarTemaAlbum(numeroCancion);
            em.getTransaction().begin();
            c.setTemasFavoritos(t);
            em.getTransaction().commit();
            em.close();
            emf.close();
        } else
            throw new UnsupportedOperationException("El nick no pertenece a un cliente.");    
    }
    
    @Override
    public void agregarAlbumFav(String nick, String nombreAl, String nombreArtista) {
        Usuario u = buscarUsuario(nick);
        Usuario a = buscarUsuario(nombreArtista);
        if(a instanceof Artista){
            Artista ar = (Artista) a;
            if(u instanceof Cliente){
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
                EntityManager em = emf.createEntityManager();
                Cliente c = (Cliente) u;
                Album al = ar.buscarAlbum(nombreAl);
                em.getTransaction().begin();
                c.setAlbumesFavoritos(al);
                em.getTransaction().commit();
                em.close();
                emf.close();
            } else
                throw new UnsupportedOperationException("El nick no pertenece a un artista.");    
        }else
             throw new UnsupportedOperationException("El nick no pertenece a un cliente.");
    }


    @Override
    public void agregarListaFavPersonalizada(String nickPropietario, String nombreLista, String nombreUsuario) {
        Usuario u = buscarUsuario(nickPropietario);
        Usuario a = buscarUsuario (nombreUsuario);
        if(u instanceof Cliente && a instanceof Cliente){
            Cliente c = (Cliente) u;
            Cliente cl = (Cliente) a;
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();
            ListaReproduccion l = cl.buscarLista(nombreLista);
            em.getTransaction().begin();
            c.setListaReproduccionFavorita(l);
            em.getTransaction().commit();
            em.close();
            emf.close();
        }
        else
            throw new UnsupportedOperationException("El nick no pertenece a un artista.");
    }
    @Override
    public void agregarListaFavDefecto(String nickPropietario, String nombreLista, String nombreGenero) {
        Usuario u = buscarUsuario(nickPropietario);
        Genero g = buscarGenero(nombreGenero);
        if(u instanceof Cliente){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();
            Cliente c = (Cliente) u;
            ListaReproduccion l = g.buscarLista(nombreLista);
            em.getTransaction().begin();
            c.setListaReproduccionFavorita(l);
            em.getTransaction().commit();
            em.close();
            emf.close();
        }
        else
            throw new UnsupportedOperationException("El nick no pertenece a un artista.");
    }


    @Override
    public void quitarTemaFavorito(String nick, DtTema t) {
        Usuario u = buscarUsuario(nick);
        if(u instanceof Cliente){
            Cliente c = (Cliente) u;
            Iterator<Tema> it = c.getTemasFavoritos().iterator();
            boolean encontrado = false;
            Tema tem;
            while(it.hasNext() && !encontrado){
                tem = it.next();
                if(tem.getNumeroCancion() == t.getNumeroAlbum() && tem.getAlbum().getNombre().equals(t.getAlbum()))
                    encontrado = true;
            }
            if(t != null && encontrado)
                it.remove();
            else
                throw new UnsupportedOperationException("El tema no fue encontrado!.");
        }else
            throw new UnsupportedOperationException("El nick ingresado pertenece a un artista!.");
    }

    @Override
    public void quitarAlbumFavorito(String nick, DtPertenece a) {
        Usuario u = buscarUsuario(nick);
        if(u instanceof Cliente){
            Cliente c = (Cliente) u;
            u = buscarUsuario(a.getNombrePertenece());
            if(u instanceof Artista){
                Artista artista = (Artista) u;
                c.quitarAlbumFavorito(artista.buscarAlbum(a.getNombre()));
            }else
                throw new UnsupportedOperationException("El album no fue encontrado.");
        }else
            throw new UnsupportedOperationException("El nick ingresado pertenece a un artista.");
    }

    @Override
    public void quitarListaFavorito(String nick, DtPertenece lista) {
        Usuario u = buscarUsuario(nick);
        if(u instanceof Cliente){
            Cliente autor = (Cliente) u;
            boolean encontro = false;
            boolean encontrado = false;
            Iterator<Usuario> it2 = usuarios.iterator();
            Usuario cliente = null;
            while(it2.hasNext() && !encontro){
                u = it2.next();
                if (u.getNick().equals(lista.getNombrePertenece())) 
                    encontro = true;
            }
            ListaReproduccion l = null;
            if(encontro){
                if(u instanceof Cliente){
                    Iterator<ListaReproduccion> it = autor.getListasFavoritas().iterator();
                    while(it.hasNext() && !encontrado){
                        l = it.next();
                        if(l instanceof Personalizada){
                            Personalizada quitar = (Personalizada) l;
                            if(quitar.getNombre().equals(lista.getNombre()) && quitar.getCreador().getNick().equals(lista.getNombrePertenece()))
                                encontrado = true;
                        }
                    }
                    if(l != null && encontrado)
                        it.remove();
                    else
                        throw new UnsupportedOperationException("La lista no fue encontrada.");
                }else
                    throw new UnsupportedOperationException("El nick ingresado pertenece a un artista.");
            }else{
                Genero g = buscarGenero(lista.getNombrePertenece());
                try{
                    ListaReproduccion quitar = g.buscarLista(lista.getNombre());
                }catch(UnsupportedOperationException e){
                    throw new UnsupportedOperationException("No se encontro nick de propíetario, ni tampoco nombre de genero.");
                }
                Iterator<ListaReproduccion> it3 = autor.getListasFavoritas().iterator();
                while(it3.hasNext()){
                    l = it3.next();
                    if(l instanceof PorDefecto){
                        PorDefecto quitar = (PorDefecto) l;
                        if(quitar.getNombre().equals(lista.getNombre()) && quitar.getGenero().getNombre().equals(lista.getNombrePertenece()))
                            encontrado = true;
                    }
                }
                if(l != null && encontrado)
                    it3.remove();
                else
                    throw new UnsupportedOperationException("La lista no fue encontrada.");            }
        }else
            throw new UnsupportedOperationException("El nick ingresado pertenece a un artista!.");
    }
    
    @Override
    public Usuario buscarUsuario(String nick){
       /* Iterator<Usuario> it = usuarios.iterator();
        Boolean encontro = false;
        Usuario u = null;
        while(it.hasNext() && !encontro){
            u = it.next();
            if (u.getNick().equals(nick) || u.getEmail().equals(nick)) 
                    encontro = true;
        }
        if(encontro)
            return u;
        else{*/
            // Sino se encontro se buscara en la base de datos
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();
//            em.getTransaction().begin(); 
            Query query = em.createNativeQuery("SELECT * FROM USUARIO WHERE NICKNAME = '" + nick + "'" + " OR EMAIL = '" + nick + "'",Usuario.class);
            List<Usuario> lista = query.getResultList();
            em.close();
            emf.close();
            if(!lista.isEmpty()){               
                Iterator<Usuario> it2 = lista.iterator();                
                if(it2.hasNext())
                    return (Usuario) it2.next();
                else
                return null;           
        //em.getTransaction().commit();     
        }else
                return null;
  }
    @Override
    public Artista buscarArtista(String nick){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
        EntityManager em = emf.createEntityManager();
        Query q = em.createNativeQuery("SELECT * FROM USUARIO WHERE NICKNAME = '" + nick + "'" + " OR EMAIL = '" + nick + "' AND TIPO = 'Artista'", Usuario.class);
        List u = q.getResultList();
        em.close();
        emf.close();
        Iterator a = u.iterator();
        if (a.hasNext()){
            Artista ret = (Artista) a.next();            
            return ret;
        }else 
            return null;
    }
    

    @Override
    public boolean verificarCliente(String nick) {
        Usuario u = buscarUsuario(nick);
        if(u instanceof Cliente )
            return true;
        else
            throw new UnsupportedOperationException("El nick pertenece a un artista!."); 
    }

    @Override
    public void IniciarValores() {
        // Se dan de alta clientes
        altaPerfil(new DtCliente("Juano", "Juan", "Vega", "Juan@hotmail.com", "23/6/1995", null, "123"));
        altaPerfil(new DtCliente("Lea", "Leandro", "Curbelo", "l_curbe@hotmail.com", "3/1/1997", null, "123"));
        altaPerfil(new DtCliente("San", "Santiago", "Amengual", "amengual@hotmail.com", "7/6/1995", null, "123"));
        altaPerfil(new DtCliente("Mari", "Mariano", "Callero", "Mariano@hotmail.com", "1/12/1986", null, "123"));
        // Se dan de alta artistas
        altaPerfil(new DtArtista("Gardel", "Antonio", "Paiba", "antonitopaiba21@hotmail.com", "1/4/1972", null, "Hijo de Mirta Zaguaver e hijo de Antonio Paiba padre", "www.soytuantonito.com", null, null, "123"));
        altaPerfil(new DtArtista("OreOre", "Natalia", "Oreiro", "lapibapalosPibes@hotmail.com", "7/12/2000", null, "Actriz, modelo, te hace todo", "www.natiPhot.com", null, null, "123"));
        altaPerfil(new DtArtista("Laka", "Lakamorra", "Banda", "sentiloLaKamorra@hotmail.com", "1/1/1970", null, "Banda en crecimiento", "www.kamorramusic.com", null, null, "123"));
        //Se crean los Generos
        altaGenero("Genero");
        altaGenero("Rock","Genero");
        altaGenero("Tango","Genero");
        altaGenero("Cumbia","Genero");
        altaGenero("Villera","Cumbia");
        altaGenero("Cheta", "Cumbia");
        altaGenero("Metalica","Genero");
        altaGenero("Nacional", "Rock");
        // Se crean seguimientos de parte de un cliente a un usuario
        seguirUsuario("Juano", "OreOre");
        seguirUsuario("Juano", "Gardel");
        seguirUsuario("Juano", "Laka");
        seguirUsuario("Mari", "Laka");
        seguirUsuario("Mari", "Juano");
        seguirUsuario("San", "Juano");
        seguirUsuario("San", "Lea");
        seguirUsuario("Lea", "Juano");
        // Se crean temas y se agregaran a los albumes pertenecientes
        ArrayList<String> generos = new ArrayList();
        ArrayList<DtTema> listaTemas = new ArrayList();
        
        DtTema t1 = new DtTema(null,"tema1", 1, "2:13", "Album1", "Laka");
        DtTema t2 = new DtTema(null,"tema2", 2, "2:15", "Album1", "Laka");
        DtTema t3 = new DtTema(null,"tema3", 3, "2:03", "Album1", "Laka");
        
        ArrayList<DtTema> listaT = new ArrayList();
        listaT.add(t1);
        listaT.add(t2);
        listaT.add(t3);
        
        listaTemas.add(t1);
        listaTemas.add(t2);
        listaTemas.add(t3);
        generos.add("Villera");
        generos.add("Cheta");
        altaAlbum(new DtAlbum("Album1", 1999, listaTemas, "Laka", generos, null));
        
        t1 = new DtTema(null,"Tango1", 1, "2:13", "Adios muchachos", "Gardel");
        t2 = new DtTema(null,"Tango2", 2, "2:13", "Adios muchachos", "Gardel");
        t3 = new DtTema(null,"Tango3", 3, "2:13", "Adios muchachos", "Gardel");
        
        listaTemas = new ArrayList();
        generos = new ArrayList();
        listaTemas.add(t1);
        listaTemas.add(t2);
        listaTemas.add(t3);
        generos.add("Tango");
        altaAlbum(new DtAlbum("Adios muchachos", 1999, listaTemas, "Gardel", generos, null));
        // Se crean 2 listas por defecto y se le agregan temas de sus respectivos generos
        listaT.add(t1);
        listaT.add(t2);
        listaT.add(t3);
        crearListaReproduccion(new DtListaReproduccionDefecto("Lista tango", listaT, "Tango", null));
        DtPertenece listaPropietario = new DtPertenece("Lista tango", "Tango"), ruta = new DtPertenece("Adios muchachos", "Gardel");
        agregarTemaListaDefecto(listaPropietario, ruta, 1);
        agregarTemaListaDefecto(listaPropietario, ruta, 2);
        agregarTemaListaDefecto(listaPropietario, ruta, 3);
        
        crearListaReproduccion(new DtListaReproduccionPersonalizada("ListaPersonalizada1", listaT, "Lea", false, null));
        listaPropietario = new DtPertenece("ListaPersonalizada1", "Lea");
        ruta = new DtPertenece("Album1", "Laka");
        agregarTemaListaPersonalizada(listaPropietario, ruta, 1);
        agregarTemaListaPersonalizada(listaPropietario, ruta, 2);
        agregarTemaListaPersonalizada(listaPropietario, ruta, 3);    

    }

    @Override
    public List<Usuario> ListaUsuarios() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNativeQuery("SELECT * FROM USUARIO",Usuario.class);
        List<Usuario> lista = query.getResultList();
        em.close();
        emf.close();
        return lista;
    }

    @Override
    public void altaSuscripcion(String nick, float monto, String tipo) {
        Usuario u = buscarUsuario(nick);
        if (u instanceof Cliente) {
            Cliente c = (Cliente) u;
            java.util.Date fecha = new Date();
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();
            Suscripciones nuevo = new Suscripciones("Pendiente",fecha.toString(),monto,tipo,c);
            em.getTransaction().begin();
            em.persist(nuevo);
            c.setSuscripciones(nuevo);
            em.getTransaction().commit();
        } else {
            throw new UnsupportedOperationException("El nick de usuario no pertenece a un cliente");
        }
    }

    @Override
    public ArrayList<Suscripciones> listarSuscripciones(String nick) {
        Usuario u = buscarUsuario(nick);
        if(u instanceof Cliente){
            ArrayList<Suscripciones> ret = new ArrayList<Suscripciones>();
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();
            Query query = em.createNativeQuery("SELECT * FROM SUSCRIPCIONES WHERE NICK_CLIENTE = '" + nick + "'",Suscripciones.class);
            List<Suscripciones> lista = query.getResultList();
            Iterator<Suscripciones> it = lista.iterator();
            Suscripciones s = null;
            if(!lista.isEmpty()){
                while(it.hasNext()){
                    s = it.next();
                    ret.add(s);
                }
                return ret;
            }else
                return null;
        }else
            throw new UnsupportedOperationException("El nick de usuario no pertenece a un cliente");
    }

    @Override
    public ArrayList<String> listarArtistas() {
            ArrayList<String> ret = new ArrayList<>();
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("EspotifyPersistence");
            EntityManager em = emf.createEntityManager();
            Query query = em.createNativeQuery("SELECT * FROM USUARIO WHERE TIPO = 'Artista'",Usuario.class);
            List<Usuario> lista = query.getResultList();
            em.close();
            emf.close();
            Usuario g = null;
            if(!lista.isEmpty()){
                Iterator<Usuario> it2 = lista.iterator();
                while(it2.hasNext()){
                   g = (Usuario) it2.next();
                   ret.add(g.getNick());
                }
            }else
                return null;
        return ret;
    }
    
}


/*     @Override
    public void agregarTemaListaAlbum(DtPertenece listaPropietario,DtPertenece ruta, DtTema tema) {
        Usuario u = buscarUsuario(listaPropietario.getNombrePertenece());
        if(u instanceof Cliente){
            Cliente c = (Cliente) u;
            ListaReproduccion l = c.buscarLista(listaPropietario.getNombre());
            if(l instanceof Personalizada){
                Usuario u2 = buscarUsuario(ruta.getNombrePertenece());
                if(u2 instanceof Artista){
                    Artista a = (Artista) u2;
                    Album album = a.buscarAlbum(ruta.getNombre());
                    Tema t = album.buscarTemaAlbum(tema.getNumeroAlbum());
                    l.setTemaLista(t);
                }else
                    throw new UnsupportedOperationException("El nick pertenece es de un artista!");
            }else
                throw new UnsupportedOperationException("Error incorrecto!");
        }else
            throw new UnsupportedOperationException("El nick de propietario es de un artista!");    
    }
    
    
    @Override
    public ArrayList<String> listarListas(String nick) {
        Iterator<Usuario> it = usuarios.iterator();
        Usuario u;
        Cliente c = null;
        while(it.hasNext()){
            u = it.next();
            if(u.getNick().equals(nick) && u instanceof Cliente){
                c = (Cliente) u;
            }
        }
        if(c!=null)
            return c.darListas();
        else
            throw new UnsupportedOperationException("Cliente no encontrado!"); 
    }
    
    @Override
    public ArrayList<String> listarListas() {
        Iterator<Genero> it = generos.iterator();
        ArrayList<String> ret = new ArrayList<String>();
        while(it.hasNext()){
            Genero g = it.next();
            ret.addAll(g.darListas());
        }
        return ret;
    }
    
    @Override
    public ArrayList<String> listarListasGenero(String nombreGenero) {
        Genero g = buscarGenero(nombreGenero);
        return g.darListas();
    }
    

*/