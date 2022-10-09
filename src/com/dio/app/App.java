package com.dio.app;

import java.util.ArrayList;
import java.util.List;

import com.dio.entity.Conta;
import com.dio.entity.ContaCorrente;
import com.dio.entity.ContaPoupanca;

public class App {

	public static void main(String[] args) {
		
		List<Conta> banco = new ArrayList<>();
		
		
		Conta cc = new ContaCorrente();	
		banco.add(cc);
		
		Conta cp = new ContaPoupanca();
		banco.add(cp);
		
		for(Conta conta : banco) {
			System.out.println(conta.getNumConta());
		}
		
	}

}
