package com.pablosi.crudspringboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.pablosi.crudspringboot.interfaces.IPersona;
import com.pablosi.crudspringboot.interfazService.IpersonaService;
import com.pablosi.crudspringboot.model.Persona;

// aqui implementaremos la interfaz que habiamos echo, en donde solo declaramos los metodos
public class PersonaService implements IpersonaService {

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        
    }

    // necesitamos una variable de la interfaz persona, asi que lo declaramos
    @Autowired
    private IPersona data;

    @Override
    public List<Persona> listar() {
        
        return (List<Persona>) data.findAll();//este metod regresa un iterable asi que se tiene que convertir a una lista, este metod es propio de spring
    }

    @Override
    public Optional<Persona> listarId(int id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public int save(Persona p) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
