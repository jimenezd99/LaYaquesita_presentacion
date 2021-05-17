/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Entidades.Ingredientes;
import Entidades.OrdenHasPlatillo;
import Entidades.Platillo;
import Entidades.Usuarios;
import java.awt.event.KeyEvent;
import fachadaLogica.FachadaIngredientes;
import fachadaLogica.FachadaPlatillo;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jbran
 */
public class FmAdminPlatillos extends javax.swing.JFrame {

    FachadaPlatillo platillos = new FachadaPlatillo();
    FachadaIngredientes ingredientes = new FachadaIngredientes();
    FmAdminMenu adminMenu;
    Usuarios usuarioActual;
    List<Ingredientes> ingredientesActuales = new ArrayList();

    /**
     * Creates new form FmAdminPlatillos
     */
    public FmAdminPlatillos(Usuarios usuarioActual) {
        initComponents();
        this.usuarioActual = usuarioActual;
        this.setLocationRelativeTo(null);
        tamPantalla();
        setIconBotones();
        cargarTablaPlatillos();
        cargarTablaIngredientesActuales();
        cargarTablaIngredientesDisponibles();
    }

    private FmAdminPlatillos() {
        initComponents();
        this.setLocationRelativeTo(null);
        tamPantalla();
        setIconBotones();
        cargarTablaPlatillos();
        cargarTablaIngredientesActuales();
        cargarTablaIngredientesDisponibles();
    }

    public final void tamPantalla() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        this.setSize(width, height);
        setResizable(false);
        pack();
    }

    public final void setIconBotones() {
        this.limpiarBoton(btnCancelar);
        this.limpiarBoton(btnAgregarActuales);
        this.limpiarBoton(btnDescartarActuales);
        this.limpiarBoton(btnEliminar);
        this.limpiarBoton(btnGuardar);
        this.limpiarBoton(btnLimpiar);
        this.limpiarBoton(btnActualizar);
        btnAgregarActuales.setIcon(setIcono("/images/izquierda.png", btnAgregarActuales));
        btnDescartarActuales.setIcon(setIcono("/images/derecha.png", btnAgregarActuales));
        btnCancelar.setIcon(setIcono("/images/arrowleft.png", btnCancelar));
        btnLimpiar.setIcon(setIcono("/images/limpiar.png", btnLimpiar));
        btnGuardar.setIcon(setIcono("/images/guardar.png", btnGuardar));
        btnActualizar.setIcon(setIcono("/images/actualizar.png", btnActualizar));
        btnEliminar.setIcon(setIcono("/images/eliminar.png", btnEliminar));
    }
    public void limpiarBoton(JButton boton){
        boton.setText("");
        boton.setSize(76, 32);
        boton.setPreferredSize(boton.getSize());
        boton.setMaximumSize(boton.getSize());
        boton.setMinimumSize(boton.getSize());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCafecito = new javax.swing.JPanel();
        panelTablaPlatillos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPlatillos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtIdPlatillo = new javax.swing.JTextField();
        txtNombrePlatillo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        cbxTipoProducto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        panelIngredientesDisponibles = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaIngredientesDisponibles = new javax.swing.JTable();
        panelIngredientesActuales = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaIngredientesActuales = new javax.swing.JTable();
        btnAgregarActuales = new javax.swing.JButton();
        btnDescartarActuales = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrar platillos");
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCafecito.setBackground(new java.awt.Color(226, 207, 169));
        pnlCafecito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTablaPlatillos.setBackground(new java.awt.Color(254, 244, 222));
        panelTablaPlatillos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de platillos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(245, 133, 25))); // NOI18N
        panelTablaPlatillos.setForeground(new java.awt.Color(245, 133, 25));
        panelTablaPlatillos.setToolTipText("");

        tablaPlatillos.setBackground(new java.awt.Color(254, 244, 222));
        tablaPlatillos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaPlatillos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPlatillosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPlatillos);

        javax.swing.GroupLayout panelTablaPlatillosLayout = new javax.swing.GroupLayout(panelTablaPlatillos);
        panelTablaPlatillos.setLayout(panelTablaPlatillosLayout);
        panelTablaPlatillosLayout.setHorizontalGroup(
            panelTablaPlatillosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        panelTablaPlatillosLayout.setVerticalGroup(
            panelTablaPlatillosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );

        pnlCafecito.add(panelTablaPlatillos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 570, 270));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 133, 25));
        jLabel1.setText("ADMINISTRAR PLATILLOS");
        pnlCafecito.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        txtIdPlatillo.setEditable(false);
        txtIdPlatillo.setBackground(new java.awt.Color(254, 244, 222));
        txtIdPlatillo.setFocusable(false);
        pnlCafecito.add(txtIdPlatillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 171, -1));

        txtNombrePlatillo.setBackground(new java.awt.Color(254, 244, 222));
        pnlCafecito.add(txtNombrePlatillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 171, -1));

        txtDescripcion.setBackground(new java.awt.Color(254, 244, 222));
        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        pnlCafecito.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 313, 222));

        cbxTipoProducto.setBackground(new java.awt.Color(254, 244, 222));
        cbxTipoProducto.setForeground(new java.awt.Color(91, 52, 46));
        cbxTipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HOTDOG", "BEBIDA", "EXTRA" }));
        pnlCafecito.add(cbxTipoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 171, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(91, 52, 46));
        jLabel2.setText("ID");
        pnlCafecito.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(91, 52, 46));
        jLabel3.setText("Tipo de platillo");
        pnlCafecito.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(91, 52, 46));
        jLabel4.setText("Nombre");
        pnlCafecito.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(245, 133, 25));
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlCafecito.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 630, 80, 50));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(91, 52, 46));
        jLabel5.setText("Descripción");
        pnlCafecito.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(245, 133, 25));
        btnActualizar.setText("Actualizar");
        btnActualizar.setToolTipText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        pnlCafecito.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 630, 70, 50));

        btnLimpiar.setBackground(new java.awt.Color(245, 133, 25));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setToolTipText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        pnlCafecito.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 630, 70, 50));

        btnEliminar.setBackground(new java.awt.Color(245, 133, 25));
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlCafecito.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 630, 70, 50));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(91, 52, 46));
        jLabel6.setText("Costo");
        pnlCafecito.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        txtCosto.setBackground(new java.awt.Color(254, 244, 222));
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCostoKeyPressed(evt);
            }
        });
        pnlCafecito.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 170, -1));

        panelIngredientesDisponibles.setBackground(new java.awt.Color(254, 244, 222));
        panelIngredientesDisponibles.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingredientes disponibles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(245, 133, 25))); // NOI18N
        panelIngredientesDisponibles.setForeground(new java.awt.Color(245, 133, 25));

        tablaIngredientesDisponibles.setBackground(new java.awt.Color(254, 244, 222));
        tablaIngredientesDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaIngredientesDisponibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaIngredientesDisponiblesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaIngredientesDisponibles);

        javax.swing.GroupLayout panelIngredientesDisponiblesLayout = new javax.swing.GroupLayout(panelIngredientesDisponibles);
        panelIngredientesDisponibles.setLayout(panelIngredientesDisponiblesLayout);
        panelIngredientesDisponiblesLayout.setHorizontalGroup(
            panelIngredientesDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        panelIngredientesDisponiblesLayout.setVerticalGroup(
            panelIngredientesDisponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
        );

        pnlCafecito.add(panelIngredientesDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 260, 320));

        panelIngredientesActuales.setBackground(new java.awt.Color(254, 244, 222));
        panelIngredientesActuales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingredientes actuales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(245, 133, 25))); // NOI18N
        panelIngredientesActuales.setForeground(new java.awt.Color(245, 133, 25));

        tablaIngredientesActuales.setBackground(new java.awt.Color(254, 244, 222));
        tablaIngredientesActuales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaIngredientesActuales);

        javax.swing.GroupLayout panelIngredientesActualesLayout = new javax.swing.GroupLayout(panelIngredientesActuales);
        panelIngredientesActuales.setLayout(panelIngredientesActualesLayout);
        panelIngredientesActualesLayout.setHorizontalGroup(
            panelIngredientesActualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        panelIngredientesActualesLayout.setVerticalGroup(
            panelIngredientesActualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );

        pnlCafecito.add(panelIngredientesActuales, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 250, 310));

        btnAgregarActuales.setBackground(new java.awt.Color(245, 133, 25));
        btnAgregarActuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActualesActionPerformed(evt);
            }
        });
        pnlCafecito.add(btnAgregarActuales, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, -1, -1));

        btnDescartarActuales.setBackground(new java.awt.Color(245, 133, 25));
        btnDescartarActuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartarActualesActionPerformed(evt);
            }
        });
        pnlCafecito.add(btnDescartarActuales, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(91, 52, 46));
        jLabel8.setText("Descartar");
        pnlCafecito.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(91, 52, 46));
        jLabel7.setText("Agregar");
        pnlCafecito.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 50, -1));

        btnCancelar.setBackground(new java.awt.Color(254, 244, 222));
        btnCancelar.setForeground(new java.awt.Color(91, 52, 46));
        btnCancelar.setToolTipText("Regresar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlCafecito.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        getContentPane().add(pnlCafecito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private DefaultTableModel ingredientesTableModel(List<Ingredientes> lstIngredientes) {
        Object tabla[][];
        String[] nombreCols = {"ID", "Nombre", "Abreviación"}; // ¿Ya estamos usando Abreviación?
        if (lstIngredientes != null) {
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };
            tabla = new Object[lstIngredientes.size()][nombreCols.length];
            for (int i = 0; i < lstIngredientes.size(); i++) {
                Ingredientes ingrediente = lstIngredientes.get(i);
                tabla[i][0] = ingrediente.getIdingredientes();
                tabla[i][1] = ingrediente.getNombre();
                tabla[i][2] = ingrediente.getAbreviacion(); //Again, ¿Usamos abreviación?

            }
            modelo.setDataVector(tabla, nombreCols);
            return modelo;
        }
        return null;
    }

    private DefaultTableModel platillosTableModel(List<Platillo> lstplatillos) {
        Object tabla[][];
        String[] nombreCols = {"ID", "TipoProducto", "Nombre", "Costo", "Descripción"};
        if (lstplatillos != null) {
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            tabla = new Object[lstplatillos.size()][nombreCols.length];
            for (int i = 0; i < lstplatillos.size(); i++) {
                Platillo platillo = lstplatillos.get(i);
                tabla[i][0] = platillo.getIdplatillo();
                tabla[i][1] = platillo.getTipoProducto();
                tabla[i][2] = platillo.getNombre();
                tabla[i][3] = platillo.getCosto();
                tabla[i][4] = platillo.getDescripcion();

            }
            modelo.setDataVector(tabla, nombreCols);
            return modelo;
        }
        return null;
    }

    private void tablaPlatillosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPlatillosMouseClicked

        ingredientesActuales.clear();
        txtIdPlatillo.setText(tablaPlatillos.getValueAt(tablaPlatillos.getSelectedRow(), 0).toString());
        switch (tablaPlatillos.getValueAt(tablaPlatillos.getSelectedRow(), 1).toString()) {
            case "HOTDOG":
                cbxTipoProducto.setSelectedIndex(0);
                break;
            case "BEBIDA":
                cbxTipoProducto.setSelectedIndex(1);
                break;
            case "EXTRA":
                cbxTipoProducto.setSelectedIndex(2);
                break;
        }
        txtNombrePlatillo.setText(tablaPlatillos.getValueAt(tablaPlatillos.getSelectedRow(), 2).toString());
        txtCosto.setText(tablaPlatillos.getValueAt(tablaPlatillos.getSelectedRow(), 3).toString());
        txtDescripcion.setText(tablaPlatillos.getValueAt(tablaPlatillos.getSelectedRow(), 4).toString());

        // ¿Cómo funcionan los IngredientesList aquí? PlatilloHasIngredientes?
        int id = Integer.parseInt(tablaPlatillos.getValueAt(tablaPlatillos.getSelectedRow(), 0).toString());
        Platillo aux = platillos.consultarPlatilloID(id);
        ingredientesActuales.addAll(aux.getIngredientesList());

        cargarTablaIngredientesActuales();
    }//GEN-LAST:event_tablaPlatillosMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        Platillo platillo = new Platillo();
        switch (cbxTipoProducto.getSelectedIndex()) {
            case 0:
                if (!ingredientesActuales.isEmpty()) {
                    platillo.setNombre(txtNombrePlatillo.getText());
                    platillo.setCosto(Float.parseFloat(txtCosto.getText()));
                    platillo.setDescripcion(txtDescripcion.getText());
                    platillo.setIngredientesList(ingredientesActuales);
                    platillo.setTipoProducto("HOTDOG");
                    platillos.registrarPlatillo(platillo);
                    JOptionPane.showMessageDialog(null, "Se ha agregado el platillo.");
                } else {
                    JOptionPane.showMessageDialog(null, "Agregue un ingrediente al platillo.");
                }
                break;

            case 1:
                platillo.setNombre(txtNombrePlatillo.getText());
                platillo.setCosto(Float.parseFloat(txtCosto.getText()));
                platillo.setDescripcion(txtDescripcion.getText());
                platillo.setTipoProducto("BEBIDA");
                platillo.setIngredientesList(new ArrayList());
                platillos.registrarPlatillo(platillo);
                JOptionPane.showMessageDialog(null, "Se ha agregado la bebida.");
                break;

            case 2:
                platillo.setNombre(txtNombrePlatillo.getText());
                platillo.setCosto(Float.parseFloat(txtCosto.getText()));
                platillo.setDescripcion(txtDescripcion.getText());
                platillo.setTipoProducto("EXTRA");
                platillo.setIngredientesList(new ArrayList());
                platillos.registrarPlatillo(platillo);
                JOptionPane.showMessageDialog(null, "Se ha agregado la bebida.");
                break;
        }

        cargarTablaPlatillos();
        limpiar();


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCostoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyPressed

        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
            txtCosto.setEditable(false);
        } else {
            txtCosto.setEditable(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoKeyPressed

    private void tablaIngredientesDisponiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaIngredientesDisponiblesMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_tablaIngredientesDisponiblesMouseClicked

    private void btnAgregarActualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActualesActionPerformed
        Ingredientes ingrediente = ingredientes.consultarIngredienteId(
                Integer.parseInt(tablaIngredientesDisponibles.getValueAt(
                        tablaIngredientesDisponibles.getSelectedRow(), 0)
                        .toString()));

        if (!ingredientesActuales.contains(ingrediente)) {
            ingredientesActuales.add(ingrediente);
        }

        cargarTablaIngredientesActuales();
    }//GEN-LAST:event_btnAgregarActualesActionPerformed

    private void btnDescartarActualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartarActualesActionPerformed
        Ingredientes ingrediente = ingredientes.consultarIngredienteId(
                Integer.parseInt(tablaIngredientesDisponibles.getValueAt(
                        tablaIngredientesDisponibles.getSelectedRow(), 0)
                        .toString()));

        if (ingredientesActuales.contains(ingrediente)) {
            ingredientesActuales.remove(ingrediente);
        }
        cargarTablaIngredientesActuales();
    }//GEN-LAST:event_btnDescartarActualesActionPerformed

    //Tengo dudas en este actualizar
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Platillo platillo = new Platillo();
        switch (cbxTipoProducto.getSelectedIndex()) {
            case 0:
                if (!ingredientesActuales.isEmpty()) {
                    platillo.setIdplatillo(Integer.parseInt(txtIdPlatillo.getText()));
                    platillo.setNombre(txtNombrePlatillo.getText());
                    platillo.setCosto(Float.parseFloat(txtCosto.getText()));
                    platillo.setDescripcion(txtDescripcion.getText());
                    platillo.setIngredientesList(ingredientesActuales);
                    platillo.setTipoProducto("HOTDOG");
                    platillo.setOrdenHasPlatilloList(new ArrayList<OrdenHasPlatillo>()); //Esto es hardcode (?) 13/04/2021
                    platillos.editarPlatillo(platillo);
                    JOptionPane.showMessageDialog(null, "Se ha actualizado el platillo.");
                } else {
                    JOptionPane.showMessageDialog(null, "Agregue un ingrediente al platillo.");
                }
                break;

            case 1:
                platillo.setIdplatillo(Integer.parseInt(txtIdPlatillo.getText()));
                platillo.setNombre(txtNombrePlatillo.getText());
                platillo.setCosto(Float.parseFloat(txtCosto.getText()));
                platillo.setDescripcion(txtDescripcion.getText());
                platillo.setTipoProducto("BEBIDA");
                platillo.setOrdenHasPlatilloList(new ArrayList<OrdenHasPlatillo>()); //Esto es hardcode (?) 13/04/2021
                platillo.setIngredientesList(new ArrayList());
                platillos.editarPlatillo(platillo);
                JOptionPane.showMessageDialog(null, "Se ha actualizado la bebida.");
                break;
            case 2:
                platillo.setIdplatillo(Integer.parseInt(txtIdPlatillo.getText()));
                platillo.setNombre(txtNombrePlatillo.getText());
                platillo.setCosto(Float.parseFloat(txtCosto.getText()));
                platillo.setDescripcion(txtDescripcion.getText());
                platillo.setTipoProducto("EXTRA");
                platillo.setOrdenHasPlatilloList(new ArrayList<OrdenHasPlatillo>()); //Esto es hardcode (?) 13/04/2021
                platillo.setIngredientesList(new ArrayList());
                platillos.registrarPlatillo(platillo);
                JOptionPane.showMessageDialog(null, "Se ha actualizado el extra.");
                platillos.editarPlatillo(platillo);
                break;
        }
        limpiar();
        cargarTablaPlatillos();

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        platillos.eliminarPlatillo(Integer.parseInt(txtIdPlatillo.getText()));
        cargarTablaPlatillos();
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
//        adminMenu = new FmAdminMenu(usuarioActual);
//        adminMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cargarTablaPlatillos() {
        tablaPlatillos.setModel(platillosTableModel(platillos.consultarPlatillos()));
    }

    private void cargarTablaIngredientesDisponibles() {
        tablaIngredientesDisponibles.setModel(ingredientesTableModel(ingredientes.consultarIngredientes()));
    }

    private void cargarTablaIngredientesActuales() {
        tablaIngredientesActuales.setModel(ingredientesTableModel(ingredientesActuales));
    }

    private void limpiar() {
        txtCosto.setText("");
        txtDescripcion.setText("");
        txtIdPlatillo.setText("");
        txtNombrePlatillo.setText("");
        ingredientesActuales.clear();
        cargarTablaIngredientesActuales();
    }

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
            java.util.logging.Logger.getLogger(FmAdminPlatillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmAdminPlatillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmAdminPlatillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmAdminPlatillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmAdminPlatillos().setVisible(true);
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
        int ancho = (int) (boton.getWidth()/2.5);
        int largo = (int) (boton.getHeight()/2);
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, largo, Image.SCALE_DEFAULT));

        return icono;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregarActuales;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDescartarActuales;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxTipoProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel panelIngredientesActuales;
    private javax.swing.JPanel panelIngredientesDisponibles;
    private javax.swing.JPanel panelTablaPlatillos;
    private javax.swing.JPanel pnlCafecito;
    private javax.swing.JTable tablaIngredientesActuales;
    private javax.swing.JTable tablaIngredientesDisponibles;
    private javax.swing.JTable tablaPlatillos;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtIdPlatillo;
    private javax.swing.JTextField txtNombrePlatillo;
    // End of variables declaration//GEN-END:variables
}
