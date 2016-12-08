import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		int d = entrada.nextInt();
		System.out.println("DIFERENCA = " + calculo(a, b, c, d));
    }
    
    private static int calculo(int a, int b, int c, int d){
    	return (a*b - c*d);
    }
 
}