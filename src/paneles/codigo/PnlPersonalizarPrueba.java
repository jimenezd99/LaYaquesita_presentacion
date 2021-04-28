/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles.codigo;

import Entidades.Ingredientes;
import Entidades.Platillo;
import fachadaLogica.FachadaLogica;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import vistas.FmPrincipal;

/**
 *
 * @author Zannie
 */
public class PnlPersonalizarPrueba extends JPanel {

    private FmPrincipal tomarOrden;
    private PnlProductosPrueba jPanelProductos;
    private PanelOrden pnlOrden;
    private FachadaLogica fachadaLogica;
    private ArrayList<JToggleButton> botonesIngredientes;
    // private javax.swing.JPanel jPanelOrden;
    private Dimension sizePrincipal;
    private Dimension minSize;
    private final Color cafecito = new java.awt.Color(226, 207, 169);
    private final Color cremita = new java.awt.Color(254, 244, 222);
    private JButton btnCancelar;
    private JButton btnAgregar;
    private JToggleButton CT;
    private JToggleButton plain;
    private Platillo platillo;

    public PnlPersonalizarPrueba(FmPrincipal fmPrincipal, Point location, PnlProductosPrueba jPanelProductos) {

        // this.jPanelOrden = new javax.swing.JPanel();
//        this.platillo = new Platillo();
        this.tomarOrden = fmPrincipal;
        this.fachadaLogica = new FachadaLogica();
        this.botonesIngredientes = new ArrayList();
        this.jPanelProductos = jPanelProductos;
        this.sizePrincipal = new Dimension((this.tomarOrden.getWidth() / 3) * 2, (this.tomarOrden.getHeight() / 10) * 8);
        this.minSize = new Dimension((int) this.sizePrincipal.getWidth() - 20, (int) (this.sizePrincipal.getHeight() / 4) * 3 + 20);
        initPanel(location);

    }

    public void initPanel(Point location) {
        this.setBackground(cafecito);
        this.setPreferredSize(sizePrincipal);
        this.setSize(sizePrincipal);
        this.setLocation(location);
        this.setBackground(cremita);
        this.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        this.setMinimumSize(minSize);
        this.setPreferredSize(minSize);
        btnCancelar = new JButton();
        btnAgregar = new JButton();
        CT = new JToggleButton();
        plain = new JToggleButton();
//        setBoton(CT, "CT");
//        setBoton(btnCancelar, "Cancelar");
//        setBoton(btnAgregar, "Agregar");
        setActionBotonCancelarProd(btnCancelar);
        setActionBotonAgregarProd(btnAgregar);
    }

    public void setIngredientesPlatillo(Platillo platillo) {
        this.platillo = platillo;
        //this.platillo.getIngredientesList().addAll(platillo.getIngredientesList());
        ArrayList<Ingredientes> ingredientesTemp = new ArrayList<>();
        removeBotones();
        this.botonesIngredientes.add(CT);

         CT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnAgregar.setEnabled(true);
            }
        });
        this.botonesIngredientes.add(plain);
        plain.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnAgregar.setEnabled(true);
            }
        });
        CT.setSelected(false);
        plain.setSelected(false);
        ingredientesTemp.addAll(this.platillo.getIngredientesList());
        crearBotones(ingredientesTemp);
        this.add(btnAgregar);
        this.add(btnCancelar);
        btnAgregar.setEnabled(false);
    }
    
   

    public void setBoton(JButton boton, String texto) {
        Dimension tamBoton = new Dimension(188, 88);
        Font font = new java.awt.Font("Century Gothic", 1, 18);
        Color background = new Color(240, 60, 31);
        Color foreground = new Color(240, 211, 161);

        boton.setBackground(background);
        boton.setForeground(foreground);
        boton.setFont(font);
        boton.setMaximumSize(tamBoton);
        boton.setMinimumSize(tamBoton);
        boton.setPreferredSize(tamBoton);
        boton.setText(texto);
        boton.setLocation(0, 100);

    }

    public void removeBotones() {
        botonesIngredientes.clear();
        removeAll();
        revalidate();
        repaint();

        this.setBoton(CT, "CT");
        this.setBoton(plain, "Plain");
        this.setBoton(btnCancelar, "Cancelar");
        this.setBoton(btnAgregar, "Agregar");
    }

    public void crearBotones(ArrayList<Ingredientes> ingredientes) {
        for (Ingredientes ingrediente : ingredientes) {
            JToggleButton ingredienteTemp = new JToggleButton();
            ingredienteTemp.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                   btnAgregar.setEnabled(true);
                }
            });
            botonesIngredientes.add(ingredienteTemp);
            PnlPersonalizarPrueba.this.setBoton(ingredienteTemp, ingrediente.getAbreviacion());

        }
        setPosicionBoton(botonesIngredientes);
    }

    public void setBoton(JToggleButton producto, String nombreProducto) {
        Color background = new Color(245, 133, 25);
        Color foreground = new Color(91, 52, 46);
        Dimension tamBoton = new Dimension(188, 88);
        Font font = new java.awt.Font("Century Gothic", 1, 18);
        producto.setFont(font);
        producto.setName(nombreProducto);
        producto.setBackground(background);
        producto.setForeground(foreground);
        producto.setText(nombreProducto);
        producto.setMaximumSize(tamBoton);
        producto.setMinimumSize(tamBoton);
        producto.setPreferredSize(tamBoton);

    }

    public void setPosicionBoton(ArrayList<JToggleButton> ingredientes) {
        ArrayList<JToggleButton> ingredientesTemp = ingredientes;
        int x = 0;
        int y = 0;

        for (JToggleButton producto : ingredientesTemp) {
            producto.setLocation(x, y);
            add(producto);

            x += 10;

        }
        revalidate();

    }

    public void setActionBotonCancelarProd(JButton boton) {

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
                boolean selected = abstractButton.getModel().isSelected();
                jPanelProductos.getPanelOrden().setVisible(true);
                setVisible(false);

            }
        };

        boton.addActionListener(actionListener);

    }

//Este método es el que estaba en el push de Ana 27/04/2021
//    public void setActionBotonAgregarProd(JButton boton) {
//
//        ActionListener actionListener = new ActionListener() {
//            public void actionPerformed(ActionEvent actionEvent) {
//                AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
//                boolean selected = abstractButton.getModel().isSelected();
//
//                agregarProducto();
//            }
//        };
//
//        boton.addActionListener(actionListener);
//
//    }
 public void setActionBotonAgregarProd(JButton boton) {

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
                boolean selected = abstractButton.getModel().isSelected();

                if (validarIngredientes() || botonesIngredientes.isEmpty()) {
                    jPanelProductos.getPanelOrden().setVisible(true);
                    setIngredientes();
                    
                    SpinnerModel value = new SpinnerNumberModel(1, 1, 999, 1);
                    JSpinner cantidad = new JSpinner(value);
                 
                    JTextArea notas = new JTextArea();
                    notas.setPreferredSize(new Dimension(170, 70));
                    
                    JPanel myPanel = new JPanel();
                    myPanel.setPreferredSize(new Dimension(170, 250));
                    myPanel.add(new JLabel("Cantidad: \n"));
                    myPanel.add(cantidad);
                    myPanel.add(Box.createHorizontalStrut(30)); //Espacio
                    myPanel.add(Box.createVerticalStrut(60));
                    myPanel.add(new JLabel("Notas: \n"));
                    myPanel.add(notas);
                       
                    int result = JOptionPane.showConfirmDialog(null, myPanel, "Por favor ingrese la cantidad y las notas especiales", JOptionPane.OK_CANCEL_OPTION);
                    if (result == JOptionPane.OK_OPTION) {
                        Ingredientes ingrediente = new Ingredientes();
                        ingrediente.setNombre(notas.getText());
                        platillo.getIngredientesList().add(ingrediente);
                        platillo.setCantidad((Integer)cantidad.getValue());
                    

                        agregarProducto();
                    setVisible(false);
                }
                
                
                } else {
                    JOptionPane.showMessageDialog(null, "No ha seleccionado ingredientes");
                }

            }
        };

        boton.addActionListener(actionListener);

    }
    
    public void agregarProducto() {
        if (validarIngredientes() || botonesIngredientes.isEmpty()) {
            jPanelProductos.getPanelOrden().setVisible(true);
            setIngredientes();

            if (tomarOrden.getPanelOrden().getPlatillos().contains(platillo)) {
                ArrayList<Platillo> platillosAux = tomarOrden.getPanelOrden().getPlatillos();
                int id = platillosAux.indexOf(platillo);
                platillosAux.set(id, platillo);
            } else {
                tomarOrden.getPanelOrden().addPlatillo(platillo);
            }
          platillo = new Platillo();
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ingredientes");
        }
    }
    
    public Platillo getPlatillo(){
        return this.platillo;
    }

    public boolean validarIngredientes() {
        for (JToggleButton botonesIngrediente : botonesIngredientes) {
            if (botonesIngrediente.isSelected()) {
                return true;
            }
        }

        return false;
    }

    public void setIngredientes() {
        platillo.getIngredientesList().clear();
        for (JToggleButton botonesIngrediente : botonesIngredientes) {
            Ingredientes ingrediente = new Ingredientes();
            if (botonesIngrediente.isSelected() && botonesIngrediente.getText().equalsIgnoreCase("CT")) {
                ingrediente.setNombre("CT");
                platillo.getIngredientesList().add(ingrediente);
            } else if (botonesIngrediente.isSelected() && botonesIngrediente.getText().equalsIgnoreCase("Plain")) {
                ingrediente.setNombre(botonesIngrediente.getText());
                platillo.getIngredientesList().add(ingrediente);
            } else if (botonesIngrediente.isSelected()) {
                ingrediente.setNombre(botonesIngrediente.getText());
                platillo.getIngredientesList().add(ingrediente);
            }
        }
    }

    public Boolean confirmarSalida() {
        int input = JOptionPane.showConfirmDialog(null, "¿Desea guardar el platillo antes de salir?");
        switch (input) {
            case 0:
                agregarProducto();
                return true;
            case 1:
                jPanelProductos.getPanelOrden().setVisible(true);
                setVisible(false);
                return true;
            default:
                return false;
        }
    }

}
