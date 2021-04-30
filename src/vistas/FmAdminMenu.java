/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Entidades.Usuarios;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

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
    Usuarios usuarioActual;

    public FmAdminMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        tamPantalla();
//        localizarBtn();
        setIconBotones();
        platillos = new FmAdminPlatillos();
        principal = new FmPrincipal();
        usuarios = new FmAdminUsuarios();
        ingredientes = new FmAdminIngredientes();
        login = new FmLogin();
    }
    
  public FmAdminMenu(Usuarios usuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        tamPantalla();
//        localizarBtn();
        setIconBotones();
        platillos = new FmAdminPlatillos(usuarioActual);
        usuarioActual = usuario;
        principal = new FmPrincipal(usuarioActual);
        usuarios = new FmAdminUsuarios(usuarioActual);
        ingredientes = new FmAdminIngredientes(usuarioActual);
        login = new FmLogin();
    }

    public  final void tamPantalla() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        

        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        this.setSize(width, height);
        
        this.pnlCafecito.setSize(getSize());
        this.pnlCafecito.setPreferredSize(getSize());
        this.pnlCremita.setSize((this.pnlCafecito.getWidth()/10)*8, (this.pnlCafecito.getHeight()/10)*8);
        pack();
    }

    public final void setIconBotones() {
        btnAdminIngredientes.setIcon(setIcono("/images/ingrediente.png", btnAdminIngredientes));
        btnAdminPlatillo.setIcon(setIcono("/images/icon.png", btnAdminPlatillo));
        btnTomarOrden.setIcon(setIcono("/images/orden.png", btnTomarOrden));
        btnCerrarSesion.setIcon(setIcono("/images/salir.png", btnCerrarSesion));
        btnAdminUsuarios.setIcon(setIcono("/images/usuario.png", btnAdminUsuarios));

    }

    public void localizarBtn() {
        //localizar botones
//        btnCerrarSesion.setLocation(this.getWidth(),this.getHeight());
//        lblMenuAdministrador.setLocation(WIDTH, WIDTH);
//        btnTomarOrden.setLocation(this.lblMenuAdministrador.getHeight(),this.getHeight() / 2);
//        btnAdminPlatillo.setLocation(this.lblMenuAdministrador.getHeight(),this.getHeight() / 2);
//        btnAdminIngredientes.setLocation( this.lblMenuAdministrador.getHeight(),this.getHeight() / 2);
//        btnAdminUsuarios.setLocation(this.lblMenuAdministrador.getHeight() + this.btnTomarOrden.getHeight(),this.getHeight() / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCafecito = new javax.swing.JPanel();
        pnlCremita = new javax.swing.JPanel();
        lblMenuAdministrador = new javax.swing.JLabel();
        btnTomarOrden = new javax.swing.JButton();
        btnAdminPlatillo = new javax.swing.JButton();
        btnAdminIngredientes = new javax.swing.JButton();
        btnAdminUsuarios = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Administrador");
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCafecito.setBackground(new java.awt.Color(226, 207, 169));
        pnlCafecito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCremita.setBackground(new java.awt.Color(254, 244, 222));
        pnlCremita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenuAdministrador.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblMenuAdministrador.setText("Menú de administrador");
        pnlCremita.add(lblMenuAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 22, -1, -1));

        btnTomarOrden.setBackground(new java.awt.Color(245, 133, 25));
        btnTomarOrden.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnTomarOrden.setForeground(new java.awt.Color(91, 52, 46));
        btnTomarOrden.setText("Tomar orden");
        btnTomarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomarOrdenActionPerformed(evt);
            }
        });
        pnlCremita.add(btnTomarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 250, 190));

        btnAdminPlatillo.setBackground(new java.awt.Color(245, 133, 25));
        btnAdminPlatillo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAdminPlatillo.setForeground(new java.awt.Color(91, 52, 46));
        btnAdminPlatillo.setText("Administrar platillos");
        btnAdminPlatillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminPlatilloActionPerformed(evt);
            }
        });
        pnlCremita.add(btnAdminPlatillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 250, 190));

        btnAdminIngredientes.setBackground(new java.awt.Color(245, 133, 25));
        btnAdminIngredientes.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAdminIngredientes.setForeground(new java.awt.Color(91, 52, 46));
        btnAdminIngredientes.setText("Administrar ingredientes");
        btnAdminIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminIngredientesActionPerformed(evt);
            }
        });
        pnlCremita.add(btnAdminIngredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 250, 190));

        btnAdminUsuarios.setBackground(new java.awt.Color(245, 133, 25));
        btnAdminUsuarios.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAdminUsuarios.setForeground(new java.awt.Color(91, 52, 46));
        btnAdminUsuarios.setText("Administrar usuarios");
        btnAdminUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminUsuariosActionPerformed(evt);
            }
        });
        pnlCremita.add(btnAdminUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 250, 190));

        btnCerrarSesion.setBackground(new java.awt.Color(91, 52, 46));
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        pnlCremita.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 50, 50));

        pnlCafecito.add(pnlCremita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 610, 490));

        getContentPane().add(pnlCafecito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTomarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomarOrdenActionPerformed
        principal.setVisible(true);
//        dispose();
    }//GEN-LAST:event_btnTomarOrdenActionPerformed

    private void btnAdminPlatilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminPlatilloActionPerformed
        platillos.setVisible(true);
//        dispose();
    }//GEN-LAST:event_btnAdminPlatilloActionPerformed

    private void btnAdminIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminIngredientesActionPerformed
        ingredientes.setVisible(true);
//        dispose();
    }//GEN-LAST:event_btnAdminIngredientesActionPerformed

    private void btnAdminUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminUsuariosActionPerformed
        usuarios.setVisible(true);
//        dispose();
    }//GEN-LAST:event_btnAdminUsuariosActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        login.setVisible(true);
//        dispose();
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

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("\\images\\icon.png"));

        return retValue;
    }

    public Icon setIcono(String url, JButton boton) {

        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth() / 3;
        int largo = boton.getHeight() / 3;
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, largo, Image.SCALE_DEFAULT));

        return icono;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminIngredientes;
    private javax.swing.JButton btnAdminPlatillo;
    private javax.swing.JButton btnAdminUsuarios;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnTomarOrden;
    private javax.swing.JLabel lblMenuAdministrador;
    private javax.swing.JPanel pnlCafecito;
    private javax.swing.JPanel pnlCremita;
    // End of variables declaration//GEN-END:variables
}
