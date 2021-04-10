/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachadaLogica;

import Entidades.Platillo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hot-Dogs La Yaquesita
 */
public interface IFachadaLogica {
    
    
    public void guardarOrden(ArrayList<Platillo> platillos);
    
     public List<Platillo> consultarPlatillos();
    
    
    
    
    
    
}
