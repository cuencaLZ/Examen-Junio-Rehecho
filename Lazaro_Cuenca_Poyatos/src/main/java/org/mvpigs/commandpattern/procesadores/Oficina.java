package org.mvpigs.commandpattern.procesadores;

import org.mvpigs.commandpattern.interfaces.Pedido;
import org.mvpigs.commandpattern.interfaces.Procesador;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;
import org.mvpigs.commandpattern.pedidos.PedidoInternacional;


public class Oficina implements Procesador{

	public boolean procesa(TratamientoPedido pedido) {
		// TODO Apéndice de método generado automáticamente
		return pedido.tratar();
	}

	public String printarStatus(boolean procesa, Pedido pedido) {
		if (procesa == true) {
			return  pedido.destino() + " ACEPTADO";
		}else {
			
		return pedido.destino() + " RECHAZADO";
		}
	}


}