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
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jbran
 */
public class FmAdminUsuarios extends javax.swing.JFrame {

    DefaultTableModel modelo;
    FmAdminMenu adminMenu;
    FachadaUsuarios usuarios = new FachadaUsuarios();
    Usuarios usuarioActual;

    public FmAdminUsuarios(Usuarios usuarioActual) {
        initComponents();
        this.usuarioActual = usuarioActual;
        this.setLocationRelativeTo(null);
        tamPantalla();
        setIconBotones();
        cargarTabla();
    }

    public FmAdminUsuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        tamPantalla();
        cargarTabla();
    }

    public final void setIconBotones() {
        btnCancelar.setSize(28, 28);
        btnCancelar.setIcon(setIcono("/images/izquierda.png", btnCancelar));
        btnCancelar.setText("");
//        btnDescartarActuales.setIcon(setIcono("/images/derecha.png", btnAgregarActuales));
//        btnDescartarActuales.setText("");

    }

    public Icon setIcono(String url, JButton boton) {

        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = (boton.getWidth());
        int largo = (boton.getHeight());
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, largo, Image.SCALE_DEFAULT));

        return icono;
    }

    public void tamPantalla() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        this.setSize(width, height);
        pack();
    }

    private DefaultTableModel usuariosTableModel(List<Usuarios> lstUsuarios) {
        Object tabla[][];
        String[] nombreCols = {"ID", "Nombre", "Puesto"};
        if (lstUsuarios != null) {
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            tabla = new Object[lstUsuarios.size()][nombreCols.length];
            for (int i = 0; i < lstUsuarios.size(); i++) {
                Usuarios usuario = lstUsuarios.get(i);
                tabla[i][0] = usuario.getIdusuario();
                tabla[i][1] = usuario.getNombre();
                tabla[i][2] = usuario.getPuesto();
            }
            modelo.setDataVector(tabla, nombreCols);
            return modelo;
        }
        return null;
    }

    private void cargarTabla() {
        tablaUsuarios.setModel(usuariosTableModel(usuarios.consultarUsuarios()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCafecito = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        txtIdUsuario = new javax.swing.JTextField();
        cbxPuesto = new javax.swing.JComboBox<>();
        txtContrasena = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrar usuarios");
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCafecito.setBackground(new java.awt.Color(226, 207, 169));
        pnlCafecito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 133, 25));
        jLabel1.setText("Administrar Usuarios");
        pnlCafecito.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        panelTabla.setBackground(new java.awt.Color(254, 244, 222));
        panelTabla.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(245, 133, 25))); // NOI18N
        panelTabla.setForeground(new java.awt.Color(245, 133, 25));
        panelTabla.setToolTipText("");

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pnlCafecito.add(panelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 440, 340));

        txtNombre.setBackground(new java.awt.Color(254, 244, 222));
        pnlCafecito.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 180, -1));

        txtIdUsuario.setEditable(false);
        txtIdUsuario.setBackground(new java.awt.Color(254, 244, 222));
        pnlCafecito.add(txtIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 180, -1));

        cbxPuesto.setBackground(new java.awt.Color(254, 244, 222));
        cbxPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CAJERO", "ADMINISTRADOR" }));
        pnlCafecito.add(cbxPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 180, -1));

        txtContrasena.setBackground(new java.awt.Color(254, 244, 222));
        pnlCafecito.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 180, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(91, 52, 46));
        jLabel2.setText("ID ");
        pnlCafecito.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 50, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(91, 52, 46));
        jLabel3.setText("Nombre");
        pnlCafecito.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(91, 52, 46));
        jLabel4.setText("Contraseña");
        pnlCafecito.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(91, 52, 46));
        jLabel5.setText("Puesto");
        pnlCafecito.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(245, 133, 25));
        btnGuardar.setForeground(new java.awt.Color(91, 52, 46));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlCafecito.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(245, 133, 25));
        btnActualizar.setForeground(new java.awt.Color(91, 52, 46));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        pnlCafecito.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(245, 133, 25));
        btnEliminar.setForeground(new java.awt.Color(91, 52, 46));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlCafecito.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(245, 133, 25));
        btnCancelar.setForeground(new java.awt.Color(91, 52, 46));
        btnCancelar.setText("Regresar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlCafecito.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        getContentPane().add(pnlCafecito, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 850, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked

        txtIdUsuario.setText(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0).toString());
        txtNombre.setText(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 1).toString());
        txtContrasena.setText(usuarios.consultarUsuarioId(Integer.parseInt(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0).toString())).getContraseña());

        if (tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 2).toString().equalsIgnoreCase("CAJERO")) {
            cbxPuesto.setSelectedIndex(0);
        } else {
            cbxPuesto.setSelectedIndex(1);
        }


    }//GEN-LAST:event_tablaUsuariosMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        Usuarios usuario = new Usuarios();
        usuario.setNombre(txtNombre.getText());
        usuario.setContraseña(txtContrasena.getText());
        usuario.setPuesto(cbxPuesto.getSelectedItem().toString());

        usuarios.registrarUsuario(usuario);
        cargarTabla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        usuarios.eliminarUsuario(Integer.parseInt(txtIdUsuario.getText()));
        cargarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        Usuarios usuario = new Usuarios();
        usuario.setIdusuario(Integer.parseInt(txtIdUsuario.getText()));
        usuario.setNombre(txtNombre.getText());
        usuario.setContraseña(txtContrasena.getText());
        usuario.setPuesto(cbxPuesto.getSelectedItem().toString());
        usuario.setOrdenList(usuarios.consultarUsuarioId(Integer.parseInt(txtIdUsuario.getText())).getOrdenList());

        usuarios.editarUsuario(usuario);
        cargarTabla();


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        adminMenu = new FmAdminMenu();
        adminMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("\\images\\icon.png"));

        return retValue;
    }

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
            java.util.logging.Logger.getLogger(FmAdminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmAdminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmAdminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmAdminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmAdminUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxPuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JPanel pnlCafecito;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
