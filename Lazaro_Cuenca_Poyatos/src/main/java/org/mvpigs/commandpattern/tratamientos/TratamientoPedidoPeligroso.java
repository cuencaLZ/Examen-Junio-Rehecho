package org.mvpigs.commandpattern.tratamientos;

import org.mvpigs.commandpattern.interfaces.PedidoPeligroso;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;

public class TratamientoPedidoPeligroso implements TratamientoPedido {
	private PedidoPeligroso pedidoConPeligro;
	public TratamientoPedidoPeligroso(PedidoPeligroso pedidoConPeligro) {
		this.pedidoConPeligro = pedidoConPeligro;
	}

	public boolean tratar() {
		System.out.println(this.pedidoConPeligro.instrucciones());
		if(this.pedidoConPeligro.instrucciones() == "no ponerselo en el dedo") {		
		return false;
	}
	else {
	return true;
	}
	}
}

