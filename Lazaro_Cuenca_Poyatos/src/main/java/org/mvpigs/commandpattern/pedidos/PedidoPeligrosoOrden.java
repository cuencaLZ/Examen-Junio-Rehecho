package org.mvpigs.commandpattern.pedidos;

import java.util.UUID;

import org.mvpigs.commandpattern.interfaces.PedidoPeligroso;

public class PedidoPeligrosoOrden implements PedidoPeligroso {
	private String destino = null;
	private String instruccion = null;
	private int peso = 0;
	private String id = null;
	public PedidoPeligrosoOrden(String destino, String instruccion) {
		this.destino = destino;
		this.instruccion = instruccion;
		this.id = UUID.randomUUID().toString();
	}

	public String destino() {
		
		return this.destino;
	}

	public String instrucciones() {
		
		return this.instruccion;
	}

	public int peso() {
	
		return 0;
	}

	public Object getId() {
		
		return this.id;
	}
}
