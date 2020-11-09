
public class Main {

	public static void main(String[] args) {
		System.out.println("TELEVISOR");
		//1.- Crear(instanciar)2 objetos Televisor
		Televisor T1 = new Televisor();
		Televisor T2 = new Televisor();
		System.out.println("Leer el televisor 1");
		T1.Leer();
		System.out.println("Leer el teleevisor 2");
		T2.Leer();
		System.out.println("****************Mostrando ambos televisores***********");
		System.out.println("Televisor 1");
		T1.mostrar();
		System.out.println("Televisor 2");
		T2.mostrar();
		//2.- Mostrar la marca de cada Televisor
		System.out.println("Marca del televisor 1");
		System.out.println(T1.marcaTelevisor());
		System.out.println("\nMarca del televisor 2");
		System.out.println(T2.marcaTelevisor());
		//3.- Mostrar el televisor con mas precio 
		//Mayor precio
		T1.mayorPrecio(T2);

	}

}
