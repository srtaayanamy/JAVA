package modelos;

public class Cliente {
	public String nome;
	public String endereco;
	public String transporte;
	
	public Cliente (String nome, String endereco, String transporte) {
		this.nome = nome;
		this.endereco = endereco;
		this.transporte = transporte;
	}
	
	public void escolherTransporte() {
		
	}
	
	public String toString() {
		String end = ("Nome: " + nome + ", Endereço: "+ endereco + ", Transporte: " + transporte); 
		return end;
	}
	
}
