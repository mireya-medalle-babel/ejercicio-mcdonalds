package es.babel.ejerciciomcdonalds.servicios;

import es.babel.ejerciciomcdonalds.model.Persona;

import java.util.List;

public interface IPersonaService {

    void inicializarPersona();

    Persona getPersona(int id);

    List<Persona> listarPersona();

    boolean addPersona(Persona persona);

    boolean deletePersona(int id);
}
