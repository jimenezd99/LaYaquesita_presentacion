/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachadaLogica;

import Controladores.OrdenJpaController;
import Entidades.Orden;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jbran
 */
public class FachadaOrden {
    
    OrdenJpaController COrden;
    
    public FachadaOrden(){
        COrden = new OrdenJpaController();
    }
    
    public boolean registrarOrden(Orden orden){
        try{
            COrden.create(orden);
            return true;
            
        } catch (Exception x){
            System.out.println(x.getMessage());
            return false;
        }
    }

    public List<Orden> consultarOrdenes() {
        List<Orden> orden = COrden.findOrdenEntities();
        if (orden.isEmpty()) {
            System.out.println("No hay ordenes registrados");
        }
        return orden;
    }
    
    public List<Orden> consultarOrdenesPeriodo(Date fechaInicio, Date fechaFinal) {
        List<Orden> orden = COrden.findOrdenEntities();
        List<Orden> ordenesPeriodo = new ArrayList<Orden>();
        if (orden.isEmpty()) {
            System.out.println("No hay ordenes registradas");
        } else {
            for (Orden ord : orden) {
                if (!ord.getFecha().before(fechaInicio) && !ord.getFecha().after(fechaFinal)) {
                    ordenesPeriodo.add(ord);
                }
            }
            if(ordenesPeriodo.isEmpty()){
                JOptionPane.showMessageDialog(new JFrame(),"No se encontraron registros!", "Aviso", 0);
            }
        }
        return ordenesPeriodo;
    }
    
    public Orden consultarPlatilloOrden(Integer id){
        return COrden.findOrden(id);
    }


    
}
