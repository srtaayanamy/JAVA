package classes;

public class Main {

	public static void main(String[] args) {
		 CartaoCredito pagamento01 = new CartaoCredito();
		 PayPal pagamento02 = new PayPal();
		 
		 pagamento01.realizarPagamento(20, 3);
		 pagamento01.emitirRecibo();
		 
		 pagamento02.realizarPagamento(60, 2);
		 pagamento02.emitirRecibo();
	}

}
