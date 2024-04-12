package es.babel.ejerciciomcdonalds.controladores;

import es.babel.ejerciciomcdonalds.model.Persona;
import es.babel.ejerciciomcdonalds.repository.IFakeDBPersona;
import es.babel.ejerciciomcdonalds.servicios.PersonaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/persona")
public class PersonaController {
    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping(value = "/init")
    public void inicializarPersonas() {
        personaService.inicializarPersona();
    }

    @GetMapping(value = "/list")
    public List<Persona> listarPersonas() {
        return personaService.listarPersona();
    }

    @PostMapping(value = "/add")
    public void agregarPersonas( @RequestBody Persona persona) {
        personaService.addPersona(persona);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void eliminarPersona( @PathVariable("id") int id ) {
        personaService.deletePersona(id);
    }
}
