package br.edu.infnet.appsdi.tp4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FuncionarioArquivoTeste {
	
	private static Scanner in;
	private static String opcao;	
	private static Map<Integer, Funcionario> mapaFuncionario;
	private static Integer id;

	public static void main(String[] args) {		
		in = new Scanner(System.in);
		opcao = null;

		init("C:/dev/", "funcionarios.txt");
		
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

	private static void incluir(Funcionario funcionario) {
		mapaFuncionario.put(funcionario.getId(), funcionario);
	}
	
	private static void init(String diretorio, String arquivo) {

		try {
			FileReader file = new FileReader(diretorio+arquivo);
			BufferedReader leitura = new BufferedReader(file);
			
			String linha = leitura.readLine();
			String[] campos = null;
			
			mapaFuncionario = new HashMap<Integer, Funcionario>();
			
			id = 1;
			
			while(linha != null) {
				
				campos = linha.split(";");
				
				switch (campos[0]) {
				case "A":
					AnalistaSistema a = new AnalistaSistema();
					a.setId(id++);
					a.setNome(campos[1]);
					a.setEmail(campos[2]);
					a.setSalario(Float.valueOf(campos[3]));
					a.setIdade(Integer.valueOf(campos[4]));
					a.setQtdeSistema(Integer.valueOf(campos[5]));
					a.setTempoExperiencia(Integer.valueOf(campos[6]));

					incluir(a);
					
					break;

				case "P":
					Programador p = new Programador();
					p.setId(id++);
					p.setNome(campos[1]);
					p.setEmail(campos[2]);
					p.setSalario(Float.valueOf(campos[3]));
					p.setIdade(Integer.valueOf(campos[4]));
					p.setLinguagem(campos[5]);
					p.setValorAdicional(Float.valueOf(campos[6]));

					incluir(p);
					
					break;

				default:
					System.out.println("Tipo inexistente: " + campos[0]);
					break;
				}
				
				linha = leitura.readLine();
			}

			leitura.close();
			file.close();
		} catch (IOException e) {
			System.out.println("Problemas no arquivo: " + e.getMessage());
		}				
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

	private static void obterLista() {
		
		if(mapaFuncionario.size() > 0) {
			System.out.println("Listagem geral de funcionários:");
			for(Funcionario f : mapaFuncionario.values()) {
				
				String tipo = f instanceof Programador ? "P" : "A";
				
				System.out.print(tipo + " - ");
				
				f.impressao();
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

	private static void incluirAnalista() {
		AnalistaSistema a = new AnalistaSistema();
		
		a.setId(id++);
		
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

		incluir(a);
	}

	private static void incluirProgramador(){
		Programador p = new Programador();
		
		p.setId(id++);
		
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

		incluir(p);
	}	
}