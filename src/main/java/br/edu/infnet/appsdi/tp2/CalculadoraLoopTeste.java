package br.edu.infnet.appsdi.tp2;

import java.util.Scanner;

public class CalculadoraLoopTeste {

	private static int definirOperacao(String[] operacoes) {
		
		if(operacoes.length == 4) {
			return Integer.valueOf(operacoes[3]);
		}
		return operacaoMenu();
		
	}
	
	private static int operacaoMenu() {
		
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.printf("%d - %s (%s)\n", 
					Constante.OPERACAO_CODIGO[i], 
					Constante.OPERACAO_TEXTO[i], 
					Constante.OPERACAO_SINAL[i]
				);
		}
		
		System.out.print("Informe a operação desejada: ");
		int operacao = in.nextInt();
		
		in.close();
		
		return operacao; 
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int opcao = 0;
		do {
			Calculadora calc = new Calculadora();	
			
			System.out.print("Informe o primeiro número: ");
			calc.setNumeroA(in.nextFloat());
			
			System.out.print("Informe o segundo número: ");
			calc.setNumeroB(in.nextFloat());
			
			System.out.print("Informe o nome: ");
			calc.setNome(in.next());

			calc.setOperacao(definirOperacao(args));
			
			calc.impressao();			

			System.out.print("Informe a opção: ");
			opcao = in.nextInt();
		} while (opcao != 9);
		
		System.out.println("Finalizado!!!");
		in.close();
		
	}
}