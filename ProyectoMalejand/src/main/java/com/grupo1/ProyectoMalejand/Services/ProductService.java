package com.grupo1.ProyectoMalejand.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.grupo1.ProyectoMalejand.Models.ProductDAOModels;
import com.grupo1.ProyectoMalejand.Repositories.ProductRepositories;

@Service
public class ProductService {

    @Autowired
    ProductRepositories productRepositories;
    public ProductService(){
        
    }
    public ProductDAOModels guardardatos(ProductDAOModels productos){
        return this.productRepositories.insert(productos);
    }

    public ArrayList<ProductDAOModels> listarproductos(){
        return (ArrayList<ProductDAOModels>)
        this.productRepositories.findAll();
    }

    public Optional<ProductDAOModels> buscarporId(String id){
        return this.productRepositories.findById(id);
    }
    public ProductDAOModels update(ProductDAOModels product, String id) {
        return this.productRepositories.save(product);
    }
    public boolean eliminar_producto(String _id){
        try{
            this.productRepositories.deleteById(_id);
            return true;
        }catch (Exception er) {
            return false;
        }
    }

  

   

}
