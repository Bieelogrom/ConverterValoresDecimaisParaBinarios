package controller;

import br.edu.fateczl.gabriel.Pilha;

public class ConverteController {
	Pilha pi = new Pilha();
	
	public ConverteController() {
		// TODO Auto-generated constructor stub
	}
	
	public String decToBin(int decimal) {
		String texto = "";
		int decimalC = decimal;
	
		while(decimalC > 0) {
			try {
				pi.push(decimalC % 2);
				decimalC /= 2;
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		while(!pi.isEmpty()) {
			try {
				texto += pi.pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return texto;
	}
}
