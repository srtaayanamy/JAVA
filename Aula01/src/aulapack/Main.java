package aulapack;

public class Main {

	public static void main(String[] args) {
		Carro fiatUno = new Carro("Vermelho", "Fiat", "Uno");
		System.out.println("Cor: " + fiatUno.cor);
		System.out.println("Marca: " + fiatUno.getMarca());
		System.out.println("Modelo: " + fiatUno.getModelo());
	}

}
