package br.edu.infnet.appsdi.tp4;

public abstract class Funcionario {

	private String nome;
	private String email;
	private float salario;
	private int idade;
	
	public Funcionario() {
		this.salario = 999;
		this.idade = 99;
	}
	public Funcionario(String nome, String email) {
		this();
		this.nome = nome;
		this.email = email;
	}
	public Funcionario(String nome, String email, float salario, int idade) {
		this(nome, email);
		this.salario = salario;
		this.idade = idade;
	}

	public abstract float calcularSalario();
	
	public void impressao() {
		System.out.println("Funcionário cadastrado com sucesso: " + this +": "+this.calcularSalarioLiquido()+"!!!");
	}
	
	private float calcularSalarioLiquido(){
		return salario + idade * Constante.VL_IDADE;
	}

	@Override
	public String toString() {
		return nome+";"+email+";"+salario+";"+idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}