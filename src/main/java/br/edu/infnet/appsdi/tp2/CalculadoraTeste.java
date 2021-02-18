package br.edu.infnet.appsdi.tp2;

import java.util.Scanner;

public class CalculadoraTeste {
	
	private static float numeroA;
	private static float numeroB;
	private static int operacao;
	private static String nome; 
	
	private static final int SOMA = 1;
	private static final int SUBTRACAO = 2;
	private static final int DIVISAO = 3;
	private static final int MULTIPLICACAO = 4;
	private static final String[] OPERACAO_NOME = {"Soma", "Subtração", "Divisão", "Multiplicação"};
	private static final String[] OPERACAO_SINAL = {"+", "-", "/", "*"};

	private static float soma() {
		return numeroA + numeroB;
	}
	private static float subtracao(){
		return numeroA - numeroB;
	}
	private static float divisao(){
		return numeroA / numeroB;
	}
	private static float multiplicacao(){
		return numeroA * numeroB;
	}
	
	private static float calcular(int oper){
		
		switch (oper) {
		case SOMA:
			return soma();
		case SUBTRACAO:			
			return subtracao();
		case DIVISAO:			
			return divisao();
		case MULTIPLICACAO:			
			return multiplicacao();
		}		

		return 0;
	}	

	private static int definirOperacao(String[] argumentos){
		
		if(argumentos.length == 4) {
			return Integer.valueOf(argumentos[3]);
		}else {
			return tratarMenu();
		}		
	}	
	private static int tratarMenu(){
		
		Scanner in = new Scanner(System.in);
		
		System.out.println(SOMA + " - " + OPERACAO_NOME[0]);
		System.out.println(SUBTRACAO + " - " + OPERACAO_NOME[1]);
		System.out.println(DIVISAO + " - " + OPERACAO_NOME[2]);
		System.out.println(MULTIPLICACAO + " - " + OPERACAO_NOME[3]);

		System.out.print("Selecione a opçao desejada: ");

		return in.nextInt(); 
	}
	
	private static void impressao(){

		System.out.printf("[%s] %s: %.2f = %.2f %s %.2f\n", 
				nome, 
				OPERACAO_NOME[operacao - 1], 
				calcular(operacao), 
				numeroA, 
				OPERACAO_SINAL[operacao - 1], 
				numeroB
			);
	}
	
	private static boolean validaOperacao(){

		switch (operacao) {
		case SOMA:			
		case SUBTRACAO:			
		case DIVISAO:			
		case MULTIPLICACAO:			
			return true;

		default:
			return false;
		}
	}
	
	public static void main(String[] args) {

		numeroA = Float.valueOf(args[0]);
		numeroB = Float.valueOf(args[1]);				
		nome = args[2];
		
		operacao = definirOperacao(args);
		
		if(validaOperacao()) {
			impressao();
		}else {
			System.out.println(nome +", a sua operação está inválida: "+operacao+"!!!");
		}
	}
}