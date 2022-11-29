package com.online.Malejand.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.online.Malejand.Models.UserModel;

@Repository

public interface UsuarioRepository extends CrudRepository<UserModel,Long> {
    
}
