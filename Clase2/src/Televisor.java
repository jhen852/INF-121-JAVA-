
public class Televisor {
		private String marca, tama�o, tipo;
		private int precio;
		
		public void Leer() {
			System.out.println("Ingrese la Marca : ");
			marca = Leer.dato();
			System.out.println("Ingrese el Tama�o : ");
			tama�o = Leer.dato();
			System.out.println("Ingrese el tipo : ");
			tipo = Leer.dato();
			System.out.println("Ingrese el Precio :");
			precio = Leer.datoInt();
		}
		public void mostrar () {
			System.out.println("\nMarca : "+marca+
					"\nTama�o : "+tama�o+
					"\nTipo : "+tipo+
					"\nPrecio : "+precio);
		}
		public String marcaTelevisor() {
			return marca;
		}
		public int precioTelevisor() {
			return precio;
		}
		public void mayorPrecio(Televisor X) {
			if (this.precio>X.precio) {
				System.out.println("El televisor con mayor precio es "+this.marca);
			}
			else {
				if (X.precio>this.precio) {
					System.out.println("El televisor con mayor precio es "+X.marca);
				}
				else {
					System.out.println("Ambos tienen el mismo precio");
				}
			}
		}
		
}
