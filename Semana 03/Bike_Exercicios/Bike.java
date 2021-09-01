package entities;

public class Bike {
	public String marca;
	public int qntMarchas;
	public String cor;
	
	public void andar() {
		System.out.println("Você andou mais 1 passo.");
	}
	public void frear() {
		System.out.println("Você freiou!");
	}
}
