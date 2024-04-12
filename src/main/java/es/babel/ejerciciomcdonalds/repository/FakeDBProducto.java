package es.babel.ejerciciomcdonalds.repository;

import es.babel.ejerciciomcdonalds.model.Producto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeDBProducto implements IFakeDBProducto {

    private List<Producto> productosRepository;

    @Override
    public void inicializarProductos() {
        productosRepository = new ArrayList<>();
        productosRepository.add(new Producto(1, "hamburguesa", 3));
        productosRepository.add(new Producto(2, "coca cola", 3));
        productosRepository.add(new Producto(3, "Patatas", 5));
    }

    @Override
    public List<Producto> listarProductos() {
        return productosRepository;
    }

}
