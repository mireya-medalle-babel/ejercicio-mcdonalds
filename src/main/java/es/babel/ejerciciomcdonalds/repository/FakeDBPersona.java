package es.babel.ejerciciomcdonalds.repository;

import es.babel.ejerciciomcdonalds.model.Persona;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeDBPersona implements IFakeDBPersona {

    private List<Persona> personaRepository;


    @Override
    public void inicializarPersonas() {
        personaRepository = new ArrayList<>();
        personaRepository.add(new Persona(1, "1243434E", "Paco", "reponedor"));
        personaRepository.add(new Persona(2, "564564X", "Pepe", "cajero"));
        personaRepository.add(new Persona(3, "454545T", "Antonio", "encargado"));

    }

    @Override
    public List<Persona> listarPersonas() {
        return personaRepository;
    }

    @Override
    public void addPersona(Persona persona) {
        personaRepository.add(persona);
    }

    @Override
    public Persona getPersona(int id) {
        Persona persona = null;
        for (int x = 0; x < personaRepository.size(); x++) {
            if (id == personaRepository.get(x).getId()) {
                persona = personaRepository.get(x);
                break;
            }
        }
        return persona;
    }
    @Override
    public Persona deletePersona(int id) {
        Persona persona = null;
        for (int x = 0; x < personaRepository.size(); x++) {
            if (id == personaRepository.get(x).getId()) {
                persona = personaRepository.get(x);
                break;
            }
        }
        personaRepository.remove(persona);
        return persona;
    }


}
