package com.pablosi.crudspringboot.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.pablosi.crudspringboot.model.Persona;

public interface IPersona extends CrudRepository<Persona, Integer>{
    // primer dato que sea de clase persona y el id de tipo entero}
}