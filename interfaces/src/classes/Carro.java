package classes;

import interfaces.Veiculo;

public class Carro implements Veiculo{
	
	public void acelerar(int velocidade) {
		System.out.println("Acelerando na velocidade: "+velocidade);
	}
	public void frear(int intensidade) {
		System.out.println("Freando com intensidade: "+intensidade);
	}
}
