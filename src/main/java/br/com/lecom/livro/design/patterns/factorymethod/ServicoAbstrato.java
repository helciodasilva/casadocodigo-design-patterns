package br.com.lecom.livro.design.patterns.factorymethod;

import java.io.IOException;

import br.com.lecom.livro.design.patterns.templatemethod.GeradorArquivo;

public abstract class ServicoAbstrato<E> {

	public GeradorArquivo gerador;

	public ServicoAbstrato(GeradorArquivo gerador) {
		this.gerador = gerador;
	}

	public abstract DAO<E> getDAO();

	public void gravarEntidadeEmArquivo(Object id, String nomeArquivo) throws IOException {
		E entidade = getDAO().recuperarPorId(id);
		gerador.gerarArquivo(nomeArquivo, ((Entidade)entidade).getMapa());
		
	}

}
