package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import Conta.Conta;

public class Principal extends Conta {

	public static void main(String[] args) {

		int aux = 0;
		int opc = 0;
		Scanner e = new Scanner(System.in);

		System.out.println("Bem-vindo ao banco dos cornos.");
		Conta c = new Conta();
		System.out.println("Digite seu nome.");
		c.setNome(e.nextLine());

		System.out.println("Digite seu email.");
		c.setEmail(e.nextLine());

		System.out.println("Digite seu numero.");
		c.setNumero(e.nextLine());

		System.out.println("Digite seu saldo.");
		c.setSaldo(e.nextDouble());

		System.out.println("Digite seu cpf.");
		c.setCpf(e.nextInt());

		Conta conta = new Conta();
		conta.setCpf(321);
		conta.setNome("Zezo");
		conta.setEmail("corno@");
		conta.setNumero("2345678");
		conta.setSaldo(5000);


		do {
			System.out.println("Digite 1 para deposito, 2 para saque, 3 para transferir, 4 para sair.");
			try {
			aux = e.nextInt();
			}catch (InputMismatchException x) {
				System.out.println("Opção invalida.");
				aux = 4;
			}
			switch (aux) {
			case 1:
				System.out.println("Digite o valor.");
				double valor = e.nextDouble();
				c.depositar(valor);
				System.out.println("Pressione 1 pra sair ou qualquer outro numero para continuar");
				
				opc = e.nextInt();
				 
				if (opc == 1) {
					aux = 4;
				} else {
					aux = 5;
				}
				break;
			case 2:
				System.out.println("Digite o valor.");
				double valorSac = e.nextDouble();
				c.sacar(valorSac);
				System.out.println("Pressione 1 pra sair ou qualquer outro numero para continuar.");
				int opcSac = e.nextInt();
				if (opcSac == 1) {
					aux = 4;
				} else {
					aux = 5;
				}
				break;
			case 3:
				System.out.println("Digite o valor que vai transferir.");
				double valorTrans = e.nextDouble();
				c.transferir(conta, valorTrans);
				System.out.println("Pressione 1 pra sair ou qualquer outro numero para continuar.");
				int opcTrans = e.nextInt();
				if (opcTrans == 1) {
					aux = 4;
				} else {
					aux = 5;
				}
				break;
			case 4:
				System.out.println("Fim de operação.");
				break;
			default:
				System.out.println("Opção invalida.");
			}
		} while (aux != 4);

		System.out.println("Saldo: " + c.getSaldo());

		e.close();
	}

}
