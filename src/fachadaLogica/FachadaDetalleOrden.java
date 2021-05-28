/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachadaLogica;

import Controladores.OrdenHasPlatilloJpaController;
import Entidades.Orden;
import Entidades.OrdenHasPlatillo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Jbran
 */
public class FachadaDetalleOrden {

    OrdenHasPlatilloJpaController COrdenHasPlatillo;

    public FachadaDetalleOrden() {
        COrdenHasPlatillo = new OrdenHasPlatilloJpaController();
    }

    public List<OrdenHasPlatillo> consultarDetalleOrden(Orden orden) {
        List<OrdenHasPlatillo> ordenes = COrdenHasPlatillo.findOrdenHasPlatilloEntities();
        List<OrdenHasPlatillo> detalles = new ArrayList<>();

        for (OrdenHasPlatillo aux : ordenes) {
            if (Objects.equals(orden.getIdorden(), aux.getOrden().getIdorden())) { //Lo mismo que hacer == pero netbeans me lo recomendó
                detalles.add(aux);

            }

        }

        return detalles;

    }

}
