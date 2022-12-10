package com.grupo1.ProyectoMalejand.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.grupo1.ProyectoMalejand.Models.ProductDAOModels;

public interface ProductRepositories extends MongoRepository<ProductDAOModels,String>{
    
}
