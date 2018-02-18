package br.com.lecom.livro.design.patterns.nullobject;

public abstract class Carrinho {

	private double valor;

	private int tamanho;

	private String nomeUsuario;

	public double getValor() {
		return valor;
	}

	public int getTamanho() {
		return tamanho;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

}
