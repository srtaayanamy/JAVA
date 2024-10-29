package classes;

import interfaces.Pagamento;

public class PayPal implements Pagamento{

	public void realizarPagamento(double valor, int parcelas) {
		double valorFinal = valor/parcelas;
		System.out.println("Pagamento de R$ "+valor+" no PayPal parcelado em "+parcelas+ " vezes, no valor de R$ "+valorFinal);
	}
	public void emitirRecibo() {
		System.out.println("Pagamento confirmado");
	}
	
}
