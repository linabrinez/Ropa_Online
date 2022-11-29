package com.online.Malejand.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.Malejand.Models.UserModel;
import com.online.Malejand.Repositories.UsuarioRepository;

@Service

public class UsuarioServicio {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UserModel> obtenerusuarios() {
        return (ArrayList<UserModel>) usuarioRepository.findAll();

    }

    public UserModel guardardatos(UserModel usuario) {
        return usuarioRepository.save(usuario);
    }

    public boolean eliminar_user(Long id) {
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception er) {
            return false;
        }
    }

    public ArrayList<UserModel> obtenerporcedula(Long cedula) {

        return /* (ArrayList<UserModel>) */ this.usuarioRepository.findByCedula(cedula);
    }

    public ArrayList<UserModel> obtenerporemail(String email) {

        return /* (ArrayList<UserModel>) */ this.usuarioRepository.findByEmail(email);
    }

    public Optional<UserModel> obtenerusuarioporId(Long id) {
        return this.usuarioRepository.findById(id);
    }

    
}
