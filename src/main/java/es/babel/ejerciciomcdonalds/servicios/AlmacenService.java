package es.babel.ejerciciomcdonalds.servicios;

import es.babel.ejerciciomcdonalds.model.Producto;
import es.babel.ejerciciomcdonalds.repository.IFakeDBProducto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlmacenService implements  IAlmacenService {
    private final IFakeDBProducto iFakeDBProducto;

    public AlmacenService(IFakeDBProducto iFakeDBProducto) {
        this.iFakeDBProducto = iFakeDBProducto;
    }

    @Override
    public void inicializarAlmacen() {
        this.iFakeDBProducto.inicializarProductos();
    }

    @Override
    public int cuantosProductosHay(int id) {
        return this.iFakeDBProducto.cuantosProductosHay(id);
    }

    @Override
    public List<Producto> listarProductos() {
        return iFakeDBProducto.listarProductos();
    }

    @Override
    public void push(Producto producto) {
        iFakeDBProducto.push(producto);
    }

    @Override
    public Producto pop(int id){
        return iFakeDBProducto.pop(id);
    }

    public void cambiarCantidad(int id, int cantidad) {
       iFakeDBProducto.cambiarCantidadProducto(id, cantidad);
    }

}
