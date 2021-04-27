/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Entidades.Usuarios;
import fachadaLogica.FachadaUsuarios;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jbran
 */
public class FmLogin extends javax.swing.JFrame {

    FachadaUsuarios FUsuarios = new FachadaUsuarios();
    List<Usuarios> usuarios = new ArrayList<Usuarios>();
    FmPrincipal principal;
    FmAdminMenu adminMenu;

    /**
     * Creates new form FmLogin
     */
    public FmLogin() {
        initComponents();
        usuarios = FUsuarios.consultarUsuarios();
        this.setLocationRelativeTo(null);
        tamPantalla();

        //
        //
        lblError.setVisible(false);
    }

    public void tamPantalla() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        this.setSize(width, height);
        setResizable(false);
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        pnlCafecito = new javax.swing.JPanel();
        pnlCremita = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(226, 207, 169));
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCafecito.setBackground(new java.awt.Color(226, 207, 169));
        pnlCafecito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCremita.setBackground(new java.awt.Color(254, 244, 222));
        pnlCremita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(240, 211, 161));
        lblTitulo.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(245, 133, 25));
        lblTitulo.setText("INGRESAR AL SISTEMA");
        pnlCremita.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 24, -1, 30));
        pnlCremita.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 96, 210, -1));

        btnIngresar.setBackground(new java.awt.Color(245, 133, 25));
        btnIngresar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(91, 52, 46));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        pnlCremita.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        btnSalir.setBackground(new java.awt.Color(245, 133, 25));
        btnSalir.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(91, 52, 46));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        pnlCremita.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(91, 52, 46));
        lblUsuario.setText("Usuario:");
        pnlCremita.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 76, -1, -1));

        lblContrasena.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblContrasena.setForeground(new java.awt.Color(91, 52, 46));
        lblContrasena.setText("Contraseña:");
        pnlCremita.add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        lblError.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 102, 102));
        lblError.setText("El usuario y/o contraseña ingresados son incorrectos.");
        pnlCremita.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 360, 30));
        pnlCremita.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 150, 210, -1));

        pnlCafecito.add(pnlCremita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 270));

        getContentPane().add(pnlCafecito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        int contador = 1;

        if (txtUsuario.getText() != null && txtContrasena.getText() != null) {

            for (Usuarios usuario : usuarios) {
                if (txtUsuario.getText().equalsIgnoreCase(usuario.getNombre())
                        && txtContrasena.getText().equalsIgnoreCase(usuario.getContraseña())) {

                    if (usuario.getPuesto().equalsIgnoreCase("CAJERO")) {
                        principal = new FmPrincipal();
                        principal.setVisible(true);
                        this.dispose();
                        break;
                    } else {
                        adminMenu = new FmAdminMenu();
                        adminMenu.setVisible(true);
                        this.dispose();
                        break;
                    }

                } else {
                    contador++;
                }

                if (contador == usuarios.size()) {
                    lblError.setVisible(true);
                }

            }

        } else {

            lblError.setText("Llene ambos campos, por favor");
            lblError.setVisible(true);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(FmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmLogin().setVisible(true);
            }
        });
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("\\images\\icon.png"));

        return retValue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlCafecito;
    private javax.swing.JPanel pnlCremita;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
