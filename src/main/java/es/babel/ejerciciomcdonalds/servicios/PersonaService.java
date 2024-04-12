package es.babel.ejerciciomcdonalds.servicios;

import es.babel.ejerciciomcdonalds.model.Persona;
import es.babel.ejerciciomcdonalds.repository.IFakeDBPersona;

import java.util.List;

public class PersonaService implements IPersonaService {

    private final IFakeDBPersona iFakeDBPersona;

    public PersonaService(IFakeDBPersona iFakeDBPersona) {
        this.iFakeDBPersona = iFakeDBPersona;
    }

    @Override
    public void inicializarPersona() {

    }

    @Override
    public Persona getPersona(int id) {
        return null;
    }

    @Override
    public List<Persona> listarPersona() {
        return null;
    }

    @Override
    public boolean addPersona() {
        return false;
    }

    @Override
    public boolean deletePersona(int id) {
        return false;
    }
}
