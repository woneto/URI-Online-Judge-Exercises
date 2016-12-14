import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		Distancia d = new Distancia(entrada.nextInt());
		System.out.println(d.tempo() + " minutos");
	}	
}

class Distancia{
	
	private int km;
	
	public Distancia(int km){
		this.km = km;
	}
	
	public int tempo(){
		return this.km * 2;
	}
}
