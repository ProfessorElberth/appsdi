package br.edu.infnet.appsdi.tp2;

import java.util.Scanner;

public class CalculadoraScannerTeste {

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
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Calculadora calc = new Calculadora();
		
		System.out.println("Informe o primeiro número: ");
		calc.setNumeroA(in.nextFloat());
		
		System.out.println("Informe o segundo número: ");
		calc.setNumeroB(in.nextFloat());			
		
		System.out.println("Informe o seu nome: ");
		calc.setNome(in.next());		
		
		calc.setOperacao(definirOperacao(args));
		
		if(calc.validaOperacao()) {
			calc.impressao();
		}else {
			System.out.println(calc.getNome() +", a sua operação está inválida: "+calc.getOperacao()+"!!!");
		}		
	}
}