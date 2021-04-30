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
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import vistas.FmPrincipal;

/**
 *
 * @author Zannie
 */
public class PnlProductos extends JPanel {

    private FmPrincipal tomarOrden;
    private FachadaLogica fachadaLogica;
    private List<Platillo> platillos;
    private ArrayList<JToggleButton> botonesProductos;
    private javax.swing.JPanel jPanelOrden;
    private Dimension sizePrincipal;
    private Dimension minSize;
    private PnlPersonalizar personalizar;
    private final Color cafecito = new java.awt.Color(226, 207, 169);
    private final Color cremita = new java.awt.Color(254, 244, 222);

    public PnlProductos(FmPrincipal fmPrincipal, Point location) {

        this.jPanelOrden = new javax.swing.JPanel();
        this.tomarOrden = fmPrincipal;
        this.fachadaLogica = new FachadaLogica();
        this.personalizar = new PnlPersonalizar(tomarOrden, location, this);
        this.add(personalizar);
        personalizar.setVisible(false);
        botonesProductos = new ArrayList();
        this.platillos = fachadaLogica.consultarPlatillos();
        this.sizePrincipal = new Dimension((this.tomarOrden.getWidth() / 3) * 2, (this.tomarOrden.getHeight() / 10) * 8);
        this.minSize = new Dimension((int) this.sizePrincipal.getWidth() - 20, (int) (this.sizePrincipal.getHeight() / 4) * 3 + 20);
        initPanel(location);

    }

    public void initPanel(Point location) {
        this.setBackground(cafecito);
        this.setPreferredSize(sizePrincipal);
        this.setSize(sizePrincipal);
        this.setLocation(location);
        this.jPanelOrden.setBackground(cremita);
        this.jPanelOrden.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        this.jPanelOrden.setMinimumSize(minSize);
        this.jPanelOrden.setPreferredSize(minSize);
        this.add(jPanelOrden);
    }

    public Platillo getPlatillo(String nombre) {
        this.platillos = fachadaLogica.consultarPlatillos();
        for (Platillo platillo : platillos) {
            if (platillo.getNombre().equalsIgnoreCase(nombre)) {
                return platillo;
            }
        }
        return null;
    }
    
  

    public void cargarBebidas() {
        ArrayList<Platillo> productos = getProductos("bebida");

        removeBotones();
        crearBotones(productos);
    }

    public void cargarHotdogs() {
        ArrayList<Platillo> productos = getProductos("hotdog");
        removeBotones();
        crearBotones(productos);
    }

    public void cargarExtras() {
        ArrayList<Platillo> productos = getProductos("extra");
        removeBotones();
        crearBotones(productos);
    }

    public void removeBotones() {
        jPanelOrden.removeAll();
        jPanelOrden.revalidate();
        jPanelOrden.repaint();
        botonesProductos.clear();
    }

    public void crearBotones(ArrayList<Platillo> productos) {
        for (Platillo producto : productos) {
            JToggleButton productoTemp = new JToggleButton();

            botonesProductos.add(productoTemp);
            setBoton(productoTemp, producto.getNombre(), producto.getTipoProducto());

        }
        setPosicionBoton(botonesProductos);
    }

    public ArrayList getProductos(String tipo) {
        ArrayList<Platillo> platillosTemp = new ArrayList();

        for (Platillo platillo : platillos) {
            if (platillo.getTipoProducto().equalsIgnoreCase(tipo)) {
                platillosTemp.add(platillo);
            }
        }

        return platillosTemp;
    }

    public void setBoton(JToggleButton producto, String nombreProducto, String tipoProducto) {
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
        setActionBoton(producto, tipoProducto);

    }

    public void setPosicionBoton(ArrayList<JToggleButton> productos) {
        ArrayList<JToggleButton> productosTemp = productos;
        int x = 0;
        int y = 0;

        for (JToggleButton producto : productosTemp) {
            producto.setLocation(x, y);
            jPanelOrden.add(producto);

            x += 10;

        }
        revalidate();

    }

    public void setActionBoton(JToggleButton boton, String tipoPlatillo) {

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
                boolean selected = abstractButton.getModel().isSelected();
                if(tipoPlatillo.equalsIgnoreCase("hotdog")){
                jPanelOrden.setVisible(false);
                personalizar.setVisible(true);
                personalizar.setIngredientesPlatillo(getPlatillo(boton.getText()));
                }else{
                    Platillo platillo = getPlatillo(boton.getText());
                     tomarOrden.getPanelOrden().addPlatillo(platillo);
                }
                boton.setSelected(false);
            }
        };

        boton.addActionListener(actionListener);

    }

    public javax.swing.JPanel getPanelOrden() {
        return jPanelOrden;
    }
    
    public PnlPersonalizar getPnlPersonalizar(){
        return personalizar;
    }

}
