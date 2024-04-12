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

    @Override
    public int cuantosProductosHay(int id) {
        for (Producto producto : productosRepository) {
            if (producto.getId() == id) {
                return producto.getCantidad();
            }
        }
        return 0;
    }

    @Override
    public void push(Producto producto) {
        productosRepository.add(producto);
    }

    @Override
    public Producto pop(int id) {
        Producto producto = null;
        for (int x = 0; x < productosRepository.size(); x++) {
            if (id == productosRepository.get(x).getId()) {
                producto = productosRepository.get(x);
                productosRepository.remove(producto);
                break;
            }
        }

        return producto;

    }

    @Override
    public void cambiarCantidadProducto(int id, int cantidad) {
        Producto producto = null;
        for (Producto value : productosRepository) {
            if (id == value.getId()) {
                producto = value;
                producto.setCantidad(producto.getCantidad() - cantidad);
                break;
            }
        }
    }







 
}
