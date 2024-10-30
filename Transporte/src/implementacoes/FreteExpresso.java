package implementacoes;

import abstrato.Transporte;

public class FreteExpresso extends Transporte {

	@Override
	public double calcularFrete() {
		double frete = peso * 10;
		return frete;
	}

}
