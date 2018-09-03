package org.mvpigs.commandpattern.pedidos;

import java.util.UUID;

import org.mvpigs.commandpattern.interfaces.Pedido;

public class PedidoInternacional implements Pedido {
	
	private int peso = 0;
	private String destino = null;
	private String id = null;

	public PedidoInternacional(String destino, int peso) {
		this.peso=peso;
		this.destino=destino;
		this.id = UUID.randomUUID().toString();
	}

	public int peso() {
		
		return this.peso;
	}

	public String destino() {
		
		return this.destino;
	}

	public Object getId() {
		
		return this.id;
	}
}
