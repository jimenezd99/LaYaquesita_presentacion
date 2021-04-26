/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.codigo;

import Controladores.OrdenJpaController;
import Entidades.Orden;
import Entidades.Platillo;
import fachadaLogica.FachadaLogica;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vistas.FmPrincipal;
import vistas.FrmConfirmarOrden;

/**
 *
 * @author La Yaquesita
 */
public class PanelOrden extends javax.swing.JPanel {

    private FmPrincipal tomarOrden;
    private Dimension tamPrincipal;
    private Dimension tamText;
    private Dimension tamPanel;
    private ArrayList<Platillo> platillos;
    private FachadaLogica fachadaLogica;

    private DefaultTableModel modelo;
    private javax.swing.JPanel pnlCremita;
    private javax.swing.JLabel jlblOrden;
    private javax.swing.JLabel jlblTotal;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JScrollPane spTicket1;
    private javax.swing.JTable tblPlatillos;
    private PnlPersonalizarPrueba personalizar;

    private Platillo platilloAux;

    public PanelOrden(FmPrincipal fmPrincipal) {

        this.setLocation(0, 0);
        this.tomarOrden = fmPrincipal;
        int ancho = tomarOrden.getWidth() / 3;
        int largo = tomarOrden.getHeight();
        pnlCremita = new javax.swing.JPanel();
        jlblOrden = new javax.swing.JLabel();
        jlblTotal = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
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
        setLastOrdenId();

        btnSiguiente.setBackground(new java.awt.Color(247, 157, 68));
        btnSiguiente.setFont(new java.awt.Font("Century Gothic", 1, 18));
        btnSiguiente.setText("Siguiente");

        btnEditar.setBackground(new java.awt.Color(247, 157, 68));
        btnEditar.setFont(new java.awt.Font("Century Gothic", 1, 18));
        btnEditar.setText("Editar");

        btnEliminar.setBackground(new java.awt.Color(247, 157, 68));
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 1, 18));
        btnEliminar.setText("Eliminar");

        btnCancelar.setBackground(new java.awt.Color(247, 157, 68));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 18));
        btnCancelar.setText("Cancelar");

        pnlCremita.setSize(tamPrincipal);
        pnlCremita.setPreferredSize(tamPanel);
        cargarTabla(tblPlatillos);
        pnlCremita.add(jlblOrden);
        //spTicket1.add(tblPlatillos);
        pnlCremita.add(tblPlatillos);

        pnlCremita.add(btnSiguiente);

        pnlCremita.add(btnEditar);

        pnlCremita.add(btnEliminar);

        pnlCremita.add(btnCancelar);

        btnCancelar.setEnabled(false);

        btnEditar.setEnabled(false);

        btnEliminar.setEnabled(false);

        //  this.add(personalizar);
        // personalizar.setVisible(false);
        add(pnlCremita);

        addMouseListenerPlatillos();
        addActionListenerSiguiente();
        addActionListenerEditar();
        addActionListenerEliminar();
        addActionListenerCancelar();

    }

    private void addActionListenerSiguiente() {
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

    }

    private void addActionListenerCancelar() {
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

    }

    private void addActionListenerEditar() {
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
    }

    private void addActionListenerEliminar() {
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
    }

    private void addMouseListenerPlatillos() {
        tblPlatillos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPlatillosMouseClicked(evt);
            }
        });

    }

    private DefaultTableModel platillosTableModel(List<Platillo> lstPlatillos) {
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
                platillo = lstPlatillos.get(i);
                tabla[i][0] = 1;
                tabla[i][1] = platillo.getNombre();
                tabla[i][2] = platillo.getDescripcion();
                tabla[i][3] = platillo.getCosto();

            }

            modelo.setDataVector(tabla, nombreCols);
            return modelo;
        }
        return null;
    }

    private DefaultTableModel platillosTableModelTipo(List<Platillo> lstPlatillos, String tipo) {
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

    private void cargarTabla(JTable tabla) {
        tabla.setModel(platillosTableModel(platillos));
    }

    private void cargarTablaTipo(JTable tabla, String tipo) {
        tabla.setModel(platillosTableModel(platillos));
    }

    public ArrayList getPlatillos() {
        return platillos;

    }

    public void clearPlatillos() {
        platillos.clear();
        cargarTabla(tblPlatillos);
    }

    public void addPlatillo(Platillo platillo) {
        if (platillos.isEmpty()) {
            btnCancelar.setEnabled(true);
        }
        platillos.add(platillo);
        cargarTabla(tblPlatillos);
    }

    public int getLastOrdenId() {
        OrdenJpaController cOrden = new OrdenJpaController();
        List<Orden> ordenes = cOrden.findOrdenEntities();
        return ordenes.size() + 1;
    }

    public void setLastOrdenId() {
        jlblOrden.setText("Orden: " + String.valueOf(getLastOrdenId()));
    }

    private void tblPlatillosMouseClicked(java.awt.event.MouseEvent evt) {
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
        setPlatilloAux(tblPlatillos.getValueAt(tblPlatillos.getSelectedRow(), 1).toString());

    }

    private void setPlatilloAux(String nombre) {
        this.platilloAux = tomarOrden.getPanelProductos().getPlatillo(nombre);
    }

    private void btnSiguienteActionPerformed(ActionEvent evt) {
        FrmConfirmarOrden conf;
        if (!platillos.isEmpty()) {
            conf = new FrmConfirmarOrden(platillos, this);
            conf.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No se han agregado platillos");
        }
    }

    private void btnEditarActionPerformed(ActionEvent evt) {
        // this.personalizar = new PnlPersonalizarPrueba(tomarOrden, tomarOrden.getPanelProductos().getLocation(), tomarOrden.getPanelProductos());
        // JOptionPane.showMessageDialog(this, "Esto abre el menú de personalizar para el elemento seleccionado c:");
        if (platilloAux.getTipoProducto().equalsIgnoreCase("hotdog")) {
            tomarOrden.getPanelProductos().getPanelOrden().setVisible(false);
            tomarOrden.getPanelProductos().getPnlPersonalizar().setVisible(true);
            tomarOrden.getPanelProductos().getPnlPersonalizar().setIngredientesPlatillo(platilloAux);
        } else {
            JOptionPane.showMessageDialog(this, "No se puede editar este producto");
        }
        cargarTabla(tblPlatillos);

    }

    private void btnEliminarActionPerformed(ActionEvent evt) {
        //JOptionPane.showMessageDialog(this, "Esto elimina el elemento seleccionado");
        platillos.remove(platilloAux);
        cargarTabla(tblPlatillos);
    }

    private void btnCancelarActionPerformed(ActionEvent evt) {
        //JOptionPane.showMessageDialog(this, "Esto elimina el elemento seleccionado");
        int input = JOptionPane.showConfirmDialog(null, "¿Está seguro de querer cancelar la orden?");
        if (input == 0) {
            platillos.clear();
            cargarTabla(tblPlatillos);
            btnCancelar.setEnabled(false);
        }
    }

}
