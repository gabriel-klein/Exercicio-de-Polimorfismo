package trabalho_de_polimorfismo;

public class Ave extends Animal {
	
	private String corPena;
	
	public void fazerNinho()
	{
		System.out.println("Fazendo ninho...\n");
	}
	
	public String getCorPena() {
		return corPena;
	}
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
	@Override
	public String locomover() {
		return "Voando";
	}

	@Override
	public String alimentar() {
		return "Vermes";
	}

	@Override
	public String emitirSom() {
		return "Sons de Ave";
	}

}
