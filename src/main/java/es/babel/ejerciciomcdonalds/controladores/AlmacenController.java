package es.babel.ejerciciomcdonalds.controladores;

import es.babel.ejerciciomcdonalds.model.Producto;
import es.babel.ejerciciomcdonalds.servicios.AlmacenService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/almacen")
public class AlmacenController {
    private final AlmacenService almacenService;

    public AlmacenController(AlmacenService almacenService) {
        this.almacenService = almacenService;
    }

    @GetMapping(value = "/init")
    public void inicializarAlmacen() {
        almacenService.inicializarAlmacen();
    }

    @GetMapping(value = "/list")
    public List<Producto> listarProductos() {
        return almacenService.listarProductos();
    }

    @PostMapping(value = "/add")
    public void push( @RequestBody Producto producto) {
        almacenService.push(producto);
    }

    @DeleteMapping(value = "/delete/{id}")
    public Producto pop( @PathVariable("id") int id ) {
        return almacenService.pop(id);
    }

}
