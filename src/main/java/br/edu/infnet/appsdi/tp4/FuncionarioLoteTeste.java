package br.edu.infnet.appsdi.tp4;

import java.util.Scanner;

public class FuncionarioLoteTeste {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String opcao = null;
		
		final int QTDE = 3;
		
		Funcionario[] funcionarios = new Funcionario[QTDE];
		
		int idx = 0;
		
		do {
			
			int opcaoMenu = recuperarOpcaoMenu();
			
			switch (opcaoMenu) {
			case 1:
				if(idx < QTDE) {
					Funcionario func = new Funcionario();
					
					System.out.print("Informe o seu nome: ");
					func.setNome(in.next());
					
					System.out.print("Informe o seu e-mail: ");
					func.setEmail(in.next());
					
					System.out.print("Informe o seu salario: ");
					func.setSalario(in.nextFloat());

					System.out.print("Informe a sua idade: ");
					func.setIdade(in.nextInt());

					func.impressao();
					
					System.out.print("Deseja continuar no sistema (S/N)? Resposta: ");
					opcao = in.next();

					funcionarios[idx] = func;
					
					idx++;
				}else {
					System.out.println("Não é possível realizar um novo cadastramento!!");
				}
				break;

			case 2:
				if(idx > 0) {
					System.out.println("Listagem geral de funcionários:");
					for(int i = 0; i < idx; i++) {
						System.out.println("- " + funcionarios[i]);
					}
				} else {
					System.out.println("Nenhum funcionário cadastrado!!!");
				}
				opcao = "S";
				break;

			case 9:
				opcao = "N";
				break;
				
			default:
				System.out.println("Opção inválida!!! Informe uma nova opção!");
				opcao = "S";
				break;
			}
						
		} while ("S".equalsIgnoreCase(opcao));
		
		System.out.println("Processamento finalizado!!!");
		
		in.close();		
	}

	private static int recuperarOpcaoMenu() {
		System.out.println("Cadastramento de funcionários:");
		System.out.println("1 - Incluir");
		System.out.println("2 - Exibir todos");
		System.out.println("9 - Sair");
		System.out.print("Escolha a sua opção: ");

		return new Scanner(System.in).nextInt();
	}
}