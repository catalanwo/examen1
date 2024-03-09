package lista_examen;
import java.util.Scanner;
import java.util.ArrayList;



@SuppressWarnings("unused")
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		listasimple lista = new listasimple();

		while (true) {

			System.out.println("\nOpciones:");
			System.out.println("1. Insertar elemento al inicio");
			System.out.println("2. Insertar elemento al final");
			System.out.println("3. Buscar un elemento");
			System.out.println("4. Imprimir lista");
			System.out.println("5. Salir");
			System.out.println("Seleccione una opcion");
			int opcion = scanner.nextInt();
			
			 scanner.nextLine();
			switch (opcion) {
			case 1:
				System.out.print("Ingrese el elemento a insertar al inicio: ");
				String elementoInicio = scanner.nextLine();
				lista.insertarAlInicio(elementoInicio);
				break;
			case 2:
				System.out.print("Ingrese el elemento a insertar al final: ");
				String elementoFinal =scanner.nextLine();
				lista.insertarAlInicio(elementoFinal);
				break;	
			
				case 3:
				System.out.print("Ingrese el elemento a buscar: ");
				String buscarElemento = scanner.nextLine();
				if (lista.buscar(buscarElemento)) {
					System.out.println("El elemento " + buscarElemento + "  esta en la lista");
				}else {
					System.out.println("El elemento " + buscarElemento + " no esta en la lista");
				}
				break;
			case 4:
				lista.imprimirLista();
				break;
			case 5:
				System.out.println("Saliendo del programa...");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Opcion invalida. Por favor, selecciona una opcion valida");
			}
		}

}
}
