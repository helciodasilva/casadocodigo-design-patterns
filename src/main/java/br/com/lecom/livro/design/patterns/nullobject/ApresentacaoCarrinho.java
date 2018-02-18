package br.com.lecom.livro.design.patterns.nullobject;

import javax.servlet.http.HttpServletRequest;

public class ApresentacaoCarrinho {

	public void colocarInformaçoesCarrinho(HttpServletRequest request) {
		
		/*		
		Carrinho c = CookieFactory.criarCarrinho(request);
		if (c != null) {
			request.setAttribute("valor", c.getValor());
			request.setAttribute("qtd", c.getTamanho());
		} else {
			request.setAttribute("valor", 0.0);
			request.setAttribute("qtd", 0);
		}

		if (request.getAttribute("username") == null) {
			if (c != null) {
				request.setAttribute("userCarrinho", c.getNomeUsuario());
			} else {
				request.setAttribute("userCarrinho", "<a href=login.jsp>Login</a>");
			}
		} else {
			request.setAttribute("userCarrinho", request.getAttribute("username"));
		}
		*/
		
		Carrinho c = CookieFactory.criarCarrinho(request);

		request.setAttribute("valor", c.getValor());
		request.setAttribute("qtd", c.getTamanho());

		if (request.getAttribute("username") == null) {
			request.setAttribute("userCarrinho", c.getNomeUsuario());
		} else {
			request.setAttribute("userCarrinho", request.getAttribute("username"));
		}
	}

}
