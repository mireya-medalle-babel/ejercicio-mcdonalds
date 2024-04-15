package es.babel.ejerciciomcdonalds.servicios;

import es.babel.ejerciciomcdonalds.model.Pedido;
import es.babel.ejerciciomcdonalds.model.Persona;
import es.babel.ejerciciomcdonalds.model.Producto;

import java.util.List;

public interface IPedidoService {


    void inicializarPedidos();

    List<Pedido> listarPedidos();

    void altaPedido();

    void addProductos(List<Producto> productos, long idPedido);

    void asignarEmpleado (Persona empleado, long idPedido);
}
