package es.babel.ejerciciomcdonalds.repositorio;

import es.babel.ejerciciomcdonalds.model.Persona;
import es.babel.ejerciciomcdonalds.model.Plantilla;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeDBPersona implements IFakeDBPersona {

    private List<Persona> personaRepository;

    @Override
    public void inicializarPersonas() {
        personaRepository = new ArrayList<>();

    }

    @Override
    public Persona getPersona(int id) {
        return null;
    }

    @Override
    public List<Plantilla> listarPlantilla() {
        return null;
    }

    @Override
    public boolean addPersonal() {
        return false;
    }

    @Override
    public boolean deletePersonal(int id) {
        return false;
    }
}
