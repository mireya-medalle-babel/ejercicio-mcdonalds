package es.babel.ejerciciomcdonalds.repository;

import es.babel.ejerciciomcdonalds.model.Producto;

import java.util.List;

public interface IFakeDBProducto {
    void inicializarProductos();

    List<Producto> listarProductos();
}
