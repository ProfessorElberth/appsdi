package br.edu.infnet.appsdi.tp4;

public class Programador extends Funcionario {

	private String linguagem;
	private float valorAdicional;
	
	@Override
	public float calcularSalario() {
		
		return this.getSalario() + 
				valorAdicional + 
				("java".equalsIgnoreCase(linguagem) ? Constante.VL_JAVA : 0);
	}
	
	@Override
	public String toString() {
		return super.toString()+";"+linguagem+";"+valorAdicional;
	}
	
	public String getLinguagem() {
		return linguagem;
	}
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	public float getValorAdicional() {
		return valorAdicional;
	}
	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
}