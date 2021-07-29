package dadosprodutos;

public class Produto{//armazena os dados dos produtos

	private String nome, descricao;
	private int estoque;
	private float valor, lucro;
	
	
	public float getValor() {//Valor do produto
		return valor;
	}
	public void setValor(float valor) {//Valor do produto
		this.valor = valor;
	}
	public float getLucro() {//Lucro em porcentagem sobre o valor do produto
		return lucro;
	}
	public void setLucro(float lucro) {//Lucro em porcentagem sobre o valor do produto
		this.lucro = lucro;
	}
	public String getNome() {//Nome do produto
		return nome;
	}
	public void setNome(String nome) {//Nome do produto
		this.nome = nome;
	}
	public String getDescricao() {//Descrição do produto
		return descricao;
	}
	public void setDescricao(String descricao) {//Descrição do produto
		this.descricao = descricao;
	}
	public int getEstoque() {//Quantidade em estoque do produto
		return estoque;
	}
	public void setEstoque(int estoque) {//Quantidade em estoque do produto
		this.estoque = estoque;
	}
	public boolean buscaProduto(String produtobuscado) {//Busca nomes dos produtos para ganrantir que não haverão dois iguais
		if (nome.equalsIgnoreCase(produtobuscado))
	     return true;
	     
		else
	    	 return false;
	}
	
}
