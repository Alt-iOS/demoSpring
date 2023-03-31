package com.desarrollo.demospring.services;

import com.mayab.desarrollo.entities.Usuario;
import com.mayab.desarrollo.persistence.UserDAO;

public class UsuarioServicio {

    private UserDAO dao;
    public UsuarioServicio(UserDAO d){
        this.dao =d;
    }
    public boolean login(String user, String pass){
        boolean result = false;
        Usuario usuario =dao.findByName(user);
        if(usuario != null){
            if ( usuario.getPassword().equals(pass)){
                result = true;
            }
        }
        return result;
    }

    public boolean createUser(String username, String pass, String email){
        Usuario usuario = new Usuario();
        usuario.setPassword(pass);
        usuario.setEmail(email);
        usuario.setNombre(username);
        if (dao.findByEmail(email)==null &&  dao.findByName(username)==null){
            dao.createUser(usuario);
            return true;
        }
        else {
            return false;
        }
    }



}