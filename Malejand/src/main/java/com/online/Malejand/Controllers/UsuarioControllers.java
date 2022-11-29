package com.online.Malejand.Controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @PostMapping
    public UserModel guardardatos(@RequestBody UserModel usuario) {
        return this.usuarioServicio.guardardatos(usuario);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarUser(@PathVariable("id") Long id) {
        boolean ok = this.usuarioServicio.eliminar_user(id);
        if (ok) {
            return "Se elimino con exito";
        } else {
            return "No se elimino porque no se encontro en la BD";
        }
    }

    @GetMapping("/query")

    public ArrayList<UserModel> obtenerusuarioporcedula(@RequestParam("cedula") Long cedula) {

        return this.usuarioServicio.obtenerporcedula(cedula);
    }

    @GetMapping("/queryemail")

    public ArrayList<UserModel> obtenerusuarioporemail(@RequestParam("email") String email) {

        return this.usuarioServicio.obtenerporemail(email);
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> obtenerusuarioporid(@PathVariable("id") Long id) {
        return this.usuarioServicio.obtenerusuarioporId(id);
    }



    
}
