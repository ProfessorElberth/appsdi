package br.edu.infnet.appsdi.tp4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FuncionarioArquivoTeste {
	
	private static Map<Integer, Funcionario> mapaFuncionario;

	public static void main(String[] args) {		
		init("C:/dev/", "funcionarios.txt");
		
		//TODO chamar o comportamente existente na tela de FuncionarioLoteTeste

		//TODO mover este conteúdo para o método obterLista
		for(Funcionario f: mapaFuncionario.values()) {
			f.impressao();
		}		
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
			
			Integer id = 1;
			
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
}