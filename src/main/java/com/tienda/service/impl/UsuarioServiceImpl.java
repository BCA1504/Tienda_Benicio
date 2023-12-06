package com.tienda.service.impl;

import com.tienda.dao.RolDao;
import com.tienda.dao.UsuarioDao;
import com.tienda.domain.Rol;
import com.tienda.domain.Usuario;
import com.tienda.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioDao usuarioDao;
    @Autowired 
    private RolDao rolDao;
    
    @Transactional (readOnly = true)
    public List<Usuario> getUsuarios(){
        return usuarioDao.findAll();
    }
    
    @Transactional (readOnly = true)
    public Usuario getUsuario(Usuario usuario){
        return usuarioDao.findById(usuario.getIdUsuario()).orElse(null);
    }
    
    @Transactional (readOnly = true)
    public Usuario getUsuarioPorUsername(String username){
        return usuarioDao.findByUsername(username);
    }
    
    @Transactional (readOnly = true)
    public Usuario getUsuarioPorUsernameYPassword (String username, String password){
        return usuarioDao.findByUsernameAndPassword(username, password);
    }
    
    @Transactional (readOnly = true)
    public Usuario getUsuarioPorUsernameOCorreo (String username, String correo){
        return usuarioDao.findByUsernameOrCoreo(username, correo);
    }
    
    @Transactional (readOnly = true)
    public boolean existeUsuarioPorUsernameOCorreo (String username, String correo){
        return usuarioDao.existsByUsernameOrCorreo(username, correo);
    }
    
    @Transactional (readOnly = true)
    public void save (Usuario usuario, boolean crearRolUser){
        usuario = usuarioDao.save(usuario);
        if (crearRolUser){
            Rol rol = new Rol();
            rol.setNombre("ROLE_USER");
            rol.setIdUsuario(usuario.getIdUsuario());
            rolDao.save(rol);
        }
    }
    
    @Transactional (readOnly = true)
    public void delete (Usuario usuario){
        usuarioDao.delete(usuario);
    }
}