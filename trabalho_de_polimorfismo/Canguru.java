package trabalho_de_polimorfismo;

public class Canguru extends Mamifero{
	
	@Override
	public String alimentar() {
		return "plantas";
	}

	@Override
	public String locomover() {
		return "Saltando";
		
	}
	
	@Override
	public String emitirSom()
	{
		return  "Sons de canguru";
	}
}
