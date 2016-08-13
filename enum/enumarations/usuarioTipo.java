package enumarations;

public enum usuarioTipo {

	Noob("Noob",0.10), Veterano("Veterano",0.20);
	
	private String tipoUsuario;
	private double desconto;
	
	private usuarioTipo(String tipoUsuario, double desconto){
		
		this.tipoUsuario = tipoUsuario;
		this.desconto = desconto;
		
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	
	
	
}
