package trabalho_de_polimorfismo;

public class Mamifero extends Animal{
	
	private String corPelo;
	
	
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public String locomover() {
		return "Andando";
	}

	@Override
	public String alimentar() {
		return "Carne";
	}

	@Override
	public String emitirSom() {
		return "Sons de mamíferos";
	}

}
