package financePro;

public class Main {
	public static void main(String[] args) {
		
		ContaBancaria cliente = new ContaBancaria("anna", 1234, 10);
		
		System.out.println("Nome: " + cliente.nome);
		System.out.println("Número: " + cliente.numero);
		System.out.println("Saldo: " + cliente.getSaldo());

	}

}
