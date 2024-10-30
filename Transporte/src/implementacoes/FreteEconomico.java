package implementacoes;

import abstrato.Transporte;

public class FreteEconomico extends Transporte {

	@Override
	public double calcularFrete() {
		double frete = peso * 5;
		return frete;
	}

}

