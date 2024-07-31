package projeto;

public class TipoVeiculos {
	
	String categoria;
	String descricao;
	
	@Override
	public String toString() {
		return "TipoVeiculos [categoria=" + categoria + ", descricao=" + descricao + "]";
	}

	public String getCategoria(String categoria) {
		return categoria;
	}
	
	public String getDescricao(String descricao) {
		return descricao;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
