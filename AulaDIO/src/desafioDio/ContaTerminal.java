package desafioDio;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da Agência !");
		String agencia = sc.next();
		System.out.println("Digite o número de sua conta: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Por favor, digite o seu nome: ");
		String nomecliente = sc.nextLine();
		//sc.nextLine();
		System.out.println("Digite seu saldo: ");
		double saldo = sc.nextDouble();
		
		System.out.println("Olá " + nomecliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo "+ saldo+ " já está disponível para saque!");
		
		sc.close();
	}

}
