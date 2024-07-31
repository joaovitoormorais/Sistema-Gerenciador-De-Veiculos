package projeto;

public class Veiculos {

	String marca;
	String modelo;
	 int ano;
	String placa;
	double preco;
	
	@Override
	public String toString() {
		return "Veiculos [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", placa=" + placa + ", preco="
				+ preco + "]";
	}

	public String getMarca(String marca) {
		return marca;
	}
	
	public String getModelo(String modelo) {
		return modelo;
	}
	
	public int getAno(int ano) {
		return ano;
	}
	
	public String getPlaca(String placa) {
		return placa;
	}
	
	public double getPreco(double preco) {
		return preco;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
