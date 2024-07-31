package projeto;

public class Loja {
	
	String nome;
	String endereco;
	String telefone;
	
	public String getNome(String nome) {
		return nome;
	}
	
	@Override
	public String toString() {
		return "Loja [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + "]";
	}

	public String getEndereco(String endereco) {
		return endereco;
	}
	
	public String getTelefone(String telefone) {
		return telefone;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
