
package com.tienda.service;

import com.tienda.domain.Usuario;
import java.util.List;

public interface UsuarioService {
    
    public List<Usuario> getUsuario();
    
    public Usuario getUsuario (Usuario usuario);
    
    public Usuario getUsuarioPorUsername (String username);
    
    public Usuario getUsuarioPorUsernameYPassword (String username, String password);
    
    public Usuario getUsuarioPorUsernameOCorreo (String username, String correo);
    
    public boolean existeUsuarioPorUsernameOCorreo (String username, String correo);
    
    public void save (Usuario usuario, boolean crearRolUser);
    
    public void delete (Usuario usuario);  

}
