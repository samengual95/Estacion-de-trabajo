package frame;

/*
 * @author Leandro
 */

public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(this);                                       // Situa a la ventana en el medio de la pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        labelNick = new javax.swing.JTextField();
        labelContra = new javax.swing.JPasswordField();
        nickUsuario = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        botonLogin = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(240, 240, 240));
        nombre.setText("Espotify");
        nombre.setToolTipText("");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 70, 40));

        botonSalir.setBackground(new java.awt.Color(0, 0, 0));
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, 120, -1));

        labelNick.setBackground(new java.awt.Color(0, 0, 0));
        labelNick.setForeground(new java.awt.Color(255, 255, 255));
        labelNick.setText(" ");
        labelNick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelNickActionPerformed(evt);
            }
        });
        getContentPane().add(labelNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 211, 131, -1));

        labelContra.setBackground(new java.awt.Color(0, 0, 0));
        labelContra.setForeground(new java.awt.Color(255, 255, 255));
        labelContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelContraActionPerformed(evt);
            }
        });
        getContentPane().add(labelContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 131, -1));

        nickUsuario.setForeground(new java.awt.Color(255, 255, 255));
        nickUsuario.setText("Nombre de usuario:");
        getContentPane().add(nickUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setText("Contraseña:");
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        botonLogin.setBackground(new java.awt.Color(0, 0, 0));
        botonLogin.setForeground(new java.awt.Color(255, 255, 255));
        botonLogin.setText("Login");
        botonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(botonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 542, 120, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guitar.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void labelNickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelNickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelNickActionPerformed

    private void labelContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelContraActionPerformed

    private void botonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLoginActionPerformed
        //if() {                                                                // Preguntara si el usuario ingresado ya esta registrado en el sistema
            ventanaPrincipal vp = new ventanaPrincipal();
            vp.setVisible(true);
            this.dispose();
            //} else {
            //            JOptionPane mensaje= new JOptionPane("El usuario es incorrecto o no esta registrado", JOptionPane.ERROR_MESSAGE);
            //}
    }//GEN-LAST:event_botonLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton botonLogin;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPasswordField labelContra;
    private javax.swing.JTextField labelNick;
    private javax.swing.JLabel nickUsuario;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel pass;
    // End of variables declaration//GEN-END:variables
}
