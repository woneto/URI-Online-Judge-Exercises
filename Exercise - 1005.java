import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		double a = entrada.nextDouble();
		double b = entrada.nextDouble();
		
		System.out.println("MEDIA = " + calculo(a, b));
    }
    
    private static String calculo(double a, double b){
    	double result = a * 3.5 + b * 7.5;
    	DecimalFormat df = new DecimalFormat("0.00000");
    	return df.format(result / 11);
    }
 
}