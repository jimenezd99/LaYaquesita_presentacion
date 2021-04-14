/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.codigo;

import Entidades.Platillo;
import fachadaLogica.FachadaLogica;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.GroupLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vistas.FmPrincipal;

/**
 *
 * @author La Yaquesita
 */
public class PanelOrden extends javax.swing.JPanel {

    private FmPrincipal tomarOrden;
    private Dimension tamPrincipal;
    private Dimension tamText;
    private Dimension tamText2;
    private Dimension tamPanel;
    private ArrayList<Platillo> platillos;
    private FachadaLogica fachadaLogica;

    private DefaultTableModel modelo;
    private javax.swing.JPanel pnlCremita;
    private javax.swing.JLabel jlblOrden;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JScrollPane spTicket1;
    private javax.swing.JTable tblPlatillos;

    public PanelOrden(FmPrincipal fmPrincipal) {

        this.setLocation(0, 0);
        this.tomarOrden = fmPrincipal;
        int ancho = tomarOrden.getWidth() / 3;
        int largo = tomarOrden.getHeight();
        pnlCremita = new javax.swing.JPanel();
        jlblOrden = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        spTicket1 = new javax.swing.JScrollPane();
        tblPlatillos = new javax.swing.JTable();
        tamPrincipal = new Dimension(ancho, largo);

        this.setSize(tamPrincipal);

        int anchoPanel = ancho - 20;
        int largoPanel = largo - 50;
        tamPanel = new Dimension(anchoPanel, largoPanel);

        int ancho2 = ancho - 60;
        int largo2 = largo - 200;

        platillos = new ArrayList<>();
        modelo = new DefaultTableModel();

        tblPlatillos.setSize(ancho2, largo2);

        spTicket1.setSize(ancho2, largo2);

        tamText = new Dimension(ancho2, largo2);

        spTicket1.setPreferredSize(tamText);

        tblPlatillos.setPreferredSize(tamText);
        inicializar();

        this.fachadaLogica = new FachadaLogica();

    }

    public void inicializar() {

        setBackground(new java.awt.Color(226, 207, 169));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(tamPrincipal);

        pnlCremita.setBackground(new java.awt.Color(254, 244, 222));
        pnlCremita.setMaximumSize(tamPanel);
        pnlCremita.setMinimumSize(tamPanel);
        pnlCremita.setPreferredSize(tamPanel);

        jlblOrden.setFont(new java.awt.Font("Century Gothic", 1, 18));  
        jlblOrden.setText("Orden: 001");

        btnSiguiente.setBackground(new java.awt.Color(247, 157, 68));
        btnSiguiente.setFont(new java.awt.Font("Century Gothic", 1, 18)); 
        btnSiguiente.setText("Guardar");

        pnlCremita.setSize(tamPrincipal);
        pnlCremita.setPreferredSize(tamPanel);
        cargarTabla(tblPlatillos, "Hotdog");
        pnlCremita.add(jlblOrden);
        //spTicket1.add(tblPlatillos);
        pnlCremita.add(tblPlatillos);

        pnlCremita.add(btnSiguiente);

        add(pnlCremita);
    }

    private DefaultTableModel platillosTableModel(List<Platillo> lstPlatillos, String tipo) {
        Object tabla[][];
        Platillo platillo = new Platillo();
        String[] nombreCols = {"Cantidad", "Nombre", "Ingredientes", "Precio Unitario"};
        if (lstPlatillos != null) {
            modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            tabla = new Object[lstPlatillos.size()][nombreCols.length];
            for (int i = 0; i < lstPlatillos.size(); i++) {
                if (lstPlatillos.get(i).getTipoProducto().equalsIgnoreCase(tipo)) {
                    platillo = lstPlatillos.get(i);
                    tabla[i][0] = 1;
                    tabla[i][1] = platillo.getNombre();
                    tabla[i][2] = platillo.getDescripcion();
                    tabla[i][3] = platillo.getCosto();
                }

            }

            modelo.setDataVector(tabla, nombreCols);
            return modelo;
        }
        return null;
    }

    private void cargarTabla(JTable tabla, String tipo) {
        tabla.setModel(platillosTableModel(platillos, tipo));
    }

    public ArrayList getPlatillos() {
        return platillos;
    }

    public void addPlatillo(Platillo platillo) {
        platillos.add(platillo);
        notasOrden(platillo);
        cargarTabla(tblPlatillos, platillo.getTipoProducto());
    }

    public void notasOrden(Platillo platillo) {

        //txtATicket.append(platillo.toString() + "\n");
    }
//    public void cargarTabla(JTable table, String tipo){
//        int columnas = 4;
//        modelo.addColumn("Cantidad");
//        modelo.addColumn("Nombre");
//        modelo.addColumn("Descripcion");
//        modelo.addColumn("Precio Unitario");
//        int i=0;
//        
//        while(platillos.iterator().hasNext()){
//            Object[]fila = new Object[columnas];
//            for (int j = 0; j < columnas; j++) {
//                if(platillos.get(j).getTipoProducto().equalsIgnoreCase(tipo)){
//                    fila[j] = platillos.get(j);
//                }
//            }
//            modelo.addRow(fila);
//            i++;
//        }
//        table.setModel(modelo);
//        
//        
//    }
}
