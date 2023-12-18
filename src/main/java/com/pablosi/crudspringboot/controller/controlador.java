

package com.pablosi.crudspringboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pablosi.crudspringboot.interfazService.IPersonaService;
import com.pablosi.crudspringboot.model.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



// ponemos las notaciones correspondiente para que funcione bien
@Controller
@RequestMapping
public class controlador {
    // creamos una variable de tipo interfaz persona service para poder usarlo
    @Autowired
    private IPersonaService service;

    // metod para listar, se le tiene que poner la notaacion correspondiente, asi le estamos diciento que cuando en la url ponga /listar , muestre esto :OO
    @GetMapping("/listar")
    public String listar(Model model){
        // le ponermos el tipo de dato como el flutter
        List<Persona> personas = service.listar();

        // al modelo le agregamos el atributo de personas con valor todo el array
        model.addAttribute("personas", personas);

        // Imprimimos la lista de personas en la consola para verificar en el servidor
        System.out.println("Lista de personas:");
        System.out.println(personas);
        return "index";
    }

    // metodo para ir a la pagina y la notacion correspodiente
    @GetMapping("/new")
    public String agregar(Model model){
        // al modelo le agregamos el atributo de personas con valor todo el array, le pasmaos el objeto persona
        model.addAttribute("persona", new Persona());

        return "form";
    }

    // metodo para guardar la info del form
    // notacion para que valide  si es objeto persona
    // y afuerzas la notacion para la ruta para guardar
    @PostMapping("/save")
    public String saveUser(@Validated Persona p, Model model){
        // ocupamos el metodo save de la interfazservice , que claro necesita de un objeto tipo persona
        service.save(p);
        return "redirect:/listar";
    }

    // metodo para la vista editar, la notacion pathvariable es para poder poner parametros de id al metodo
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model) {

        Optional<Persona> persona = service.listarId(id);

        model.addAttribute("persona", persona);
        return "form";
    }
    

    // @RequestMapping("/error")
    // public String handleError() {
    //     return "error"; // Nombre de tu plantilla de error (por ejemplo, error.html)
    // }

    // @Override
    // public String getErrorPath() {
    //     return "/error";
    // }
}

