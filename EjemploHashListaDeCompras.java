import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EjemploHashListaDeCompras {
    public static void  main (String[] args) {
        Set<String> listaDeCompras = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Opciones: ");
            System.out.println("1: Agregar articulo a lista de compras");
            System.out.println("2: Ver listado");
            System.out.println("3: Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresar articulo: ");
                    String articulo = scanner.nextLine();
                    listaDeCompras.add(articulo);
                    System.out.println("Articulo agregado correctamente.");
                    break;
                case 2:
                    System.out.println("Lista de compras: ");
                    for (String item : listaDeCompras) {
                        System.out.println(item);
                    }
                    break;
                case 3:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
