package es.babel.ejerciciomcdonalds.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
	private Long id;

	private String nombreCliente;
	private Date fechaOrden;
	private String[] productos;
	
}
