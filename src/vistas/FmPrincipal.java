/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import paneles.DetalleOrden;
import paneles.PnlMenu;
import paneles.PnlPersonalizar;
import paneles.PnlProductos;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
//import java.util.ArrayList;

/**
 *
 * @author Jbran
 */
public class FmPrincipal extends javax.swing.JFrame {

    private String notasOrden;
//    private ArrayList<Platillo> platillos;
//    private OrdenJpaController COrden;
//    private UsuariosJpaController CUsuarios;
//    private PlatilloJpaController cPlatillo;
    private PnlMenu menu;
    private DetalleOrden ticket;
    private PnlProductos productos;
    private PnlPersonalizar personalizar;
    private Toolkit tk = Toolkit.getDefaultToolkit();
    private Dimension tam = tk.getScreenSize();

    /**
     * Creates new form NewJFrame
     */
    public FmPrincipal() {

        //this.add(new PanelOrden());
        //this.add(new TabbedPanelMenu());
        initComponents();
        this.setTitle("Tomar orden");
        notasOrden = "";
//        platillos = new ArrayList<>();
//        COrden = new OrdenJpaController();
//        CUsuarios = new UsuariosJpaController();
//        cPlatillo = new PlatilloJpaController();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        pack();

        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        this.setSize(width, height);
        
        this.ticket = new DetalleOrden(this);
        this.menu = new PnlMenu(this, new Point(ticket.getWidth(), 0));
        this.productos = new PnlProductos(this, new Point(ticket.getWidth(), menu.getHeight()));
        this.personalizar = new PnlPersonalizar(this);
        initPantalla();
        //cOrdenHasPlatillo = new OrdenHasPlatilloJpaController();
        //panelPrincipal.add(new Panel(Vistas.Paneles.panelMenu));
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

//    public ArrayList getPlatillos() {
//        return platillos;
//    }
//    public float calcularOrden() {
//        float total = 0F;
//
//        for (Platillo platillo : platillos) {
//            total += platillo.getCosto();
//        }
//
//        return total;
//    }
//    public void guardarOrden() {
////        List<Usuarios> usuarios = CUsuarios.findUsuariosEntities();
////        List<Platillo> platillos = cPlatillo.findPlatilloEntities();
////        Usuarios usuario = usuarios.get(0);
//
//        Orden orden = new Orden();
//        orden.setFecha(new Date());
////        orden.setIdusuario(usuario);
//
//        orden.setTotal(calcularOrden());
//
////        COrden.create(orden);
//
////        guardarOrdenHasPlatillos(orden);
//    }
//    public void guardarOrdenHasPlatillos2(Orden orden, OrdenHasPlatillo ordenHasPlatillos, List<OrdenHasPlatillo> ordHasList) {
//        OrdenHasPlatilloJpaController cOrdenHasPlatillo = new OrdenHasPlatilloJpaController();
//        ordenHasPlatillos.setCantidad(1);
//        ordenHasPlatillos.setOrden(orden);
//        orden.setOrdenHasPlatilloList(ordHasList);
//
//        try {
//            cOrdenHasPlatillo.create(ordenHasPlatillos);
//        } catch (Exception ex) {
//            System.out.println("Preexisting entity");
//        }
//    }
//    public void guardarOrdenHasPlatillos(Orden orden) {
//
////        List<Platillo> platillosBD = cPlatillo.findPlatilloEntities();
//        ArrayList<OrdenHasPlatillo> platillos2 = new ArrayList<>();
//        // ArrayList<Platillo> platillos = new ArrayList<>();
//
//        for (int i = 0; i < platillosBD.size(); i++) {
//
//            for (Platillo platillo : platillos) {
//
//                if (platillo.getNombre().equalsIgnoreCase(platillosBD.get(i).getNombre())) {
//                    OrdenHasPlatillo ordenHasPlatillos = new OrdenHasPlatillo();
//                    ordenHasPlatillos.setPlatillo(platillosBD.get(i));
//                    platillos2.add(ordenHasPlatillos);
//                    ordenHasPlatillos.setPrecio(platillo.getCosto());
//                    ordenHasPlatillos.setNotas(platillo.toString());
//                    platillos2.add(ordenHasPlatillos);
//                    guardarOrdenHasPlatillos2(orden, ordenHasPlatillos, platillos2);
//                }
//
//            }
//
//        }
//
//    }
//    public void notasOrden(Platillo platillo) {
//
//        notasOrden = notasOrden.concat(platillo.toString() + "\n");
////        txtArea.setText(notasOrden);
//    }
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
