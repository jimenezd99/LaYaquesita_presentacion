/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Entidades.Platillo;
import paneles.DetalleOrden;
import paneles.PnlMenu;
import paneles.PnlPersonalizar;
import paneles.PnlProductos;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JToggleButton;
import paneles.codigo.PnlProductosPrueba;
//import java.util.ArrayList;
/**
 *
 * @author Jbran
 */
public class FmPrincipal extends javax.swing.JFrame {

    private String notasOrden;
    private ArrayList<Platillo> platillos;
    private PnlMenu menu;
    private DetalleOrden ticket;
    //private PnlProductos productos;
     private PnlProductosPrueba productos;
    private PnlPersonalizar personalizar;
    private Toolkit tk = Toolkit.getDefaultToolkit();
    private Dimension tam = tk.getScreenSize();

    /**
     * Creates new form NewJFrame
     */
    public FmPrincipal() {

        initComponents();
        this.setTitle("Tomar orden");
        notasOrden = "";
        platillos = new ArrayList<>();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        pack();

        int width = (int) screenSize.getWidth()-15;
        int height = (int) screenSize.getHeight()-15;
        this.setSize(width, height);


        this.ticket = new DetalleOrden(this);
        this.menu = new PnlMenu(this, new Point(ticket.getWidth(), 0));
        this.productos= new PnlProductosPrueba(this, new Point(ticket.getWidth(), menu.getHeight()));
        this.personalizar= new PnlPersonalizar(this);
        initPantalla();
        setPanelProductos();
        
    }

    public void initPantalla() {
        this.add(menu);
        this.add(ticket);
        this.add(productos);
        //lógica para cambiar productos por personalizar debe ir después de seleecionar el producto
        //this.add(personalizar);
        setResizable(true);
        setLocationRelativeTo(null);
    }
    
    
     public void setPanelProductos(){
         JToggleButton menu = this.menu.getSelected();
        
        switch (menu.getText()){
            case "HotDogs":
                productos.cargarHotdogs();
                break;
            case "Bebidas":
                productos.cargarBebidas();
                break;
            case "Extras":
                productos.cargarExtras();
                break;
        }
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tomar Orden");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(226, 207, 169));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setResizable(false);
        setSize(tam);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
            java.util.logging.Logger.getLogger(FmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
