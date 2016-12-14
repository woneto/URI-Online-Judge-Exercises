import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		Consumo c = new Consumo(entrada.nextInt(), entrada.nextDouble());
		System.out.println(c.getConsumo() + " km/l");
	}

	
}

class Consumo{
	
	private int distancia;
	private double combustivel;
	private DecimalFormat df = new DecimalFormat("0.000");
	public Consumo(int distancia, double combustivel){
		this.distancia = distancia;
		this.combustivel = combustivel;
	}
	
	public String getConsumo(){
		return df.format(distancia / combustivel);
	}
}
