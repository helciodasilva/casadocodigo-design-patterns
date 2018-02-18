package br.com.lecom.livro.design.patterns.nullobject;

public class CarrinhoNulo extends Carrinho {

	@Override
	public double getValor() {
		return 0.0;
	}

	@Override
	public int getTamanho() {
		return 0;
	}

	@Override
	public String getNomeUsuario() {
		return "<a href=login.jsp>Login</a>";
	}

}
