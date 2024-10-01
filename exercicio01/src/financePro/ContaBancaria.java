package financePro;

public class ContaBancaria {
	public String nome;
	public int numero;
	private float saldo;
	
	public ContaBancaria (String nome, int numero, float saldo) {
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(float valor) {
		if (valor > 0) {
			this.saldo = this.saldo + valor;
			System.out.println("O saldo é de: R$" + saldo);
		}
		else {
			System.out.println("O valor deve ser positivo.");
		}
		
	}
	
}
