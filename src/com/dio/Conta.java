package com.dio;

public class Conta {
	protected int numero;
	protected int agencia;
	protected double saldo;
	protected Cliente cliente;
	public int getNumero() {
		return numero;
	}
	public int getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void saque(double valor) {
		this.saldo = valor;
	}
	
}
