package com.dio.conta;

import com.dio.cliente.Cliente;

public class Conta {
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int numero;
	protected int agencia;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.saldo = 0;
		
	}

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
		this.saldo -= valor;
	}

	public void deposito(double valor) {
		this.saldo += valor;
	}

	public void transferencia(Conta conta, double valor) {
		this.saque(valor);
		conta.deposito(valor);
	}
	public void imprimir() {
		
	}
	
	public void infoExtrato() {
		System.out.println("   Número da conta---- " + this.numero);
		System.out.println("   Número da agência-- " + this.agencia);
		System.out.println("   Saldo ------------- " + this.saldo);
	}
}
