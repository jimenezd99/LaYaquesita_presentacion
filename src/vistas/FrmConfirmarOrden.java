/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Entidades.Platillo;
import fachadaLogica.FachadaLogica;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import paneles.codigo.PanelOrden;

/**
 *
 * @author Brenda Bojorquez
 */
public class FrmConfirmarOrden extends javax.swing.JFrame {

    private List<Platillo> platillos;
    private FachadaLogica fachadaLogica;
    private PanelOrden panelOrden;

    public FrmConfirmarOrden(List<Platillo> platillos, PanelOrden panelOrden) {
        initComponents();
        this.platillos = platillos;
        fachadaLogica = new FachadaLogica();
        this.panelOrden = panelOrden;
        mostrarPlatillos();
    }

    private void mostrarPlatillos() {
        float total = 0;
        for (Platillo platillo : platillos) {
            if(platillo.getTipoProducto().equalsIgnoreCase("HOTDOG")){
                txtPlatillos.append(platillo.toString() + "\n");
                total += platillo.getCosto();
            }
        }
        for (Platillo platillo : platillos) {
            if(platillo.getTipoProducto().equalsIgnoreCase("EXTRA")){
                txtPlatillos.append(platillo.toString() + "\n");
                total += platillo.getCosto();
            }
            
        }
        for (Platillo platillo : platillos) {
            if(platillo.getTipoProducto().equalsIgnoreCase("BEBIDA")){
                txtPlatillos.append(platillo.toString() + "\n");
                total += platillo.getCosto();
            }
        }

        txtPlatillos.append("-------------------------"
                + "\nTotal              $" + total);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnConfirmar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPlatillos = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(226, 207, 169));

        btnConfirmar.setBackground(new java.awt.Color(245, 133, 25));
        btnConfirmar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(91, 52, 46));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        txtPlatillos.setColumns(20);
        txtPlatillos.setRows(5);
        jScrollPane1.setViewportView(txtPlatillos);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Verifique que la orden sea correcta");

        btnRegresar.setBackground(new java.awt.Color(245, 133, 25));
        btnRegresar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(91, 52, 46));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 166, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(171, 171, 171))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        try {
            fachadaLogica.guardarOrden((ArrayList<Platillo>) platillos);
            JOptionPane.showMessageDialog(this, "Orden guardada", "Confirmación", JOptionPane.PLAIN_MESSAGE);
            panelOrden.clearPlatillos();
            panelOrden.setLastOrdenId();
            panelOrden.getLabelTotal().setText("Total: ");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos", "Advertencia", JOptionPane.PLAIN_MESSAGE);
        }

        this.dispose();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtPlatillos;
    // End of variables declaration//GEN-END:variables
}
