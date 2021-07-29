package dadosclientes;

public class Cliente {//armazena os dados dos clientes

	private String nome, endereco, telefone;
	
	public String getNome() {//Nome do cliente
		return nome;
	}
	public void setNome(String nome) {//Nome do cliente
		this.nome = nome;
	}
	public String getEndereco() {//Endere�o do cliente
		return endereco;
	}
	public void setEndereco(String endereco) {//Endere�o do cliente
		this.endereco = endereco;
	}
	public String getTelefone() {//telefone do cliente
		return telefone;
	}
	public void setTelefone(String telefone) {//telefone do cliente
		this.telefone = telefone;
	}
	public boolean buscaNome(String nomebuscado) {//Busca nomes dos clientes para ganrantir que n�o haver�o dois iguais
		if (nome.equalsIgnoreCase(nomebuscado))
	     return true;
	     
		else
	    	 return false;
	}

}
