package sistema;

public class ContaBancaria {
	private String nome;
	private int numero;
	private double saldo;
	
	public ContaBancaria (String nome, int numero, double saldo) {
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo = this.saldo + valor;
			System.out.println("O saldo é de: R$" + (int) saldo);
		}
		else {
			System.out.println("O valor deve ser positivo.");
		}
	}
	
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			this.saldo = this.saldo - valor;
			System.out.println("Foi sacado R$" + (int) valor + " da conta bancária.");}
		else if (valor > saldo) {
			System.out.println("Não há saldo suficiente.");}
		else {
			System.out.println("O valor do saque deve ser positivo");
		}
	}
	
	public void mostrarSaldo() {
		System.out.println("O saldo da conta é R$" + (int) saldo);
	}
	
	public void transferir(double valor, ContaBancaria destinatario) {
		if (valor > 0 && valor <= saldo) {
			this.saldo = this.saldo - valor;
			destinatario.depositar(valor);
			System.out.println("Transferência de R$" + (int) valor + " feita para " + destinatario.getNome());
			System.out.println(this.saldo);
        } else if (valor <= 0) {
            System.out.println("O valor da transferência deve ser positivo");
        } else {
            System.out.println("Saldo insuficiente para a transferência.");
        }
		
		}
		
	}
	