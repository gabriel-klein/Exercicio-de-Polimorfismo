package trabalho_de_polimorfismo;

public class Reptil extends Animal {
	
	private String corEscama;
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public String locomover() {
		return "rastejando";
	}

	@Override
	public String alimentar() {
		return "Plantas";
	}

	@Override
	public String emitirSom() {
		return "Som de reptil";
	}

}