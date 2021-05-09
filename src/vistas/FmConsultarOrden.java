/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Entidades.Orden;
import fachadaLogica.FachadaDetalleOrden;
import fachadaLogica.FachadaOrden;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jbran
 */
public class FmConsultarOrden extends javax.swing.JFrame {

    DefaultTableModel modelo;
    FachadaDetalleOrden CDetalles = new FachadaDetalleOrden();
    FachadaOrden COrden = new FachadaOrden();
    
    public FmConsultarOrden() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JdtFechaInicio = new com.toedter.calendar.JDateChooser();
        JdtFechaFin = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaOrdenes = new javax.swing.JTable();
        btnConsultarOrden = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDetalles = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("CONSULTAR ORDENES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));
        getContentPane().add(JdtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 250, -1));
        getContentPane().add(JdtFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 250, -1));

        jLabel2.setText("Fecha de inicio");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel3.setText("Fecha de fin");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar orden"));

        tablaOrdenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaOrdenes);

        jPanel1.add(jScrollPane1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 520, 470));

        btnConsultarOrden.setText("Consultar");
        btnConsultarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de orden"));

        tablaDetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaDetalles);

        jPanel2.add(jScrollPane2);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 80, 530, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarOrdenActionPerformed

        List<Orden> ordenes = COrden.consultarOrdenesPeriodo(JdtFechaInicio.getDate(), JdtFechaFin.getDate());
        cargarTabla(ordenes);

    }//GEN-LAST:event_btnConsultarOrdenActionPerformed

    private DefaultTableModel ordenesTableModel(List<Orden> lstOrdenes) {
        Object tabla[][];
        String[] nombreCols = {"ID", "Fecha", "Total", "Usuario"};
        if (lstOrdenes != null) {
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            tabla = new Object[lstOrdenes.size()][nombreCols.length];
            for (int i = 0; i < lstOrdenes.size(); i++) {
                Orden orden = lstOrdenes.get(i);
                tabla[i][0] = orden.getFecha();
                tabla[i][1] = orden.getTotal();
                tabla[i][2] = orden.getUsuarios();
            }
            modelo.setDataVector(tabla, nombreCols);
            return modelo;
        }
        return null;
    }
    
   // private DefaultTableModel detallesOrdenTableModel(OrdenHasPlatillo)

    private void cargarTabla(List<Orden> ordenes) {
        tablaOrdenes.setModel(ordenesTableModel(ordenes));
    }
    
    
    
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FmConsultarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmConsultarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmConsultarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmConsultarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmConsultarOrden().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JdtFechaFin;
    private com.toedter.calendar.JDateChooser JdtFechaInicio;
    private javax.swing.JButton btnConsultarOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaDetalles;
    private javax.swing.JTable tablaOrdenes;
    // End of variables declaration//GEN-END:variables
}
