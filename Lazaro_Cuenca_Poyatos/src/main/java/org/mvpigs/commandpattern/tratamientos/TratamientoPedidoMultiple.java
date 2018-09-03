package org.mvpigs.commandpattern.tratamientos;

import java.util.Set;

import org.mvpigs.commandpattern.interfaces.Pedido;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;

public class TratamientoPedidoMultiple implements TratamientoPedido {

	private Set<Pedido> pedidos;
	private int pesoTotal;
	private int numBultos;

	public TratamientoPedidoMultiple(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public boolean tratar() {
		if (pesoTotal > 0) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public void calcularTotalBultos() {
		 this.numBultos=pedidos.size();
		
	}

	public Object getNumBultos() {
		return numBultos;
	}

	public void calcularPesoTotal() {
		for( Pedido pedido : this.pedidos){
			this.pesoTotal = this.pesoTotal + pedido.peso();
			
			
		}
		
	}

	public Object getPesoTotal() {
		return pesoTotal;
	}
}
