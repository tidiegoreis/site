import java.text.ParseException;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
	    int i;
		float numero[] = new float[10];
		float maior = Float.MIN_VALUE;
		float menor = Float.MAX_VALUE;
		float media = 0;
	
		for (i = 0; i< 10; i++) {
			numero[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor"));	
		} 
				
		for (i = 0; i < 10;  i++) {
			if (numero[i] > maior) {
				maior = numero[i];
			}

			if (numero[i] < menor) {
				menor = numero[i];
			}
			media = media + numero[i];
		}
		media = media / 10;
		System.out.println("Maior:"+ maior);
		System.out.println("Menor:"+ menor);
		System.out.println("Media:"+ media);
	}
	

}
