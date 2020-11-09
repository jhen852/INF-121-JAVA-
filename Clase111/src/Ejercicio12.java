import java.util.Scanner;
import java.util.*;
public class Ejercicio12 {

	public static void main(String[] args) {
		//Dado un numero "n" introducido por teclado generar la serie
		// 0,1,1,2,2,3,3,3,5,5,5,5,5,8,8,8,8,8,8,8,8,8,...
		Scanner leer = new Scanner(System.in);
		int n = leer.nextInt();
		int a = -1, b = 1;
		int c = 1;
			for (int i = 1; i <=n ; i++) {
				int f = a+b;
				System.out.print(f +" ,");
				c++;
				if (c>f) {
					a=b;
					b=f;
					c=1;
				}
			}

	}

}
