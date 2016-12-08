import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Funcionario f1 = new Funcionario();
		f1.numeroFuncionario = f1.entrada.nextInt();
		f1.horasTrabalhadas = f1.entrada.nextInt();
		f1.valorHora = f1.entrada.nextDouble();
		f1.mostra();
	}	
}


class Funcionario{
	int numeroFuncionario;
	int horasTrabalhadas;
	double valorHora;
	Scanner entrada = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");
	private double salario(){
		return horasTrabalhadas * valorHora;
	}
	
	public void mostra() {
		System.out.println("NUMBER = " + this.numeroFuncionario);
		System.out.println("SALARY = U$ " + df.format(salario()));
	}

	void setHorasTrabalhadas(int valor){
		this.horasTrabalhadas = valor;
	}
	
	void setValorHora(double valor){
		this.valorHora = valor;
	}
	
}
