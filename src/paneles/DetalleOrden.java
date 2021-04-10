/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import Entidades.Platillo;
import vistas.FmPrincipal;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.util.ArrayList;
import fachadaLogica.FachadaLogica;

/**
 *
 * @author Diana Jiménez
 */
public class DetalleOrden extends javax.swing.JPanel {

    private FmPrincipal tomarOrden;
    private Dimension tamPrincipal;
    private Dimension tamText;
    private Dimension tamPanel;
    private ArrayList<Platillo> platillos;
    private FachadaLogica fachadaLogica;
  

    /**
     * Creates new form DetalleOrden
     */
    public DetalleOrden(FmPrincipal fmPrincipal) {
        initComponents();
        this.setLocation(0, 0);
        this.tomarOrden = fmPrincipal;
        int ancho = tomarOrden.getWidth() / 3;
        int largo = tomarOrden.getHeight();
        tamPrincipal = new Dimension(ancho, largo);

        this.setSize(tamPrincipal);

        int anchoPanel = ancho - 20;
        int largoPanel = largo - 50;
        tamPanel = new Dimension(anchoPanel, largoPanel);

        pnlCremita.setSize(tamPrincipal);
        pnlCremita.setPreferredSize(tamPanel);

        int ancho2 = ancho / 3;
        int largo2 = largo / 10;

        txtATicket.setSize(ancho2, largo2);
        spTicket.setSize(ancho2, largo2);

        tamText = new Dimension(ancho2, largo2);
        spTicket.setPreferredSize(tamText);
        txtATicket.setPreferredSize(tamText);

        platillos = new ArrayList<>();
        this.fachadaLogica = new FachadaLogica();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCremita = new javax.swing.JPanel();
        jlblOrden = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        spTicket = new javax.swing.JScrollPane();
        txtATicket = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(226, 207, 169));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(tamPrincipal);

        pnlCremita.setBackground(new java.awt.Color(254, 244, 222));
        pnlCremita.setMaximumSize(tamPanel);
        pnlCremita.setMinimumSize(tamPanel);
        pnlCremita.setPreferredSize(tamPanel);

        jlblOrden.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlblOrden.setText("Orden: 001");

        btnSiguiente.setBackground(new java.awt.Color(247, 157, 68));
        btnSiguiente.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnSiguiente.setText("Guardar");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        spTicket.setMaximumSize(tamText);
        spTicket.setMinimumSize(null);
        spTicket.setName(""); // NOI18N
        spTicket.setPreferredSize(tamText);

        txtATicket.setEditable(false);
        txtATicket.setColumns(20);
        txtATicket.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtATicket.setRows(5);
        txtATicket.setMargin(null);
        txtATicket.setMaximumSize(tamText);
        txtATicket.setMinimumSize(null);
        txtATicket.setName(""); // NOI18N
        txtATicket.setPreferredSize(tamText);
        spTicket.setViewportView(txtATicket);

        javax.swing.GroupLayout pnlCremitaLayout = new javax.swing.GroupLayout(pnlCremita);
        pnlCremita.setLayout(pnlCremitaLayout);
        pnlCremitaLayout.setHorizontalGroup(
            pnlCremitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCremitaLayout.createSequentialGroup()
                .addGroup(pnlCremitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCremitaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCremitaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCremitaLayout.setVerticalGroup(
            pnlCremitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCremitaLayout.createSequentialGroup()
                .addComponent(jlblOrden)
                .addGap(18, 18, 18)
                .addComponent(spTicket, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCremita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnlCremita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if(!txtATicket.getText().isEmpty()){
            fachadaLogica.guardarOrden(platillos);
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    public ArrayList getPlatillos() {
        return platillos;
    }

    public void addPlatillo(Platillo platillo) {
        platillos.add(platillo);
        notasOrden(platillo);
    }

    public void notasOrden(Platillo platillo) {

       txtATicket.append(platillo.toString() + "\n");

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jlblOrden;
    private javax.swing.JPanel pnlCremita;
    private javax.swing.JScrollPane spTicket;
    private javax.swing.JTextArea txtATicket;
    // End of variables declaration//GEN-END:variables
}
