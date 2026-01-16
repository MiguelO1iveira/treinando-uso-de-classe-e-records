import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// CLASSE SCANNER
		Scanner scanner = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		
		// VARIÁVEIS
		int mat;
		String nome, dataNasc, resp = "";
		
		// ENTRADA DE DADOS
		System.out.println("\nBEM VINDO!!");
		System.out.println("Informe o nome: ");
		System.out.print(">>> ");
		nome = scanner.nextLine();
		pessoa.setNome(nome);
		
		
		System.out.println("Informe a data de Nacimento: ");
		System.out.print(">>> ");
		dataNasc = scanner.nextLine();
		pessoa.setDataNasc(dataNasc);
		
		
		System.out.println("Deseja informar a matricula? (S/N)");
		System.out.print(">>> ");
		resp = scanner.nextLine();
		
		
		while(!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n")) {
			System.out.println("[ERRO] Digite (S/N)\nDeseja informara a matrícula?");
			System.out.print(">>> ");
			resp = scanner.nextLine();
		}
		
		
		if (resp.equalsIgnoreCase("s")) {
			System.out.println("Digite a matrícula");
			System.out.print(">>> ");
			mat = Integer.parseInt(scanner.nextLine());
			pessoa.setMatricula(mat);
		}
		
		
		// CRIANDO O RECORD INFOPESSOA QUE VAI RECEBER OS DADOS DE PESSOA
		InfoPessoa infoPessoa = pessoa.toInfoPessoa();
		
		// CONSULTANDO OS DADOS DE PESSOA ATRAVES DO RECORD
		System.out.println(
				"\nResultado: \n\n" +
				"Matrícula: " + infoPessoa.matricula() + "\n" +
				"Nome: " + infoPessoa.nome() + "\n" +
				"Data de Nascimento: " + infoPessoa.dataNasc()
			);
		
		scanner.close();
	}
	
}
