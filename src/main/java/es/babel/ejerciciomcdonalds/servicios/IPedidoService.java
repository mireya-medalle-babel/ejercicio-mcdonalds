package es.babel.ejerciciomcdonalds.servicios;

import es.babel.ejerciciomcdonalds.model.Pedido;

import java.util.List;

public interface IPedidoService {


    void inicializarPedidos();

    List<Pedido> listarPedidos();
}
