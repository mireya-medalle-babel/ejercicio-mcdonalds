package es.babel.ejerciciomcdonalds.servicios;

import es.babel.ejerciciomcdonalds.model.Persona;
import es.babel.ejerciciomcdonalds.repository.IFakeDBPersona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    private final IFakeDBPersona iFakeDBPersona;

    public PersonaService(IFakeDBPersona iFakeDBPersona) {
        this.iFakeDBPersona = iFakeDBPersona;
    }

    @Override
    public void inicializarPersona() {
        this.iFakeDBPersona.inicializarPersonas();

    }

    @Override
    public Persona getPersona(int id) {
        return null;
    }

    @Override
    public List<Persona> listarPersona() {
        return iFakeDBPersona.listarPersonas();
    }

    @Override
    public boolean addPersona(Persona persona) {
        iFakeDBPersona.addPersona(persona);
        return false;
    }

    @Override
    public boolean deletePersona(int id) {
        iFakeDBPersona.deletePersona(id);
        return false;
    }

}
