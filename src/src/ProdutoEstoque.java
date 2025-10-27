package src;

public class ProdutoEstoque {
	
	private String nome;
	private int quantidade;
	public ProdutoEstoque(String nome, int quantidade) {
		setNome(nome);
		setQuantidade(quantidade);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		}
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		if(quantidade > 0) {
			this.quantidade = quantidade;
		}
	}
	public void adicionarEstoque(int total) {
		if(total > 0) {
			quantidade =+ total;
			System.out.println("A quantidade atual do produto é: " + quantidade);
		}
	}
	public void removerEstoque(int total) {
		if (total <= quantidade) {
			quantidade -= total;
			System.out.println("A quantidade atual do produto é: " + quantidade);
		}
	}
	
}
