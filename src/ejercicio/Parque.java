package ejercicio;

public class Parque {
	
	private int entradas;
	private int chanclas;
	private int souvenir;
		
	//constructor
	public Parque (int entradas, int chanclas, int souvenir) {	
		this.entradas = entradas;
		this.chanclas = chanclas;
		this.souvenir = souvenir;
	}
	
	//setter
	public void venderEntradas(int entradas) {
		this.entradas -= entradas;
		chanclas -= entradas;
		if (this.entradas <= 0) {
			entradas = 0;		
			System.out.println ("Ya no se puede vender más entradas");
		}
	}
	public void venderChanclas(int chanclas) {
		this.chanclas  -= chanclas;
		this.chanclas  -= souvenir+1;
			
	}
	public void venderSouvenir(int souvenir) {
		souvenir *= 2;
		this.souvenir -= souvenir;
	}
	
	//getter
	public String dameAforo () {
		return "Quedan "+entradas+" entradas, quedan "+chanclas+" chanclas, se puede seguir vendiendo ";
	}
		
	
}
