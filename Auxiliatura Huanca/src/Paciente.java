
public class Paciente {
		private String ci, nombre, paterno, materno, direccion;
		private int edad;
		private String telefono, telefonoContacto, tipoSangre; //CamelCase
		
		//Metodo
		public void Leer() {
			System.out.println("Ingrese el ci ");
			ci = Leer.dato();
			System.out.println("Ingrese el Nombre");
			nombre = Leer.dato();
			System.out.println("Ingrese el Ap. Paterno");
			paterno = Leer.dato();
			System.out.println("Ingrese el Ap. Materno ");
			direccion = Leer.dato();
			System.out.println("Ingrese el edad");
			edad = Leer.datoInt();
			System.out.println("Ingrese el telefono");
			telefono = Leer.dato();
			System.out.println("Ingrese el  Telefono de Contacto");
			telefonoContacto = Leer.dato();
			System.out.println("Ingrese el Tipo de Sangre ");
			tipoSangre = Leer.dato();
		}
		public void mostrar() {
			System.out.println("Ci "+ci+
					"\nNombre "+nombre+
					"\nPaterno "+paterno+
					"\ndireccion "+direccion);
		}
		// Vamos a imprimir 
		public void mostrarTelefonos() {
			System.out.println("\nTelefonia de Contacto"+telefonoContacto+
					"\nTipo de Sangre "+tipoSangre);
			
		}
		// modificar los telefonos de los pacientes
		
	
}
