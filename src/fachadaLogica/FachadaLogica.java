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
public class FachadaLogica implements IFachadaLogica {

    FachadaPlatillo fachadaPlatillo;

    public FachadaLogica() {
        this.fachadaPlatillo = new FachadaPlatillo();
    }

    @Override
    public void guardarOrden(ArrayList<Platillo> platillos, String notasOrden) {
        TomarOrden tomarOrden = new TomarOrden(platillos, notasOrden);
        tomarOrden.generarOrden();
    }

    @Override
    public List<Platillo> consultarPlatillos() {
        return fachadaPlatillo.consultarPlatillos();
    }

}
