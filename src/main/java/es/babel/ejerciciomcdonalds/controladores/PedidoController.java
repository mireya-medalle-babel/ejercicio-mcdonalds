package es.babel.ejerciciomcdonalds.controladores;

import es.babel.ejerciciomcdonalds.model.Pedido;
import es.babel.ejerciciomcdonalds.model.Producto;
import es.babel.ejerciciomcdonalds.servicios.PedidoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {
    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping(value = "/init")
    public void inicializarPedidos() {
        pedidoService.inicializarPedidos();
    }

    @GetMapping(value = "/list")
    public List<Pedido> listarPedidos() {
        return pedidoService.listarPedidos();
    }
    
}
