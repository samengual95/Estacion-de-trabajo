package frame;

import clases.Fabrica;
import dataType.DtAlbum;
import dataType.DtArbol;
import dataType.DtArtista;
import dataType.DtCliente;
import dataType.DtListaReproduccionDefecto;
import dataType.DtListaReproduccionPersonalizada;
import dataType.DtPertenece;
import dataType.DtTema;
import interfaz.Interfaz;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/*
 * @author Leandro
 */

public class ventanaPrincipal extends javax.swing.JFrame {
    
    private Interfaz sistema;
    private ArrayList<DtTema> temas;
    public ventanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);                                       // Situa a la ventana en el medio de la pantalla
        this.setTitle("Espotify");                                              // Le da un nombre a la ventana
        ocultarFrameInternos();
        
        Fabrica fabrica = Fabrica.getInstance();
        sistema = fabrica.getInterfaz();
        temas = new ArrayList<DtTema>();
        inicializarTest();
        //sistema.altaPerfil(a);
        //this.getContentPane().setBackground(Color.BLACK);
        //this.getContentPane().setBackground(SystemColor.window);                // El color de la ventana se adapta al que tiene el sistema operativo nativo
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotonesCrearListaReproduccion = new javax.swing.ButtonGroup();
        grupoBotonesConsultarAlbum = new javax.swing.ButtonGroup();
        grupoBotonesAgregarTemaLista = new javax.swing.ButtonGroup();
        grupoBotonesEliminarFavorito = new javax.swing.ButtonGroup();
        grupoBotonesConsultarListaReproduccion = new javax.swing.ButtonGroup();
        grupoBotonesAgregarFavorito1 = new javax.swing.ButtonGroup();
        grupoBotonesAgregarFavorito = new javax.swing.ButtonGroup();
        grupoBotonesAgregarFavorito2 = new javax.swing.ButtonGroup();
        grupoBotonesQuitarTemaLista = new javax.swing.ButtonGroup();
        ventanas = new javax.swing.JDesktopPane();
        frameAltaArtista = new javax.swing.JInternalFrame();
        labelNick = new javax.swing.JLabel();
        correoElectronicoAltaArtista = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        nombreAltaArtista = new javax.swing.JTextField();
        labelApellido = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        apellidoAltaArtista = new javax.swing.JTextField();
        labelFecha = new javax.swing.JLabel();
        comboBoxDiaAltaArtista = new javax.swing.JComboBox<>();
        comboBoxMesAltaArtista = new javax.swing.JComboBox<>();
        comboBoxAnioAltaArtista = new javax.swing.JComboBox<>();
        nickAltaArtista = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fotoAltaArtista = new javax.swing.JLabel();
        textAreaDescripcion = new javax.swing.JScrollPane();
        descripcionAltaArtista = new javax.swing.JTextArea();
        cancelarAltaArtista = new javax.swing.JButton();
        sitioWebAltaArtista = new javax.swing.JTextField();
        labelSitioWeb = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        aceptarAltaArtista = new javax.swing.JButton();
        botonCargarFoto = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        frameAltaCliente = new javax.swing.JInternalFrame();
        comboBoxDiaAltaCliente = new javax.swing.JComboBox<>();
        comboBoxMesAltaCliente = new javax.swing.JComboBox<>();
        aceptarAltaCliente = new javax.swing.JButton();
        comboBoxAnioAltaCliente = new javax.swing.JComboBox<>();
        botonCargarFoto1 = new javax.swing.JButton();
        labelNick1 = new javax.swing.JLabel();
        nickAltaCliente = new javax.swing.JTextField();
        correoElectronicoAltaCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        labelNombre1 = new javax.swing.JLabel();
        fotoAltaCliente = new javax.swing.JLabel();
        nombreAltaCliente = new javax.swing.JTextField();
        labelApellido1 = new javax.swing.JLabel();
        labelCorreo1 = new javax.swing.JLabel();
        cancelarAltaCliente = new javax.swing.JButton();
        apellidoAltaCliente = new javax.swing.JTextField();
        labelFecha1 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jPasswordField4 = new javax.swing.JPasswordField();
        frameAltaGenero = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        nombreAltaGenero = new javax.swing.JTextField();
        nombrePadreAltaGenero = new javax.swing.JTextField();
        cancelarAltaGenero = new javax.swing.JButton();
        aceptarAltaGenero = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        frameCrearListaReproduccion = new javax.swing.JInternalFrame();
        labelNombreCrearListaReproduccion = new javax.swing.JLabel();
        textFieldNombreCrearListaReproduccion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        aceptarCrearListaReproduccion = new javax.swing.JButton();
        cancelarCrarListaReproduccion = new javax.swing.JButton();
        radioPersonalizadaCrearListaReproduccion = new javax.swing.JRadioButton();
        RadioDefectoCrearListaReproduccion = new javax.swing.JRadioButton();
        labelPerteneceCrearListaReproduccion = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textFieldPerteneceCrearListaReproduccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        crearCrearListaReproduccion = new javax.swing.JButton();
        atrasCrearListaReproduccion = new javax.swing.JButton();
        jTree32 = new javax.swing.JScrollPane();
        jTree3 = new javax.swing.JTree();
        fotoLista = new javax.swing.JLabel();
        framePublicarLista = new javax.swing.JInternalFrame();
        aceptarPublicarLista = new javax.swing.JButton();
        cancelarPublicarLista = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textFieldClientePublicarLista = new javax.swing.JTextField();
        textFieldListaPublicarLista = new javax.swing.JTextField();
        frameSeguirUsuario = new javax.swing.JInternalFrame();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelElegirSeguirUsuario = new javax.swing.JLabel();
        aceptarSeguirUsuario = new javax.swing.JButton();
        cancelarSeguirUsuario = new javax.swing.JButton();
        textFieldNickClienteSeguirUsuario = new javax.swing.JTextField();
        textFieldNickUsuarioSeguirUsuario = new javax.swing.JTextField();
        frameDejarSeguir = new javax.swing.JInternalFrame();
        jLabel17 = new javax.swing.JLabel();
        labelElejirDejarSeguir = new javax.swing.JLabel();
        aceptarDejarSeguir = new javax.swing.JButton();
        cancelarDejarSeguir = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        textFieldClienteDejarSeguir = new javax.swing.JTextField();
        textFieldUsuarioDejarSeguir = new javax.swing.JTextField();
        frameConsultarPerfilArtista = new javax.swing.JInternalFrame();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cancelarConsultarPerfilArtista = new javax.swing.JButton();
        aceptarConsultaPerfilArtista = new javax.swing.JButton();
        textFieldNickConsultarPerfilArtista = new javax.swing.JTextField();
        listaArtistasConsultarPerfilArtista = new javax.swing.JScrollPane();
        listaArtistasConsultarPerfilArtista2 = new javax.swing.JList<>();
        jLabel55 = new javax.swing.JLabel();
        frameConsultarPerfilCliente = new javax.swing.JInternalFrame();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cancelarConsultarPerfilCliente = new javax.swing.JButton();
        aceptarConsultarPerfilCliente = new javax.swing.JButton();
        textFieldConsultarPerfilCliente = new javax.swing.JTextField();
        listaClientesConsultarPerfilCliente = new javax.swing.JScrollPane();
        listaClientesConsultarPerfilCliente2 = new javax.swing.JList<>();
        jLabel54 = new javax.swing.JLabel();
        frameConsultarListaReproduccion = new javax.swing.JInternalFrame();
        labelListaConsultarListaReproduccion = new javax.swing.JLabel();
        aceptarConsultarListaReproduccion = new javax.swing.JButton();
        cancelarConsultarListaReproduccion = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        radioGeneroConsultarListaReproduccion = new javax.swing.JRadioButton();
        radioClienteConsultarListaReproduccion = new javax.swing.JRadioButton();
        labelCambiarConsultarListaReproduccion = new javax.swing.JLabel();
        textFieldOpcionConsultarListaReproduccion = new javax.swing.JTextField();
        textFieldListaConsultarListaReproduccion = new javax.swing.JTextField();
        listaConsultaLista2 = new javax.swing.JScrollPane();
        listaConsultaListas = new javax.swing.JList<>();
        frameConsultarAlbum = new javax.swing.JInternalFrame();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        aceptarConsultarAlbum = new javax.swing.JButton();
        cancelarConsultarAlbum = new javax.swing.JButton();
        radioGeneroConsultarAlbum = new javax.swing.JRadioButton();
        radioArtistaConsultarAlbum = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        labelAlbumConsultaAlbum = new javax.swing.JLabel();
        textFieldEleccionConsultarAlbum = new javax.swing.JTextField();
        textFieldAlbumConsultaAlbum = new javax.swing.JTextField();
        listaConsultaAlbum = new javax.swing.JScrollPane();
        listaConsultaAlbum2 = new javax.swing.JList<>();
        jTree12 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        frameAgregarTemaLista = new javax.swing.JInternalFrame();
        jLabel29 = new javax.swing.JLabel();
        personalizadaAgregarTemaLista = new javax.swing.JRadioButton();
        porDefectoAgregarTemaLista = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        aceptarAgregarTemaLista = new javax.swing.JButton();
        cancelarAgregarTemaLista = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        textFieldClienteAgregarTemaLista = new javax.swing.JTextField();
        textFieldListaPersonalizadaAgregarTemaLista = new javax.swing.JTextField();
        textFieldArtistaAgregarTemaLista = new javax.swing.JTextField();
        textFieldAlbumAgregarTemaLista = new javax.swing.JTextField();
        textFieldTemaAgregarTemaLista = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree4 = new javax.swing.JTree();
        frameAltaTema = new javax.swing.JInternalFrame();
        agregarAltaTema = new javax.swing.JButton();
        aceptarAltaTema = new javax.swing.JButton();
        cancelarAltaTema = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        nombreAltaTema = new javax.swing.JTextField();
        duracionAltaTema = new javax.swing.JTextField();
        numeroCancionAltaTema = new javax.swing.JTextField();
        frameAltaAlbum = new javax.swing.JInternalFrame();
        generosAltaAlbum = new javax.swing.JTextField();
        aceptarAltaAlbum = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        cancelarAltaAlbum = new javax.swing.JButton();
        labelArtistaAltaAlbum = new javax.swing.JLabel();
        nickAltaAlbum = new javax.swing.JTextField();
        labelNombreAltaAlbum = new javax.swing.JLabel();
        nombreAltaAlbum = new javax.swing.JTextField();
        labelAnioAltaAlbum = new javax.swing.JLabel();
        anioAltaAlbum = new javax.swing.JTextField();
        labelGenerosAltaAlbum = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree2 = new javax.swing.JTree();
        fotoAlbum = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        cargarFoto = new javax.swing.JInternalFrame();
        jfchCargarfoto = new javax.swing.JFileChooser();
        frameEliminarFavorito = new javax.swing.JInternalFrame();
        albumEliminarFavorito = new javax.swing.JRadioButton();
        jLabel47 = new javax.swing.JLabel();
        listaEliminarFavorito = new javax.swing.JRadioButton();
        favorito = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        aceptarEliminarFavorito = new javax.swing.JButton();
        cancelarEliminarFavorito = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        temaEliminarFavorito = new javax.swing.JRadioButton();
        textFieldClienteEliminarFavorito = new javax.swing.JTextField();
        textFieldSeleccionEliminarFavorito = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        frameGuardarTemaFav = new javax.swing.JInternalFrame();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        labelAlbumesTemaAgregarFavorito = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        aceptarAgregarFavorito = new javax.swing.JButton();
        cancelarAgregarFavorito = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        text1AgregarFavorito = new javax.swing.JTextField();
        text2AgregarFavorito = new javax.swing.JTextField();
        text3AgregarFavorito = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        frameDatos = new javax.swing.JInternalFrame();
        listaDatos = new javax.swing.JScrollPane();
        listaDatos2 = new javax.swing.JList<>();
        areaDatosSeguidores = new javax.swing.JScrollPane();
        areaDatosSeguidores2 = new javax.swing.JList<>();
        Aceptar = new javax.swing.JButton();
        areaDatos2 = new javax.swing.JScrollPane();
        areaDatos = new javax.swing.JTextArea();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        datoFoto = new javax.swing.JLabel();
        frameGuardarListaFav = new javax.swing.JInternalFrame();
        jLabel52 = new javax.swing.JLabel();
        text6AgregarFavorito = new javax.swing.JTextField();
        text8AgregarFavorito = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        radioPersonalizadaGuardarListaFav = new javax.swing.JRadioButton();
        radioDefectoGuardarListaFav = new javax.swing.JRadioButton();
        jTree52 = new javax.swing.JScrollPane();
        jTree5 = new javax.swing.JTree();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        frameGuardarAlbum = new javax.swing.JInternalFrame();
        text5AgregarFavorito = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        text4AgregarFavorito = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        frameQuitarTema = new javax.swing.JInternalFrame();
        textFieldTemaQuitarTemaLista = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        personalizadaQuitarTemaLista = new javax.swing.JRadioButton();
        jLabel58 = new javax.swing.JLabel();
        porDefectoQuitarTemaLista = new javax.swing.JRadioButton();
        jLabel59 = new javax.swing.JLabel();
        textFieldClienteQuitarTemaLista = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        textFieldListaPersonalizadaQuitarTemaLista = new javax.swing.JTextField();
        aceptarAgregarTemaLista1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTree6 = new javax.swing.JTree();
        cancelarAgregarTemaLista1 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        textFieldArtistaQuitarTemaLista = new javax.swing.JTextField();
        textFieldAlbumQuitarTemaLista = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        barraMenuPrincipal = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuNuevo = new javax.swing.JMenu();
        menuAltaUsuario = new javax.swing.JMenu();
        menuAltaArtista = new javax.swing.JMenuItem();
        menuAltaCliente = new javax.swing.JMenuItem();
        menuAltaGenero = new javax.swing.JMenuItem();
        menuAltaAlbum = new javax.swing.JMenuItem();
        menuAltaListaReproduccion = new javax.swing.JMenuItem();
        menuPublicarLista = new javax.swing.JMenuItem();
        menuAgregarTema = new javax.swing.JMenuItem();
        menuQuitarTema = new javax.swing.JMenuItem();
        menuSeguirUsuario = new javax.swing.JMenuItem();
        menuDejarSeguirUsuario = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuGuardarFavoritoLista = new javax.swing.JMenuItem();
        menuEliminarTema = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuSalir = new javax.swing.JMenuItem();
        menuBuscar = new javax.swing.JMenu();
        menuConsultaAlbum = new javax.swing.JMenuItem();
        menuConsultaLista = new javax.swing.JMenuItem();
        menuConsultaPerfiles = new javax.swing.JMenu();
        menuConsultaPerfilArtista = new javax.swing.JMenuItem();
        menuConsultaPerfilCliente = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        menuAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        frameAltaArtista.setTitle("Alta artista");
        frameAltaArtista.setPreferredSize(new java.awt.Dimension(600, 600));
        frameAltaArtista.setVisible(true);

        labelNick.setText("Nombre de usuario");

        labelNombre.setText("Nombre");

        labelApellido.setText("Apellido");

        labelCorreo.setText("Correo electronico");

        labelFecha.setText("Fecha nacimiento");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel7.setText("Alta artista");

        fotoAltaArtista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoAltaArtista.setText("FOTO");
        fotoAltaArtista.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        descripcionAltaArtista.setColumns(20);
        descripcionAltaArtista.setRows(5);
        textAreaDescripcion.setViewportView(descripcionAltaArtista);

        cancelarAltaArtista.setText("Cancelar");
        cancelarAltaArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarAltaArtistaActionPerformed(evt);
            }
        });

        labelSitioWeb.setText("Sitio web");

        labelDescripcion.setText("Descripcion");

        aceptarAltaArtista.setText("Aceptar");
        aceptarAltaArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarAltaArtistaActionPerformed(evt);
            }
        });

        botonCargarFoto.setText("Cargar foto");
        botonCargarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarFotoActionPerformed(evt);
            }
        });

        jLabel69.setText("Contraseña:");

        jLabel70.setText("Confirmar contraseña:");

        javax.swing.GroupLayout frameAltaArtistaLayout = new javax.swing.GroupLayout(frameAltaArtista.getContentPane());
        frameAltaArtista.getContentPane().setLayout(frameAltaArtistaLayout);
        frameAltaArtistaLayout.setHorizontalGroup(
            frameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameAltaArtistaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(213, 213, 213))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameAltaArtistaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelarAltaArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aceptarAltaArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(frameAltaArtistaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(frameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(frameAltaArtistaLayout.createSequentialGroup()
                        .addGroup(frameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCargarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(frameAltaArtistaLayout.createSequentialGroup()
                                .addComponent(fotoAltaArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(frameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDescripcion)
                                    .addComponent(labelSitioWeb))))
                        .addGap(18, 18, 18)
                        .addGroup(frameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sitioWebAltaArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAreaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(frameAltaArtistaLayout.createSequentialGroup()
                        .addGroup(frameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNick)
                            .addComponent(jLabel69)
                            .addComponent(jLabel70)
                            .addComponent(labelNombre)
                            .addComponent(labelApellido)
                            .addComponent(labelCorreo)
                            .addComponent(labelFecha))
                        .addGap(51, 51, 51)
                        .addGroup(frameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nickAltaArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreAltaArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidoAltaArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correoElectronicoAltaArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(frameAltaArtistaLayout.createSequentialGroup()
                                .addComponent(comboBoxDiaAltaArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxMesAltaArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxAnioAltaArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frameAltaArtistaLayout.setVerticalGroup(
            frameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAltaArtistaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(14, 14, 14)
                .addGroup(frameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNick)
                    .addComponent(nickAltaArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreAltaArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre))
                .addGap(18, 18, 18)
                .addGroup(frameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoAltaArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelApellido))
                .addGap(18, 18, 18)
                .addGroup(frameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correoElectronicoAltaArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCorreo))
                .addGap(18, 18, 18)
                .addGroup(frameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxDiaAltaArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxMesAltaArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxAnioAltaArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFecha))
                .addGap(22, 22, 22)
                .addGroup(frameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameAltaArtistaLayout.createSequentialGroup()
                        .addComponent(fotoAltaArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCargarFoto))
                    .addGroup(frameAltaArtistaLayout.createSequentialGroup()
                        .addGroup(frameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sitioWebAltaArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSitioWeb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(frameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDescripcion)
                            .addComponent(textAreaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarAltaArtista)
                    .addComponent(cancelarAltaArtista))
                .addContainerGap())
        );

        ventanas.add(frameAltaArtista);
        frameAltaArtista.setBounds(420, 540, 100, 30);

        frameAltaCliente.setTitle("Alta cliente");
        frameAltaCliente.setVisible(true);

        aceptarAltaCliente.setText("Aceptar");
        aceptarAltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarAltaClienteActionPerformed(evt);
            }
        });

        botonCargarFoto1.setText("Cargar foto");
        botonCargarFoto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarFoto1ActionPerformed(evt);
            }
        });

        labelNick1.setText("Nombre de usuario");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel8.setText("Alta cliente");

        labelNombre1.setText("Nombre");

        fotoAltaCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoAltaCliente.setText("FOTO");
        fotoAltaCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelApellido1.setText("Apellido");

        labelCorreo1.setText("Correo electronico");

        cancelarAltaCliente.setText("Cancelar");
        cancelarAltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarAltaClienteActionPerformed(evt);
            }
        });

        labelFecha1.setText("Fecha nacimiento");

        jLabel71.setText("Contraseña:");

        jLabel72.setText("Confirmar contraseña:");

        javax.swing.GroupLayout frameAltaClienteLayout = new javax.swing.GroupLayout(frameAltaCliente.getContentPane());
        frameAltaCliente.getContentPane().setLayout(frameAltaClienteLayout);
        frameAltaClienteLayout.setHorizontalGroup(
            frameAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameAltaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelarAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aceptarAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(frameAltaClienteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(frameAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameAltaClienteLayout.createSequentialGroup()
                        .addGroup(frameAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fotoAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCargarFoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(276, 276, 276))
                    .addGroup(frameAltaClienteLayout.createSequentialGroup()
                        .addGroup(frameAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frameAltaClienteLayout.createSequentialGroup()
                                .addGroup(frameAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNombre1)
                                    .addComponent(labelApellido1)
                                    .addComponent(labelCorreo1)
                                    .addComponent(labelFecha1))
                                .addGap(93, 93, 93)
                                .addGroup(frameAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frameAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nombreAltaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                        .addComponent(apellidoAltaCliente)
                                        .addComponent(correoElectronicoAltaCliente))
                                    .addGroup(frameAltaClienteLayout.createSequentialGroup()
                                        .addComponent(comboBoxDiaAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboBoxMesAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboBoxAnioAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frameAltaClienteLayout.createSequentialGroup()
                                .addGroup(frameAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel71)
                                    .addComponent(jLabel72)
                                    .addComponent(labelNick1))
                                .addGap(73, 73, 73)
                                .addGroup(frameAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frameAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPasswordField4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nickAltaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(frameAltaClienteLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frameAltaClienteLayout.setVerticalGroup(
            frameAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAltaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(14, 14, 14)
                .addGroup(frameAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNick1)
                    .addComponent(nickAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frameAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(jPasswordField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre1)
                    .addComponent(nombreAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frameAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApellido1)
                    .addComponent(apellidoAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frameAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correoElectronicoAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCorreo1))
                .addGap(29, 29, 29)
                .addGroup(frameAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFecha1)
                    .addComponent(comboBoxDiaAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxMesAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxAnioAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(fotoAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCargarFoto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameAltaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarAltaCliente)
                    .addComponent(cancelarAltaCliente))
                .addContainerGap())
        );

        ventanas.add(frameAltaCliente);
        frameAltaCliente.setBounds(420, 570, 100, 30);

        frameAltaGenero.setTitle("Alta genero");
        frameAltaGenero.setVisible(true);

        jLabel2.setText("Genero Padre:");

        cancelarAltaGenero.setText("Cancelar");
        cancelarAltaGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarAltaGeneroActionPerformed(evt);
            }
        });

        aceptarAltaGenero.setText("Aceptar");
        aceptarAltaGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarAltaGeneroActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        jLabel3.setText("Agregar género");

        jLabel1.setText("Nombre:");

        javax.swing.GroupLayout frameAltaGeneroLayout = new javax.swing.GroupLayout(frameAltaGenero.getContentPane());
        frameAltaGenero.getContentPane().setLayout(frameAltaGeneroLayout);
        frameAltaGeneroLayout.setHorizontalGroup(
            frameAltaGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAltaGeneroLayout.createSequentialGroup()
                .addGroup(frameAltaGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameAltaGeneroLayout.createSequentialGroup()
                        .addGroup(frameAltaGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frameAltaGeneroLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(frameAltaGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(50, 50, 50)
                                .addGroup(frameAltaGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombreAltaGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(nombrePadreAltaGenero)))
                            .addGroup(frameAltaGeneroLayout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameAltaGeneroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cancelarAltaGenero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptarAltaGenero)))
                .addContainerGap())
        );
        frameAltaGeneroLayout.setVerticalGroup(
            frameAltaGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAltaGeneroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(57, 57, 57)
                .addGroup(frameAltaGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreAltaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(47, 47, 47)
                .addGroup(frameAltaGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombrePadreAltaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameAltaGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarAltaGenero)
                    .addComponent(cancelarAltaGenero))
                .addContainerGap())
        );

        ventanas.add(frameAltaGenero);
        frameAltaGenero.setBounds(570, 690, 110, 30);

        frameCrearListaReproduccion.setTitle("Crear lista reproduccion");
        frameCrearListaReproduccion.setVisible(true);

        labelNombreCrearListaReproduccion.setText("Nombre");

        textFieldNombreCrearListaReproduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNombreCrearListaReproduccionActionPerformed(evt);
            }
        });

        jButton1.setText("Cargar foto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        aceptarCrearListaReproduccion.setText("Aceptar");
        aceptarCrearListaReproduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarCrearListaReproduccionActionPerformed(evt);
            }
        });

        cancelarCrarListaReproduccion.setText("Cancelar");
        cancelarCrarListaReproduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCrarListaReproduccionActionPerformed(evt);
            }
        });

        radioPersonalizadaCrearListaReproduccion.setText("Personalizada");
        radioPersonalizadaCrearListaReproduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPersonalizadaCrearListaReproduccionActionPerformed(evt);
            }
        });

        RadioDefectoCrearListaReproduccion.setText("Por defecto");
        RadioDefectoCrearListaReproduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioDefectoCrearListaReproduccionActionPerformed(evt);
            }
        });

        labelPerteneceCrearListaReproduccion.setText("jLabel4");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel9.setText("Crear lista de reproduccion");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Tipo de lista");

        crearCrearListaReproduccion.setText("Crear");
        crearCrearListaReproduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCrearListaReproduccionActionPerformed(evt);
            }
        });

        atrasCrearListaReproduccion.setText("Atras");
        atrasCrearListaReproduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasCrearListaReproduccionActionPerformed(evt);
            }
        });

        jTree32.setViewportView(jTree3);

        fotoLista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoLista.setText("FOTO");
        fotoLista.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout frameCrearListaReproduccionLayout = new javax.swing.GroupLayout(frameCrearListaReproduccion.getContentPane());
        frameCrearListaReproduccion.getContentPane().setLayout(frameCrearListaReproduccionLayout);
        frameCrearListaReproduccionLayout.setHorizontalGroup(
            frameCrearListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameCrearListaReproduccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameCrearListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameCrearListaReproduccionLayout.createSequentialGroup()
                        .addGroup(frameCrearListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPerteneceCrearListaReproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNombreCrearListaReproduccion))
                        .addGap(44, 44, 44)
                        .addGroup(frameCrearListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldNombreCrearListaReproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldPerteneceCrearListaReproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(frameCrearListaReproduccionLayout.createSequentialGroup()
                        .addComponent(radioPersonalizadaCrearListaReproduccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RadioDefectoCrearListaReproduccion))
                    .addGroup(frameCrearListaReproduccionLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel10))
                    .addGroup(frameCrearListaReproduccionLayout.createSequentialGroup()
                        .addComponent(cancelarCrarListaReproduccion)
                        .addGap(2, 2, 2)
                        .addComponent(atrasCrearListaReproduccion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frameCrearListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameCrearListaReproduccionLayout.createSequentialGroup()
                        .addComponent(crearCrearListaReproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptarCrearListaReproduccion)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameCrearListaReproduccionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(frameCrearListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameCrearListaReproduccionLayout.createSequentialGroup()
                                .addComponent(jTree32, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameCrearListaReproduccionLayout.createSequentialGroup()
                                .addGroup(frameCrearListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fotoLista, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                                .addGap(71, 71, 71))))))
            .addGroup(frameCrearListaReproduccionLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        frameCrearListaReproduccionLayout.setVerticalGroup(
            frameCrearListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameCrearListaReproduccionLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGroup(frameCrearListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frameCrearListaReproduccionLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(fotoLista, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTree32, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(frameCrearListaReproduccionLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(frameCrearListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frameCrearListaReproduccionLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(frameCrearListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radioPersonalizadaCrearListaReproduccion)
                                    .addComponent(RadioDefectoCrearListaReproduccion)))
                            .addGroup(frameCrearListaReproduccionLayout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addGroup(frameCrearListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelNombreCrearListaReproduccion)
                                    .addComponent(textFieldNombreCrearListaReproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(66, 66, 66)
                        .addGroup(frameCrearListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelPerteneceCrearListaReproduccion)
                            .addComponent(textFieldPerteneceCrearListaReproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(frameCrearListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarCrearListaReproduccion)
                    .addComponent(crearCrearListaReproduccion)
                    .addComponent(atrasCrearListaReproduccion)
                    .addComponent(cancelarCrarListaReproduccion))
                .addContainerGap())
        );

        ventanas.add(frameCrearListaReproduccion);
        frameCrearListaReproduccion.setBounds(320, 490, 170, 30);

        framePublicarLista.setTitle("Publicar lista");
        framePublicarLista.setVisible(true);

        aceptarPublicarLista.setText("Aceptar");
        aceptarPublicarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarPublicarListaActionPerformed(evt);
            }
        });

        cancelarPublicarLista.setText("Cancelar");
        cancelarPublicarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarPublicarListaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel11.setText("Publicar Lista");

        jLabel12.setText("Eliga el cliente:");

        jLabel13.setText("Elija la lista:");

        textFieldClientePublicarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldClientePublicarListaActionPerformed(evt);
            }
        });

        textFieldListaPublicarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldListaPublicarListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout framePublicarListaLayout = new javax.swing.GroupLayout(framePublicarLista.getContentPane());
        framePublicarLista.getContentPane().setLayout(framePublicarListaLayout);
        framePublicarListaLayout.setHorizontalGroup(
            framePublicarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(framePublicarListaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(framePublicarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(60, 60, 60)
                .addGroup(framePublicarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldClientePublicarLista, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(textFieldListaPublicarLista))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, framePublicarListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(framePublicarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, framePublicarListaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, framePublicarListaLayout.createSequentialGroup()
                        .addComponent(cancelarPublicarLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptarPublicarLista)
                        .addContainerGap())))
        );
        framePublicarListaLayout.setVerticalGroup(
            framePublicarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(framePublicarListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(28, 28, 28)
                .addGroup(framePublicarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(textFieldClientePublicarLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(framePublicarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(textFieldListaPublicarLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(framePublicarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarPublicarLista)
                    .addComponent(cancelarPublicarLista))
                .addContainerGap())
        );

        ventanas.add(framePublicarLista);
        framePublicarLista.setBounds(570, 650, 110, 30);

        frameSeguirUsuario.setTitle("Seguir usuario");
        frameSeguirUsuario.setVisible(true);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel14.setText("Seguir Usuario");

        jLabel15.setText("Eliga el cliente:");

        labelElegirSeguirUsuario.setText("Eliga el usuario:");

        aceptarSeguirUsuario.setText("Aceptar");
        aceptarSeguirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarSeguirUsuarioActionPerformed(evt);
            }
        });

        cancelarSeguirUsuario.setText("Cancelar");
        cancelarSeguirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarSeguirUsuarioActionPerformed(evt);
            }
        });

        textFieldNickClienteSeguirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNickClienteSeguirUsuarioActionPerformed(evt);
            }
        });

        textFieldNickUsuarioSeguirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNickUsuarioSeguirUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameSeguirUsuarioLayout = new javax.swing.GroupLayout(frameSeguirUsuario.getContentPane());
        frameSeguirUsuario.getContentPane().setLayout(frameSeguirUsuarioLayout);
        frameSeguirUsuarioLayout.setHorizontalGroup(
            frameSeguirUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameSeguirUsuarioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(frameSeguirUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelElegirSeguirUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameSeguirUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldNickClienteSeguirUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(textFieldNickUsuarioSeguirUsuario))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameSeguirUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameSeguirUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameSeguirUsuarioLayout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameSeguirUsuarioLayout.createSequentialGroup()
                        .addComponent(cancelarSeguirUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptarSeguirUsuario)
                        .addContainerGap())))
        );
        frameSeguirUsuarioLayout.setVerticalGroup(
            frameSeguirUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameSeguirUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(28, 28, 28)
                .addGroup(frameSeguirUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(textFieldNickClienteSeguirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(frameSeguirUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelElegirSeguirUsuario)
                    .addComponent(textFieldNickUsuarioSeguirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameSeguirUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarSeguirUsuario)
                    .addComponent(cancelarSeguirUsuario))
                .addContainerGap())
        );

        ventanas.add(frameSeguirUsuario);
        frameSeguirUsuario.setBounds(570, 620, 110, 30);

        frameDejarSeguir.setTitle("Dejar de seguir usuario");
        frameDejarSeguir.setVisible(true);

        jLabel17.setText("Eliga el cliente:");

        labelElejirDejarSeguir.setText("Eliga el usuario:");

        aceptarDejarSeguir.setText("Aceptar");
        aceptarDejarSeguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarDejarSeguirActionPerformed(evt);
            }
        });

        cancelarDejarSeguir.setText("Cancelar");
        cancelarDejarSeguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarDejarSeguirActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel19.setText("Dejar de seguir Usuario");

        textFieldClienteDejarSeguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldClienteDejarSeguirActionPerformed(evt);
            }
        });

        textFieldUsuarioDejarSeguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldUsuarioDejarSeguirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameDejarSeguirLayout = new javax.swing.GroupLayout(frameDejarSeguir.getContentPane());
        frameDejarSeguir.getContentPane().setLayout(frameDejarSeguirLayout);
        frameDejarSeguirLayout.setHorizontalGroup(
            frameDejarSeguirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameDejarSeguirLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(frameDejarSeguirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelElejirDejarSeguir)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameDejarSeguirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldClienteDejarSeguir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldUsuarioDejarSeguir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameDejarSeguirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameDejarSeguirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameDejarSeguirLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameDejarSeguirLayout.createSequentialGroup()
                        .addComponent(cancelarDejarSeguir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptarDejarSeguir)
                        .addContainerGap())))
        );
        frameDejarSeguirLayout.setVerticalGroup(
            frameDejarSeguirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameDejarSeguirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(28, 28, 28)
                .addGroup(frameDejarSeguirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(textFieldClienteDejarSeguir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(frameDejarSeguirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelElejirDejarSeguir)
                    .addComponent(textFieldUsuarioDejarSeguir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameDejarSeguirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarDejarSeguir)
                    .addComponent(cancelarDejarSeguir))
                .addContainerGap())
        );

        ventanas.add(frameDejarSeguir);
        frameDejarSeguir.setBounds(410, 620, 160, 30);

        frameConsultarPerfilArtista.setTitle("Consultar perfil artista");
        frameConsultarPerfilArtista.setVisible(true);

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel20.setText("Consulta de perfil de Artista");

        jLabel21.setText("Elegir artista:");

        cancelarConsultarPerfilArtista.setText("Cancelar");
        cancelarConsultarPerfilArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarConsultarPerfilArtistaActionPerformed(evt);
            }
        });

        aceptarConsultaPerfilArtista.setText("Aceptar");
        aceptarConsultaPerfilArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarConsultaPerfilArtistaActionPerformed(evt);
            }
        });

        listaArtistasConsultarPerfilArtista2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaArtistasConsultarPerfilArtista.setViewportView(listaArtistasConsultarPerfilArtista2);

        jLabel55.setText("Lista artistas registrados:");

        javax.swing.GroupLayout frameConsultarPerfilArtistaLayout = new javax.swing.GroupLayout(frameConsultarPerfilArtista.getContentPane());
        frameConsultarPerfilArtista.getContentPane().setLayout(frameConsultarPerfilArtistaLayout);
        frameConsultarPerfilArtistaLayout.setHorizontalGroup(
            frameConsultarPerfilArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameConsultarPerfilArtistaLayout.createSequentialGroup()
                .addGroup(frameConsultarPerfilArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameConsultarPerfilArtistaLayout.createSequentialGroup()
                        .addGroup(frameConsultarPerfilArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frameConsultarPerfilArtistaLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(frameConsultarPerfilArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frameConsultarPerfilArtistaLayout.createSequentialGroup()
                                        .addComponent(jLabel55)
                                        .addGap(81, 81, 81)
                                        .addComponent(listaArtistasConsultarPerfilArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(frameConsultarPerfilArtistaLayout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addGap(117, 117, 117)
                                        .addComponent(textFieldNickConsultarPerfilArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(frameConsultarPerfilArtistaLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel20)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameConsultarPerfilArtistaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cancelarConsultarPerfilArtista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptarConsultaPerfilArtista)))
                .addContainerGap())
        );
        frameConsultarPerfilArtistaLayout.setVerticalGroup(
            frameConsultarPerfilArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameConsultarPerfilArtistaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGroup(frameConsultarPerfilArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameConsultarPerfilArtistaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(frameConsultarPerfilArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(textFieldNickConsultarPerfilArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jLabel55))
                    .addGroup(frameConsultarPerfilArtistaLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(listaArtistasConsultarPerfilArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameConsultarPerfilArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarConsultaPerfilArtista)
                    .addComponent(cancelarConsultarPerfilArtista))
                .addContainerGap())
        );

        ventanas.add(frameConsultarPerfilArtista);
        frameConsultarPerfilArtista.setBounds(520, 540, 160, 30);

        frameConsultarPerfilCliente.setTitle("Consultar perfil cliente");
        frameConsultarPerfilCliente.setVisible(true);

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel22.setText("Consulta de perfil de Cliente");

        jLabel23.setText("Elegir cliente:");

        cancelarConsultarPerfilCliente.setText("Cancelar");
        cancelarConsultarPerfilCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarConsultarPerfilClienteActionPerformed(evt);
            }
        });

        aceptarConsultarPerfilCliente.setText("Aceptar");
        aceptarConsultarPerfilCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarConsultarPerfilClienteActionPerformed(evt);
            }
        });

        listaClientesConsultarPerfilCliente.setViewportView(listaClientesConsultarPerfilCliente2);

        jLabel54.setText("Lista de clientes registrados:");

        javax.swing.GroupLayout frameConsultarPerfilClienteLayout = new javax.swing.GroupLayout(frameConsultarPerfilCliente.getContentPane());
        frameConsultarPerfilCliente.getContentPane().setLayout(frameConsultarPerfilClienteLayout);
        frameConsultarPerfilClienteLayout.setHorizontalGroup(
            frameConsultarPerfilClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameConsultarPerfilClienteLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(frameConsultarPerfilClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameConsultarPerfilClienteLayout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listaClientesConsultarPerfilCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(frameConsultarPerfilClienteLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldConsultarPerfilCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
            .addGroup(frameConsultarPerfilClienteLayout.createSequentialGroup()
                .addGroup(frameConsultarPerfilClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameConsultarPerfilClienteLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel22)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameConsultarPerfilClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cancelarConsultarPerfilCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptarConsultarPerfilCliente)))
                .addContainerGap())
        );
        frameConsultarPerfilClienteLayout.setVerticalGroup(
            frameConsultarPerfilClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameConsultarPerfilClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(frameConsultarPerfilClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(textFieldConsultarPerfilCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(frameConsultarPerfilClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaClientesConsultarPerfilCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameConsultarPerfilClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarConsultarPerfilCliente)
                    .addComponent(cancelarConsultarPerfilCliente))
                .addContainerGap())
        );

        ventanas.add(frameConsultarPerfilCliente);
        frameConsultarPerfilCliente.setBounds(520, 570, 160, 30);

        frameConsultarListaReproduccion.setTitle("Consulta lista reproduccion");
        frameConsultarListaReproduccion.setVisible(true);

        labelListaConsultarListaReproduccion.setText("Elija la lista:");

        aceptarConsultarListaReproduccion.setText("Aceptar");
        aceptarConsultarListaReproduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarConsultarListaReproduccionActionPerformed(evt);
            }
        });

        cancelarConsultarListaReproduccion.setText("Cancelar");
        cancelarConsultarListaReproduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarConsultarListaReproduccionActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel24.setText("Consultar Lista de Reproducción");

        jLabel25.setText("Como desea realizar la busqueda:");

        radioGeneroConsultarListaReproduccion.setText("Por genero");
        radioGeneroConsultarListaReproduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGeneroConsultarListaReproduccionActionPerformed(evt);
            }
        });

        radioClienteConsultarListaReproduccion.setText("Por cliente");
        radioClienteConsultarListaReproduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioClienteConsultarListaReproduccionActionPerformed(evt);
            }
        });

        textFieldOpcionConsultarListaReproduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldOpcionConsultarListaReproduccionActionPerformed(evt);
            }
        });

        textFieldListaConsultarListaReproduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldListaConsultarListaReproduccionActionPerformed(evt);
            }
        });

        listaConsultaLista2.setViewportView(listaConsultaListas);

        javax.swing.GroupLayout frameConsultarListaReproduccionLayout = new javax.swing.GroupLayout(frameConsultarListaReproduccion.getContentPane());
        frameConsultarListaReproduccion.getContentPane().setLayout(frameConsultarListaReproduccionLayout);
        frameConsultarListaReproduccionLayout.setHorizontalGroup(
            frameConsultarListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameConsultarListaReproduccionLayout.createSequentialGroup()
                .addGroup(frameConsultarListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameConsultarListaReproduccionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(frameConsultarListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25)
                            .addGroup(frameConsultarListaReproduccionLayout.createSequentialGroup()
                                .addGroup(frameConsultarListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCambiarConsultarListaReproduccion)
                                    .addComponent(labelListaConsultarListaReproduccion))
                                .addGap(85, 85, 85)))
                        .addGroup(frameConsultarListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(frameConsultarListaReproduccionLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(frameConsultarListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textFieldOpcionConsultarListaReproduccion, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(textFieldListaConsultarListaReproduccion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(listaConsultaLista2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frameConsultarListaReproduccionLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(radioGeneroConsultarListaReproduccion)
                                .addGap(18, 18, 18)
                                .addComponent(radioClienteConsultarListaReproduccion))))
                    .addGroup(frameConsultarListaReproduccionLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel24)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameConsultarListaReproduccionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cancelarConsultarListaReproduccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptarConsultarListaReproduccion)))
                .addContainerGap())
        );
        frameConsultarListaReproduccionLayout.setVerticalGroup(
            frameConsultarListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameConsultarListaReproduccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(frameConsultarListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioGeneroConsultarListaReproduccion)
                    .addComponent(radioClienteConsultarListaReproduccion))
                .addGap(24, 24, 24)
                .addGroup(frameConsultarListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameConsultarListaReproduccionLayout.createSequentialGroup()
                        .addGroup(frameConsultarListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelCambiarConsultarListaReproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldOpcionConsultarListaReproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(frameConsultarListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelListaConsultarListaReproduccion)
                            .addComponent(textFieldListaConsultarListaReproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(frameConsultarListaReproduccionLayout.createSequentialGroup()
                        .addComponent(listaConsultaLista2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(frameConsultarListaReproduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aceptarConsultarListaReproduccion)
                            .addComponent(cancelarConsultarListaReproduccion))
                        .addContainerGap())))
        );

        ventanas.add(frameConsultarListaReproduccion);
        frameConsultarListaReproduccion.setBounds(490, 490, 190, 30);

        frameConsultarAlbum.setTitle("Consulta álbum");
        frameConsultarAlbum.setVisible(true);

        jLabel26.setText("Como desea realizar la busqueda:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel27.setText("Consulta album");

        aceptarConsultarAlbum.setText("Aceptar");
        aceptarConsultarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarConsultarAlbumActionPerformed(evt);
            }
        });

        cancelarConsultarAlbum.setText("Cancelar");
        cancelarConsultarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarConsultarAlbumConsultarAlbumActionPerformed(evt);
            }
        });

        radioGeneroConsultarAlbum.setText("Por genero");
        radioGeneroConsultarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGeneroConsultarAlbumActionPerformed(evt);
            }
        });

        radioArtistaConsultarAlbum.setText("Por artista");
        radioArtistaConsultarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioArtistaConsultarAlbumActionPerformed(evt);
            }
        });

        jLabel28.setText("jLabel28");

        labelAlbumConsultaAlbum.setText("Elija el álbum:");

        textFieldEleccionConsultarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEleccionConsultarAlbumActionPerformed(evt);
            }
        });

        textFieldAlbumConsultaAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldAlbumConsultaAlbumActionPerformed(evt);
            }
        });

        listaConsultaAlbum.setViewportView(listaConsultaAlbum2);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree12.setViewportView(jTree1);

        javax.swing.GroupLayout frameConsultarAlbumLayout = new javax.swing.GroupLayout(frameConsultarAlbum.getContentPane());
        frameConsultarAlbum.getContentPane().setLayout(frameConsultarAlbumLayout);
        frameConsultarAlbumLayout.setHorizontalGroup(
            frameConsultarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(frameConsultarAlbumLayout.createSequentialGroup()
                .addGroup(frameConsultarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameConsultarAlbumLayout.createSequentialGroup()
                        .addGroup(frameConsultarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(frameConsultarAlbumLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(frameConsultarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(labelAlbumConsultaAlbum))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(frameConsultarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldAlbumConsultaAlbum)
                                    .addComponent(textFieldEleccionConsultarAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
                            .addGroup(frameConsultarAlbumLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(frameConsultarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frameConsultarAlbumLayout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioGeneroConsultarAlbum)
                                        .addGap(28, 28, 28)
                                        .addComponent(radioArtistaConsultarAlbum))
                                    .addGroup(frameConsultarAlbumLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(listaConsultaAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTree12, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frameConsultarAlbumLayout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel27)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(frameConsultarAlbumLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cancelarConsultarAlbum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptarConsultarAlbum)))
                .addContainerGap())
        );
        frameConsultarAlbumLayout.setVerticalGroup(
            frameConsultarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameConsultarAlbumLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel27)
                .addGap(22, 22, 22)
                .addGroup(frameConsultarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameConsultarAlbumLayout.createSequentialGroup()
                        .addComponent(jTree12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 48, Short.MAX_VALUE))
                    .addGroup(frameConsultarAlbumLayout.createSequentialGroup()
                        .addGroup(frameConsultarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioGeneroConsultarAlbum)
                            .addComponent(radioArtistaConsultarAlbum)
                            .addComponent(jLabel26))
                        .addGap(42, 42, 42)
                        .addGroup(frameConsultarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(textFieldEleccionConsultarAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(frameConsultarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAlbumConsultaAlbum)
                            .addComponent(textFieldAlbumConsultaAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listaConsultaAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(frameConsultarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelarConsultarAlbum)
                            .addComponent(aceptarConsultarAlbum))))
                .addContainerGap())
        );

        ventanas.add(frameConsultarAlbum);
        frameConsultarAlbum.setBounds(560, 440, 120, 30);

        frameAgregarTemaLista.setTitle("Agregar tema");
        frameAgregarTemaLista.setVisible(true);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel29.setText("Agregar tema a lista");

        personalizadaAgregarTemaLista.setText("Lista personalizada");
        personalizadaAgregarTemaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalizadaAgregarTemaListaActionPerformed(evt);
            }
        });

        porDefectoAgregarTemaLista.setText("Lista por defecto");
        porDefectoAgregarTemaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porDefectoAgregarTemaListaActionPerformed(evt);
            }
        });

        jLabel30.setText("Elija a que lista se agregara el tema:");

        aceptarAgregarTemaLista.setText("Aceptar");
        aceptarAgregarTemaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarAgregarTemaListaActionPerformed(evt);
            }
        });

        cancelarAgregarTemaLista.setText("Cancelar");
        cancelarAgregarTemaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarAgregarTemaListaActionPerformed(evt);
            }
        });

        jLabel31.setText("Cliente:");

        jLabel33.setText("Artista:");

        jLabel34.setText("Lista:");

        jLabel36.setText("Album:");

        jLabel37.setText("Numero de cancion:");

        jScrollPane2.setViewportView(jTree4);

        javax.swing.GroupLayout frameAgregarTemaListaLayout = new javax.swing.GroupLayout(frameAgregarTemaLista.getContentPane());
        frameAgregarTemaLista.getContentPane().setLayout(frameAgregarTemaListaLayout);
        frameAgregarTemaListaLayout.setHorizontalGroup(
            frameAgregarTemaListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAgregarTemaListaLayout.createSequentialGroup()
                .addGroup(frameAgregarTemaListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameAgregarTemaListaLayout.createSequentialGroup()
                        .addGroup(frameAgregarTemaListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frameAgregarTemaListaLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(personalizadaAgregarTemaLista))
                            .addGroup(frameAgregarTemaListaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel31))
                            .addGroup(frameAgregarTemaListaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel34)))
                        .addGroup(frameAgregarTemaListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(frameAgregarTemaListaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldClienteAgregarTemaLista, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frameAgregarTemaListaLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(textFieldListaPersonalizadaAgregarTemaLista, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frameAgregarTemaListaLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(porDefectoAgregarTemaLista))))
                    .addGroup(frameAgregarTemaListaLayout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel29)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(frameAgregarTemaListaLayout.createSequentialGroup()
                .addGroup(frameAgregarTemaListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameAgregarTemaListaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel30))
                    .addGroup(frameAgregarTemaListaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(frameAgregarTemaListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frameAgregarTemaListaLayout.createSequentialGroup()
                                .addGroup(frameAgregarTemaListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel33))
                                .addGap(93, 93, 93)
                                .addGroup(frameAgregarTemaListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frameAgregarTemaListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textFieldTemaAgregarTemaLista)
                                        .addComponent(textFieldAlbumAgregarTemaLista, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textFieldArtistaAgregarTemaLista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel36))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameAgregarTemaListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelarAgregarTemaLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aceptarAgregarTemaLista)
                .addContainerGap())
        );
        frameAgregarTemaListaLayout.setVerticalGroup(
            frameAgregarTemaListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAgregarTemaListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addGap(23, 23, 23)
                .addComponent(jLabel30)
                .addGap(27, 27, 27)
                .addGroup(frameAgregarTemaListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(frameAgregarTemaListaLayout.createSequentialGroup()
                        .addGroup(frameAgregarTemaListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(personalizadaAgregarTemaLista)
                            .addComponent(porDefectoAgregarTemaLista))
                        .addGap(31, 31, 31)
                        .addGroup(frameAgregarTemaListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(textFieldClienteAgregarTemaLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(frameAgregarTemaListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(textFieldListaPersonalizadaAgregarTemaLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(frameAgregarTemaListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(textFieldArtistaAgregarTemaLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(frameAgregarTemaListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(textFieldAlbumAgregarTemaLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(frameAgregarTemaListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(textFieldTemaAgregarTemaLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameAgregarTemaListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarAgregarTemaLista)
                    .addComponent(cancelarAgregarTemaLista))
                .addContainerGap())
        );

        ventanas.add(frameAgregarTemaLista);
        frameAgregarTemaLista.setBounds(560, 730, 120, 30);

        frameAltaTema.setTitle("Alta tema");
        frameAltaTema.setVisible(true);

        agregarAltaTema.setText("Agregar");
        agregarAltaTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAltaTemaActionPerformed(evt);
            }
        });

        aceptarAltaTema.setText("Aceptar");
        aceptarAltaTema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptarAltaTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarAltaTemaActionPerformed(evt);
            }
        });

        cancelarAltaTema.setText("Cancelar");
        cancelarAltaTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarAltaTemaActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel38.setText("Agregar Temas");

        jLabel39.setText("Nombre:");

        jLabel40.setText("Duracion:");

        jLabel41.setText("Numero de cancion:");

        javax.swing.GroupLayout frameAltaTemaLayout = new javax.swing.GroupLayout(frameAltaTema.getContentPane());
        frameAltaTema.getContentPane().setLayout(frameAltaTemaLayout);
        frameAltaTemaLayout.setHorizontalGroup(
            frameAltaTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAltaTemaLayout.createSequentialGroup()
                .addGroup(frameAltaTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameAltaTemaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(frameAltaTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41)
                            .addComponent(jLabel39)))
                    .addGroup(frameAltaTemaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cancelarAltaTema)))
                .addGap(71, 71, 71)
                .addGroup(frameAltaTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameAltaTemaLayout.createSequentialGroup()
                        .addGroup(frameAltaTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frameAltaTemaLayout.createSequentialGroup()
                                .addGroup(frameAltaTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(numeroCancionAltaTema, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(duracionAltaTema, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(nombreAltaTema))
                        .addGap(91, 91, 91))
                    .addGroup(frameAltaTemaLayout.createSequentialGroup()
                        .addComponent(agregarAltaTema)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptarAltaTema, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameAltaTemaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addGap(133, 133, 133))
        );
        frameAltaTemaLayout.setVerticalGroup(
            frameAltaTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAltaTemaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38)
                .addGap(25, 25, 25)
                .addGroup(frameAltaTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(nombreAltaTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(frameAltaTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(duracionAltaTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(frameAltaTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(numeroCancionAltaTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameAltaTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarAltaTema)
                    .addComponent(agregarAltaTema)
                    .addComponent(cancelarAltaTema))
                .addContainerGap())
        );

        ventanas.add(frameAltaTema);
        frameAltaTema.setBounds(480, 410, 100, 30);

        frameAltaAlbum.setTitle("Alta album");
        frameAltaAlbum.setVisible(true);

        aceptarAltaAlbum.setText("Aceptar");
        aceptarAltaAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarAltaAlbumActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel42.setText("Alta Album");

        cancelarAltaAlbum.setText("Cancelar");
        cancelarAltaAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarAltaAlbumActionPerformed(evt);
            }
        });

        labelArtistaAltaAlbum.setText("Nombre artista:");

        labelNombreAltaAlbum.setText("Nombre Album:");

        labelAnioAltaAlbum.setText("Año de Creacion:");

        labelGenerosAltaAlbum.setText("Genero(s):");

        jLabel5.setText("Separados por \", \"");

        jScrollPane1.setViewportView(jTree2);

        fotoAlbum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoAlbum.setText("FOTO");
        fotoAlbum.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton6.setText("Cargar foto");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameAltaAlbumLayout = new javax.swing.GroupLayout(frameAltaAlbum.getContentPane());
        frameAltaAlbum.getContentPane().setLayout(frameAltaAlbumLayout);
        frameAltaAlbumLayout.setHorizontalGroup(
            frameAltaAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAltaAlbumLayout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel42)
                .addContainerGap(198, Short.MAX_VALUE))
            .addGroup(frameAltaAlbumLayout.createSequentialGroup()
                .addGroup(frameAltaAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameAltaAlbumLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(frameAltaAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNombreAltaAlbum)
                            .addComponent(labelArtistaAltaAlbum)
                            .addComponent(labelAnioAltaAlbum)
                            .addComponent(labelGenerosAltaAlbum)
                            .addComponent(fotoAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(frameAltaAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frameAltaAlbumLayout.createSequentialGroup()
                                .addGroup(frameAltaAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nickAltaAlbum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(nombreAltaAlbum)
                                    .addComponent(anioAltaAlbum, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(generosAltaAlbum, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frameAltaAlbumLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameAltaAlbumLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cancelarAltaAlbum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptarAltaAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        frameAltaAlbumLayout.setVerticalGroup(
            frameAltaAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameAltaAlbumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addGap(41, 41, 41)
                .addGroup(frameAltaAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameAltaAlbumLayout.createSequentialGroup()
                        .addGroup(frameAltaAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nickAltaAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelArtistaAltaAlbum))
                        .addGap(31, 31, 31)
                        .addGroup(frameAltaAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombreAltaAlbum)
                            .addComponent(nombreAltaAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(frameAltaAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAnioAltaAlbum)
                            .addComponent(anioAltaAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(frameAltaAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelGenerosAltaAlbum)
                            .addComponent(generosAltaAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(frameAltaAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameAltaAlbumLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(fotoAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(frameAltaAlbumLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(frameAltaAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aceptarAltaAlbum)
                            .addComponent(cancelarAltaAlbum))
                        .addContainerGap())))
        );

        ventanas.add(frameAltaAlbum);
        frameAltaAlbum.setBounds(580, 410, 100, 30);

        cargarFoto.setTitle("Cargar foto");
        cargarFoto.setVisible(true);

        javax.swing.GroupLayout cargarFotoLayout = new javax.swing.GroupLayout(cargarFoto.getContentPane());
        cargarFoto.getContentPane().setLayout(cargarFotoLayout);
        cargarFotoLayout.setHorizontalGroup(
            cargarFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jfchCargarfoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        cargarFotoLayout.setVerticalGroup(
            cargarFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cargarFotoLayout.createSequentialGroup()
                .addComponent(jfchCargarfoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ventanas.add(cargarFoto);
        cargarFoto.setBounds(580, 770, 100, 30);

        frameEliminarFavorito.setTitle("Eliminar de favoritos");
        frameEliminarFavorito.setVisible(true);

        albumEliminarFavorito.setText("Album");
        albumEliminarFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumEliminarFavoritoActionPerformed(evt);
            }
        });

        jLabel47.setText("Seleccione el cliente:");

        listaEliminarFavorito.setText("Lista");
        listaEliminarFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEliminarFavoritoActionPerformed(evt);
            }
        });

        favorito.setText("Seleccione su tema:");

        jLabel48.setText("Seleccione que quiere eliminar de su lista de favoritos:");

        aceptarEliminarFavorito.setText("Aceptar");
        aceptarEliminarFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarEliminarFavoritoActionPerformed(evt);
            }
        });

        cancelarEliminarFavorito.setText("Cancelar");
        cancelarEliminarFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarEliminarFavoritoActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel49.setText("Eliminar de favoritos");

        temaEliminarFavorito.setText("Tema");
        temaEliminarFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temaEliminarFavoritoActionPerformed(evt);
            }
        });

        textFieldClienteEliminarFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldClienteEliminarFavoritoActionPerformed(evt);
            }
        });

        textFieldSeleccionEliminarFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSeleccionEliminarFavoritoActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel56.setText("Se debera indicar el nombre del tema, ");

        jLabel57.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel57.setText("el lugar en el album y el album separador por \", \"");

        javax.swing.GroupLayout frameEliminarFavoritoLayout = new javax.swing.GroupLayout(frameEliminarFavorito.getContentPane());
        frameEliminarFavorito.getContentPane().setLayout(frameEliminarFavoritoLayout);
        frameEliminarFavoritoLayout.setHorizontalGroup(
            frameEliminarFavoritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameEliminarFavoritoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(temaEliminarFavorito)
                .addGap(56, 56, 56)
                .addComponent(albumEliminarFavorito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(listaEliminarFavorito)
                .addGap(50, 50, 50))
            .addGroup(frameEliminarFavoritoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameEliminarFavoritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameEliminarFavoritoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel48)
                        .addGap(69, 69, 69))
                    .addGroup(frameEliminarFavoritoLayout.createSequentialGroup()
                        .addGroup(frameEliminarFavoritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frameEliminarFavoritoLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(frameEliminarFavoritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel57)
                                    .addComponent(jLabel56)))
                            .addGroup(frameEliminarFavoritoLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel49))
                            .addGroup(frameEliminarFavoritoLayout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addGap(44, 44, 44)
                                .addComponent(textFieldClienteEliminarFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(frameEliminarFavoritoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(favorito)
                .addGap(48, 48, 48)
                .addComponent(textFieldSeleccionEliminarFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameEliminarFavoritoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelarEliminarFavorito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aceptarEliminarFavorito)
                .addContainerGap())
        );
        frameEliminarFavoritoLayout.setVerticalGroup(
            frameEliminarFavoritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameEliminarFavoritoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addGap(37, 37, 37)
                .addGroup(frameEliminarFavoritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(textFieldClienteEliminarFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel48)
                .addGap(18, 18, 18)
                .addGroup(frameEliminarFavoritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temaEliminarFavorito)
                    .addComponent(albumEliminarFavorito)
                    .addComponent(listaEliminarFavorito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameEliminarFavoritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(favorito)
                    .addComponent(textFieldSeleccionEliminarFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel57)
                .addGap(13, 13, 13)
                .addGroup(frameEliminarFavoritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarEliminarFavorito)
                    .addComponent(cancelarEliminarFavorito))
                .addContainerGap())
        );

        ventanas.add(frameEliminarFavorito);
        frameEliminarFavorito.setBounds(20, 680, 160, 30);

        frameGuardarTemaFav.setTitle("Guardar tema favorito");
        frameGuardarTemaFav.setVisible(true);

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel50.setText("Guardar tema favoritos");

        jLabel51.setText("Cliente:");

        labelAlbumesTemaAgregarFavorito.setText("Atista:");

        jLabel16.setText("Tema (numero cancion):");

        aceptarAgregarFavorito.setText("Aceptar");
        aceptarAgregarFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarAgregarFavoritoActionPerformed(evt);
            }
        });

        cancelarAgregarFavorito.setText("Cancelar");
        cancelarAgregarFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarAgregarFavoritoActionPerformed(evt);
            }
        });

        jLabel68.setText("Album:");

        javax.swing.GroupLayout frameGuardarTemaFavLayout = new javax.swing.GroupLayout(frameGuardarTemaFav.getContentPane());
        frameGuardarTemaFav.getContentPane().setLayout(frameGuardarTemaFavLayout);
        frameGuardarTemaFavLayout.setHorizontalGroup(
            frameGuardarTemaFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameGuardarTemaFavLayout.createSequentialGroup()
                .addGroup(frameGuardarTemaFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameGuardarTemaFavLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cancelarAgregarFavorito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptarAgregarFavorito))
                    .addGroup(frameGuardarTemaFavLayout.createSequentialGroup()
                        .addGroup(frameGuardarTemaFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frameGuardarTemaFavLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel50))
                            .addGroup(frameGuardarTemaFavLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(frameGuardarTemaFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel51)
                                    .addComponent(labelAlbumesTemaAgregarFavorito)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel68))
                                .addGap(55, 55, 55)
                                .addGroup(frameGuardarTemaFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text2AgregarFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text3AgregarFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text1AgregarFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        frameGuardarTemaFavLayout.setVerticalGroup(
            frameGuardarTemaFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameGuardarTemaFavLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addGap(40, 40, 40)
                .addGroup(frameGuardarTemaFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(frameGuardarTemaFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlbumesTemaAgregarFavorito)
                    .addComponent(text1AgregarFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(frameGuardarTemaFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(text2AgregarFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameGuardarTemaFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(text3AgregarFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(frameGuardarTemaFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarAgregarFavorito)
                    .addComponent(cancelarAgregarFavorito))
                .addContainerGap())
        );

        ventanas.add(frameGuardarTemaFav);
        frameGuardarTemaFav.setBounds(20, 720, 170, 30);

        frameDatos.setTitle("Expulcion de datos");
        frameDatos.setVisible(true);

        listaDatos.setViewportView(listaDatos2);

        areaDatosSeguidores.setViewportView(areaDatosSeguidores2);

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        areaDatos.setColumns(20);
        areaDatos.setRows(5);
        areaDatos2.setViewportView(areaDatos);

        jLabel62.setText("Datos principales:");

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel63.setText("Seccion de datos");

        jLabel46.setText("jLabel46");

        jLabel53.setText("jLabel53");

        datoFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datoFoto.setText("FOTO");
        datoFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout frameDatosLayout = new javax.swing.GroupLayout(frameDatos.getContentPane());
        frameDatos.getContentPane().setLayout(frameDatosLayout);
        frameDatosLayout.setHorizontalGroup(
            frameDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel63)
                .addGap(310, 310, 310))
            .addGroup(frameDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameDatosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Aceptar))
                    .addGroup(frameDatosLayout.createSequentialGroup()
                        .addGroup(frameDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(frameDatosLayout.createSequentialGroup()
                                .addComponent(jLabel62)
                                .addGap(49, 49, 49)
                                .addComponent(areaDatos2, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(frameDatosLayout.createSequentialGroup()
                                .addComponent(datoFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel46)
                                .addGap(31, 31, 31)
                                .addComponent(areaDatosSeguidores, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel53)
                                .addGap(31, 31, 31)
                                .addComponent(listaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        frameDatosLayout.setVerticalGroup(
            frameDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63)
                .addGap(25, 25, 25)
                .addGroup(frameDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addComponent(areaDatos2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frameDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameDatosLayout.createSequentialGroup()
                        .addGroup(frameDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53)
                            .addComponent(jLabel46)
                            .addComponent(datoFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(Aceptar))
                    .addComponent(areaDatosSeguidores, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ventanas.add(frameDatos);
        frameDatos.setBounds(20, 40, 140, 30);

        frameGuardarListaFav.setTitle("Guardar lista en favoritos");
        frameGuardarListaFav.setVisible(true);

        jLabel52.setText("Lista:");

        text6AgregarFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text6AgregarFavoritoActionPerformed(evt);
            }
        });

        text8AgregarFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text8AgregarFavoritoActionPerformed(evt);
            }
        });

        jLabel44.setText("Genero:");

        radioPersonalizadaGuardarListaFav.setText("Personalizada");
        radioPersonalizadaGuardarListaFav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPersonalizadaGuardarListaFavActionPerformed(evt);
            }
        });

        radioDefectoGuardarListaFav.setText("Defecto");
        radioDefectoGuardarListaFav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDefectoGuardarListaFavActionPerformed(evt);
            }
        });

        jTree52.setViewportView(jTree5);

        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel64.setText("Guardar lista en favoritos");

        jLabel66.setText("Cliente:");

        javax.swing.GroupLayout frameGuardarListaFavLayout = new javax.swing.GroupLayout(frameGuardarListaFav.getContentPane());
        frameGuardarListaFav.getContentPane().setLayout(frameGuardarListaFavLayout);
        frameGuardarListaFavLayout.setHorizontalGroup(
            frameGuardarListaFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameGuardarListaFavLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(frameGuardarListaFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addComponent(jLabel44))
                .addGap(72, 72, 72)
                .addGroup(frameGuardarListaFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(text6AgregarFavorito, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(text8AgregarFavorito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTree52, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameGuardarListaFavLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(frameGuardarListaFavLayout.createSequentialGroup()
                .addGroup(frameGuardarListaFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameGuardarListaFavLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel64))
                    .addGroup(frameGuardarListaFavLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(radioPersonalizadaGuardarListaFav)
                        .addGap(74, 74, 74)
                        .addComponent(radioDefectoGuardarListaFav)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameGuardarListaFavLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        frameGuardarListaFavLayout.setVerticalGroup(
            frameGuardarListaFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameGuardarListaFavLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64)
                .addGap(40, 40, 40)
                .addGroup(frameGuardarListaFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66))
                .addGap(18, 18, 18)
                .addGroup(frameGuardarListaFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioPersonalizadaGuardarListaFav)
                    .addComponent(radioDefectoGuardarListaFav))
                .addGroup(frameGuardarListaFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameGuardarListaFavLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jTree52, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frameGuardarListaFavLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(frameGuardarListaFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(text6AgregarFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(frameGuardarListaFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel52)
                            .addComponent(text8AgregarFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameGuardarListaFavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        ventanas.add(frameGuardarListaFav);
        frameGuardarListaFav.setBounds(20, 780, 170, 30);

        frameGuardarAlbum.setTitle("Guardar album favorito");
        frameGuardarAlbum.setVisible(true);

        text5AgregarFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text5AgregarFavoritoActionPerformed(evt);
            }
        });

        jLabel43.setText("Album:");

        text4AgregarFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text4AgregarFavoritoActionPerformed(evt);
            }
        });

        jLabel18.setText("Artista:");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel45.setText("Guardar album favorito");

        jButton4.setText("Aceptar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel67.setText("Cliente:");

        javax.swing.GroupLayout frameGuardarAlbumLayout = new javax.swing.GroupLayout(frameGuardarAlbum.getContentPane());
        frameGuardarAlbum.getContentPane().setLayout(frameGuardarAlbumLayout);
        frameGuardarAlbumLayout.setHorizontalGroup(
            frameGuardarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameGuardarAlbumLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(frameGuardarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frameGuardarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(frameGuardarAlbumLayout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addGap(86, 86, 86)
                            .addComponent(text4AgregarFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(frameGuardarAlbumLayout.createSequentialGroup()
                            .addComponent(jLabel43)
                            .addGap(89, 89, 89)
                            .addComponent(text5AgregarFavorito)))
                    .addGroup(frameGuardarAlbumLayout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addGap(88, 88, 88)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameGuardarAlbumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameGuardarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameGuardarAlbumLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel45)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameGuardarAlbumLayout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addContainerGap())))
        );
        frameGuardarAlbumLayout.setVerticalGroup(
            frameGuardarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameGuardarAlbumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45)
                .addGap(32, 32, 32)
                .addGroup(frameGuardarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(frameGuardarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(text4AgregarFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(frameGuardarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(text5AgregarFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameGuardarAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        ventanas.add(frameGuardarAlbum);
        frameGuardarAlbum.setBounds(20, 750, 170, 30);

        frameQuitarTema.setTitle("Quitar tema");
        frameQuitarTema.setVisible(true);

        jLabel35.setText("Lista:");

        personalizadaQuitarTemaLista.setText("Lista personalizada");
        personalizadaQuitarTemaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalizadaQuitarTemaListaActionPerformed(evt);
            }
        });

        jLabel58.setText("Album:");

        porDefectoQuitarTemaLista.setText("Lista por defecto");
        porDefectoQuitarTemaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porDefectoQuitarTemaListaActionPerformed(evt);
            }
        });

        jLabel59.setText("Numero de cancion:");

        jLabel32.setText("Elija a que lista se agregara el tema:");

        aceptarAgregarTemaLista1.setText("Aceptar");
        aceptarAgregarTemaLista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarAgregarTemaLista1ActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jTree6);

        cancelarAgregarTemaLista1.setText("Cancelar");
        cancelarAgregarTemaLista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarAgregarTemaLista1ActionPerformed(evt);
            }
        });

        jLabel60.setText("Cliente:");

        jLabel61.setText("Artista:");

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel65.setText("Quitar tema lista");

        javax.swing.GroupLayout frameQuitarTemaLayout = new javax.swing.GroupLayout(frameQuitarTema.getContentPane());
        frameQuitarTema.getContentPane().setLayout(frameQuitarTemaLayout);
        frameQuitarTemaLayout.setHorizontalGroup(
            frameQuitarTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameQuitarTemaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameQuitarTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameQuitarTemaLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel32)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(frameQuitarTemaLayout.createSequentialGroup()
                        .addGroup(frameQuitarTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59)
                            .addComponent(jLabel61)
                            .addComponent(jLabel58)
                            .addGroup(frameQuitarTemaLayout.createSequentialGroup()
                                .addGroup(frameQuitarTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frameQuitarTemaLayout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(personalizadaQuitarTemaLista))
                                    .addComponent(jLabel60)
                                    .addComponent(jLabel35))
                                .addGroup(frameQuitarTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frameQuitarTemaLayout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(porDefectoQuitarTemaLista))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frameQuitarTemaLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(frameQuitarTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textFieldArtistaQuitarTemaLista)
                                            .addComponent(textFieldListaPersonalizadaQuitarTemaLista, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                            .addComponent(textFieldClienteQuitarTemaLista)
                                            .addComponent(textFieldAlbumQuitarTemaLista)
                                            .addComponent(textFieldTemaQuitarTemaLista))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameQuitarTemaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel65)
                        .addGap(198, 198, 198))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameQuitarTemaLayout.createSequentialGroup()
                        .addComponent(cancelarAgregarTemaLista1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptarAgregarTemaLista1)
                        .addContainerGap())))
        );
        frameQuitarTemaLayout.setVerticalGroup(
            frameQuitarTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameQuitarTemaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel65)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addGap(27, 27, 27)
                .addGroup(frameQuitarTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameQuitarTemaLayout.createSequentialGroup()
                        .addGroup(frameQuitarTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(personalizadaQuitarTemaLista)
                            .addComponent(porDefectoQuitarTemaLista))
                        .addGap(31, 31, 31)
                        .addGroup(frameQuitarTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(textFieldClienteQuitarTemaLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(frameQuitarTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(textFieldListaPersonalizadaQuitarTemaLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(frameQuitarTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel61)
                            .addComponent(textFieldArtistaQuitarTemaLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(frameQuitarTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58)
                            .addComponent(textFieldAlbumQuitarTemaLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(frameQuitarTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(textFieldTemaQuitarTemaLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frameQuitarTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarAgregarTemaLista1)
                    .addComponent(cancelarAgregarTemaLista1))
                .addContainerGap())
        );

        ventanas.add(frameQuitarTema);
        frameQuitarTema.setBounds(460, 730, 100, 30);

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("Espotify");
        ventanas.add(nombre);
        nombre.setBounds(1840, 60, 56, 19);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Espo_opt.jpg"))); // NOI18N
        ventanas.add(jLabel6);
        jLabel6.setBounds(1840, 20, 50, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen.jpg"))); // NOI18N
        ventanas.add(jLabel4);
        jLabel4.setBounds(0, 0, 1920, 1080);

        getContentPane().add(ventanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        barraMenuPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        barraMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barraMenuPrincipal.setName(""); // NOI18N

        menuArchivo.setText("Archivo");
        menuArchivo.setActionCommand("Alta");
        menuArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuNuevo.setText("Nuevo");

        menuAltaUsuario.setText("Usuario");

        menuAltaArtista.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuAltaArtista.setText("Artista");
        menuAltaArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAltaArtistaActionPerformed(evt);
            }
        });
        menuAltaUsuario.add(menuAltaArtista);

        menuAltaCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        menuAltaCliente.setText("Cliente");
        menuAltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAltaClienteActionPerformed(evt);
            }
        });
        menuAltaUsuario.add(menuAltaCliente);

        menuNuevo.add(menuAltaUsuario);

        menuAltaGenero.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        menuAltaGenero.setText("Genero");
        menuAltaGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAltaGeneroActionPerformed(evt);
            }
        });
        menuNuevo.add(menuAltaGenero);

        menuAltaAlbum.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuAltaAlbum.setText("Album");
        menuAltaAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAltaAlbumActionPerformed(evt);
            }
        });
        menuNuevo.add(menuAltaAlbum);

        menuAltaListaReproduccion.setText("Lista de reproduccion");
        menuAltaListaReproduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAltaListaReproduccionActionPerformed(evt);
            }
        });
        menuNuevo.add(menuAltaListaReproduccion);

        menuArchivo.add(menuNuevo);

        menuPublicarLista.setText("Publicar lista");
        menuPublicarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPublicarListaActionPerformed(evt);
            }
        });
        menuArchivo.add(menuPublicarLista);

        menuAgregarTema.setText("Agregar tema a lista");
        menuAgregarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregarTemaActionPerformed(evt);
            }
        });
        menuArchivo.add(menuAgregarTema);

        menuQuitarTema.setText("Quitar tema de lista");
        menuQuitarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuQuitarTemaActionPerformed(evt);
            }
        });
        menuArchivo.add(menuQuitarTema);

        menuSeguirUsuario.setText("Seguir usuario");
        menuSeguirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSeguirUsuarioActionPerformed(evt);
            }
        });
        menuArchivo.add(menuSeguirUsuario);

        menuDejarSeguirUsuario.setText("Dejar de seguir usuario");
        menuDejarSeguirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDejarSeguirUsuarioActionPerformed(evt);
            }
        });
        menuArchivo.add(menuDejarSeguirUsuario);

        jMenu1.setText("Guardar favorito");

        jMenuItem1.setText("Tema");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Album");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        menuGuardarFavoritoLista.setText("Lista");
        menuGuardarFavoritoLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarFavoritoListaActionPerformed(evt);
            }
        });
        jMenu1.add(menuGuardarFavoritoLista);

        menuArchivo.add(jMenu1);

        menuEliminarTema.setText("Eliminar de favorito");
        menuEliminarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarTemaActionPerformed(evt);
            }
        });
        menuArchivo.add(menuEliminarTema);
        menuArchivo.add(jSeparator1);

        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuSalir);

        barraMenuPrincipal.add(menuArchivo);

        menuBuscar.setText("Buscar");

        menuConsultaAlbum.setText("Album");
        menuConsultaAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaAlbumActionPerformed(evt);
            }
        });
        menuBuscar.add(menuConsultaAlbum);

        menuConsultaLista.setText("Lista reproduccion");
        menuConsultaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaListaActionPerformed(evt);
            }
        });
        menuBuscar.add(menuConsultaLista);

        menuConsultaPerfiles.setText("Perfiles");

        menuConsultaPerfilArtista.setText("Artista");
        menuConsultaPerfilArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaPerfilArtistaActionPerformed(evt);
            }
        });
        menuConsultaPerfiles.add(menuConsultaPerfilArtista);

        menuConsultaPerfilCliente.setText("Cliente");
        menuConsultaPerfilCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaPerfilClienteActionPerformed(evt);
            }
        });
        menuConsultaPerfiles.add(menuConsultaPerfilCliente);

        menuBuscar.add(menuConsultaPerfiles);

        barraMenuPrincipal.add(menuBuscar);

        menuAyuda.setText("Ayuda");
        menuAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAyudaActionPerformed(evt);
            }
        });

        menuAcercaDe.setText("Acerca de...");
        menuAyuda.add(menuAcercaDe);

        barraMenuPrincipal.add(menuAyuda);

        setJMenuBar(barraMenuPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAyudaActionPerformed

    }//GEN-LAST:event_menuAyudaActionPerformed

    private void menuConsultaPerfilArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaPerfilArtistaActionPerformed
        textFieldNickConsultarPerfilArtista.setText("");
        DefaultListModel<String> artistas = new DefaultListModel();
        Iterator<String> it = sistema.consultarPerfilArtista().iterator();
        while(it.hasNext())
            artistas.addElement(it.next());
        listaArtistasConsultarPerfilArtista2.setModel(artistas);
        frameConsultarPerfilArtista.setVisible(true);
    }//GEN-LAST:event_menuConsultaPerfilArtistaActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuAgregarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregarTemaActionPerformed
        textFieldClienteAgregarTemaLista.setVisible(false);
        textFieldListaPersonalizadaAgregarTemaLista.setVisible(false);
        textFieldArtistaAgregarTemaLista.setVisible(false);
        textFieldAlbumAgregarTemaLista.setVisible(false);
        textFieldTemaAgregarTemaLista.setVisible(false);
        textFieldClienteAgregarTemaLista.setText("");
        textFieldListaPersonalizadaAgregarTemaLista.setText("");
        textFieldArtistaAgregarTemaLista.setText("");
        textFieldAlbumAgregarTemaLista.setText("");
        textFieldTemaAgregarTemaLista.setText("");
        jLabel31.setVisible(false);
        jLabel33.setVisible(false);
        jLabel34.setVisible(false);
        jLabel36.setVisible(false);
        jLabel37.setVisible(false);
        this.imprimirArbol(jTree4);
        grupoBotonesAgregarTemaLista.clearSelection();
        frameAgregarTemaLista.setVisible(true);
    }//GEN-LAST:event_menuAgregarTemaActionPerformed

    private void menuPublicarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPublicarListaActionPerformed
        framePublicarLista.setVisible(true);
        jLabel13.setVisible(false);
        textFieldListaPublicarLista.setVisible(false);
        aceptarPublicarLista.setEnabled(false);
        textFieldClientePublicarLista.setText("");
        framePublicarLista.setVisible(true);
    }//GEN-LAST:event_menuPublicarListaActionPerformed

    private void menuAltaListaReproduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAltaListaReproduccionActionPerformed
        grupoBotonesCrearListaReproduccion.clearSelection();
        jTree3.setVisible(false);
        jTree32.setVisible(false);
        fotoLista.setEnabled(true);
        fotoLista.setIcon(null);
        fotoLista.setText("FOTO");
        jButton1.setEnabled(true);
        RadioDefectoCrearListaReproduccion.setEnabled(true);
        radioPersonalizadaCrearListaReproduccion.setEnabled(true);
        aceptarCrearListaReproduccion.setEnabled(true);
        textFieldNombreCrearListaReproduccion.setText("");
        textFieldNombreCrearListaReproduccion.setEnabled(true);
        textFieldPerteneceCrearListaReproduccion.setText("");
        labelPerteneceCrearListaReproduccion.setVisible(false);
        textFieldPerteneceCrearListaReproduccion.setVisible(false);
        aceptarCrearListaReproduccion.setEnabled(false);
        crearCrearListaReproduccion.setEnabled(false);
        frameCrearListaReproduccion.setVisible(true);
    }//GEN-LAST:event_menuAltaListaReproduccionActionPerformed

    private void menuAltaAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAltaAlbumActionPerformed
        nickAltaAlbum.setText("");
        nombreAltaAlbum.setText("");
        anioAltaAlbum.setText("");
        generosAltaAlbum.setText("");
        this.imprimirArbol(jTree2);
        frameAltaAlbum.setVisible(true);
    }//GEN-LAST:event_menuAltaAlbumActionPerformed

    private void menuAltaGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAltaGeneroActionPerformed
        nombreAltaGenero.setText("");
        nombrePadreAltaGenero.setText("");
        frameAltaGenero.setVisible(true);
    }//GEN-LAST:event_menuAltaGeneroActionPerformed

    private void menuAltaArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAltaArtistaActionPerformed
        frameAltaArtista.setVisible(true);
        fotoAltaArtista.setIcon(null);
        fotoAltaArtista.setText("FOTO");
        jPasswordField1.setText("");
        jPasswordField2.setText("");
        nickAltaArtista.setText("");
        nombreAltaArtista.setText("");
        apellidoAltaArtista.setText("");
        correoElectronicoAltaArtista.setText("");
        sitioWebAltaArtista.setText("");
        descripcionAltaArtista.setText("");
        comboBoxDiaAltaArtista.setSelectedIndex(0);         // Pone el jComboBox en el primer valor de la tabla
        comboBoxMesAltaArtista.setSelectedIndex(0);
        comboBoxAnioAltaArtista.setSelectedIndex(0);
    }//GEN-LAST:event_menuAltaArtistaActionPerformed

    private void menuAltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAltaClienteActionPerformed
        nickAltaCliente.setText("");
        fotoAltaCliente.setIcon(null);
        fotoAltaCliente.setText("FOTO");
        jPasswordField3.setText("");
        jPasswordField4.setText("");
        nombreAltaCliente.setText("");
        apellidoAltaCliente.setText("");
        correoElectronicoAltaCliente.setText("");
        comboBoxDiaAltaCliente.setSelectedIndex(0);
        comboBoxMesAltaCliente.setSelectedIndex(0);
        comboBoxAnioAltaCliente.setSelectedIndex(0);
        frameAltaCliente.setVisible(true);
    }//GEN-LAST:event_menuAltaClienteActionPerformed

    private void menuSeguirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSeguirUsuarioActionPerformed
        frameSeguirUsuario.setVisible(true);
        textFieldNickClienteSeguirUsuario.setText("");
        aceptarSeguirUsuario.setEnabled(false);
        labelElegirSeguirUsuario.setVisible(false);
        textFieldNickUsuarioSeguirUsuario.setVisible(false);
    }//GEN-LAST:event_menuSeguirUsuarioActionPerformed

    private void menuDejarSeguirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDejarSeguirUsuarioActionPerformed
        aceptarDejarSeguir.setEnabled(false);
        labelElejirDejarSeguir.setVisible(false);
        textFieldUsuarioDejarSeguir.setVisible(false);
        textFieldClienteDejarSeguir.setText("");
        frameDejarSeguir.setVisible(true);
    }//GEN-LAST:event_menuDejarSeguirUsuarioActionPerformed

    private void menuConsultaPerfilClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaPerfilClienteActionPerformed
        textFieldConsultarPerfilCliente.setText("");
        DefaultListModel<String> clientes = new DefaultListModel();
        Iterator<String> it = sistema.consultarPerfilCliente().iterator();
        while(it.hasNext())
            clientes.addElement(it.next());
        listaClientesConsultarPerfilCliente2.setModel(clientes);
        frameConsultarPerfilCliente.setVisible(true);
    }//GEN-LAST:event_menuConsultaPerfilClienteActionPerformed

    private void menuEliminarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarTemaActionPerformed
        try{
            jLabel56.setVisible(false);
            jLabel57.setVisible(false);
            aceptarEliminarFavorito.setEnabled(false);
            textFieldClienteEliminarFavorito.setText("");
            textFieldSeleccionEliminarFavorito.setVisible(false);
            favorito.setVisible(false);
            temaEliminarFavorito.setVisible(false);
            albumEliminarFavorito.setVisible(false);
            listaEliminarFavorito.setVisible(false);
            jLabel48.setVisible(false);
            grupoBotonesEliminarFavorito.clearSelection();
            frameEliminarFavorito.setVisible(true);
        }catch(UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_menuEliminarTemaActionPerformed

    private void menuConsultaAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaAlbumActionPerformed
        jLabel28.setVisible(false);
        jTree1.setVisible(false);
        jTree12.setVisible(false);
        listaConsultaAlbum.setVisible(false);
        textFieldEleccionConsultarAlbum.setVisible(false);
        labelAlbumConsultaAlbum.setVisible(false);
        textFieldAlbumConsultaAlbum.setVisible(false);
        grupoBotonesConsultarAlbum.clearSelection();
        textFieldEleccionConsultarAlbum.setText("");
        textFieldAlbumConsultaAlbum.setText("");
        aceptarConsultarAlbum.setEnabled(false);
        frameConsultarAlbum.setVisible(true);
    }//GEN-LAST:event_menuConsultaAlbumActionPerformed

    private void menuConsultaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaListaActionPerformed
        aceptarConsultarListaReproduccion.setEnabled(false);
        listaConsultaLista2.setVisible(false);
        textFieldOpcionConsultarListaReproduccion.setVisible(false);
        textFieldListaConsultarListaReproduccion.setVisible(false);
        labelListaConsultarListaReproduccion.setVisible(false);
        labelCambiarConsultarListaReproduccion.setVisible(false);
        grupoBotonesConsultarListaReproduccion.clearSelection();
        frameConsultarListaReproduccion.setVisible(true);
    }//GEN-LAST:event_menuConsultaListaActionPerformed
    private Icon Foto;
    private void botonCargarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarFotoActionPerformed
        int resultado;
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png");
        jfchCargarfoto.setFileFilter(filtro);
        resultado= jfchCargarfoto.showOpenDialog(null);
        if (JFileChooser.APPROVE_OPTION == resultado){
            fichero = jfchCargarfoto.getSelectedFile();
            try{
                ImageIcon icon = new ImageIcon(fichero.toString());
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(fotoAltaArtista.getWidth(), fotoAltaArtista.getHeight(),Image.SCALE_DEFAULT));
                fotoAltaArtista.setText(null);
                fotoAltaArtista.setIcon(icono);
                this.Foto = icono;
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error abriendo la imagen "+ ex);
            }
        }
    }//GEN-LAST:event_botonCargarFotoActionPerformed

    private void aceptarAltaArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarAltaArtistaActionPerformed
        if(!descripcionAltaArtista.getText().equals("") && jPasswordField1.getPassword().length>0 && jPasswordField2.getPassword().length>0  && !nickAltaArtista.getText().equals("") && !nombreAltaArtista.getText().equals("") && !apellidoAltaArtista.getText().equals("") && !correoElectronicoAltaArtista.getText().equals("")){
            if(verificacionContrasenia(jPasswordField3.getPassword(), jPasswordField4.getPassword())){
                char[] pass = jPasswordField1.getPassword();
                String contrasenia = new String(pass);
                String fecha = (comboBoxDiaAltaArtista.getSelectedItem().toString()+"/"+comboBoxMesAltaArtista.getSelectedItem().toString()+"/"+comboBoxAnioAltaArtista.getSelectedItem().toString());
                DtArtista nuevo = new DtArtista(nickAltaArtista.getText(), nombreAltaArtista.getText(), apellidoAltaArtista.getText(), correoElectronicoAltaArtista.getText(), fecha, null, descripcionAltaArtista.getText(), sitioWebAltaArtista.getText(), new ArrayList<String>(), this.Foto, contrasenia);
                this.Foto = null;
                try{
                    sistema.altaPerfil(nuevo);
                    frameAltaArtista.setVisible(false);
                }
                catch(UnsupportedOperationException e){
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else
                JOptionPane.showMessageDialog(null, "La contraseña no concuerda con la confirmacón.", "Error", JOptionPane.ERROR_MESSAGE);
        }else
            JOptionPane.showMessageDialog(null, "No se permiten campos vacios.", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_aceptarAltaArtistaActionPerformed

    private void cancelarAltaArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarAltaArtistaActionPerformed
        frameAltaArtista.setVisible(false);
    }//GEN-LAST:event_cancelarAltaArtistaActionPerformed

    private void aceptarAltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarAltaClienteActionPerformed
        if(!nickAltaCliente.getText().equals("") && jPasswordField3.getPassword().length>0 && jPasswordField4.getPassword().length>0 && !nombreAltaCliente.getText().equals("") && !apellidoAltaCliente.getText().equals("") && !correoElectronicoAltaCliente.getText().equals("")){
            if(verificacionContrasenia(jPasswordField3.getPassword(), jPasswordField4.getPassword())){    
                char[] pass = jPasswordField1.getPassword();
                String contrasenia = new String(pass);
                String fecha = (comboBoxDiaAltaCliente.getSelectedItem().toString()+"/"+comboBoxMesAltaCliente.getSelectedItem().toString()+"/"+comboBoxAnioAltaCliente.getSelectedItem().toString());
                DtCliente nuevo = new DtCliente(nickAltaCliente.getText(), nombreAltaCliente.getText(), apellidoAltaCliente.getText(), correoElectronicoAltaCliente.getText(), fecha, this.Foto, contrasenia);
                this.Foto = null;
                try{
                    sistema.altaPerfil(nuevo);
                    frameAltaCliente.setVisible(false);           
                }catch (UnsupportedOperationException e){
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else
                JOptionPane.showMessageDialog(null, "La contraseña no concuerda con la confirmacón.", "Error", JOptionPane.ERROR_MESSAGE);
        }else
            JOptionPane.showMessageDialog(null, "No se permiten campos vacios.", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_aceptarAltaClienteActionPerformed

    private void botonCargarFoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarFoto1ActionPerformed
        int resultado;
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png");
        jfchCargarfoto.setFileFilter(filtro);
        resultado= jfchCargarfoto.showOpenDialog(null);
        if (JFileChooser.APPROVE_OPTION == resultado){
            fichero = jfchCargarfoto.getSelectedFile();
            try{
                ImageIcon icon = new ImageIcon(fichero.toString());
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(fotoAltaCliente.getWidth(), fotoAltaCliente.getHeight(),Image.SCALE_DEFAULT));
                fotoAltaCliente.setText(null);
                fotoAltaCliente.setIcon(icono);
                this.Foto = icono;
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error abriendo la imagen "+ ex);
            }
        }
    }//GEN-LAST:event_botonCargarFoto1ActionPerformed

    private void cancelarAltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarAltaClienteActionPerformed
        frameAltaCliente.setVisible(false);
    }//GEN-LAST:event_cancelarAltaClienteActionPerformed

    private void cancelarAltaGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarAltaGeneroActionPerformed
        frameAltaGenero.setVisible(false);
    }//GEN-LAST:event_cancelarAltaGeneroActionPerformed

    private void aceptarAltaGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarAltaGeneroActionPerformed
        try{
            if(nombrePadreAltaGenero.getText().equals("")){
                sistema.altaGenero(nombreAltaGenero.getText(),"Genero");
                frameAltaGenero.setVisible(false);
            }
            else{
                sistema.altaGenero(nombreAltaGenero.getText(),nombrePadreAltaGenero.getText());
                frameAltaGenero.setVisible(false);
            }
        }catch (UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aceptarAltaGeneroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int resultado;
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png");
        jfchCargarfoto.setFileFilter(filtro);
        resultado= jfchCargarfoto.showOpenDialog(null);
        if (JFileChooser.APPROVE_OPTION == resultado){
            fichero = jfchCargarfoto.getSelectedFile();
            try{
                ImageIcon icon = new ImageIcon(fichero.toString());
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(fotoLista.getWidth(), fotoLista.getHeight(),Image.SCALE_DEFAULT));
                fotoLista.setText(null);
                fotoLista.setIcon(icono);
                this.Foto = icono;
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error abriendo la imagen "+ ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void aceptarCrearListaReproduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarCrearListaReproduccionActionPerformed
        if(radioPersonalizadaCrearListaReproduccion.isSelected())
            labelPerteneceCrearListaReproduccion.setText("Nick propietario:");
        else{
            labelPerteneceCrearListaReproduccion.setText("Nombre genero:");
            jTree3.setVisible(true);
            jTree32.setVisible(true);
            this.imprimirArbol(jTree3);
        }
        labelPerteneceCrearListaReproduccion.setVisible(true);
        textFieldPerteneceCrearListaReproduccion.setVisible(true);
        crearCrearListaReproduccion.setVisible(true);
        fotoLista.setEnabled(false);
        jButton1.setEnabled(false);
        textFieldNombreCrearListaReproduccion.setEnabled(false);
        radioPersonalizadaCrearListaReproduccion.setEnabled(false);
        RadioDefectoCrearListaReproduccion.setEnabled(false);
        aceptarCrearListaReproduccion.setEnabled(false);
        crearCrearListaReproduccion.setEnabled(true);
        atrasCrearListaReproduccion.setEnabled(true);
    }//GEN-LAST:event_aceptarCrearListaReproduccionActionPerformed

    private void cancelarCrarListaReproduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCrarListaReproduccionActionPerformed
        frameCrearListaReproduccion.setVisible(false);
    }//GEN-LAST:event_cancelarCrarListaReproduccionActionPerformed

    private void atrasCrearListaReproduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasCrearListaReproduccionActionPerformed
        aceptarCrearListaReproduccion.setEnabled(false);
        labelPerteneceCrearListaReproduccion.setVisible(false);
        crearCrearListaReproduccion.setEnabled(false);
        textFieldPerteneceCrearListaReproduccion.setVisible(false);
        atrasCrearListaReproduccion.setEnabled(false);
        labelPerteneceCrearListaReproduccion.setVisible(false);
        textFieldPerteneceCrearListaReproduccion.setVisible(false);
        crearCrearListaReproduccion.setVisible(false);
        fotoLista.setEnabled(true);
        jButton1.setEnabled(true);
        aceptarCrearListaReproduccion.setEnabled(true);
        textFieldNombreCrearListaReproduccion.setEnabled(true);
        radioPersonalizadaCrearListaReproduccion.setEnabled(true);
        RadioDefectoCrearListaReproduccion.setEnabled(true);
        grupoBotonesCrearListaReproduccion.clearSelection();
        textFieldPerteneceCrearListaReproduccion.setText("");
    }//GEN-LAST:event_atrasCrearListaReproduccionActionPerformed

    private void cancelarPublicarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarPublicarListaActionPerformed
        framePublicarLista.setVisible(false);
    }//GEN-LAST:event_cancelarPublicarListaActionPerformed

    private void cancelarSeguirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarSeguirUsuarioActionPerformed
        frameSeguirUsuario.setVisible(false);
    }//GEN-LAST:event_cancelarSeguirUsuarioActionPerformed

    private void cancelarDejarSeguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarDejarSeguirActionPerformed
        frameDejarSeguir.setVisible(false);
    }//GEN-LAST:event_cancelarDejarSeguirActionPerformed

    private void cancelarConsultarPerfilArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarConsultarPerfilArtistaActionPerformed
        frameConsultarPerfilArtista.setVisible(false);
    }//GEN-LAST:event_cancelarConsultarPerfilArtistaActionPerformed

    private void cancelarConsultarPerfilClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarConsultarPerfilClienteActionPerformed
        frameConsultarPerfilCliente.setVisible(false);
    }//GEN-LAST:event_cancelarConsultarPerfilClienteActionPerformed

    private void aceptarConsultarPerfilClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarConsultarPerfilClienteActionPerformed
        if(!textFieldConsultarPerfilCliente.getText().equals("")){
            try{
                String nick = textFieldConsultarPerfilCliente.getText();
                textFieldConsultarPerfilCliente.setText("");
                DtCliente c = sistema.elegirCliente(nick);
                String listasFav = c.getListaFavoritos().toString(), temasFav = c.getTemaFavoritos().toString(), albumesFav = c.getAlbumFavoritos().toString(),listasCreadas = c.getListaPropias().toString();
                areaDatos.setText("");
                if(listasCreadas.equals("[]"))
                    listasCreadas = "No tiene listas creadas";
                if(temasFav.equals("[]"))
                    temasFav = "No tiene temas favoritos";
                if(listasFav.equals("[]"))
                    listasFav = "No tiene listas favoritas";
                if(albumesFav.equals("[]"))
                    albumesFav = "No tiene albumes favoritos";
                areaDatos.setText(
                        "Nick de usuario:\t" + c.getNick() + "\n" +
                        "Nombre:\t\t" + c.getNombre() + "\n" +
                        "Apellido:\t\t" + c.getApellido() + "\n" +
                        "Email:\t\t" + c.getEmail() + "\n" +
                        "Fecha nacimiento:\t" + c.getFechaNacimiento() + "\n" +
                        "Listas creadas:\t\t" + listasCreadas + "\n" + 
                        "Temas favoritos:\t" + temasFav + "\n" +
                        "Listas favoritas:\t\t" + listasFav + "\n" +
                        "Albumes favoritos:\t" + albumesFav + "\n" +
                        "Contraseña: \t" + c.getPass());
                Iterator<String> it = c.getSeguidores().iterator();
                if(it.hasNext()){
                    DefaultListModel<String> seguidores = new DefaultListModel();
                    jLabel53.setText("Seguidores");
                    while(it.hasNext())
                        seguidores.addElement(it.next());
                    listaDatos2.setModel(seguidores);
                }else{
                    listaDatos2.setVisible(false);
                    listaDatos.setVisible(false);
                    jLabel53.setVisible(false);
                }
                Iterator<String> it1 = c.getSeguidos().iterator();
                if(it1.hasNext()){
                    DefaultListModel<String> seguidos = new DefaultListModel();
                    jLabel46.setText("Seguidos:");
                    while(it1.hasNext())
                        seguidos.addElement(it1.next());
                    areaDatosSeguidores2.setModel(seguidos);
                }else{
                    areaDatosSeguidores2.setVisible(false);
                    areaDatosSeguidores.setVisible(false);
                    jLabel46.setVisible(false);
                }
                datoFoto.setText("");
                if(c.getImagen() != null)
                    datoFoto.setIcon(c.getImagen());
                else
                    datoFoto.setVisible(false);
                frameConsultarPerfilCliente.setVisible(false);
                frameDatos.setVisible(true);
            }catch(UnsupportedOperationException e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else
            JOptionPane.showMessageDialog(null, "Se debe rellenar el campo. \nDato: la lista situada debajo contiene los clientes registrados.", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_aceptarConsultarPerfilClienteActionPerformed

    private void aceptarConsultarListaReproduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarConsultarListaReproduccionActionPerformed
        try{
            areaDatosSeguidores2.setVisible(false);
            areaDatosSeguidores.setVisible(false);
            jLabel46.setVisible(false);
            jLabel53.setVisible(false);
            listaDatos2.setVisible(false);
            listaDatos.setVisible(false);
            if(radioGeneroConsultarListaReproduccion.isSelected()){
                DtPertenece p = new DtPertenece(textFieldListaConsultarListaReproduccion.getText(), textFieldOpcionConsultarListaReproduccion.getText());
                DtListaReproduccionDefecto lista = sistema.seleccionarListaReproduccionDefecto(p);
                String canciones;
                if(lista.getTemas().iterator().hasNext())
                    canciones = pasarString(lista.getTemas().iterator());
                else
                    canciones = "La lista no contiene ninguna cancion";
                areaDatos.setText("");
                areaDatos.setText(
                        "Genero de la lista:\t" + lista.getGenero() + "\n" +
                        "Nombre:\t\t" + lista.getNombre() + "\n" + 
                        "Canciones:\n\t" + canciones);
                datoFoto.setText("");
                if(lista.getImagen() != null)
                    datoFoto.setIcon(lista.getImagen());
                else
                    datoFoto.setVisible(false);
            }if(radioClienteConsultarListaReproduccion.isSelected()){
                DtPertenece p = new DtPertenece(textFieldListaConsultarListaReproduccion.getText(), textFieldOpcionConsultarListaReproduccion.getText());
                DtListaReproduccionPersonalizada lista = sistema.seleccionarListaReproduccion(p);
                String privada;
                String canciones = pasarString(lista.getTemas().iterator());
                if(lista.isPrivada())
                    privada = "Privada";
                else
                    privada = "Publica";
                areaDatos.setText("");
                areaDatos.setText(
                        "Nick de usuario:\t" + lista.getClienteAutor() + "\n" +
                        "Nombre:\t\t" + lista.getNombre() + "\n" + 
                        "Estado:\t\t" + privada + "\n" + 
                        "Canciones:\n\t" + canciones);
                datoFoto.setText("");
                if(lista.getImagen() != null)
                    datoFoto.setIcon(lista.getImagen());
                else
                    datoFoto.setVisible(false);
            }
            frameConsultarListaReproduccion.setVisible(false);
            frameDatos.setVisible(true);
        }catch(UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aceptarConsultarListaReproduccionActionPerformed

    private void cancelarConsultarListaReproduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarConsultarListaReproduccionActionPerformed
        frameConsultarListaReproduccion.setVisible(false);
    }//GEN-LAST:event_cancelarConsultarListaReproduccionActionPerformed

    private void radioGeneroConsultarListaReproduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGeneroConsultarListaReproduccionActionPerformed
        labelCambiarConsultarListaReproduccion.setVisible(true);
        aceptarConsultarListaReproduccion.setEnabled(false);
        labelCambiarConsultarListaReproduccion.setText("Elija el género:");
        listaConsultaLista2.setVisible(true);
        DefaultListModel<String> generos = new DefaultListModel();
        Iterator<String> it = sistema.listarGenero().iterator();
        while(it.hasNext())
            generos.addElement(it.next());
        listaConsultaListas.setModel(generos);
        textFieldOpcionConsultarListaReproduccion.setText("");
        labelListaConsultarListaReproduccion.setVisible(false);
        textFieldListaConsultarListaReproduccion.setVisible(false);
        textFieldOpcionConsultarListaReproduccion.setVisible(true);
    }//GEN-LAST:event_radioGeneroConsultarListaReproduccionActionPerformed

    private void radioClienteConsultarListaReproduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioClienteConsultarListaReproduccionActionPerformed
        labelCambiarConsultarListaReproduccion.setVisible(true);
        aceptarConsultarListaReproduccion.setEnabled(false);
        labelCambiarConsultarListaReproduccion.setText("Elija el cliente:");
        textFieldOpcionConsultarListaReproduccion.setVisible(true);
        listaConsultaLista2.setVisible(true);
        DefaultListModel<String> clientes = new DefaultListModel();
        Iterator<String> it = sistema.consultarPerfilCliente().iterator();
        while(it.hasNext())
            clientes.addElement(it.next());
        listaConsultaListas.setModel(clientes);
        textFieldOpcionConsultarListaReproduccion.setText("");
        labelListaConsultarListaReproduccion.setVisible(false);
        textFieldListaConsultarListaReproduccion.setVisible(false);
    }//GEN-LAST:event_radioClienteConsultarListaReproduccionActionPerformed

    private void cancelarConsultarAlbumConsultarAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarConsultarAlbumConsultarAlbumActionPerformed
        frameConsultarAlbum.setVisible(false);
    }//GEN-LAST:event_cancelarConsultarAlbumConsultarAlbumActionPerformed

    private void radioGeneroConsultarAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGeneroConsultarAlbumActionPerformed
        try {
            textFieldAlbumConsultaAlbum.setVisible(false);
            textFieldAlbumConsultaAlbum.setText("");
            textFieldEleccionConsultarAlbum.setText("");
            this.imprimirArbol(jTree1);
            jTree1.setVisible(true);
            jTree12.setVisible(true);
            listaConsultaAlbum.setVisible(false);
            labelAlbumConsultaAlbum.setVisible(false);
            aceptarConsultarAlbum.setEnabled(false);
            jLabel28.setVisible(true);
            jLabel28.setText("Ingrese el género:");
            textFieldEleccionConsultarAlbum.setVisible(true);
            textFieldEleccionConsultarAlbum.setText("");
        } catch(UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, "No se puede mostrar Generos debido a que no se inicializo ninguno. \nInicialice algun genero para proceder", "Error", JOptionPane.ERROR_MESSAGE);
            frameConsultarAlbum.setVisible(false);
        }

    }//GEN-LAST:event_radioGeneroConsultarAlbumActionPerformed

    private void radioArtistaConsultarAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioArtistaConsultarAlbumActionPerformed
        textFieldAlbumConsultaAlbum.setVisible(false);
        jTree1.setVisible(false);
        jTree12.setVisible(false);
        textFieldAlbumConsultaAlbum.setText("");
        textFieldEleccionConsultarAlbum.setText("");
        DefaultListModel<String> artistas = new DefaultListModel();
        Iterator<String> it = sistema.consultarPerfilArtista().iterator();
        while(it.hasNext())
            artistas.addElement(it.next());
        listaConsultaAlbum2.setModel(artistas);
        labelAlbumConsultaAlbum.setVisible(false);
        listaConsultaAlbum.setVisible(true);
        aceptarConsultarAlbum.setEnabled(false);
        jLabel28.setVisible(true);
        jLabel28.setText("Ingrese el artista(nick):");
        textFieldEleccionConsultarAlbum.setVisible(true);
        textFieldEleccionConsultarAlbum.setText("");
    }//GEN-LAST:event_radioArtistaConsultarAlbumActionPerformed

    private void cancelarAgregarTemaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarAgregarTemaListaActionPerformed
        frameAgregarTemaLista.setVisible(false);
    }//GEN-LAST:event_cancelarAgregarTemaListaActionPerformed

    private void agregarAltaTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAltaTemaActionPerformed
        DtTema tema = new DtTema(null,nombreAltaTema.getText(),Integer.parseInt(numeroCancionAltaTema.getText()),duracionAltaTema.getText(),nombreAltaAlbum.getText(),nickAltaAlbum.getText());
        temas.add(tema);
        nombreAltaTema.setText("");
        duracionAltaTema.setText("");
        numeroCancionAltaTema.setText("");
    }//GEN-LAST:event_agregarAltaTemaActionPerformed

    private void aceptarAltaTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarAltaTemaActionPerformed
        try{
            String[] g = generosAltaAlbum.getText().split(", ");
            ArrayList<String> generos = new ArrayList();
            int tam = g.length,i = 0;
            while(i<tam){
                generos.add(g[i]);
                i++;
            }
            DtAlbum nuevo = new DtAlbum(nombreAltaAlbum.getText(), Integer.parseInt(anioAltaAlbum.getText()), temas, nickAltaAlbum.getText(), generos, fotoAlbum.getIcon());
            Foto = null;
            sistema.altaAlbum(nuevo);
            frameAltaAlbum.setVisible(false);
            frameAltaTema.setVisible(false);
        }catch(UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aceptarAltaTemaActionPerformed

    private void cancelarAltaTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarAltaTemaActionPerformed
        frameAltaTema.setVisible(false);
    }//GEN-LAST:event_cancelarAltaTemaActionPerformed

    private void aceptarAltaAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarAltaAlbumActionPerformed
        try{
            if(sistema.verificarArtista(nickAltaAlbum.getText(),nombreAltaAlbum.getText()))
                frameAltaTema.setVisible(true);
        }catch(UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aceptarAltaAlbumActionPerformed

    private void cancelarAltaAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarAltaAlbumActionPerformed
        frameAltaAlbum.setVisible(false);
    }//GEN-LAST:event_cancelarAltaAlbumActionPerformed

    private void albumEliminarFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_albumEliminarFavoritoActionPerformed
        try{
            jLabel56.setText("Se debera indicar el nombre del album y");
            jLabel56.setVisible(true);
            jLabel57.setVisible(true);
            jLabel57.setText("el nombre del propietario separador por ', '");
            textFieldSeleccionEliminarFavorito.setText("");
            textFieldSeleccionEliminarFavorito.setVisible(true);
            favorito.setText("Seleccione el album a quitar:");
            favorito.setVisible(true);
        }catch(UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_albumEliminarFavoritoActionPerformed

    private void listaEliminarFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEliminarFavoritoActionPerformed
        try{
            jLabel56.setText("Se debera indicar el nombre de la lista, ");
            jLabel56.setVisible(true);
            jLabel57.setVisible(true);
            jLabel57.setText("y creador(cliente o genero) separador por ', '");
            textFieldSeleccionEliminarFavorito.setText("");
            textFieldSeleccionEliminarFavorito.setVisible(true);
            favorito.setText("Seleccione la lista a quitar:");
            favorito.setVisible(true);
        }catch(UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_listaEliminarFavoritoActionPerformed

    private void cancelarEliminarFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarEliminarFavoritoActionPerformed
        frameEliminarFavorito.setVisible(false);
    }//GEN-LAST:event_cancelarEliminarFavoritoActionPerformed

    private void temaEliminarFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temaEliminarFavoritoActionPerformed
        try{
            jLabel56.setText("Se debera indicar el nombre del tema, ");
            jLabel56.setVisible(true);
            jLabel57.setVisible(true);
            jLabel57.setText("el lugar en el album y el album separador por ', '");
            favorito.setText("Seleccione el tema a quitar:");
            favorito.setVisible(true);
            textFieldSeleccionEliminarFavorito.setText("");
            textFieldSeleccionEliminarFavorito.setVisible(true);
        }catch(UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_temaEliminarFavoritoActionPerformed

    private void personalizadaAgregarTemaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalizadaAgregarTemaListaActionPerformed
        jLabel31.setText("Cliente:");
        textFieldClienteAgregarTemaLista.setVisible(true);
        textFieldListaPersonalizadaAgregarTemaLista.setVisible(true);
        textFieldArtistaAgregarTemaLista.setVisible(true);
        textFieldAlbumAgregarTemaLista.setVisible(true);
        textFieldTemaAgregarTemaLista.setVisible(true);
        textFieldClienteAgregarTemaLista.setText("");
        textFieldListaPersonalizadaAgregarTemaLista.setText("");
        textFieldArtistaAgregarTemaLista.setText("");
        textFieldAlbumAgregarTemaLista.setText("");
        textFieldTemaAgregarTemaLista.setText("");
        jLabel31.setVisible(true);
        jLabel33.setVisible(true);
        jLabel34.setVisible(true);
        jLabel36.setVisible(true);
        jLabel37.setVisible(true);
    }//GEN-LAST:event_personalizadaAgregarTemaListaActionPerformed

    private void porDefectoAgregarTemaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porDefectoAgregarTemaListaActionPerformed
        jLabel31.setText("Genero:");
        textFieldClienteAgregarTemaLista.setVisible(true);
        textFieldListaPersonalizadaAgregarTemaLista.setVisible(true);
        textFieldArtistaAgregarTemaLista.setVisible(true);
        textFieldAlbumAgregarTemaLista.setVisible(true);
        textFieldTemaAgregarTemaLista.setVisible(true);
        textFieldClienteAgregarTemaLista.setText("");
        textFieldListaPersonalizadaAgregarTemaLista.setText("");
        textFieldArtistaAgregarTemaLista.setText("");
        textFieldAlbumAgregarTemaLista.setText("");
        textFieldTemaAgregarTemaLista.setText("");
        jLabel31.setVisible(true);
        jLabel33.setVisible(true);
        jLabel34.setVisible(true);
        jLabel36.setVisible(true);
        jLabel37.setVisible(true);
    }//GEN-LAST:event_porDefectoAgregarTemaListaActionPerformed

    private void aceptarConsultarAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarConsultarAlbumActionPerformed
        try{
            areaDatosSeguidores2.setVisible(false);
            areaDatosSeguidores.setVisible(false);
            jLabel46.setVisible(false);
            listaDatos2.setVisible(false);
            listaDatos.setVisible(false);
            jLabel53.setVisible(false);
            DtAlbum album = null;
            if(radioGeneroConsultarAlbum.isSelected()){
                String nombreAlbum = textFieldAlbumConsultaAlbum.getText();
                String[] datos = nombreAlbum.split(" - ");
                if(datos.length == 2){
                    DtPertenece pG = new DtPertenece(datos[0], datos[1]);
                    album = sistema.seleccionarAlbumArtista(pG);
                }else
                    JOptionPane.showMessageDialog(null, "Introduzca los campos necesarios.\nDebe ingresar el nombre del album seguido del nombre del artista separados por ' - '\n como muestra la lista a su derecha.", "Error", JOptionPane.ERROR_MESSAGE);
            }if(radioArtistaConsultarAlbum.isSelected()){
                String nick = textFieldEleccionConsultarAlbum.getText();
                String nombreAlbum = textFieldAlbumConsultaAlbum.getText();
                DtPertenece pA = new DtPertenece(nombreAlbum, nick);
                album = sistema.seleccionarAlbumArtista(pA);
            }
            areaDatos.setText("");
            String listaTemas;
            if(album.getTemas().iterator().hasNext())
                listaTemas = pasarString(album.getTemas().iterator());
            else
                listaTemas = "El album no contiene ninguna cancion";
            ArrayList<String> g = album.getGeneros();
            ArrayList<String> tema = new ArrayList();
            ArrayList<DtTema> t = album.getTemas();
            Iterator<DtTema> it = t.iterator();
            while(it.hasNext())
                tema.add(it.next().getNombre());
            String generos = g.toString();
            areaDatos.setText(
                    "Nombre del album:\t" + album.getNombre()+ "\n" +
                    "Autor:\t\t" + album.getNombreArtista()+ "\n" +
                    "Año de creación:\t" + album.getAnioCreacion() + "\n" +
                    "Genero/s:\t\t" + generos + "\n" +
                    "Temas que lo componen:\n\t" + listaTemas);
            datoFoto.setText("");
            if(album.getImagen() != null)
                datoFoto.setIcon(album.getImagen());
            else
                datoFoto.setVisible(false);
            frameConsultarAlbum.setVisible(false);
            frameDatos.setVisible(true);
        }catch(UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aceptarConsultarAlbumActionPerformed

    private void aceptarEliminarFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarEliminarFavoritoActionPerformed
        try{
            if(temaEliminarFavorito.isSelected()){
                String[] datos = textFieldSeleccionEliminarFavorito.getText().split(", ");
                if(datos.length == 3){
                    DtTema tema = new DtTema(null,datos[0], Integer.parseInt(datos[1]), null, datos[2], null);
                    sistema.quitarTemaFavorito(textFieldClienteEliminarFavorito.getText(), tema);
                }else
                    JOptionPane.showMessageDialog(null, "Introduce todo los campos necesarios!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if(albumEliminarFavorito.isSelected()){
                String[] datos = textFieldSeleccionEliminarFavorito.getText().split(", ");
                if(datos.length == 2){
                    DtPertenece album = new DtPertenece(datos[0], datos[1]);
                    sistema.quitarAlbumFavorito(textFieldClienteEliminarFavorito.getText(), album);
                }else
                    JOptionPane.showMessageDialog(null, "Introduce todo los campos necesarios!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if(listaEliminarFavorito.isSelected()){
                String[] datos = textFieldSeleccionEliminarFavorito.getText().split(", ");
                if(datos.length == 2){
                    DtPertenece p = new DtPertenece(datos[0], datos[1]);
                    sistema.quitarListaFavorito(textFieldClienteEliminarFavorito.getText(), p);
                }else
                    JOptionPane.showMessageDialog(null, "Introduce todo los campos necesarios!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            frameEliminarFavorito.setVisible(false);
        }catch(UnsupportedOperationException e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aceptarEliminarFavoritoActionPerformed
/*
    private void aceptarConsultarPerfilArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarConsultarPerfilArtistaActionPerformed
        
    }//GEN-LAST:event_aceptarConsultarPerfilArtistaActionPerformed
*/
    private void aceptarConsultaPerfilArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarConsultaPerfilArtistaActionPerformed
        try{
            DtArtista c = sistema.elegirArtista(textFieldNickConsultarPerfilArtista.getText());
            String albumes = c.getAlbum().toString();
            areaDatos.setText("");
            if(albumes.equals("[]"))
                albumes = "No ah subido ningun album";
            areaDatos.setText(
                    "Nick de usuario:\t" + c.getNick() + "\n" +
                    "Nombre:\t\t" + c.getNombre() + "\n" +
                    "Apellido:\t\t" + c.getApellido() + "\n" +
                    "Email:\t\t" + c.getEmail() + "\n" +
                    "Fecha nacimiento:\t" + c.getFechaNacimiento()+"\n"+
                    "Biografia:\t\t" + c.getBiografia()+"\n"+
                    "Web:\t\t" + c.getDireccionWeb()+"\n" + 
                    "Albumes publicados:\t" + albumes); 
            DefaultListModel<String> seguidores = new DefaultListModel();
            Iterator<String> it = c.getSeguidores().iterator();
            jLabel46.setText("Seguidores");
            while(it.hasNext())
                seguidores.addElement(it.next());
            areaDatosSeguidores2.setModel(seguidores);
            frameConsultarPerfilArtista.setVisible(false);
            listaDatos.setVisible(false);
            listaDatos2.setVisible(false);
            jLabel53.setVisible(false);
            if(c.getImagen() != null)
                datoFoto.setIcon(c.getImagen());
            else
                datoFoto.setVisible(false);
            frameDatos.setVisible(true);
        }catch(UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aceptarConsultaPerfilArtistaActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        frameDatos.setVisible(false);
        datoFoto.setText("FOTO");
        datoFoto.setIcon(null);
        areaDatosSeguidores2.setVisible(true);
        areaDatosSeguidores.setVisible(true);
        areaDatos2.setVisible(true);
        Aceptar.setVisible(true);
        listaDatos.setVisible(true);
        listaDatos2.setVisible(true);
        jLabel62.setVisible(true);
        jLabel46.setVisible(true);
        jLabel53.setVisible(true);
    }//GEN-LAST:event_AceptarActionPerformed

    private void textFieldEleccionConsultarAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEleccionConsultarAlbumActionPerformed
        try{
            if(radioGeneroConsultarAlbum.isSelected()){
                listaConsultaAlbum2.setVisible(true);
                listaConsultaAlbum.setVisible(true);
                jTree1.setVisible(false);
                jTree12.setVisible(false);
                labelAlbumConsultaAlbum.setVisible(true);
                textFieldAlbumConsultaAlbum.setVisible(true);
                DefaultListModel<String> listasGenero = new DefaultListModel();
                ArrayList<DtPertenece> albumes = sistema.seleccionarGeneroAlbum(jTree12.getToolTipText());
                Iterator<DtPertenece> ite = albumes.iterator();
                ArrayList<String> albumes2 = new ArrayList();
                while(ite.hasNext()){
                    DtPertenece album = ite.next();
                    albumes2.add(album.getNombre()+" - "+album.getNombrePertenece());
                }
                Iterator<String> it = albumes2.iterator();
                while(it.hasNext())
                    listasGenero.addElement(it.next());
                listaConsultaAlbum2.setModel(listasGenero);
            }if(radioArtistaConsultarAlbum.isSelected()){
                labelAlbumConsultaAlbum.setVisible(true);
                textFieldAlbumConsultaAlbum.setVisible(true);
                DefaultListModel<String> listasCliente = new DefaultListModel();//textFieldEleccionConsultarAlbum.getText()
                Iterator<String> it = sistema.seleccionarArtista(listaConsultaAlbum2.getSelectedValue()).iterator();
                while(it.hasNext())
                    listasCliente.addElement(it.next());
                listaConsultaAlbum2.setModel(listasCliente);
            }
        }catch(UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_textFieldEleccionConsultarAlbumActionPerformed

    private void textFieldAlbumConsultaAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldAlbumConsultaAlbumActionPerformed
        aceptarConsultarAlbum.setEnabled(true);
    }//GEN-LAST:event_textFieldAlbumConsultaAlbumActionPerformed

    private void textFieldOpcionConsultarListaReproduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldOpcionConsultarListaReproduccionActionPerformed
        try{
            if(radioGeneroConsultarListaReproduccion.isSelected()){
                textFieldListaConsultarListaReproduccion.setVisible(true);
                labelListaConsultarListaReproduccion.setVisible(true);
                textFieldListaConsultarListaReproduccion.setText("");
                DefaultListModel<String> listas = new DefaultListModel();
                Iterator<String> it = sistema.seleccionarGeneroLR(textFieldOpcionConsultarListaReproduccion.getText()).iterator();
                while(it.hasNext())
                    listas.addElement(it.next());
                listaConsultaListas.setModel(listas);
            }if(radioClienteConsultarListaReproduccion.isSelected()){
                textFieldListaConsultarListaReproduccion.setVisible(true);
                labelListaConsultarListaReproduccion.setVisible(true);
                textFieldListaConsultarListaReproduccion.setText("");
                DefaultListModel<String> listas = new DefaultListModel();
                Iterator<String> it = sistema.seleccionarCliente(textFieldOpcionConsultarListaReproduccion.getText()).iterator();
                while(it.hasNext())
                    listas.addElement(it.next());
                listaConsultaListas.setModel(listas);
            }
        }catch(UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_textFieldOpcionConsultarListaReproduccionActionPerformed

    private void textFieldListaConsultarListaReproduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldListaConsultarListaReproduccionActionPerformed
        aceptarConsultarListaReproduccion.setEnabled(true);
    }//GEN-LAST:event_textFieldListaConsultarListaReproduccionActionPerformed

    private void textFieldNickClienteSeguirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNickClienteSeguirUsuarioActionPerformed
        textFieldNickUsuarioSeguirUsuario.setVisible(true);
        textFieldNickUsuarioSeguirUsuario.setText("");
        labelElegirSeguirUsuario.setVisible(true);
    }//GEN-LAST:event_textFieldNickClienteSeguirUsuarioActionPerformed

    private void textFieldNickUsuarioSeguirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNickUsuarioSeguirUsuarioActionPerformed
        aceptarSeguirUsuario.setEnabled(true);
    }//GEN-LAST:event_textFieldNickUsuarioSeguirUsuarioActionPerformed

    private void aceptarSeguirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarSeguirUsuarioActionPerformed
        try{
            String nickCliente = textFieldNickClienteSeguirUsuario.getText(), nickUsuario = textFieldNickUsuarioSeguirUsuario.getText();
            if(!nickCliente.equals(nickUsuario)){
                sistema.seguirUsuario(nickCliente, nickUsuario);
                frameSeguirUsuario.setVisible(false);
            }
            else
                JOptionPane.showMessageDialog(null, "Un usuario no puede seguirse a si mismo!", "Error", JOptionPane.ERROR_MESSAGE);
        }catch(UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aceptarSeguirUsuarioActionPerformed

    private void textFieldClientePublicarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldClientePublicarListaActionPerformed
        try{
            if(sistema.verificarCliente(textFieldClientePublicarLista.getText())){
                textFieldListaPublicarLista.setVisible(true);
                jLabel13.setVisible(true);
            }else
                JOptionPane.showMessageDialog(null, "No existe cliente con ese nickname!", "Error", JOptionPane.ERROR_MESSAGE);
        }catch(UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_textFieldClientePublicarListaActionPerformed

    private void aceptarPublicarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarPublicarListaActionPerformed
        if(!textFieldClientePublicarLista.getText().equals("") && !textFieldListaPublicarLista.getText().equals("")){
            try{
                String nick = textFieldClientePublicarLista.getText(), nombreLista = textFieldListaPublicarLista.getText();
                sistema.hacerPublica(nick, nombreLista);
                textFieldClientePublicarLista.setText("");
                textFieldListaPublicarLista.setText("");
                framePublicarLista.setVisible(false);
            }catch(UnsupportedOperationException e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else
            JOptionPane.showMessageDialog(null, "Se deben rellenar todos los campos correspondientes.", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_aceptarPublicarListaActionPerformed

    private void textFieldListaPublicarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldListaPublicarListaActionPerformed
        aceptarPublicarLista.setEnabled(true);
    }//GEN-LAST:event_textFieldListaPublicarListaActionPerformed

    private void textFieldClienteDejarSeguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldClienteDejarSeguirActionPerformed
        try{
            if(sistema.verificarCliente(textFieldClienteDejarSeguir.getText())){
                textFieldUsuarioDejarSeguir.setVisible(true);
                labelElejirDejarSeguir.setVisible(true);
            }
        }catch(UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_textFieldClienteDejarSeguirActionPerformed

    private void textFieldUsuarioDejarSeguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldUsuarioDejarSeguirActionPerformed
        try{
            if(!textFieldUsuarioDejarSeguir.getText().equals(textFieldClienteDejarSeguir.getText()))
                aceptarDejarSeguir.setEnabled(true);
            else
                JOptionPane.showMessageDialog(null, "Un usuario no puede seguirse a si mismo!", "Error", JOptionPane.ERROR_MESSAGE);
        }catch(UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_textFieldUsuarioDejarSeguirActionPerformed

    private void crearCrearListaReproduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCrearListaReproduccionActionPerformed
        try{
            if(radioPersonalizadaCrearListaReproduccion.isSelected()){
                DtListaReproduccionPersonalizada LR = new DtListaReproduccionPersonalizada(textFieldNombreCrearListaReproduccion.getText(), null, textFieldPerteneceCrearListaReproduccion.getText(), true, this.Foto);
                this.Foto = null;
                sistema.crearListaReproduccion(LR);
                frameCrearListaReproduccion.setVisible(false);
            }
            if(RadioDefectoCrearListaReproduccion.isSelected()){
                DtListaReproduccionDefecto LR = new DtListaReproduccionDefecto(textFieldNombreCrearListaReproduccion.getText(), null, textFieldPerteneceCrearListaReproduccion.getText(), this.Foto);
                this.Foto = null;
                sistema.crearListaReproduccion(LR);
                frameCrearListaReproduccion.setVisible(false);
            }
        }catch(UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_crearCrearListaReproduccionActionPerformed

    private void textFieldNombreCrearListaReproduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNombreCrearListaReproduccionActionPerformed
        aceptarCrearListaReproduccion.setEnabled(false);
        if(radioPersonalizadaCrearListaReproduccion.isSelected() || RadioDefectoCrearListaReproduccion.isSelected())
            aceptarCrearListaReproduccion.setEnabled(true);
    }//GEN-LAST:event_textFieldNombreCrearListaReproduccionActionPerformed

    private void radioPersonalizadaCrearListaReproduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPersonalizadaCrearListaReproduccionActionPerformed
        aceptarCrearListaReproduccion.setEnabled(false);
        if(!textFieldNombreCrearListaReproduccion.getText().equals(""))
            aceptarCrearListaReproduccion.setEnabled(true);
    }//GEN-LAST:event_radioPersonalizadaCrearListaReproduccionActionPerformed

    private void RadioDefectoCrearListaReproduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioDefectoCrearListaReproduccionActionPerformed
        aceptarCrearListaReproduccion.setEnabled(false);
        if(!textFieldNombreCrearListaReproduccion.getText().equals(""))
            aceptarCrearListaReproduccion.setEnabled(true);
    }//GEN-LAST:event_RadioDefectoCrearListaReproduccionActionPerformed

    private void aceptarDejarSeguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarDejarSeguirActionPerformed
        try{
            sistema.dejarSeguir(textFieldClienteDejarSeguir.getText(),textFieldUsuarioDejarSeguir.getText());
            textFieldUsuarioDejarSeguir.setText("");
            textFieldClienteDejarSeguir.setText("");
            frameDejarSeguir.setVisible(false);
        }catch(UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_aceptarDejarSeguirActionPerformed

    private void textFieldClienteEliminarFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldClienteEliminarFavoritoActionPerformed
        try{    
            if(sistema.verificarCliente(textFieldClienteEliminarFavorito.getText())){
                temaEliminarFavorito.setVisible(true);
                albumEliminarFavorito.setVisible(true);
                listaEliminarFavorito.setVisible(true);
                jLabel48.setVisible(true);
            }
        }catch(UnsupportedOperationException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_textFieldClienteEliminarFavoritoActionPerformed

    private void textFieldSeleccionEliminarFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldSeleccionEliminarFavoritoActionPerformed
        aceptarEliminarFavorito.setEnabled(true);
    }//GEN-LAST:event_textFieldSeleccionEliminarFavoritoActionPerformed

    private void menuQuitarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuQuitarTemaActionPerformed
        textFieldClienteQuitarTemaLista.setVisible(false);
        textFieldListaPersonalizadaQuitarTemaLista.setVisible(false);
        textFieldArtistaQuitarTemaLista.setVisible(false);
        textFieldAlbumQuitarTemaLista.setVisible(false);
        textFieldTemaQuitarTemaLista.setVisible(false);
        this.imprimirArbol(jTree6);
        jLabel35.setVisible(false);
        jLabel38.setVisible(false);
        jLabel58.setVisible(false);
        jLabel59.setVisible(false);
        jLabel60.setVisible(false);
        jLabel61.setVisible(false);
        textFieldClienteQuitarTemaLista.setText("");
        textFieldListaPersonalizadaQuitarTemaLista.setText("");
        textFieldArtistaQuitarTemaLista.setText("");
        textFieldAlbumQuitarTemaLista.setText("");
        textFieldTemaQuitarTemaLista.setText("");
        grupoBotonesQuitarTemaLista.clearSelection();
        frameQuitarTema.setVisible(true);
    }//GEN-LAST:event_menuQuitarTemaActionPerformed

    private void aceptarAgregarTemaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarAgregarTemaListaActionPerformed
        if(!textFieldListaPersonalizadaAgregarTemaLista.getText().equals("") && !textFieldClienteAgregarTemaLista.getText().equals("") && !textFieldAlbumAgregarTemaLista.getText().equals("") && !textFieldArtistaAgregarTemaLista.getText().equals("")){
            try{
                if(personalizadaAgregarTemaLista.isSelected()){
                    DtPertenece listaPropietario = new DtPertenece(textFieldListaPersonalizadaAgregarTemaLista.getText(), textFieldClienteAgregarTemaLista.getText());
                    DtPertenece ruta = new DtPertenece(textFieldAlbumAgregarTemaLista.getText(), textFieldArtistaAgregarTemaLista.getText());
                    sistema.agregarTemaListaPersonalizada(listaPropietario, ruta, Integer.parseInt(textFieldTemaAgregarTemaLista.getText()));
                }
                if(porDefectoAgregarTemaLista.isSelected()){
                    DtPertenece listaPropietario = new DtPertenece(textFieldListaPersonalizadaAgregarTemaLista.getText(), textFieldClienteAgregarTemaLista.getText());
                    DtPertenece ruta = new DtPertenece(textFieldAlbumAgregarTemaLista.getText(), textFieldArtistaAgregarTemaLista.getText());
                    sistema.agregarTemaListaDefecto(listaPropietario, ruta, Integer.parseInt(textFieldTemaAgregarTemaLista.getText()));
                }
                frameAgregarTemaLista.setVisible(false);
            }catch(UnsupportedOperationException e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else
            JOptionPane.showMessageDialog(null, "Se deben rellenar todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_aceptarAgregarTemaListaActionPerformed

    private void text8AgregarFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text8AgregarFavoritoActionPerformed
        jButton2.setEnabled(true);
    }//GEN-LAST:event_text8AgregarFavoritoActionPerformed

    private void text6AgregarFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text6AgregarFavoritoActionPerformed
        text8AgregarFavorito.setVisible(true);
        jLabel52.setVisible(true);
    }//GEN-LAST:event_text6AgregarFavoritoActionPerformed

    private void text5AgregarFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text5AgregarFavoritoActionPerformed
        aceptarAgregarFavorito.setEnabled(true);
    }//GEN-LAST:event_text5AgregarFavoritoActionPerformed

    private void text4AgregarFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text4AgregarFavoritoActionPerformed
        jLabel43.setVisible(true);
        text5AgregarFavorito.setText("");
        text5AgregarFavorito.setVisible(true);
    }//GEN-LAST:event_text4AgregarFavoritoActionPerformed

    private void cancelarAgregarFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarAgregarFavoritoActionPerformed
        frameGuardarTemaFav.setVisible(false);
    }//GEN-LAST:event_cancelarAgregarFavoritoActionPerformed

    private void aceptarAgregarFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarAgregarFavoritoActionPerformed
        if(!jTextField1.getText().equals("") && !text1AgregarFavorito.getText().equals("") && !text2AgregarFavorito.getText().equals("") && !text3AgregarFavorito.getText().equals("")){
            try { 
                String nickCliente = jTextField1.getText(), nombreArtista = text1AgregarFavorito.getText(), nombreAl = text2AgregarFavorito.getText();
                int numeroCancion = Integer.parseInt(text3AgregarFavorito.getText());
                sistema.agregarTemaFavAlbum(nickCliente, numeroCancion, nombreAl, nombreArtista);
                frameGuardarTemaFav.setVisible(false);
            } catch (UnsupportedOperationException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else
            JOptionPane.showMessageDialog(null, "Ingrese valores en todos los campos para proceder.", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_aceptarAgregarFavoritoActionPerformed

    private void menuGuardarFavoritoListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarFavoritoListaActionPerformed
        grupoBotonesAgregarFavorito1.clearSelection();
        jTree52.setVisible(false);
        jLabel44.setVisible(false);
        jLabel52.setVisible(false);
        jTextField3.setText("");
        imprimirArbol(jTree5);
        text6AgregarFavorito.setText("");
        text8AgregarFavorito.setText("");
        text6AgregarFavorito.setVisible(false);
        text8AgregarFavorito.setVisible(false);
        jButton2.setEnabled(false);
        frameGuardarListaFav.setVisible(true);
    }//GEN-LAST:event_menuGuardarFavoritoListaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        frameGuardarListaFav.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void radioPersonalizadaGuardarListaFavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPersonalizadaGuardarListaFavActionPerformed
        text6AgregarFavorito.setText("");
        text8AgregarFavorito.setText("");
        text6AgregarFavorito.setVisible(true);
        jLabel44.setText("Cliente:");
        jLabel44.setVisible(true);
        text8AgregarFavorito.setVisible(false);
        jLabel52.setVisible(false);
        jTree52.setVisible(false);
        jButton2.setEnabled(false);
    }//GEN-LAST:event_radioPersonalizadaGuardarListaFavActionPerformed

    private void radioDefectoGuardarListaFavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDefectoGuardarListaFavActionPerformed
        text6AgregarFavorito.setVisible(true);
        text6AgregarFavorito.setText("");
        text8AgregarFavorito.setText("");
        jLabel44.setText("Género:");
        jLabel44.setVisible(true);
        text8AgregarFavorito.setVisible(false);
        jLabel52.setVisible(false);
        jTree52.setVisible(true);
        jButton2.setEnabled(false);
    }//GEN-LAST:event_radioDefectoGuardarListaFavActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(!text6AgregarFavorito.getText().equals("") && !text8AgregarFavorito.getText().equals("") && !jTextField3.getText().equals("")){
            if(radioPersonalizadaGuardarListaFav.isSelected()){
                try {
                    String cliente = text6AgregarFavorito.getText(), lista = text8AgregarFavorito.getText(), clienteCaso = jTextField3.getText();
                    sistema.agregarListaFavPersonalizada(clienteCaso, lista, cliente);
                    frameGuardarListaFav.setVisible(false);
                }catch(UnsupportedOperationException e){
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }if(radioDefectoGuardarListaFav.isSelected()){
                try {
                    String cliente = text6AgregarFavorito.getText(), lista = text8AgregarFavorito.getText(), clienteCaso = jTextField3.getText();
                    sistema.agregarListaFavDefecto(clienteCaso, lista, cliente);
                    frameGuardarListaFav.setVisible(false);
                } catch (UnsupportedOperationException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else
            JOptionPane.showMessageDialog(null, "Ingrese valores en todos los campos para proceder.", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        frameGuardarAlbum.setVisible(true);
        text4AgregarFavorito.setText("");
        text5AgregarFavorito.setText("");
        jTextField4.setText("");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        frameGuardarAlbum.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frameGuardarTemaFav.setVisible(true);
        jTextField1.setText("");
        text1AgregarFavorito.setText("");
        text2AgregarFavorito.setText("");
        text3AgregarFavorito.setText("");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(!jTextField4.getText().equals("") && !text4AgregarFavorito.getText().equals("") && !text5AgregarFavorito.getText().equals("")){
            try { 
                String nick = jTextField4.getText(), nombreArtista = text4AgregarFavorito.getText(), nombreAl = text5AgregarFavorito.getText();
                sistema.agregarAlbumFav(nick, nombreAl, nombreArtista);
                frameGuardarAlbum.setVisible(false);
            } catch (UnsupportedOperationException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else
            JOptionPane.showMessageDialog(null, "Ingrese valores en todos los campos para proceder.", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int resultado;
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png");
        jfchCargarfoto.setFileFilter(filtro);
        resultado= jfchCargarfoto.showOpenDialog(null);
        if (JFileChooser.APPROVE_OPTION == resultado){
            fichero = jfchCargarfoto.getSelectedFile();
            try{
                ImageIcon icon = new ImageIcon(fichero.toString());
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(fotoAlbum.getWidth(), fotoAlbum.getHeight(),Image.SCALE_DEFAULT));
                fotoAlbum.setText(null);
                fotoAlbum.setIcon(icono);
                this.Foto = icono;
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error abriendo la imagen "+ ex);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void personalizadaQuitarTemaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalizadaQuitarTemaListaActionPerformed
        jLabel60.setText("Cliente:");
        textFieldClienteQuitarTemaLista.setVisible(true);
        textFieldListaPersonalizadaQuitarTemaLista.setVisible(true);
        textFieldArtistaQuitarTemaLista.setVisible(true);
        textFieldAlbumQuitarTemaLista.setVisible(true);
        textFieldTemaQuitarTemaLista.setVisible(true);
        textFieldClienteQuitarTemaLista.setText("");
        textFieldListaPersonalizadaQuitarTemaLista.setText("");
        textFieldArtistaQuitarTemaLista.setText("");
        textFieldAlbumQuitarTemaLista.setText("");
        textFieldTemaQuitarTemaLista.setText("");
        jLabel35.setVisible(true);
        jLabel58.setVisible(true);
        jLabel59.setVisible(true);
        jLabel60.setVisible(true);
        jLabel61.setVisible(true);
    }//GEN-LAST:event_personalizadaQuitarTemaListaActionPerformed

    private void porDefectoQuitarTemaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porDefectoQuitarTemaListaActionPerformed
        jLabel60.setText("Género:");
        textFieldClienteQuitarTemaLista.setVisible(true);
        textFieldListaPersonalizadaQuitarTemaLista.setVisible(true);
        textFieldArtistaQuitarTemaLista.setVisible(true);
        textFieldAlbumQuitarTemaLista.setVisible(true);
        textFieldTemaQuitarTemaLista.setVisible(true);
        textFieldClienteQuitarTemaLista.setText("");
        textFieldListaPersonalizadaQuitarTemaLista.setText("");
        textFieldArtistaQuitarTemaLista.setText("");
        textFieldAlbumQuitarTemaLista.setText("");
        textFieldTemaQuitarTemaLista.setText("");
        jLabel35.setVisible(true);
        jLabel58.setVisible(true);
        jLabel59.setVisible(true);
        jLabel60.setVisible(true);
        jLabel61.setVisible(true);
    }//GEN-LAST:event_porDefectoQuitarTemaListaActionPerformed

    private void aceptarAgregarTemaLista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarAgregarTemaLista1ActionPerformed
        if(!textFieldClienteQuitarTemaLista.getText().equals("") && !textFieldListaPersonalizadaQuitarTemaLista.getText().equals("") && !textFieldArtistaQuitarTemaLista.getText().equals("") && !textFieldAlbumQuitarTemaLista.getText().equals("") && !textFieldTemaQuitarTemaLista.getText().equals("")){
            if(personalizadaQuitarTemaLista.isSelected()){
                try {
                    DtPertenece listaPropietario = new DtPertenece(textFieldListaPersonalizadaQuitarTemaLista.getText(), textFieldClienteQuitarTemaLista.getText()), ruta = new DtPertenece(textFieldAlbumQuitarTemaLista.getText(), textFieldArtistaQuitarTemaLista.getText());
                    sistema.quitarTemaListaPersonalizada(listaPropietario, ruta, Integer.parseInt(textFieldTemaQuitarTemaLista.getText()));
                    frameQuitarTema.setVisible(false);
                } catch (UnsupportedOperationException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }if(porDefectoQuitarTemaLista.isSelected()){
                try {
                    DtPertenece listaPropietario = new DtPertenece(textFieldListaPersonalizadaQuitarTemaLista.getText(), textFieldClienteQuitarTemaLista.getText()), ruta = new DtPertenece(textFieldAlbumQuitarTemaLista.getText(), textFieldArtistaQuitarTemaLista.getText());
                    sistema.quitarTemaListaDefecto(listaPropietario, ruta, Integer.parseInt(textFieldTemaQuitarTemaLista.getText()));
                    frameQuitarTema.setVisible(false);
                } catch (UnsupportedOperationException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else
            JOptionPane.showMessageDialog(null, "Ingrese valores en todos los campos para proceder.", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_aceptarAgregarTemaLista1ActionPerformed

    private void cancelarAgregarTemaLista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarAgregarTemaLista1ActionPerformed
        frameQuitarTema.setVisible(false);
    }//GEN-LAST:event_cancelarAgregarTemaLista1ActionPerformed
    File fichero;
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Inicializacion
                new ventanaPrincipal().setVisible(true);
            }
        });
    }
    
    private void inicializarTest(){
        // Se dan de alta clientes
        sistema.altaPerfil(new DtCliente("Juano", "Juan", "Vega", "Juan@hotmail.com", "23/6/1995", null, "123"));
        sistema.altaPerfil(new DtCliente("Lea", "Leandro", "Curbelo", "l_curbe@hotmail.com", "3/1/1997", null, "123"));
        sistema.altaPerfil(new DtCliente("San", "Santiago", "Amengual", "amengual@hotmail.com", "7/6/1995", null, "123"));
        sistema.altaPerfil(new DtCliente("Mari", "Mariano", "Callero", "Mariano@hotmail.com", "1/12/1986", null, "123"));
        // Se dan de alta artistas
        sistema.altaPerfil(new DtArtista("Gardel", "Antonio", "Paiba", "antonitopaiba21@hotmail.com", "1/4/1972", null, "Hijo de Mirta Zaguaver e hijo de Antonio Paiba padre", "www.soytuantonito.com", null, null, "123"));
        sistema.altaPerfil(new DtArtista("OreOre", "Natalia", "Oreiro", "lapibapalosPibes@hotmail.com", "7/12/2000", null, "Actriz, modelo, te hace todo", "www.natiPhot.com", null, null, "123"));
        sistema.altaPerfil(new DtArtista("Laka", "Lakamorra", "Banda", "sentiloLaKamorra@hotmail.com", "1/1/1970", null, "Banda en crecimiento", "www.kamorramusic.com", null, null, "123"));
        //Se crean los Generos
        sistema.altaGenero("Genero");
        sistema.altaGenero("Rock","Genero");
        sistema.altaGenero("Tango","Genero");
        sistema.altaGenero("Cumbia","Genero");
        sistema.altaGenero("Villera","Cumbia");
        sistema.altaGenero("Cheta", "Cumbia");
        sistema.altaGenero("Metalica","Genero");
        sistema.altaGenero("Nacional", "Rock");
        // Se crean seguimientos de parte de un cliente a un usuario
        sistema.seguirUsuario("Juano", "OreOre");
//        sistema.seguirUsuario("Juano", "Gardel");
//        sistema.seguirUsuario("Juano", "Laka");
//        sistema.seguirUsuario("Mari", "Laka");
//        sistema.seguirUsuario("Mari", "Juano");
//        sistema.seguirUsuario("San", "Juano");
//        sistema.seguirUsuario("San", "Lea");
//        sistema.seguirUsuario("Lea", "Juano");
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
        sistema.altaAlbum(new DtAlbum("Album1", 1999, listaTemas, "Laka", generos, null));
        
        t1 = new DtTema(null,"Tango1", 1, "2:13", "Adios muchachos", "Gardel");
        t2 = new DtTema(null,"Tango2", 2, "2:13", "Adios muchachos", "Gardel");
        t3 = new DtTema(null,"Tango3", 3, "2:13", "Adios muchachos", "Gardel");
        
        listaTemas = new ArrayList();
        generos = new ArrayList();
        listaTemas.add(t1);
        listaTemas.add(t2);
        listaTemas.add(t3);
        generos.add("Tango");
        sistema.altaAlbum(new DtAlbum("Adios muchachos", 1999, listaTemas, "Gardel", generos, null));
        // Se crean 2 listas por defecto y se le agregan temas de sus respectivos generos
        listaT.add(t1);
        listaT.add(t2);
        listaT.add(t3);
        sistema.crearListaReproduccion(new DtListaReproduccionDefecto("Lista tango", listaT,"Tango", null));
          DtPertenece listaPropietario = new DtPertenece("Lista tango","Tango"), ruta = new DtPertenece("Adios muchachos", "Gardel");
        sistema.agregarTemaListaDefecto(listaPropietario, ruta, 1);
        sistema.agregarTemaListaDefecto(listaPropietario, ruta, 2);
        sistema.agregarTemaListaDefecto(listaPropietario, ruta, 3);
        
        sistema.crearListaReproduccion(new DtListaReproduccionPersonalizada("ListaPersonalizada1", listaT, "Lea", false, null));
        listaPropietario = new DtPertenece("ListaPersonalizada1", "Lea");
        ruta = new DtPertenece("Album1", "Laka");
        sistema.agregarTemaListaPersonalizada(listaPropietario, ruta, 1);
        sistema.agregarTemaListaPersonalizada(listaPropietario, ruta, 2);
        sistema.agregarTemaListaPersonalizada(listaPropietario, ruta, 3);
        sistema.altaSuscripcion("Lea",150,"Mensual");
        sistema.listarSuscripciones("Lea");
        sistema.agregarListaFavDefecto("Juano","Lista tango","Tango");
        sistema.agregarAlbumFav("Lea","Adios muchachos","Gardel");
        sistema.agregarTemaFavAlbum("Lea",1,"Album1","Laka");

    }
    
    private String pasarString(Iterator<DtTema> it) {
        if(it.hasNext()){
            DtTema tema = it.next();
            String nodo = new String(
                    "Nombre tema: \t" + tema.getNombre() + "\n\t\t" + 
                    "Nombre album: \t" + tema.getAlbum() + "\n\t\t" + 
                    "Numero cancion:\t" + tema.getNumeroAlbum() + "\n\t\t" + 
                    "Nombre artista:\t\t" + tema.getArtista() + "\n\t\t" + 
                    "Duracion: \t\t" + tema.getDuracion());
            return nodo + "\n\t" + pasarString(it);
        }else
            return "\n";
    }

    private void imprimirArbol(JTree tree) {
        DtArbol arbol = sistema.listarArbolGenero();
        DefaultMutableTreeNode Generos = new DefaultMutableTreeNode();
        Generos.add(darNodo(arbol));
        DefaultTreeModel raiz = new DefaultTreeModel(Generos,false);
        tree.setModel(raiz);
    }
    
    private boolean verificacionContrasenia(char[] pass, char[] pass2) {
        int largo1 = pass.length, largo2 = pass2.length, pibot1 = 0, pibot2 = 0;
        if(largo1 == largo2){
            while(pibot2<largo2 && pass[pibot1] == pass2[pibot2]){
                pibot1+=1;
                pibot2+=1;
            }
            if(pibot2 == largo2)
                return true;
            else
                return false;
        }else
            return false;
    }
    
    private DefaultMutableTreeNode darNodo(DtArbol arbol){
        DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(arbol.getNombre());
        Iterator<DtArbol> it = arbol.getHijos().iterator();
        while(it.hasNext())
            nodo.add(darNodo(it.next()));
        return nodo;
    }
    
    private void ocultarFrameInternos(){
        // LOS 2 PRIMEROS PARAMETROS EN RESHAPE SON PARA LA POSICION, LOS OTROS 2 SON LAS MEDIDAS
        // EL TERCERO ES PARA EL ANCHO Y EL CUARTO PARA EL ALTO
        
        frameAltaArtista.setVisible(false);
        frameAltaArtista.reshape(500, 200, 550, 650);
        for(Integer i=1;i<32;i++)
            comboBoxDiaAltaArtista.addItem(i.toString());
        for(Integer i=1;i<13;i++)
            comboBoxMesAltaArtista.addItem(i.toString());
        for(Integer i=1930;i<2017;i++)
             comboBoxAnioAltaArtista.addItem(i.toString());
        
        
        frameAltaCliente.setVisible(false);
        frameAltaCliente.reshape(500, 200, 500, 600);
        for(Integer i=1;i<32;i++)
            comboBoxDiaAltaCliente.addItem(i.toString());
        for(Integer i=1;i<13;i++)
            comboBoxMesAltaCliente.addItem(i.toString());
        for(Integer i=1930;i<2017;i++)
             comboBoxAnioAltaCliente.addItem(i.toString());
        
        
        frameAltaGenero.setVisible(false);
        frameAltaGenero.reshape(500, 200, 347, 290);
        
        
        frameCrearListaReproduccion.setVisible(false);
        frameCrearListaReproduccion.reshape(500, 200, 600, 550);
        grupoBotonesCrearListaReproduccion.add(radioPersonalizadaCrearListaReproduccion);
        grupoBotonesCrearListaReproduccion.add(RadioDefectoCrearListaReproduccion);
        
        
        framePublicarLista.setVisible(false);
        framePublicarLista.reshape(500, 200, 355, 269);
        
        
        frameSeguirUsuario.setVisible(false);
        frameSeguirUsuario.reshape(500, 200, 309, 250);
        
        
        frameDejarSeguir.setVisible(false);
        frameDejarSeguir.reshape(500, 200, 356, 219);
        
        
        frameConsultarPerfilArtista.setVisible(false);
        frameConsultarPerfilArtista.reshape(500, 200, 455, 404);
       
        
        frameConsultarPerfilCliente.setVisible(false);
        frameConsultarPerfilCliente.reshape(500, 200, 414, 412);
        
        
        frameConsultarListaReproduccion.setVisible(false);
        frameConsultarListaReproduccion.reshape(500, 200, 528, 362);
        grupoBotonesConsultarListaReproduccion.add(radioGeneroConsultarListaReproduccion);
        grupoBotonesConsultarListaReproduccion.add(radioClienteConsultarListaReproduccion);
        
        
        frameConsultarAlbum.setVisible(false);
        frameConsultarAlbum.reshape(500, 200, 681, 602);
        grupoBotonesConsultarAlbum.add(radioGeneroConsultarAlbum);
        grupoBotonesConsultarAlbum.add(radioArtistaConsultarAlbum);
        
        
        frameAgregarTemaLista.setVisible(false);
        frameAgregarTemaLista.reshape(500, 200, 860, 724);
        grupoBotonesAgregarTemaLista.add(personalizadaAgregarTemaLista);
        grupoBotonesAgregarTemaLista.add(porDefectoAgregarTemaLista);
        
        
        frameAltaTema.setVisible(false);
        frameAltaTema.reshape(500, 200, 442, 280);
        
        
        frameAltaAlbum.setVisible(false);
        frameAltaAlbum.reshape(500, 200, 610, 580);
        
        
        cargarFoto.setVisible(false);
        cargarFoto.reshape(500, 200, 639, 427);
        
        
        frameEliminarFavorito.setVisible(false);
        frameEliminarFavorito.reshape(500, 200, 456, 380);
        grupoBotonesEliminarFavorito.add(temaEliminarFavorito);
        grupoBotonesEliminarFavorito.add(albumEliminarFavorito);
        grupoBotonesEliminarFavorito.add(listaEliminarFavorito);
        
        
        frameGuardarTemaFav.setVisible(false);
        frameGuardarTemaFav.reshape(500, 200, 723, 450);
        
        frameGuardarListaFav.setVisible(false);
        frameGuardarListaFav.reshape(500, 200, 580, 520);
        grupoBotonesAgregarFavorito1.add(radioDefectoGuardarListaFav);
        grupoBotonesAgregarFavorito1.add(radioPersonalizadaGuardarListaFav);
        
        
        frameDatos.setVisible(false);
        frameDatos.reshape(500, 200, 820, 680);
        
        
        frameGuardarAlbum.setVisible(false);
        frameGuardarAlbum.reshape(500, 200, 403, 416);

        
        frameGuardarTemaFav.setVisible(false);
        frameGuardarTemaFav.reshape(500, 200, 530, 451);


        frameQuitarTema.setVisible(false);
        frameQuitarTema.reshape(500, 200, 620, 600);
        grupoBotonesQuitarTemaLista.add(personalizadaQuitarTemaLista);
        grupoBotonesQuitarTemaLista.add(porDefectoQuitarTemaLista);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JRadioButton RadioDefectoCrearListaReproduccion;
    private javax.swing.JButton aceptarAgregarFavorito;
    private javax.swing.JButton aceptarAgregarTemaLista;
    private javax.swing.JButton aceptarAgregarTemaLista1;
    private javax.swing.JButton aceptarAltaAlbum;
    private javax.swing.JButton aceptarAltaArtista;
    private javax.swing.JButton aceptarAltaCliente;
    private javax.swing.JButton aceptarAltaGenero;
    private javax.swing.JButton aceptarAltaTema;
    private javax.swing.JButton aceptarConsultaPerfilArtista;
    private javax.swing.JButton aceptarConsultarAlbum;
    private javax.swing.JButton aceptarConsultarListaReproduccion;
    private javax.swing.JButton aceptarConsultarPerfilCliente;
    private javax.swing.JButton aceptarCrearListaReproduccion;
    private javax.swing.JButton aceptarDejarSeguir;
    private javax.swing.JButton aceptarEliminarFavorito;
    private javax.swing.JButton aceptarPublicarLista;
    private javax.swing.JButton aceptarSeguirUsuario;
    private javax.swing.JButton agregarAltaTema;
    private javax.swing.JRadioButton albumEliminarFavorito;
    private javax.swing.JTextField anioAltaAlbum;
    private javax.swing.JTextField apellidoAltaArtista;
    private javax.swing.JTextField apellidoAltaCliente;
    private javax.swing.JTextArea areaDatos;
    private javax.swing.JScrollPane areaDatos2;
    private javax.swing.JScrollPane areaDatosSeguidores;
    private javax.swing.JList<String> areaDatosSeguidores2;
    private javax.swing.JButton atrasCrearListaReproduccion;
    private javax.swing.JMenuBar barraMenuPrincipal;
    private javax.swing.JButton botonCargarFoto;
    private javax.swing.JButton botonCargarFoto1;
    private javax.swing.JButton cancelarAgregarFavorito;
    private javax.swing.JButton cancelarAgregarTemaLista;
    private javax.swing.JButton cancelarAgregarTemaLista1;
    private javax.swing.JButton cancelarAltaAlbum;
    private javax.swing.JButton cancelarAltaArtista;
    private javax.swing.JButton cancelarAltaCliente;
    private javax.swing.JButton cancelarAltaGenero;
    private javax.swing.JButton cancelarAltaTema;
    private javax.swing.JButton cancelarConsultarAlbum;
    private javax.swing.JButton cancelarConsultarListaReproduccion;
    private javax.swing.JButton cancelarConsultarPerfilArtista;
    private javax.swing.JButton cancelarConsultarPerfilCliente;
    private javax.swing.JButton cancelarCrarListaReproduccion;
    private javax.swing.JButton cancelarDejarSeguir;
    private javax.swing.JButton cancelarEliminarFavorito;
    private javax.swing.JButton cancelarPublicarLista;
    private javax.swing.JButton cancelarSeguirUsuario;
    private javax.swing.JInternalFrame cargarFoto;
    private javax.swing.JComboBox<String> comboBoxAnioAltaArtista;
    private javax.swing.JComboBox<String> comboBoxAnioAltaCliente;
    private javax.swing.JComboBox<String> comboBoxDiaAltaArtista;
    private javax.swing.JComboBox<String> comboBoxDiaAltaCliente;
    private javax.swing.JComboBox<String> comboBoxMesAltaArtista;
    private javax.swing.JComboBox<String> comboBoxMesAltaCliente;
    private javax.swing.JTextField correoElectronicoAltaArtista;
    private javax.swing.JTextField correoElectronicoAltaCliente;
    private javax.swing.JButton crearCrearListaReproduccion;
    private javax.swing.JLabel datoFoto;
    private javax.swing.JTextArea descripcionAltaArtista;
    private javax.swing.JTextField duracionAltaTema;
    private javax.swing.JLabel favorito;
    private javax.swing.JLabel fotoAlbum;
    private javax.swing.JLabel fotoAltaArtista;
    private javax.swing.JLabel fotoAltaCliente;
    private javax.swing.JLabel fotoLista;
    private javax.swing.JInternalFrame frameAgregarTemaLista;
    private javax.swing.JInternalFrame frameAltaAlbum;
    private javax.swing.JInternalFrame frameAltaArtista;
    private javax.swing.JInternalFrame frameAltaCliente;
    private javax.swing.JInternalFrame frameAltaGenero;
    private javax.swing.JInternalFrame frameAltaTema;
    private javax.swing.JInternalFrame frameConsultarAlbum;
    private javax.swing.JInternalFrame frameConsultarListaReproduccion;
    private javax.swing.JInternalFrame frameConsultarPerfilArtista;
    private javax.swing.JInternalFrame frameConsultarPerfilCliente;
    private javax.swing.JInternalFrame frameCrearListaReproduccion;
    private javax.swing.JInternalFrame frameDatos;
    private javax.swing.JInternalFrame frameDejarSeguir;
    private javax.swing.JInternalFrame frameEliminarFavorito;
    private javax.swing.JInternalFrame frameGuardarAlbum;
    private javax.swing.JInternalFrame frameGuardarListaFav;
    private javax.swing.JInternalFrame frameGuardarTemaFav;
    private javax.swing.JInternalFrame framePublicarLista;
    private javax.swing.JInternalFrame frameQuitarTema;
    private javax.swing.JInternalFrame frameSeguirUsuario;
    private javax.swing.JTextField generosAltaAlbum;
    private javax.swing.ButtonGroup grupoBotonesAgregarFavorito;
    private javax.swing.ButtonGroup grupoBotonesAgregarFavorito1;
    private javax.swing.ButtonGroup grupoBotonesAgregarFavorito2;
    private javax.swing.ButtonGroup grupoBotonesAgregarTemaLista;
    private javax.swing.ButtonGroup grupoBotonesConsultarAlbum;
    private javax.swing.ButtonGroup grupoBotonesConsultarListaReproduccion;
    private javax.swing.ButtonGroup grupoBotonesCrearListaReproduccion;
    private javax.swing.ButtonGroup grupoBotonesEliminarFavorito;
    private javax.swing.ButtonGroup grupoBotonesQuitarTemaLista;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTree jTree1;
    private javax.swing.JScrollPane jTree12;
    private javax.swing.JTree jTree2;
    private javax.swing.JTree jTree3;
    private javax.swing.JScrollPane jTree32;
    private javax.swing.JTree jTree4;
    private javax.swing.JTree jTree5;
    private javax.swing.JScrollPane jTree52;
    private javax.swing.JTree jTree6;
    public static javax.swing.JFileChooser jfchCargarfoto;
    private javax.swing.JLabel labelAlbumConsultaAlbum;
    private javax.swing.JLabel labelAlbumesTemaAgregarFavorito;
    private javax.swing.JLabel labelAnioAltaAlbum;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelApellido1;
    private javax.swing.JLabel labelArtistaAltaAlbum;
    private javax.swing.JLabel labelCambiarConsultarListaReproduccion;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelCorreo1;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelElegirSeguirUsuario;
    private javax.swing.JLabel labelElejirDejarSeguir;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelFecha1;
    private javax.swing.JLabel labelGenerosAltaAlbum;
    private javax.swing.JLabel labelListaConsultarListaReproduccion;
    private javax.swing.JLabel labelNick;
    private javax.swing.JLabel labelNick1;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombre1;
    private javax.swing.JLabel labelNombreAltaAlbum;
    private javax.swing.JLabel labelNombreCrearListaReproduccion;
    private javax.swing.JLabel labelPerteneceCrearListaReproduccion;
    private javax.swing.JLabel labelSitioWeb;
    private javax.swing.JScrollPane listaArtistasConsultarPerfilArtista;
    private javax.swing.JList<String> listaArtistasConsultarPerfilArtista2;
    private javax.swing.JScrollPane listaClientesConsultarPerfilCliente;
    private javax.swing.JList<String> listaClientesConsultarPerfilCliente2;
    private javax.swing.JScrollPane listaConsultaAlbum;
    private javax.swing.JList<String> listaConsultaAlbum2;
    private javax.swing.JScrollPane listaConsultaLista2;
    private javax.swing.JList<String> listaConsultaListas;
    private javax.swing.JScrollPane listaDatos;
    private javax.swing.JList<String> listaDatos2;
    private javax.swing.JRadioButton listaEliminarFavorito;
    private javax.swing.JMenuItem menuAcercaDe;
    private javax.swing.JMenuItem menuAgregarTema;
    private javax.swing.JMenuItem menuAltaAlbum;
    private javax.swing.JMenuItem menuAltaArtista;
    private javax.swing.JMenuItem menuAltaCliente;
    private javax.swing.JMenuItem menuAltaGenero;
    private javax.swing.JMenuItem menuAltaListaReproduccion;
    private javax.swing.JMenu menuAltaUsuario;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuBuscar;
    private javax.swing.JMenuItem menuConsultaAlbum;
    private javax.swing.JMenuItem menuConsultaLista;
    private javax.swing.JMenuItem menuConsultaPerfilArtista;
    private javax.swing.JMenuItem menuConsultaPerfilCliente;
    private javax.swing.JMenu menuConsultaPerfiles;
    private javax.swing.JMenuItem menuDejarSeguirUsuario;
    private javax.swing.JMenuItem menuEliminarTema;
    private javax.swing.JMenuItem menuGuardarFavoritoLista;
    private javax.swing.JMenu menuNuevo;
    private javax.swing.JMenuItem menuPublicarLista;
    private javax.swing.JMenuItem menuQuitarTema;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenuItem menuSeguirUsuario;
    private javax.swing.JTextField nickAltaAlbum;
    private javax.swing.JTextField nickAltaArtista;
    private javax.swing.JTextField nickAltaCliente;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombreAltaAlbum;
    private javax.swing.JTextField nombreAltaArtista;
    private javax.swing.JTextField nombreAltaCliente;
    private javax.swing.JTextField nombreAltaGenero;
    private javax.swing.JTextField nombreAltaTema;
    private javax.swing.JTextField nombrePadreAltaGenero;
    private javax.swing.JTextField numeroCancionAltaTema;
    private javax.swing.JRadioButton personalizadaAgregarTemaLista;
    private javax.swing.JRadioButton personalizadaQuitarTemaLista;
    private javax.swing.JRadioButton porDefectoAgregarTemaLista;
    private javax.swing.JRadioButton porDefectoQuitarTemaLista;
    private javax.swing.JRadioButton radioArtistaConsultarAlbum;
    private javax.swing.JRadioButton radioClienteConsultarListaReproduccion;
    private javax.swing.JRadioButton radioDefectoGuardarListaFav;
    private javax.swing.JRadioButton radioGeneroConsultarAlbum;
    private javax.swing.JRadioButton radioGeneroConsultarListaReproduccion;
    private javax.swing.JRadioButton radioPersonalizadaCrearListaReproduccion;
    private javax.swing.JRadioButton radioPersonalizadaGuardarListaFav;
    private javax.swing.JTextField sitioWebAltaArtista;
    private javax.swing.JRadioButton temaEliminarFavorito;
    private javax.swing.JTextField text1AgregarFavorito;
    private javax.swing.JTextField text2AgregarFavorito;
    private javax.swing.JTextField text3AgregarFavorito;
    private javax.swing.JTextField text4AgregarFavorito;
    private javax.swing.JTextField text5AgregarFavorito;
    private javax.swing.JTextField text6AgregarFavorito;
    private javax.swing.JTextField text8AgregarFavorito;
    private javax.swing.JScrollPane textAreaDescripcion;
    private javax.swing.JTextField textFieldAlbumAgregarTemaLista;
    private javax.swing.JTextField textFieldAlbumConsultaAlbum;
    private javax.swing.JTextField textFieldAlbumQuitarTemaLista;
    private javax.swing.JTextField textFieldArtistaAgregarTemaLista;
    private javax.swing.JTextField textFieldArtistaQuitarTemaLista;
    private javax.swing.JTextField textFieldClienteAgregarTemaLista;
    private javax.swing.JTextField textFieldClienteDejarSeguir;
    private javax.swing.JTextField textFieldClienteEliminarFavorito;
    private javax.swing.JTextField textFieldClientePublicarLista;
    private javax.swing.JTextField textFieldClienteQuitarTemaLista;
    private javax.swing.JTextField textFieldConsultarPerfilCliente;
    private javax.swing.JTextField textFieldEleccionConsultarAlbum;
    private javax.swing.JTextField textFieldListaConsultarListaReproduccion;
    private javax.swing.JTextField textFieldListaPersonalizadaAgregarTemaLista;
    private javax.swing.JTextField textFieldListaPersonalizadaQuitarTemaLista;
    private javax.swing.JTextField textFieldListaPublicarLista;
    private javax.swing.JTextField textFieldNickClienteSeguirUsuario;
    private javax.swing.JTextField textFieldNickConsultarPerfilArtista;
    private javax.swing.JTextField textFieldNickUsuarioSeguirUsuario;
    private javax.swing.JTextField textFieldNombreCrearListaReproduccion;
    private javax.swing.JTextField textFieldOpcionConsultarListaReproduccion;
    private javax.swing.JTextField textFieldPerteneceCrearListaReproduccion;
    private javax.swing.JTextField textFieldSeleccionEliminarFavorito;
    private javax.swing.JTextField textFieldTemaAgregarTemaLista;
    private javax.swing.JTextField textFieldTemaQuitarTemaLista;
    private javax.swing.JTextField textFieldUsuarioDejarSeguir;
    private javax.swing.JDesktopPane ventanas;
    // End of variables declaration//GEN-END:variables
}