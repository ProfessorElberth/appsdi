package br.edu.infnet.appsdi.tp4;

public class AnalistaSistema extends Funcionario {

	private int qtdeSistema;
	private int tempoExperiencia;
	
	@Override
	public float calcularSalario() {
		return this.getSalario() + 
				qtdeSistema * Constante.VL_SISTEMA + 
				tempoExperiencia * Constante.VL_EXPERIENCIA;
	}
	
	@Override
	public String toString() {
		return super.toString()+";"+qtdeSistema+";"+tempoExperiencia;
	}

	public int getQtdeSistema() {
		return qtdeSistema;
	}
	public void setQtdeSistema(int qtdeSistema) {
		this.qtdeSistema = qtdeSistema;
	}
	public int getTempoExperiencia() {
		return tempoExperiencia;
	}
	public void setTempoExperiencia(int tempoExperiencia) {
		this.tempoExperiencia = tempoExperiencia;
	}
}