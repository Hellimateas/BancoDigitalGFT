package com.dio.conta;

import com.dio.cliente.Cliente;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimir() {
		System.out.println("Conta Poupança do " + cliente.getNome());
		System.out.println(" -> Extrato:");
		super.infoExtrato();
		System.out.println();
	}

}
