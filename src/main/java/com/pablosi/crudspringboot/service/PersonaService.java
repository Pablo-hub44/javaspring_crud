package com.pablosi.crudspringboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pablosi.crudspringboot.interfaces.IPersona;
import com.pablosi.crudspringboot.interfazService.IPersonaService;
import com.pablosi.crudspringboot.model.Persona;

// aqui implementaremos la interfaz que habiamos echo, en donde solo declaramos los metodos
@Service  //ponemos la notacion que va a ser un servicio
public class PersonaService implements IPersonaService {

    @Override
    public void delete(int id) {
        // borramos por id, con el metodo propio de CrudRepository
        data.deleteById(id);
        
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
        
        // metodo propio de crudrepository
        return data.findById(id);
    }

    @Override
    public int save(Persona p) {
        int respuesta = 0;

        Persona persona = data.save(p);

        // validamos si persona no es nulo
        if (!persona.equals(null)) {
            respuesta =1;
        }

        return respuesta;
    }
    
}
