package trabalho_de_polimorfismo;

public class TesterPolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mamifero mamifero = new Mamifero();
		Reptil reptil = new Reptil();
		Peixe peixe = new Peixe();
		Ave ave = new Ave();
		Canguru canguru = new Canguru();
		
		mamifero.setCorPelo("castanho");
		reptil.setCorEscama("azul");
		peixe.setCorEscama("vermelho");
		ave.setCorPena("amarelo");
		canguru.setCorPelo("Branco");
		
		//Mamífero
		imprimir(mamifero);
		System.out.println("Cor do pelo do mamífero: " + mamifero.getCorPelo()+"\n");
		
		//Réptil
		imprimir(reptil);
		System.out.println("Cor da escama do reptil: " + reptil.getCorEscama()+"\n");
		
		//Peixe
		imprimir(peixe);
		System.out.println("Cor da escama do peixe: " + peixe.getCorEscama());
		peixe.soltarBolha();
		
		//Ave
		imprimir(ave);
		System.out.println("Cor das penas da ave: " + ave.getCorPena());
		ave.fazerNinho();
		
		//Canguru
		imprimir(canguru);
		System.out.println("Cor dos pelos do canguru: " + canguru.getCorPelo()+"\n");
	}
	
	public static void imprimir(Animal animal)
	{
		System.out.println(animal.getClass());
		System.out.println(animal.alimentar());
		System.out.println(animal.emitirSom());
		System.out.println(animal.locomover()+"\n");
	}
}
