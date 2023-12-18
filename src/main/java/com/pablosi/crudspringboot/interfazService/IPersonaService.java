package com.pablosi.crudspringboot.interfazService;

import java.util.List;
import java.util.Optional;

import com.pablosi.crudspringboot.model.Persona;

// aqui implementaremos la interfaz, donde se ponen los metodos sin cuerpo, pa luego reemcribirlos en servicios donde los implementaremos
public interface IPersonaService {
    // metodo para mostrar todo
    public List<Persona>listar();
    // metodo para mostrar por id
    public Optional<Persona>listarId(int id);
    // metodo para guardar
    public int save(Persona p);
    // metodo para borrar
    public void delete(int id);

}

