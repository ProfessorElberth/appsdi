package br.edu.infnet.appsdi.tp2;

import java.util.Scanner;

public class CalculadoraArgumentoTeste {
<<<<<<< HEAD

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

=======
	
	private static int definirOperacao(String[] argumentos){		
		if(argumentos.length == 4) {
			return Integer.valueOf(argumentos[3]);
		}else {
			return tratarMenu();
		}		
	}		
	private static int tratarMenu(){
		
		Scanner in = new Scanner(System.in);
		
		System.out.println(Constante.SOMA + " - " + Constante.OPERACAO_NOME[0]);
		System.out.println(Constante.SUBTRACAO + " - " + Constante.OPERACAO_NOME[1]);
		System.out.println(Constante.DIVISAO + " - " + Constante.OPERACAO_NOME[2]);
		System.out.println(Constante.MULTIPLICACAO + " - " + Constante.OPERACAO_NOME[3]);

		System.out.print("Selecione a opçao desejada: ");

		return in.nextInt(); 
	}
	
>>>>>>> 59dbddabba5676a66a236a7d413889210619a481
	public static void main(String[] args) {

		Calculadora calc = new Calculadora();
		
		calc.setNumeroA(Float.valueOf(args[0]));
<<<<<<< HEAD
		calc.setNumeroB(Float.valueOf(args[1]));
		calc.setNome(args[2]);
		calc.setOperacao(definirOperacao(args));

		calc.impressao();
=======
		calc.setNumeroB(Float.valueOf(args[1]));				
		calc.setNome(args[2]);		
		calc.setOperacao(definirOperacao(args));
		
		if(calc.validaOperacao()) {
			calc.impressao();
		}else {
			System.out.println(calc.getNome() +", a sua operação está inválida: "+calc.getOperacao()+"!!!");
		}
>>>>>>> 59dbddabba5676a66a236a7d413889210619a481
	}
}