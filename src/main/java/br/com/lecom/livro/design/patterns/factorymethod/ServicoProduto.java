package br.com.lecom.livro.design.patterns.factorymethod;

import br.com.lecom.livro.design.patterns.templatemethod.GeradorArquivo;

public class ServicoProduto extends ServicoAbstrato<Produto> {

	private DAO<Produto> dao;

	public ServicoProduto(GeradorArquivo gerador) {
		super(gerador);
	}

	@Override
	public DAO<Produto> getDAO() {
		if (dao == null) {
			dao = new ProdutoDAO();
		}
		return dao;
	}

	// Funcionalidade específica
	public double getPrecoProduto(Object id) {
		Produto p = getDAO().recuperarPorId(id);
		return p.getPreco();
	}

}
