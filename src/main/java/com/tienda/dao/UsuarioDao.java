
package com.tienda.dao;

import com.tienda.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository <Usuario, Long>{
    Usuario findByUsername (String username);
    
    Usuario findByUsername (String username, String Password);
    
    Usuario findByUsernameOrCorreo (String username, String correo);
    
    boolean existsByUsernameOrCorreo (String username, String correo);

    public Usuario findByUsernameAndPassword(String username, String password);

    public Usuario findByUsernameOrCoreo(String username, String correo);
}
