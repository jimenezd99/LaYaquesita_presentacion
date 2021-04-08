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
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import vistas.FmPrincipal;

/**
 *
 * @author Zannie
 */
public class PnlProductosPrueba extends JPanel {

    private FmPrincipal tomarOrden;
    private FachadaLogica fachadaLogica;
    private List<Platillo> platillos;
    private ArrayList<JToggleButton> botonesProductos;
    private javax.swing.JPanel jPanelOrden;

    public PnlProductosPrueba(FmPrincipal fmPrincipal, Point location) {

        this.jPanelOrden = new javax.swing.JPanel();
        this.tomarOrden = fmPrincipal;
        this.fachadaLogica = new FachadaLogica();

        botonesProductos = new ArrayList();
        this.platillos = fachadaLogica.consultarPlatillos();
        initPanel(location);
    }

    public void initPanel(Point location) {
        this.setBackground(new java.awt.Color(226, 207, 169));
        this.setPreferredSize(new java.awt.Dimension(1360, 800));
        this.setSize(1360, 800);
        this.setLocation(location);
        this.jPanelOrden.setBackground(new java.awt.Color(254, 244, 222));
        this.jPanelOrden.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        this.jPanelOrden.setMinimumSize(new java.awt.Dimension(1340, 400));
        this.jPanelOrden.setPreferredSize(new java.awt.Dimension(1340, 400));
        this.add(jPanelOrden);
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
            setBoton(productoTemp, producto.getNombre());

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

}
