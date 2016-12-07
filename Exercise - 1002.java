import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0000");
		double pi = 3.14159;
		double area = pi * Math.pow(entrada.nextDouble(), 2);
		System.out.println("A="+ df.format(area));
    }
 
}