package model;

public class Pessoa {
	private String nome, cpf;
	private int idade;
	private String email;

	public Pessoa(String nome, String cpf, int idade, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nopme) {
		this.nome = nopme;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
