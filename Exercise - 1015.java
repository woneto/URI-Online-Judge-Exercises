import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		Distancia d = new Distancia(entrada.nextDouble(), entrada.nextDouble(), entrada.nextDouble(), entrada.nextDouble());
		System.out.println(d.calcular());
	}	
}

class Distancia{
	
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private DecimalFormat df = new DecimalFormat("0.0000");
	
	public Distancia(double x1, double y1, double x2, double y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public String calcular(){
		return df.format(Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2)));
	}
}
