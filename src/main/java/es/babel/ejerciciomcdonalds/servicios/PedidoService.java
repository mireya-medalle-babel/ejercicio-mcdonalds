package es.babel.ejerciciomcdonalds.servicios;

import es.babel.ejerciciomcdonalds.model.Pedido;
import es.babel.ejerciciomcdonalds.repository.IFakeDBPedido;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService implements IPedidoService{
    private final IFakeDBPedido iFakeDBPedido;

    public PedidoService(IFakeDBPedido iFakeDBPedido) {
        this.iFakeDBPedido = iFakeDBPedido;
    }

    @Override
    public void inicializarPedidos() {
        this.iFakeDBPedido.inicializarPedidos();

    }

    @Override
    public List<Pedido> listarPedidos() {
        return iFakeDBPedido.listarPedidos();
    }
    
    


}
