package es.babel.ejerciciomcdonalds.servicios;

import es.babel.ejerciciomcdonalds.model.Persona;
import es.babel.ejerciciomcdonalds.model.Plantilla;
import es.babel.ejerciciomcdonalds.repositorio.IFakeDBPersona;

import java.util.List;

public class PlantillaService implements IPlantillaService {

    private final IFakeDBPersona iFakeDBPersona;

    public PlantillaService(IFakeDBPersona iFakeDBPersona) {
        this.iFakeDBPersona = iFakeDBPersona;
    }

    @Override
    public void inicializarPlantilla() {

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
