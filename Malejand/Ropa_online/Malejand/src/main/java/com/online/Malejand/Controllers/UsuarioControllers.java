package com.online.Malejand.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.Malejand.Models.UserModel;
import com.online.Malejand.Services.UsuarioServicio;

@RestController
@RequestMapping("/usuario")
public class UsuarioControllers {

    @Autowired
    UsuarioServicio usuarioServicio;

    @GetMapping
    public ArrayList<UserModel> obtenerusuarios() {
        return usuarioServicio.obtenerusuarios();
    }
    
}
