package org.mvpigs.commandpattern.pedidos;

import java.util.UUID;

import org.mvpigs.commandpattern.interfaces.Pedido;

public class PedidoNacional implements Pedido {
	private int peso= 0;
	private String destino =null;
	private String id = null;
	
	
	public PedidoNacional(String destino, int peso) {
		this.destino = destino;
		this.peso = peso;
		this.id = UUID.randomUUID().toString();
		
	}

	public int peso() {
		return this.peso;
	}

	public String destino() {
		return this.destino;
	}

	public Object getId() {
		// TODO Apéndice de método generado automáticamente
		return this.id;
	}
}