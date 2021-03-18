package br.edu.infnet.appsdi.tp4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionarioLoteTeste {

	private static Scanner in;
	private static String opcao;	
	private static List<Funcionario> funcionarios;	

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		opcao = null;
		funcionarios = new ArrayList<Funcionario>();		
		
		do {
			
			int opcaoMenu = recuperarOpcaoMenu();
			
			switch (opcaoMenu) {
			case 1:
				incluirProgramador();
				break;

			case 2:
				incluirAnalista();
				break;

			case 3:
				obterLista();
				break;

			case 9:
				sair();
				break;
				
			default:
				tratarOpcaoInvalida();
				break;
			}
						
		} while ("S".equalsIgnoreCase(opcao));
		
		System.out.println("Processamento finalizado!!!");
		
		in.close();		
	}
	
	private static void incluirAnalista() {
		AnalistaSistema a = new AnalistaSistema();
		
		System.out.print("Informe o seu nome: ");
		a.setNome(in.next());
		
		System.out.print("Informe o seu e-mail: ");
		a.setEmail(in.next());
		
		System.out.print("Informe o seu salario: ");
		a.setSalario(in.nextFloat());

		System.out.print("Informe a sua idade: ");
		a.setIdade(in.nextInt());
		
		System.out.print("Informe a quantidade de sistemas: ");
		a.setQtdeSistema(in.nextInt());
		
		System.out.print("Informe o tempo de experiência: ");
		a.setTempoExperiencia(in.nextInt());
		
		a.impressao();
		
		System.out.print("Deseja continuar no sistema (S/N)? Resposta: ");
		opcao = in.next();

		funcionarios.add(a);
	}

	private static void incluirProgramador(){
		Programador p = new Programador();
		
		System.out.print("Informe o seu nome: ");
		p.setNome(in.next());
		
		System.out.print("Informe o seu e-mail: ");
		p.setEmail(in.next());
		
		System.out.print("Informe o seu salario: ");
		p.setSalario(in.nextFloat());

		System.out.print("Informe a sua idade: ");
		p.setIdade(in.nextInt());
		
		System.out.print("Informe a sua linguagem: ");
		p.setLinguagem(in.next());
		
		System.out.print("Informe o seu valor adicional: ");
		p.setValorAdicional(in.nextFloat());

		p.impressao();
		
		System.out.print("Deseja continuar no sistema (S/N)? Resposta: ");
		opcao = in.next();

		funcionarios.add(p);
	}

	private static void obterLista() {
		if(funcionarios.size() > 0) {
			System.out.println("Listagem geral de funcionários:");
			for(Funcionario f : funcionarios) {
				
				String tipo = f instanceof Programador ? "P" : "A";
				
				System.out.println(tipo + " - " + f);
			}
		} else {
			System.out.println("Nenhum funcionário cadastrado!!!");
		}
		opcao = "S";
	}
	
	private static void sair() {
		opcao = "N";
	}
	
	private static void tratarOpcaoInvalida() {
		System.out.println("Opção inválida!!! Informe uma nova opção!");
		opcao = "S";
	}
	
	private static int recuperarOpcaoMenu() {
		System.out.println("Cadastramento de funcionários:");
		System.out.println("1 - Incluir programadores");
		System.out.println("2 - Incluir analistas");
		System.out.println("3 - Exibir todos");
		System.out.println("9 - Sair");
		System.out.print("Escolha a sua opção: ");

		return in.nextInt();
	}
}