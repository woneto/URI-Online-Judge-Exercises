import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		Pecas p = new Pecas(entrada.nextInt(), entrada.nextInt(), entrada.nextDouble(), entrada.nextInt(), entrada.nextInt(), entrada.nextDouble());
		System.out.println("VALOR A PAGAR: R$ " + df.format(p.calcula()));
	}
}

class Pecas {
	private int codigoPeca1;
	private int qtdPecas1;
	private double valorPeca1;
	private int codigoPeca2;
	private int qtdPecas2;
	private double valorPeca2;

	public Pecas(int codigo1, int qtd1, double valor1, int codigo2, int qtd2, double valor2){
		this.codigoPeca1 = codigo1;
		this.qtdPecas1 = qtd1;
		this.valorPeca1 = valor1;
		this.codigoPeca2 = codigo2;
		this.qtdPecas2 = qtd2;
		this.valorPeca2 = valor2;
	}
	
	public double calcula(){
		return this.qtdPecas1 * this.valorPeca1 + this.qtdPecas2 * this.valorPeca2;
	}

}
