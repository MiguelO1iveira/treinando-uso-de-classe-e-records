
public class Main {

	public static void main(String[] args) {
		// CRIANDO O OBJETO PESSOA
		Pessoa pessoa = new Pessoa("Miguel", 196923);
		pessoa.setDataNasc("19-01-2004");
		
		// CRIANDO O RECORD INFOPESSOA QUE VAI RECEBER OS DADOS DE PESSOA
		InfoPessoa infoPessoa = pessoa.toInfoPessoa();
		
		// CONSULTANDO OS DADOS DE PESSOA ATRAVES DO RECORD
		System.out.println(
				"Matrícula: " + infoPessoa.matricula() + "\n" +
				"Nome: " + infoPessoa.nome() + "\n" +
				"Data de Nascimento: " + infoPessoa.dataNasc()
			);
		
		
	}

}
