import java.util.Scanner;
public class punto1 {
	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
			System.out.println("Ingrese el numero");
			int n = lee.nextInt();
			int a = -1;
			int b = 1;
			for (int i = 1; i <= n; i++) {
				int f = a+b;
			    System.out.println(f);
			    a = b;
			    b = f;		
		}
	}
}
