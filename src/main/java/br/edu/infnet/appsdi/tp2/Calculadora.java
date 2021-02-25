package br.edu.infnet.appsdi.tp2;

public class Calculadora {

	private float numeroA;
	private float numeroB;
	private int operacao;
	private String nome;
	
	public boolean validaOperacao(){
		switch (operacao) {
		case Constante.SOMA:			
		case Constante.SUBTRACAO:			
		case Constante.DIVISAO:			
		case Constante.MULTIPLICACAO:			
			return true;
		default:
			return false;
		}
	}
	
	public void impressao(){
		System.out.printf("[%s] %s: %.2f = %.2f %s %.2f\n", 
				nome, 
				Constante.OPERACAO_NOME[operacao - 1], 
				calcular(operacao), 
				numeroA, 
				Constante.OPERACAO_SINAL[operacao - 1], 
				numeroB
			);
	}
		
	private float calcular(int oper){
		
		switch (oper) {
		case Constante.SOMA:
			return soma();
		case Constante.SUBTRACAO:			
			return subtracao();
		case Constante.DIVISAO:			
			return divisao();
		case Constante.MULTIPLICACAO:			
			return multiplicacao();
		}		

		return 0;
	}	
	
	private float soma() {
		return numeroA + numeroB;
	}
	private float subtracao(){
		return numeroA - numeroB;
	}
	private float divisao(){
		return numeroA / numeroB;
	}
	private float multiplicacao(){
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