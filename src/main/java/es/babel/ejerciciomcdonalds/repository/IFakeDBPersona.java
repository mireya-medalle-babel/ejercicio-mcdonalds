package es.babel.ejerciciomcdonalds.repository;

import es.babel.ejerciciomcdonalds.model.Persona;

import java.util.List;

public interface IFakeDBPersona {
    void inicializarPersonas();

    List<Persona> listarPersonas();


    void addPersona(Persona persona);

    Persona getPersona(int id);

    Persona deletePersona(int id);
}
