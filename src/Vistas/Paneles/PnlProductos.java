/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paneles;

import Vistas.Paneles.hardcord.Cuate;
import Vistas.Paneles.hardcord.Yaqui;
import java.awt.Color;
/**
 *
 * @author Diana Jiménez
 */
public class PnlProductos extends javax.swing.JPanel {

    /**
     * Creates new form Productos
     */
    public PnlProductos() {
        initComponents();
//        setLayout(new GroupLayout(this));
        this.setSize(1360, 800);
        this.setLocation(556,216);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelOrden = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(226, 207, 169));
        setPreferredSize(new java.awt.Dimension(1360, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelOrden.setBackground(new java.awt.Color(254, 244, 222));
        jPanelOrden.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelOrden.setMinimumSize(new java.awt.Dimension(1340, 400));
        jPanelOrden.setPreferredSize(new java.awt.Dimension(1340, 400));

        btn1.setBackground(new java.awt.Color(245, 133, 25));
        btn1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(91, 52, 46));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(245, 133, 25));
        btn2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(91, 52, 46));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOrdenLayout = new javax.swing.GroupLayout(jPanelOrden);
        jPanelOrden.setLayout(jPanelOrdenLayout);
        jPanelOrdenLayout.setHorizontalGroup(
            jPanelOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrdenLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btn1)
                .addGap(18, 18, 18)
                .addComponent(btn2)
                .addContainerGap())
        );
        jPanelOrdenLayout.setVerticalGroup(
            jPanelOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrdenLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanelOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(287, 287, 287))
        );

        add(jPanelOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 1340, 390));
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (btn1.getText().equalsIgnoreCase("Yaqui")) {
//            Yaqui yaqui = new Yaqui(this, true, this);
//            yaqui.setVisible(true);

        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (btn2.getText().equalsIgnoreCase("Cuate")) {
//            Cuate cuate = new Cuate(this, true, this);
//            cuate.setVisible(true);
        }
    }//GEN-LAST:event_btn2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JPanel jPanelOrden;
    // End of variables declaration//GEN-END:variables
}
