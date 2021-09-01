package entities;

import java.util.Scanner;

public class BikeTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Bike bic = new Bike();
		
		System.out.print("Marca da Bicicleta: ");
		bic.marca = sc.nextLine();
		System.out.print("Quantidade de Marchas: ");
		bic.qntMarchas = sc.nextInt();
		sc.nextLine();
		System.out.print("Cor da Bicicleta: ");
		bic.cor = sc.nextLine();
		
		System.out.printf("Marca: %s\nQuantidade de Marcha: %d\nCor: %s", bic.marca, bic.qntMarchas, bic.cor);
		System.out.println();

		bic.andar();
		bic.frear();
		
		sc.close();
	}

}
