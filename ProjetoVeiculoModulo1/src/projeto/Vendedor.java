package projeto;

public class Vendedor {

	String nome;
	String cpf;
	String telefone;
	
	public String getNome(String nome) {
		return nome;
	}
	
	public String getCpf(String cpf) {
		return cpf;
	}
	
	public String getTelefone(String telefone) {
		return telefone;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Vendedor [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + "]";
	}
	
	
}