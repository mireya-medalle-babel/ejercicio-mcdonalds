package es.babel.ejerciciomcdonalds.servicios;

import es.babel.ejerciciomcdonalds.model.Producto;

import java.util.List;

public interface IAlmacenService {
    void inicializarAlmacen();

    int cuantosProductosHay(int id);

    List<Producto> listarProductos();

    void push(Producto producto);

    Producto pop(int id);
}
