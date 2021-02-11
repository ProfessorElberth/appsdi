package br.edu.infnet.appsdi.tp2;

import java.util.Scanner;

public class CalculadoraTeste {
	
	private static float numeroA;
	private static float numeroB;
	
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
	
	private static final int SOMA = 1;
	private static final int SUBTRACAO = 2;
	private static final int DIVISAO = 3;
	private static final int MULTIPLICACAO = 4;
	
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
		
		System.out.println(SOMA + " - soma");
		System.out.println(SUBTRACAO + " - subtração");
		System.out.println(DIVISAO + " - divisão");
		System.out.println(MULTIPLICACAO + " - multiplicação");

		System.out.print("Selecione a opçao desejada: ");

		return in.nextInt(); 
	}
	
	public static void main(String[] args) {

		numeroA = Float.valueOf(args[0]);
		numeroB = Float.valueOf(args[1]);				
		String nome = args[2];

		int operacao = definirOperacao(args);
		
		float resultado = calcular(operacao);
		
		if(operacao == SOMA) {
			System.out.printf("[%s] Soma: %.2f = %.2f + %.2f\n", nome, resultado, numeroA, numeroB);

		} else if(operacao == SUBTRACAO) {
			System.out.printf("[%s] Subtração: %.2f = %.2f + %.2f\n", nome, resultado, numeroA, numeroB);
			
		} else if(operacao == DIVISAO) {
			System.out.printf("[%s] Divisão: %.2f = %.2f + %.2f\n", nome, resultado, numeroA, numeroB);
			
		} else if(operacao == MULTIPLICACAO) {
			System.out.printf("[%s] Multiplicação: %.2f = %.2f + %.2f\n", nome, resultado, numeroA, numeroB);

		} else {
			System.out.println(nome +", a sua operação está inválida: "+operacao+"!!!");
		}
	}
}