package trabalho_de_polimorfismo;

public class Peixe extends Animal{
	
	private String corEscama;
	
	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	public void soltarBolha()
	{
		System.out.println("Soltando bolhas...\n");
	}
	@Override
	public String locomover() {
		return "Nadando";
	}

	@Override
	public String alimentar() {
		return "Algas";
	}

	@Override
	public String emitirSom() {
		return "Sons de peixe";
	}
	
}
