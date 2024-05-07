package es.babel.ejerciciomcdonalds.controladores;

import es.babel.ejerciciomcdonalds.model.Producto;
import es.babel.ejerciciomcdonalds.servicios.AlmacenService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/almacen")
@OpenAPIDefinition(
        info = @Info(
                title = "Controlador del almacén",
                version = "0.0",
                description = "API McDonalds",
                license = @License(name = "Apache 2.0", url = "http://foo.bar"),
                contact = @Contact(name = "Mireya", email = "mireya.medalle@babelgroup.com")
        )
)
public class AlmacenController {
    private final AlmacenService almacenService;

    public AlmacenController(AlmacenService almacenService) {
        this.almacenService = almacenService;
    }

    @GetMapping(value = "/init")
    @Operation(summary = "Inicializar la base de datos",
    description = "Se inicializará el almacén con los productos por defecto")
    public void inicializarAlmacen() {
        almacenService.inicializarAlmacen();
    }

    @GetMapping(value = "/list")
    @Operation(summary = "Listar productos del almacen")
    @ApiResponse(responseCode = "200", description = "Lista de productos",
            content = {
                    @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Producto.class))
                    )}
    )
    @ApiResponse(responseCode = "400", description = "Error 400")
    public List<Producto> listarProductos() {
        return almacenService.listarProductos();
    }

    @PostMapping(value = "/add")
    @Operation(summary = "Añadir productos al almacen",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Producto añadido"),
                    @ApiResponse(responseCode = "400", description = "No se ha podido añadir el producto")}
    )
    public void push(@Valid @RequestBody Producto producto) {
        almacenService.push(producto);
    }

    @DeleteMapping(value = "/delete/{id}")
    @Operation(summary = "Borrar productos del almacen")
    @ApiResponse(responseCode = "200", description = "Producto eliminado")
    @ApiResponse(responseCode = "400", description = "No se pudo borrar el producto")
    public Producto pop( @PathVariable("id") int id ) {
        return almacenService.pop(id);
    }

}
