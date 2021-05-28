/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Entidades.Orden;
import Entidades.OrdenHasPlatillo;
import Entidades.Platillo;
import fachadaLogica.FachadaDetalleOrden;
import fachadaLogica.FachadaOrden;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import reportes.GenerarReporte;

/**
 *
 * @author Jbran
 */
public class FmConsultarOrden extends javax.swing.JFrame {

    DefaultTableModel modelo;
    FachadaDetalleOrden CDetalles = new FachadaDetalleOrden();
    FachadaOrden COrden = new FachadaOrden();
    List<Orden> ordenes;
    List<Orden> ordenes1;
    Date fechaInicio;
    Date fechaFin;
    public FmConsultarOrden() {
        initComponents();
        setIconBotones();
        btnGenerarReporte.setEnabled(false);
        jLblTotal.setFont(new java.awt.Font("Century Gothic", 1, 18));
        jLblTotal.setText("Total:");
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
        btnCancelar = new javax.swing.JButton();
        btnAyer = new javax.swing.JButton();
        btnSemana = new javax.swing.JButton();
        btnMes = new javax.swing.JButton();
        jLblTotal = new javax.swing.JLabel();
        btnGenerarReporte = new javax.swing.JButton();

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
        tablaOrdenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaOrdenesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaOrdenes);

        jPanel1.add(jScrollPane1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 520, 470));

        btnConsultarOrden.setText("Consultar");
        btnConsultarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, 40));

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

        btnCancelar.setBackground(new java.awt.Color(254, 244, 222));
        btnCancelar.setForeground(new java.awt.Color(91, 52, 46));
        btnCancelar.setToolTipText("Regresar");
        btnCancelar.setFocusable(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 40));

        btnAyer.setText("Ayer");
        btnAyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyerActionPerformed(evt);
            }
        });
        getContentPane().add(btnAyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, 40));

        btnSemana.setText("Esta Semana");
        btnSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemanaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSemana, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, 40));

        btnMes.setText("Este Mes");
        btnMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesActionPerformed(evt);
            }
        });
        getContentPane().add(btnMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, 40));
        getContentPane().add(jLblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, 150, 20));

        btnGenerarReporte.setText("Generar Reporte");
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarOrdenActionPerformed

        if (JdtFechaInicio.getDate() == null || JdtFechaFin.getDate() == null) {
            
            JOptionPane.showMessageDialog(null, "Seleccione ambas fechas. ");
            
        } else {

            ordenes1 = COrden.consultarOrdenesPeriodo(JdtFechaInicio.getDate(), JdtFechaFin.getDate());
            cargarTablaOrdenes(ordenes1);
            this.ordenes = ordenes1;
            fechaInicio = JdtFechaInicio.getDate();
            fechaFin = JdtFechaFin.getDate();
            calcularVentas();
            if (!ordenes1.isEmpty()) {
                btnGenerarReporte.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnConsultarOrdenActionPerformed

    private void tablaOrdenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaOrdenesMouseClicked
        
        Orden aux = (Orden) (tablaOrdenes.getValueAt(tablaOrdenes.getSelectedRow(), 0));
        
       List<OrdenHasPlatillo> ohs = CDetalles.consultarDetalleOrden(aux);
        cargarTablaDetalleOrdenes(ohs);
        
        
    }//GEN-LAST:event_tablaOrdenesMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyerActionPerformed
        long ayer = 86400000;
        long hoy = System.currentTimeMillis();
        Date fechaAyer = new Date(hoy - ayer);
        Date fechaHoy = new Date(hoy);
        
        
        ordenes1 = COrden.consultarOrdenesPeriodo(fechaAyer, fechaHoy);
        cargarTablaOrdenes(ordenes1);
        this.ordenes = ordenes1;
        fechaInicio = fechaAyer;
        fechaFin = fechaHoy;
        if(!ordenes1.isEmpty()){
            btnGenerarReporte.setEnabled(true);
        }
        calcularVentas();
    }//GEN-LAST:event_btnAyerActionPerformed

    private void btnSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemanaActionPerformed
        long semanaP = 604800000;
        long semanaA = System.currentTimeMillis();
        Date fechaSemanaP = new Date(semanaA - semanaP);
        Date fechaSemanaA = new Date(semanaA);
        ordenes1 = COrden.consultarOrdenesPeriodo(fechaSemanaP, fechaSemanaA);
        cargarTablaOrdenes(ordenes1);
        this.ordenes = ordenes1;
        fechaInicio = fechaSemanaP;
        fechaFin = fechaSemanaA;
        calcularVentas();
        if(!ordenes1.isEmpty()){
            btnGenerarReporte.setEnabled(true);
        }
        
    }//GEN-LAST:event_btnSemanaActionPerformed

    private void btnMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesActionPerformed
        Date fTemp = new Date(System.currentTimeMillis());
        Date mesInicio = new Date(fTemp.getYear(), fTemp.getMonth(), 1);
        Date mesFin = new Date(fTemp.getYear(), fTemp.getMonth(), verificarDia(fTemp));
        ordenes1 = COrden.consultarOrdenesPeriodo(mesInicio, mesFin);
        cargarTablaOrdenes(ordenes1);
        this.ordenes = ordenes1;
        fechaInicio = mesInicio;
        fechaFin = mesFin;
        calcularVentas();
        if(!ordenes1.isEmpty()){
            btnGenerarReporte.setEnabled(true);
        }
        
    }//GEN-LAST:event_btnMesActionPerformed

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed
        GenerarReporte generarReporte = new GenerarReporte();
        generarReporte.reporte(fechaInicio, fechaFin, ordenes1);
    }//GEN-LAST:event_btnGenerarReporteActionPerformed

    private void calcularVentas() {
        float total = 0;
        ArrayList<Platillo> platillos = new ArrayList();
        for (int i = 0; i < ordenes.size(); i++) {
            total += ordenes.get(i).getTotal();
        }
        jLblTotal.setText("Total: $" + total);
    }
    
    private int verificarDia(Date fecha){
        switch(fecha.getMonth()){
            case 0:
                return 31;
            case 1:
                return 28;
            case 2:
                return 31;
            case 3:
                return 30;
            case 4:
                return 31;
            case 5:
                return 30;
            case 6:
                return 31;
            case 7:
                return 31;
            case 8:
                return 30;
            case 9:
                return 31;
            case 10:
                return 30;
            case 11:
                return 31;
        }
        return 0;
    }
    public final void setIconBotones() {
        btnCancelar.setIcon(setIcono("/images/salir.png", btnCancelar));
    }
    public Icon setIcono(String url, JButton boton) {

        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = (int) (boton.getWidth() / 2.5);
        int largo = (int) (boton.getHeight() / 2.5);
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, largo, Image.SCALE_DEFAULT));

        return icono;
    }
    
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
                tabla[i][0] = orden;
                tabla[i][1] = orden.getFecha();
                tabla[i][2] = orden.getTotal();
                tabla[i][3] = orden.getUsuarios();
            }
            modelo.setDataVector(tabla, nombreCols);
            return modelo;
        }
        return null;
    }
    
    private DefaultTableModel detallesOrdenTableModel(List<OrdenHasPlatillo> lstOrdenes){
        Object tabla[][];
        String[] nombreCols = {"ID OHS","ID Orden", "ID Platillo", "Cantidad", "Notas", "Precio", };
        if (lstOrdenes != null) {
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            tabla = new Object[lstOrdenes.size()][nombreCols.length];
            for (int i = 0; i < lstOrdenes.size(); i++) {
                OrdenHasPlatillo ordenHasPlatillo = lstOrdenes.get(i);
                tabla[i][0] = ordenHasPlatillo;
                tabla[i][1] = ordenHasPlatillo.getOrden().getIdorden();
                tabla[i][2] = ordenHasPlatillo.getPlatillo().getIdplatillo();
                tabla[i][3] = ordenHasPlatillo.getCantidad();
                tabla[i][4] = ordenHasPlatillo.getNotas();
                tabla[i][5] = ordenHasPlatillo.getPrecio();
            }
            modelo.setDataVector(tabla, nombreCols);
            return modelo;
        }
        return null;
    }

    private void cargarTablaOrdenes(List<Orden> ordenes) {
        tablaOrdenes.setModel(ordenesTableModel(ordenes));
    }
    
    private void cargarTablaDetalleOrdenes(List<OrdenHasPlatillo> ordenes){
        tablaDetalles.setModel(detallesOrdenTableModel(ordenes));
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
    private javax.swing.JButton btnAyer;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultarOrden;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton btnMes;
    private javax.swing.JButton btnSemana;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLblTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaDetalles;
    private javax.swing.JTable tablaOrdenes;
    // End of variables declaration//GEN-END:variables
}
