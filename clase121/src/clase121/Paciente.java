package clase121;

public class Paciente {
	private String ci,nombre, paterno, materno;
	private int edad;
	private String direccion, telefono, telefonoContacto, tipoSangre; // camelCase
	
	//vamos a crear metodos 
	
	public void leer () {
		System.out.println("Ingresa tu CI : ");
		ci = Leer.dato();
		System.out.println("Ingrese nombre del Paciente : ");
		nombre = Leer.dato();
		System.out.println("Ingrese el Apellido : ");
		paterno = Leer.dato();
		System.out.println("Ingrese el Apellido Materno ");
		materno = Leer.dato();
		System.out.println("Ingrese la edad : ");
		edad = Leer.datoInt();
		System.out.println("Ingrese direccion : ");
		direccion = Leer.dato();
		System.out.println("Ingrese telefono : ");
		telefono = Leer.dato();
		System.out.println("Ingrese telefono de contacto : ");
		telefonoContacto = Leer.dato();
		System.out.println("Ingrese el tipo de Sangre : ");
		tipoSangre = Leer.dato();
		}	
	// motodo mostrar DE LOS DATOS DEL PACIENTE
	
	public void mostrar() {
		System.out.println("\nCI : "+ci+
				"\nNombre : "+nombre+
				"\nPaterno : "+paterno+
				"\nMaterno : "+materno+
				"\nEdad : "+edad+
				"\nDireccion : "+direccion);
	}
	// MOSTRAR LOS TELEFONOS DEL PACIENTE
	public void mostrarTelefonos() {
		System.out.println("\nTelefono : "+telefono+
				"\nTelefono de Contacto : "+telefonoContacto+
				"\nTipo de Sangre : "+tipoSangre);
	}
	//Modificar el telefono de contacto del Paciente
	public void modificarTelefono(String telefono ) {
		this.telefonoContacto = telefono;
	}
	//Modificar la direccion del Paciente
	public void modificarDireccion(String direccion ) {
		this.direccion = direccion;
		mostrar();
	}
	//Verificar si el Paciente es Mayor de Edad
	public void verificarMayorEdad() {
		if (edad >= 18) {
			System.out.println("Es Mayor de edad");
		}
		else {
			System.out.println("Es Menos de edad");
		}
	}
	}
	
