package br.com.lecom.livro.design.patterns.state;

import java.util.List;

// Classe que abstrai o estado de um nó
/*
public abstract class Cor {

	public void busca(No no, List<No> list) {
	}

	public void assumiu(No no, List<No> list) {

	}

}
*/

public enum Cor {
	BRANCO {
		public void busca(No no, List<No> list) {
			no.setCor(CINZA, list);
		}
	},
	CINZA {
		void assumiu(No no, List<No> list) {
			for (No adj : no.getAdjacentes()) {
				adj.buscaProfundidade(list);
			}
			no.setCor(PRETO, list);
		}

		public void busca(No no, List<No> list) {
			no.setCor(CINZA, list);
		}
	},
	PRETO {
		void assumiu(No no, List<No> list) {
			list.add(no);
		}
	};
	
	void busca(No no, List<No> list){}
	void assumiu(No no, List<No> list){}
}