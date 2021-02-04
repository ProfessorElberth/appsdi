package br.edu.infnet.appsdi.tp2;

public class CalculadoraTeste {

	public static void main(String[] args) {

		float numeroA = Float.valueOf(args[0]);
		float numeroB = Float.valueOf(args[1]);				
		int operacao = Integer.valueOf(args[2]);
		String nome = args[3];
		
		float resultado = 0;

		System.out.println("1 - soma");
		System.out.println("2 - subtração");
		System.out.println("3 - divisão");
		System.out.println("4 - multiplicação");

		if(operacao == 1) {
			resultado = numeroA + numeroB;
			System.out.printf("[%s] Soma: %.2f = %.2f + %.2f\n", nome, resultado, numeroA, numeroB);

		} else if(operacao == 2) {
			resultado = numeroA - numeroB;
			System.out.printf("[%s] Subtração: %.2f = %.2f + %.2f\n", nome, resultado, numeroA, numeroB);
			
		} else if(operacao == 3) {
			resultado = numeroA / numeroB;
			System.out.printf("[%s] Divisão: %.2f = %.2f + %.2f\n", nome, resultado, numeroA, numeroB);
			
		} else if(operacao == 4) {
			resultado = numeroA * numeroB;
			System.out.printf("[%s] Multiplicação: %.2f = %.2f + %.2f\n", nome, resultado, numeroA, numeroB);

		} else {
			System.out.println(nome +", a sua operação está inválida: "+operacao+"!!!");
		}
	}
}