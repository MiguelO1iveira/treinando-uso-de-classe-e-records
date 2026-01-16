
public class Pessoa {
	//Atributos:
	private String nome, dataNasc;
	private int matricula;
	
	//Treinando o uso de Construtores
	public Pessoa() {
		this.matricula = 1;
	}
	public Pessoa(String nome, String dataNasc) {
		System.out.println("Pessoa cadastrada com nome informado!");
		this.nome = nome;
		this.matricula = 1;
	}
	public Pessoa(String nome, int matricula, String dataNasc) {
		System.out.println("Pessoa cadastrada com nome, matrícula e data de nascimento informados!");
		this.nome = nome;
		this.matricula = matricula;
		this.dataNasc = dataNasc;
	}
	
	
	
	//GETTERS AND SETTERS
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getMatricula() {
		return matricula;
	}
	
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	
	
	// MÉTODO PARA CHAMAR O CONSTRUTOR DE INFOPESSOA PASSANDO OS DADOS DE PESSOA
	public InfoPessoa toInfoPessoa() {
		return new InfoPessoa(this.nome, this.matricula, this.dataNasc);
	}
	
	
	
	
}
