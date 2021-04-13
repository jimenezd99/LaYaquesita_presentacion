/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachadaLogica;

import Controladores.IngredientesJpaController;
import Entidades.Ingredientes;
import java.util.List;

/**
 *
 * @author Jbran
 */
public class FachadaIngredientes {
    
    IngredientesJpaController CIngredientes;
    
    public FachadaIngredientes(){
        CIngredientes = new IngredientesJpaController();
    }
    
    public boolean registrarIngrediente(Ingredientes ingrediente) {
        try {
            CIngredientes.create(ingrediente);
            return true;
        } catch (Exception x) {
            System.out.println(x.getMessage());
            return false;
        }
    }
    
    public boolean editarIngrediente(Ingredientes ingrediente_a_Actualizar){
        try{
            CIngredientes.edit(ingrediente_a_Actualizar);
            return true;
        } catch (Exception x){
            System.out.println(x.getMessage());
            return false;
        }
    }
    
    public List<Ingredientes> consultarIngredientes(){
        
        List<Ingredientes> ingredientes = CIngredientes.findIngredientesEntities();
        
        if(ingredientes.isEmpty()){
            System.out.println("No hay ingredientes registrados");
        } 
        return ingredientes;
    }
    
    public Ingredientes consultarIngredienteId(Integer id){
        return CIngredientes.findIngredientes(id);
    }

}
