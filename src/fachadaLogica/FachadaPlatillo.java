/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachadaLogica;

import Controladores.PlatilloJpaController;
import Entidades.Platillo;
import java.util.List;

/**
 *
 * @author Jbran
 */
public class FachadaPlatillo {
    
    PlatilloJpaController CPlatillo;
    
    public FachadaPlatillo(){
        CPlatillo = new PlatilloJpaController();
    }
    
    public boolean registrarPlatillo(Platillo platillo) {
        try {
            CPlatillo.create(platillo);
            return true;
        } catch (Exception x) {
            System.out.println(x.getMessage());
            return false;
        }
    }
    
    public boolean editarPlatillo(Platillo platillo_a_Actualizar){
        try{
            CPlatillo.edit(platillo_a_Actualizar);
            return true;
        } catch (Exception x){
            System.out.println(x.getMessage());
            return false;
        }
    }
    
    public boolean eliminarPlatillo(Integer idPlatillo){
        try{
            CPlatillo.destroy(idPlatillo);
            return true;
        } catch(Exception x){
            System.out.println(x.getMessage());
            return false;
        }
    }
    
    public List<Platillo> consultarPlatillos(){
        List<Platillo> platillos = CPlatillo.findPlatilloEntities();
        if(platillos.isEmpty()){
            System.out.println("No hay platillos registrados");
        }
        return platillos;
    }
    
    public Platillo consultarPlatilloID(Integer id){
        return CPlatillo.findPlatillo(id);
    }
    
}
