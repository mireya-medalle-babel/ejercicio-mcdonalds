package es.babel.ejerciciomcdonalds.servicios;

import es.babel.ejerciciomcdonalds.model.Persona;
import es.babel.ejerciciomcdonalds.model.Plantilla;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IPlantillaService {
    void inicializarPlantilla();
    Persona getPersona(int id);
    List<Plantilla> listarPlantilla();
    boolean addPersonal();
    boolean deletePersonal(int id);

}
