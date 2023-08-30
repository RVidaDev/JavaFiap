package br.com.fiap.beans;

public class Cliente {
	
	//visibilidade, tipo de dado e variável
	
	private String nome;
	private int idade;
	private double ValorConsulta;
	
	//setters (entrada)
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade
	}
	
	public void setValorConsulta(double ValorConsulta) {
		this.ValorConsulta = ValorConsulta
	}
	
	//getters (exibir)
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return Idade;
	}
	
	public double getValorConsulta() {
		return ValorConsulta;
	}

}
