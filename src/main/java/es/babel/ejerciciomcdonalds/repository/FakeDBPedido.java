package es.babel.ejerciciomcdonalds.repository;

import es.babel.ejerciciomcdonalds.model.Pedido;
import es.babel.ejerciciomcdonalds.model.Persona;
import es.babel.ejerciciomcdonalds.model.Producto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class FakeDBPedido implements IFakeDBPedido {
    private List<Pedido> pedidoRepository;
    private final FakeDBProducto fakeDBProducto;
    private final IFakeDBPersona fakeDBPersona;
    public FakeDBPedido(FakeDBProducto fakeDBProducto, FakeDBPersona fakeDBPersona) {
        this.fakeDBProducto = fakeDBProducto;
        this.fakeDBPersona = fakeDBPersona;
    }

    public List<Producto> getAllProductos() {
        fakeDBProducto.inicializarProductos();
        return fakeDBProducto.listarProductos();
    }

    public List<Persona> getAllPersonas() {
        fakeDBPersona.inicializarPersonas();
        return fakeDBPersona.listarPersonas();
    }

    @Override
    public void inicializarPedidos() {
        pedidoRepository = new ArrayList<>();
        List<Producto> sublistProductos = getAllProductos().subList(1,2);
        Persona personaPedido1 = getAllPersonas().get(0);

        pedidoRepository.add(new Pedido(1L, "Cliente1", new Date(), sublistProductos, personaPedido1));
        fakeDBProducto.cambiarCantidadProducto(getAllProductos().get(1).getId(), 1);
        fakeDBProducto.cambiarCantidadProducto(getAllProductos().get(2).getId(), 1);

    }

    @Override
    public List<Pedido> listarPedidos() {
        return pedidoRepository;
    }

}
