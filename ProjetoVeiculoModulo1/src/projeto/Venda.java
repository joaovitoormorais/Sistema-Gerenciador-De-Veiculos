package projeto;

public class Venda {
	
	String veiculovendido;
	String vendedorreponsavel;
	String clientecomprador;
	int datavenda;
	
	public String getveiculovendido(String veiculovendido) {
		return veiculovendido;
	}
	
	@Override
	public String toString() {
		return "Venda [veiculovendido=" + veiculovendido + ", vendedorreponsavel=" + vendedorreponsavel
				+ ", clientecomprador=" + clientecomprador + ", datavenda=" + datavenda + "]";
	}

	public String getvendedorresponsavel(String vendedorresponsavel) {
		return vendedorresponsavel;
	}

	public String getclientecomprador(String clientecomprador) {
		return clientecomprador;
	}
	
	public void setveiculovendido(String veiculovendido) {
		this.veiculovendido = veiculovendido;
	}
	
	public void setClientecomprador(String clientecomprador) {
		this.clientecomprador = clientecomprador;
	}
	
	public void setDatavenda(int datavenda) {
		this.datavenda = datavenda;
	}
}
