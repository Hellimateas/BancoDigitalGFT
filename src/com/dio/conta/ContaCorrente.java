package com.dio.conta;

import com.dio.cliente.Cliente;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimir() {
		System.out.println("Conta Corrente do " + this.cliente.getNome());
		System.out.println(" -> Extrato:");
		super.infoExtrato();
		System.out.println();
	}

}
