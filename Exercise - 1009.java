import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Funcionario f1 = new Funcionario();
		DecimalFormat df = new DecimalFormat("0.00");
		f1.nomeVendedor = f1.entrada.nextLine();
		f1.salarioFixo = f1.entrada.nextDouble();
		f1.totalVendas = f1.entrada.nextDouble();
		System.out.println("TOTAL = R$ " + df.format(f1.getSalarioTotal()));
	}	
}


class Funcionario{
	String nomeVendedor;
	double salarioFixo;
	double totalVendas;
	Scanner entrada = new Scanner(System.in);
	public String getNomeVendedor(){
		return this.nomeVendedor;
	}
	
	public double getSalarioTotal(){
		return calculo();
	}
	
	private double calculo(){
		return this.salarioFixo + totalVendas * 0.15;
	}
	
}
