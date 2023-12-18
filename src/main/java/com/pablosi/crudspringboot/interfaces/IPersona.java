package com.pablosi.crudspringboot.interfaces;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pablosi.crudspringboot.model.Persona;

// notacion necesaria, crudrepo tiene todos los metodo necesarios para poder funcionar
@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{
    // primer dato que sea de clase persona y el id de tipo entero}
}
