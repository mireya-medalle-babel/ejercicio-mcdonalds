package es.babel.ejerciciomcdonalds.controladores;

import es.babel.ejerciciomcdonalds.model.Pedido;
import es.babel.ejerciciomcdonalds.model.Persona;
import es.babel.ejerciciomcdonalds.model.Producto;
import es.babel.ejerciciomcdonalds.servicios.PedidoService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/")
    public void altaPedido() {
       pedidoService.altaPedido();

    }

    @PostMapping(value = "/{id}/productos")
    public void addProductos(@RequestBody List<Producto> productos, @PathVariable("id") int id) {
        pedidoService.addProductos(productos, id);
    }

    @PutMapping(value = "/{id}")
    public void asignarEmpleado(@RequestBody Persona empleado, @PathVariable("id") int id) {
        pedidoService.asignarEmpleado(empleado, id);
    }








    
}
