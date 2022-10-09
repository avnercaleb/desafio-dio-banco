package com.dio.entity;

import lombok.Getter;

@Getter
public abstract class Conta {
	
	protected Integer agencia;
	protected Integer numConta;
	protected Double saldo = 0.0;
	
	private static final int AGENCIA = 1;
	private static int SEQUENCIAL = 1;
	
	public Conta() {		
		this.agencia = AGENCIA;
		this.numConta = SEQUENCIAL++;		
	}
		
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public void extrato() {
		System.out.println("***** Extrato *****");
		System.out.println();
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
}
