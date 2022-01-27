package com.dio;

import com.dio.cliente.Cliente;
import com.dio.conta.Conta;
import com.dio.conta.ContaCorrente;
import com.dio.conta.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente Hellimateas = new Cliente("Hellimateas","0243323");
		Cliente Felipe = new Cliente("Felipe", "05858839");
		
		Conta usuario1 = new ContaCorrente(Felipe);
		Conta usuario2 = new ContaPoupanca(Hellimateas);
		
		System.out.println("------ Contas no início ------------");
		
		usuario1.imprimir();
		usuario2.imprimir();
		
		System.out.println("====== Contas com dinheiro ============");
		System.out.println();
		
		usuario1.deposito(150);
		
		usuario1.imprimir();
		usuario2.imprimir();
		
		usuario1.transferencia(usuario2, 100);
	
		System.out.println("-------- Contas após transferencia ------------");
		
		usuario1.imprimir();
		usuario2.imprimir();
		
	}

}
