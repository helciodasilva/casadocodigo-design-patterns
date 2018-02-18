package br.com.lecom.livro.design.patterns.strategy;

public class ContaEstacionamento {

	private CalculoValor calculo;

	private Veiculo veiculo;
	private long inicio;
	private long fim;

	public double valorConta() {
		
		/*
		long atual = (fim == 0) ? System.currentTimeMillis() : fim;
		long periodo = inicio - atual;

		if (veiculo instanceof Passeio) {
			if (periodo < 12 * HORA) {
				return 2.0 * Math.ceil(periodo / HORA);
			} else if (periodo > 12 * HORA && periodo < 15 * DIA) {
				return 26.0 * Math.ceil(periodo / DIA);
			} else {
				return 300. * Math.ceil(periodo / MES);
			}

		} else if (veiculo instanceof Carga) {
			// outras regras para outros tipos de veículo
		}
		*/
		
		return calculo.calcular(fim - inicio, veiculo);
	}

	public void setCalculo(CalculoValor calculo) {
		this.calculo = calculo;
	}

}
