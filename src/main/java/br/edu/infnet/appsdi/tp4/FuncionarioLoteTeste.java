package br.edu.infnet.appsdi.tp4;

import java.util.Arrays;
import java.util.Scanner;

public class FuncionarioLoteTeste {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String opcao = null;
		
		final int QTDE = 3;
		
		String[] nomes = new String[QTDE];
		int idx = 0;
		
		do {			
			
			if(idx < nomes.length) {
				System.out.print("Informe o seu nome: ");
				nomes[idx] = in.next();
				
				System.out.println("Funcionário cadastrado com sucesso: " + nomes[idx]);
				
				System.out.print("Deseja cadastrar um funcionário (S/N)? Resposta: ");
				opcao = in.next();
				
				idx++;
			}else {
				System.out.println("Não é possível realizar um novo cadastramento!!");
				opcao = "N";
			}
			
		} while ("S".equalsIgnoreCase(opcao));
		
		System.out.println(Arrays.toString(nomes));
		
		System.out.println("Processamento finalizado!!!");
		
		in.close();		
	}
}