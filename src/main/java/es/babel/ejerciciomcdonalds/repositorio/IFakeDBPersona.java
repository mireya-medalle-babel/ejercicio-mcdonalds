package es.babel.ejerciciomcdonalds.repositorio;

import es.babel.ejerciciomcdonalds.model.Persona;
import es.babel.ejerciciomcdonalds.model.Plantilla;

import java.util.List;

public interface IFakeDBPersona {
    void inicializarPersonas();

    Persona getPersona(int id);
    List<Plantilla> listarPlantilla();
    boolean addPersonal();
    boolean deletePersonal(int id);

}
