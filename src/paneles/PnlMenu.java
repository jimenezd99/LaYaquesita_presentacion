/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import vistas.FmPrincipal;

/**
 *
 * @author Diana Jiménez
 */
public class PnlMenu extends javax.swing.JPanel {
    private FmPrincipal tomarOrden;
    /**
     * Creates new form PnlMenu
     */
    public PnlMenu(FmPrincipal fmPrincipal) {
        initComponents();
        tomarOrden= fmPrincipal;
        //setLayout(new GroupLayout(this));
        this.setSize(1360, 216);
        this.setLocation(546, 0);
             // Menú
//        tbtnHotdogs.setSelected(true);
//        btn1.setText("Yaqui");
//        btn2.setText("Cuate");
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMenu = new javax.swing.JPanel();
        tbtnExtras = new javax.swing.JToggleButton();
        tbtnBebidas = new javax.swing.JToggleButton();
        tbtnHotdogs = new javax.swing.JToggleButton();
        jsMenu = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(226, 207, 169));
        setAlignmentX(1.0F);
        setPreferredSize(new java.awt.Dimension(1360, 200));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpMenu.setBackground(new java.awt.Color(254, 244, 222));
        jpMenu.setPreferredSize(new java.awt.Dimension(1340, 200));

        tbtnExtras.setBackground(new java.awt.Color(198, 60, 31));
        tbtnExtras.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tbtnExtras.setForeground(new java.awt.Color(240, 211, 161));
        tbtnExtras.setText("Extras");
        tbtnExtras.setPreferredSize(new java.awt.Dimension(188, 88));
        tbtnExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnExtrasActionPerformed(evt);
            }
        });

        tbtnBebidas.setBackground(new java.awt.Color(198, 60, 31));
        tbtnBebidas.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tbtnBebidas.setForeground(new java.awt.Color(240, 211, 161));
        tbtnBebidas.setText("Bebidas");
        tbtnBebidas.setPreferredSize(new java.awt.Dimension(188, 88));
        tbtnBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnBebidasActionPerformed(evt);
            }
        });

        tbtnHotdogs.setBackground(new java.awt.Color(240, 60, 31));
        tbtnHotdogs.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tbtnHotdogs.setForeground(new java.awt.Color(240, 211, 161));
        tbtnHotdogs.setText("HotDogs");
        tbtnHotdogs.setPreferredSize(new java.awt.Dimension(188, 88));
        tbtnHotdogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnHotdogsActionPerformed(evt);
            }
        });

        jsMenu.setBackground(new java.awt.Color(0, 0, 0));
        jsMenu.setForeground(new java.awt.Color(0, 0, 0));
        jsMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jsMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jsMenu.setPreferredSize(new java.awt.Dimension(50, 4));

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(tbtnHotdogs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(tbtnBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(tbtnExtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jsMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtnHotdogs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtnBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtnExtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jsMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        add(jpMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 190));
    }// </editor-fold>//GEN-END:initComponents

    private void tbtnHotdogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnHotdogsActionPerformed
        tbtnHotdogs.setSelected(true);
        tbtnExtras.setSelected(false);
        tbtnBebidas.setSelected(false);

//        btn1.setText("Yaqui");
//        btn2.setText("Cuate");
    }//GEN-LAST:event_tbtnHotdogsActionPerformed

    private void tbtnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnBebidasActionPerformed
        tbtnHotdogs.setSelected(false);
        tbtnExtras.setSelected(false);
        tbtnBebidas.setSelected(true);
//        btn1.setText("Coca L");
//        btn2.setText("Coca B");
    }//GEN-LAST:event_tbtnBebidasActionPerformed

    private void tbtnExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnExtrasActionPerformed
        tbtnHotdogs.setSelected(false);
        tbtnExtras.setSelected(true);
        tbtnBebidas.setSelected(false);
//        btn1.setText("Queso de Nacho");
//        btn2.setText("Salsa Valiente");
    }//GEN-LAST:event_tbtnExtrasActionPerformed

    public void llenarBotones(String producto){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpMenu;
    private javax.swing.JSeparator jsMenu;
    private javax.swing.JToggleButton tbtnBebidas;
    private javax.swing.JToggleButton tbtnExtras;
    private javax.swing.JToggleButton tbtnHotdogs;
    // End of variables declaration//GEN-END:variables
}
