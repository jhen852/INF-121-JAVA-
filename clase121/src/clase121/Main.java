package clase121;
public class Main {
	public static void main(String[] args) {
		System.out.println("Empezando la Clase 1");
		// es el constructor que java te crear por defecto que nos da java
		Paciente A = new Paciente();
		A.leer();
		A.mostrar();
		System.out.println("ingrese telefono de contacto a modificar");
		//tambien podemos crear la variable y ponerlo leerlo
		A.modificarTelefono(Leer.dato());
		A.mostrarTelefonos();
		// Modificiar pacientes 
		System.out.println("Ingresar la direccion a modificar");
		A.modificarDireccion(Leer.dato());
		A.mostrar();
		//Verificar si el Paciente es mayor de edad
		System.out.println("Es Mayor de edad ?");
		A.verificarMayorEdad();

	}

}
