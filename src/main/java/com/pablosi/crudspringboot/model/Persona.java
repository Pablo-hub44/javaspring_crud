package com.pablosi.crudspringboot.model;

// notaciones importantees

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //decimos q es una eentidad yque la tabla se lllama persona, con esse nombre se va a crean en nuestra DB
@Table(name = "persona")
public class Persona {
    // propiedades|variables
    //notamos que eel id va a ser unico , y se deeclare automaticamentee y id propiedad serea eel dee la tabla persona
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String telefono;
    
    // constructor igualamos los propieedaes de la clase con los deel parametro
    public Persona(int id, String name, String telefono) {
        this.id = id;
        this.name = name;
        this.telefono = telefono;
    }

    // Constructor sin argumentos requerido por Hibernate
    public Persona() {
        // puedo dejarlo vacío o realizar inicializaciones si es necesario
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }











    
}
