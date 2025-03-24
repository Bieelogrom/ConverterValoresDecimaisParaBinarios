package view;

import java.util.Scanner;

import controller.ConverteController;

public class Main {
	public static void main(String[] args) {
		ConverteController CC = new ConverteController();
		Scanner sc = new Scanner(System.in);
		int decimal = 0;
		
		do {
			System.out.println("Digite o valor decimal para converter: ");
			decimal = sc.nextInt();
		}while(decimal > 1000 || decimal < 0);
		
		String texto = CC.decToBin(decimal);
		
		System.out.println("Valor: "+decimal+"\nValor convertido: "+texto);
	}
}
