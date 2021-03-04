package br.edu.infnet.appsdi.tp2;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int opcao = 0;
		do {
			System.out.print("Informe a opção: ");
			opcao = in.nextInt();
		} while (opcao != 9);
		
		System.out.println("Finalizado!!!");
		in.close();
	}
}
