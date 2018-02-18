package br.com.lecom.livro.design.patterns.strategy;

import static br.com.lecom.livro.design.patterns.strategy.Constants.HORA;

public class CalculoDiaria implements CalculoValor {

	private double valorDiaria;

	public CalculoDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Double calcular(double periodo, Veiculo veiculo) {
		return valorDiaria * Math.ceil(periodo / HORA);
	}
}
