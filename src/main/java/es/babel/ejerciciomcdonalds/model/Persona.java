package es.babel.ejerciciomcdonalds.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
    int id;
    String dni;
    String nombre;
    String cargo;
}
