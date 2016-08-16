package enumarations;

public enum usuarioTipo {

	Noob("Noob",0.10, 10), Veterano("Veterano",0.20, 15);
	
	private String tipoUsuario;
	private double desconto;
	private int x2pPreco;
	
	private usuarioTipo(String tipoUsuario, double desconto, int x2pPreco){
		
		this.tipoUsuario = tipoUsuario;
		this.desconto = desconto;
		this.x2pPreco = x2pPreco;
		
	}

	public int getX2pPreco() {
		return x2pPreco;
	}


	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setX2pPreco(int x2pInicial) {
		this.x2pPreco = x2pInicial;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	
	
	
}
