package sistema;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        ContaBancaria conta = new ContaBancaria("Anna", 12345, 1000);
        ContaBancaria conta2 = new ContaBancaria("Julio", 6789, 2000);
        
        conta.mostrarSaldo();
        conta2.mostrarSaldo();
        
        System.out.print("Digite o valor para depósito: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);
        
        System.out.print("Digite o valor para saque: ");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);
        
        conta.mostrarSaldo();
        conta2.mostrarSaldo();
        
        scanner.close();
	}
}
