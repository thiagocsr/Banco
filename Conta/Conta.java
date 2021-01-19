package Conta;

import java.util.Date;

import Cliente.Customer;

public class Conta extends Customer {

	protected double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double depositar(double valor) {

		this.saldo += valor;
		return saldo;
	}

	public void sacar(double valor) {
		if (valor > this.saldo) {
			System.out.println("Saldo indisponível.");
		} else {
			this.saldo -= valor;
		}
	}

	public void transferir(Conta conta, double valor) {
		if (valor > this.saldo) {
			System.out.println("Saldo indisponível.");
		} else {
			this.saldo -= valor;
			conta.saldo += valor;
			Date novadata = new Date();
			System.out.println("Data da transferencia: "+ novadata);
		}
	}

}
