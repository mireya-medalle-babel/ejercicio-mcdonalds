package es.babel.ejerciciomcdonalds.repository;

import es.babel.ejerciciomcdonalds.model.Pedido;

import java.util.List;

public interface IFakeDBPedido {
    void inicializarPedidos();

    List<Pedido> listarPedidos();
}
