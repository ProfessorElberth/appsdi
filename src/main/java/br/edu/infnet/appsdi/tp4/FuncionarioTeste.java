package br.edu.infnet.appsdi.tp4;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		//FIXME Classe abstrata: usar uma das filhas! Construtor padrão
		Funcionario func1 = new Funcionario();
		func1.setNome("huguinho");
		func1.setEmail("elb@elb.com");
		func1.setSalario(1000);
		func1.setIdade(10);
		func1.impressao();
		
		//FIXME Classe abstrata: usar uma das filhas! Construtor com dois parâmetros
		//TODO Criar um construtor com dois parâmetros nas filhas
		Funcionario func2 = new Funcionario("zezinho", "elb@elb.com");
		func2.setSalario(2000);
		func2.setIdade(20);
		func2.impressao();
		
		//FIXME Classe abstrata: usar uma das filhas! Construtor com quatro parâmetros
		//TODO Criar um construtor com quatro parâmetros nas filhas
		Funcionario func3 = new Funcionario("luizinho", "elb@elb.com", 3000, 30);
		func3.impressao();

		//FIXME Classe abstrata: usar uma das filhas! Construtor padrão
		Funcionario func4 = new Funcionario();
		func4.setNome("donald");
		func4.setEmail("elb@elb.com");
		func4.impressao();
		
		//FIXME Classe abstrata: usar uma das filhas! Construtor com dois parâmetros
		//TODO Criar um construtor com dois parâmetros nas filhas
		Funcionario func5 = new Funcionario("elberth", "elb@elb.com");
		func5.impressao();
	}
}