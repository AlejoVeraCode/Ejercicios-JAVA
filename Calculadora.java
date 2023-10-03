
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ingrese primer numero: ");
            double num1 = scanner.nextDouble();
            System.out.println("Ingrese segundo numero: ");
            double num2 = scanner.nextDouble();
            double division = num1 / num2;
            System.out.println("la division de los numeros es: " + division);

            if (num2 == 0) {
                throw new ArithmeticException("division no permitida: ");
            }
        }catch (InputMismatchException e) {
            System.out.println("ingrese numero valido");
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
}
}
