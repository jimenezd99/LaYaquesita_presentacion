/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author Jbran
 */
public class FmAdminMenu extends javax.swing.JFrame {
    
    FmAdminPlatillos platillos;
    FmPrincipal principal;
    FmAdminUsuarios usuarios;
    FmAdminIngredientes ingredientes;
    FmLogin login;
    
    public FmAdminMenu() {
        initComponents();
        platillos = new FmAdminPlatillos();
        principal = new FmPrincipal();
        usuarios = new FmAdminUsuarios();
        ingredientes = new FmAdminIngredientes();
        login = new FmLogin();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenuAdministrador = new javax.swing.JLabel();
        btnTomarOrden = new javax.swing.JButton();
        btnAdminPlatillo = new javax.swing.JButton();
        btnAdminIngredientes = new javax.swing.JButton();
        btnAdminUsuarios = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenuAdministrador.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblMenuAdministrador.setText("Menú de administrador");
        getContentPane().add(lblMenuAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 22, -1, -1));

        btnTomarOrden.setText("Tomar orden");
        btnTomarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomarOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(btnTomarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 250, 190));

        btnAdminPlatillo.setText("Administrar platillos");
        btnAdminPlatillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminPlatilloActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdminPlatillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 250, 190));

        btnAdminIngredientes.setText("Administrar ingredientes");
        btnAdminIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminIngredientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdminIngredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 250, 190));

        btnAdminUsuarios.setText("Administrar usuarios");
        btnAdminUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdminUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 250, 190));

        btnCerrarSesion.setText("Cerrar sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 12, -1, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTomarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomarOrdenActionPerformed
        principal.setVisible(true);
    }//GEN-LAST:event_btnTomarOrdenActionPerformed

    private void btnAdminPlatilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminPlatilloActionPerformed
        platillos.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAdminPlatilloActionPerformed

    private void btnAdminIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminIngredientesActionPerformed
        ingredientes.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAdminIngredientesActionPerformed

    private void btnAdminUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminUsuariosActionPerformed
        usuarios.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAdminUsuariosActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(FmAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmAdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminIngredientes;
    private javax.swing.JButton btnAdminPlatillo;
    private javax.swing.JButton btnAdminUsuarios;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnTomarOrden;
    private javax.swing.JLabel lblMenuAdministrador;
    // End of variables declaration//GEN-END:variables
}
