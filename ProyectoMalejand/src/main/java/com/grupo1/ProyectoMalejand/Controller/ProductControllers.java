package com.grupo1.ProyectoMalejand.Controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo1.ProyectoMalejand.Models.ProductDAOModels;
import com.grupo1.ProyectoMalejand.Services.ProductService;

@RestController
@RequestMapping("/productos")
public class ProductControllers {

    @Autowired
    ProductService productService;

    @PostMapping
    public ProductDAOModels guardardatos(@Validated @RequestBody ProductDAOModels product){
        return this.productService.guardardatos(product);
    }
    
    @GetMapping
    public ArrayList<ProductDAOModels> listarproductos(){
        return this.productService.listarproductos();
    } 

    @GetMapping(path = "/{id}")
    public Optional <ProductDAOModels> buscarporId(@PathVariable("id") String id){
        return this.productService.buscarporId(id);
    }

    @PutMapping(path="/{id}")
    public ProductDAOModels update(@PathVariable String id,@Validated @RequestBody ProductDAOModels product){
        return this.productService.update(product,id);
    }

    @DeleteMapping(path="/{id}")
    public String eliminarProducto(@PathVariable("id") String id){
        boolean ok= this.productService.eliminar_producto(id);
        if(ok){
            return "El producto se elimino con exito";
        }else{
            return "No se Elimino porque no se encontro en la BD";
        }
    }
}
