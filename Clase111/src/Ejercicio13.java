import java.util.*;
public class Ejercicio13 {

	public static void main(String[] args) {
		//Sacar la serie de factorial de un numero sucesivo 
		// 1!, 2!, 3!, 4!,...
		Scanner leer = new Scanner(System.in);
		int n = leer.nextInt();
		int fac = 1;
		for (int i = 1; i <=n ; i++) {
			fac = fac*i;
			System.out.print(fac +", ");
		}
	}

}
