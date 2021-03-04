package br.edu.infnet.appsdi.tp2;

public class Calculadora {

	private float numeroA;
	private float numeroB;
	private int operacao;
	private String nome;

	public void impressao() {

		if(validaOperacao()) {
			
			System.out.printf("[%s] %s: %.2f = %.2f %s %.2f\n", 
					nome, 
					Constante.OPERACAO_TEXTO[operacao-1], 
					calcular(), 
					numeroA, 
					Constante.OPERACAO_SINAL[operacao-1], 
					numeroB
				);
		}else {
			System.out.println(nome +", a sua operação está inválida: "+operacao+"!!!");
		}
		
	}
	
	private boolean validaOperacao() {

		switch (operacao) {
		case Constante.SOMA:
		case Constante.SUBTRACAO:
		case Constante.DIVISAO:
		case Constante.MULTIPLICACAO:
			return true;
		}

		return false;
	}
	
	private float calcular() {

		switch (operacao) {
			case Constante.SOMA:
				return somar();

			case Constante.SUBTRACAO:
				return subtrair();

			case Constante.DIVISAO:
				return dividir();

			case Constante.MULTIPLICACAO:
				return multiplicar();

			default:
				return 0;
		}
	}
	
	private float somar() {
		return numeroA + numeroB;
	}
	
	private float subtrair() {
		return numeroA - numeroB;
	}

	private float dividir() {
		return numeroA / numeroB;
	}
	
	private float multiplicar() {
		return numeroA * numeroB;
	}
	
	public float getNumeroA() {
		return numeroA;
	}
	public void setNumeroA(float numeroA) {
		this.numeroA = numeroA;
	}
	public float getNumeroB() {
		return numeroB;
	}
	public void setNumeroB(float numeroB) {
		this.numeroB = numeroB;
	}
	public int getOperacao() {
		return operacao;
	}
	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
}