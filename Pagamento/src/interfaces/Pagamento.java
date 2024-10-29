package interfaces;

public interface Pagamento {
	
	void realizarPagamento(double valor, int parcelas);
	void emitirRecibo();
	
}
