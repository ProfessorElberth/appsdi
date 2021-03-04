package br.edu.infnet.appsdi.tp2;

import java.util.Scanner;

public class CalculadoraArgumentoTeste {

	private static int definirOperacao(String[] operacoes) {
		
		if(operacoes.length == 3) {
			return operacaoMenu();
		}
		
		return Integer.valueOf(operacoes[3]);
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

		Calculadora calc = new Calculadora();
		
		calc.setNumeroA(Float.valueOf(args[0]));
		calc.setNumeroB(Float.valueOf(args[1]));
		calc.setNome(args[2]);
		calc.setOperacao(definirOperacao(args));

		calc.impressao();
	}
}