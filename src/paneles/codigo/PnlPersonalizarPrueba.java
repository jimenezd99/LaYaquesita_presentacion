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
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import vistas.FmPrincipal;

/**
 *
 * @author Zannie
 */
public class PnlPersonalizarPrueba extends JPanel {

    private FmPrincipal fmPrincipal;
    private PnlProductosPrueba jPanelProductos;
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
        this.platillo = new Platillo();
        this.fmPrincipal = fmPrincipal;
        this.fachadaLogica = new FachadaLogica();
        this.botonesIngredientes = new ArrayList();
        this.jPanelProductos = jPanelProductos;
        this.sizePrincipal = new Dimension((this.fmPrincipal.getWidth() / 3) * 2, (this.fmPrincipal.getHeight() / 10) * 8);
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
        setActionBotonCancelar(btnCancelar);
        setActionBotonAgregar(btnAgregar);
    }

    public void setIngredientes(Platillo platillo) {
        this.platillo = platillo;
        //this.platillo.getIngredientesList().addAll(platillo.getIngredientesList());
        ArrayList<Ingredientes> ingredientesTemp = new ArrayList<>();
        removeBotones();
        this.botonesIngredientes.add(CT);
        this.botonesIngredientes.add(plain);
        CT.setSelected(false);
        plain.setSelected(false);
        ingredientesTemp.addAll(this.platillo.getIngredientesList());
        crearBotones(ingredientesTemp);
        this.add(btnAgregar);
        this.add(btnCancelar);
    }
    


    public void setBoton(JButton boton, String texto) {
        Dimension tamBoton = new Dimension(188, 88);
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

            botonesIngredientes.add(ingredienteTemp);
            PnlPersonalizarPrueba.this.setBoton(ingredienteTemp, ingrediente.getAbreviacion());

        }
        setPosicionBoton(botonesIngredientes);
    }

    public void setBoton(JToggleButton producto, String nombreProducto) {
        Color background = new Color(245, 133, 25);
        Color foreground = new Color(91, 52, 46);
        Dimension tamBoton = new Dimension(188, 88);
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

    public void setActionBotonCancelar(JButton boton) {

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

    public void setActionBotonAgregar(JButton boton) {

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
                boolean selected = abstractButton.getModel().isSelected();
                jPanelProductos.getPanelOrden().setVisible(true);
                setIngredientes();
                fmPrincipal.getPanelOrden().addPlatillo(platillo);
                setVisible(false);

            }
        };

        boton.addActionListener(actionListener);

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

}
