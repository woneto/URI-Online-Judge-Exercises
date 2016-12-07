import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		double a = entrada.nextDouble();
		double b = entrada.nextDouble();
		double c = entrada.nextDouble();
		
		System.out.println("MEDIA = " + calculo(a, b, c));
    }
    
    private static String calculo(double a, double b, double c){
    	double result = a * 2 + b * 3 + c * 5;
    	DecimalFormat df = new DecimalFormat("0.0");
    	return df.format(result / 10);
    }
 
}