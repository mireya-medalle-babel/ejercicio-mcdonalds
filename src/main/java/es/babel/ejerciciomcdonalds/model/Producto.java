package es.babel.ejerciciomcdonalds.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name="producto", description="Modelo de producto")
public class Producto {
    @Schema(description = "Identificador del producto", example = "1")
    @Min(value = 1, message = "Debe ser mínimo 1")
    private int id;
    @Schema(description = "Nombre del producto", example = "hamburguesa")
    @NotBlank(message = "El producto tiene que tener nombre")
    private String nombre;
    @Min(value = 0, message = "No puede haber cantidad negativa de producto")
    @Schema(description = "Cantidad del producto disponible en el almacén", example = "20")
    private int cantidad;

}
