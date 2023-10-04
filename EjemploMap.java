import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EjemploMap {
    public static void main(String[] args) {
        Map<Integer, String> personas = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Opciones");
            System.out.println("0 Lista de personas");
            System.out.println("1 Agregar personas");
            System.out.println("2 Buscar personas");
            System.out.println("3 Eliminar Persona");
            System.out.println("4 salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Lista de personas:");
                    List<String> listaNombres = new ArrayList<>();
                    for (Map.Entry<Integer, String> entry : personas.entrySet()) {
                        int id = entry.getKey();
                        String nombre = entry.getValue();
                        listaNombres.add("ID: " + id + ", Nombre: " + nombre);
                    }
                    if (listaNombres.isEmpty()) {
                        System.out.println("No hay personas en la lista");
                    } else {
                        for (String persona : listaNombres) {
                            System.out.println(persona);
                        }
                    }
                    break;
                case 1:
                    System.out.println("Ingrese el Id de la persona");
                    int idAgregar = scanner.nextInt();
                    scanner.nextLine();
                    if (personas.containsKey(idAgregar)) {
                        System.out.println("ID repetido, no se puede agregar.");
                    } else {
                        System.out.println("Ingrese el nombre de la persona");
                        String nombre = scanner.nextLine();
                        personas.put(idAgregar, nombre);
                        System.out.println("Se agregó correctamente");
                    }
                    break;
                case 2:
                    System.out.println("Ingresar el Id de la persona");
                    int idBuscar = scanner.nextInt();
                    String nombreEncontrado = personas.get(idBuscar);
                    if (nombreEncontrado != null) {
                        System.out.println("Nombre de la persona: " + nombreEncontrado);
                    } else {
                        System.out.println("Persona no encontrada");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese id de persona");
                    int idEliminar = scanner.nextInt();
                    String personaEliminada = personas.remove(idEliminar);
                    if (personaEliminada != null) {
                        System.out.println("El eliminado es: " + personaEliminada);
                    } else {
                        System.out.println("Persona no eliminada");
                    }
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opcion no válida");
            }
        }
    }
}
