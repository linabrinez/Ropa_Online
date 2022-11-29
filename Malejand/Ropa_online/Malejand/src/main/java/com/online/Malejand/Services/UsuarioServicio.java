package com.online.Malejand.Services;

import java.util.ArrayList;

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
    
}
