/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachadaLogica;

import Controladores.UsuariosJpaController;
import Entidades.Usuarios;
import java.util.List;

public class FachadaUsuarios {
    
    UsuariosJpaController CUsuarios;
    
    public FachadaUsuarios(){
        CUsuarios = new UsuariosJpaController();
    }
    
    public void registrarUsuario(Usuarios usuario){
        CUsuarios.create(usuario);
    }
    
    public String editarUsuario(Usuarios usuario_a_Actualizar) {
        try {

            CUsuarios.edit(usuario_a_Actualizar);
            return "Usuario registrado";
        } catch (Exception x) {
            System.out.println(x.getMessage());
            return "El usuario no fue encontrado";
        }
    }

    public String eliminarUsuario(Integer idUsuario) {
        try {
            CUsuarios.destroy(idUsuario);
            return "Usuario eliminado";
        } catch (Exception x) {
            System.out.println(x.getMessage());
            return "El usuario no fue encontrado";
        }

    }
    
    public List<Usuarios> consultarUsuarios(){
        List<Usuarios> usuarios= CUsuarios.findUsuariosEntities();
        return usuarios;
    }
    


    
    
}
