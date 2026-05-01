package entities;

public class Produto {

	public String nome;
	public Double preco;
	public Integer quantidade;

	public String toString() {
		return "Produto: " + nome + " | " + "Preço: " + preco + " | " + "Quantidade: " + quantidade;
	}

	public boolean equals(Object obj) {
		Produto p = (Produto) obj;
		return nome.equals(p.nome) && preco == p.preco;
	}

}
