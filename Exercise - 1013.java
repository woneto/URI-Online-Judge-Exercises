
import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
    	Scanner entrada = new Scanner(System.in);
    	Maior m = new Maior(entrada.nextInt(), entrada.nextInt(), entrada.nextInt());
    	System.out.println(m.maiorNumero() + " eh o maior");
    }
 
}

class Maior{
	private int a;
	private int b;
	private int c;
	
	public Maior(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int maiorNumero(){
		int maior = (this.a + this.b + Math.abs(this.a - this.b)) / 2;
		return (maior + this.c + Math.abs(maior - this.c)) / 2;
	}
}
