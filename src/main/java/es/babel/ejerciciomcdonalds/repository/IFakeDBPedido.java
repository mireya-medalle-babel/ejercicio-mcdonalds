package es.babel.ejerciciomcdonalds.repository;

import es.babel.ejerciciomcdonalds.model.Pedido;
import es.babel.ejerciciomcdonalds.model.Persona;
import es.babel.ejerciciomcdonalds.model.Producto;

import java.util.List;

public interface IFakeDBPedido {
    void inicializarPedidos();

    List<Pedido> listarPedidos();

    void altaPedido();

    void addProductos(List<Producto> productos, long idPedido);

    void asignarEmpleado (Persona empleado, long idPedido);

    void finalizarPedido(int idPedido);
}
