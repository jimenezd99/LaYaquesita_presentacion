/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachadaLogica;

import Controladores.UsuariosJpaController;
import Entidades.Usuarios;
import java.util.List;
import javax.swing.JOptionPane;

public class FachadaUsuarios {
    
    UsuariosJpaController CUsuarios;
    
    public FachadaUsuarios(){
        CUsuarios = new UsuariosJpaController();
    }
    
    public boolean registrarUsuario(Usuarios usuario){
       try{
            CUsuarios.create(usuario);
            return true;
        } catch (Exception x) {
            System.out.println(x.getMessage());
            return false;
        }
    } 
    
    public boolean editarUsuario(Usuarios usuario_a_Actualizar) {
        try {

            CUsuarios.edit(usuario_a_Actualizar);
            return true;
        } catch (Exception x) {
            System.out.println(x.getMessage());
            return false;
        }
    }

    public boolean eliminarUsuario(Integer idUsuario) {
        try {
            CUsuarios.destroy(idUsuario);
            return true;
        } catch (Exception x) {
            System.out.println(x.getMessage());
            return false;
        }

    }
    
    public List<Usuarios> consultarUsuarios(){
        List<Usuarios> usuarios= CUsuarios.findUsuariosEntities();
        if(usuarios.isEmpty()){
                     JOptionPane.showMessageDialog(null, "No se han encontrado usuarios");
        }
        return usuarios;
    }
    
    public Usuarios consultarUsuarioId(Integer id){
        Usuarios usuario = CUsuarios.findUsuarios(id);
        if(usuario == null){
         JOptionPane.showMessageDialog(null, "No se ha encontrado usuario");
        }
        return usuario;
    }
    


    
    
}
