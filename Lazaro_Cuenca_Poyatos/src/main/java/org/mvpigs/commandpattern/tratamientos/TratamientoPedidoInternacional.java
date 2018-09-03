package org.mvpigs.commandpattern.tratamientos;

import org.mvpigs.commandpattern.interfaces.TratamientoPedido;
import org.mvpigs.commandpattern.pedidos.PedidoInternacional;

public class TratamientoPedidoInternacional implements TratamientoPedido {
	private PedidoInternacional pedidoInt;

	public TratamientoPedidoInternacional(PedidoInternacional pedidoInt) {
		this.pedidoInt = pedidoInt;
	}

	public boolean tratar() {
		if (this.pedidoInt.destino() == "Mordor") {
				return false;
		}
		else {
			return true;
		}
		
	}
}
