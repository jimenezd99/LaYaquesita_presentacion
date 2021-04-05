/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Controladores.UsuariosJpaController;
import Entidades.Usuarios;
import fachadaLogica.FachadaUsuarios;
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

    public FmLogin() {
        initComponents();
        usuarios = FUsuarios.consultarUsuarios();
        principal = new FmPrincipal();
        lblError.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        lblTitulo.setText("INGRESAR AL SISTEMA");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 370, 30));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 210, -1));
        getContentPane().add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 210, -1));

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        btnSalir.setText("Salir");
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lblUsuario.setText("Usuario:");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        lblContrasena.setText("Contraseña:");
        getContentPane().add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        lblError.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 102, 102));
        lblError.setText("El usuario y/o contraseña ingresados son incorrectos.");
        getContentPane().add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 380, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        int contador = 1;
        
        if (txtUsuario.getText() != null && txtContrasena.getText() != null) {
            
            for (Usuarios usuario : usuarios) {
                if (txtUsuario.getText().equalsIgnoreCase(usuario.getNombre())
                        && txtContrasena.getText().equalsIgnoreCase(usuario.getContraseña())) {
                    principal.setVisible(true);
                    this.dispose();
                    break;
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
