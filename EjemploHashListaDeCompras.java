import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class EjemploHashListaDeCompras {
    public static void main(String[] args) {
        Set<String> listaDeCompras = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Opciones: ");
            System.out.println("1: Agregar artículo a lista de compras");
            System.out.println("2: Ver listado");
            System.out.println("3: Eliminar artículo");
            System.out.println("4: Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresar artículo: ");
                    String articulo = scanner.nextLine();
                    listaDeCompras.add(articulo);
                    System.out.println("Artículo agregado correctamente.");
                    break;
                case 2:
                    System.out.println("Lista de compras: ");
                    for (String item : listaDeCompras) {
                        System.out.println(item);
                    }
                    break;
                case 3:
                    System.out.println("Ingresar artículo a eliminar: ");
                    String articuloEliminar = scanner.nextLine();
                    if (listaDeCompras.remove(articuloEliminar)) {
                        System.out.println("Artículo eliminado correctamente.");
                    } else {
                        System.out.println("El artículo no existe en la lista.");
                    }
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
