import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		Esfera esf = new Esfera(entrada.nextInt());
		System.out.println("VOLUME = " + df.format(esf.calcular()));
	}
}

class Esfera{
	private int raio;
	private double pi = 3.14159;
	
	public Esfera(int raio){
		this.raio = raio;
	}
	
	public double calcular(){
		return (double) 4 / 3 * pi * Math.pow(raio, 3);
	}
	
}
