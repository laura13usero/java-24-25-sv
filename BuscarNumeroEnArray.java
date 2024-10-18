import java.util.Random;
import java.util.Scanner;

public class BuscarNumeroEnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[100]; // Array de tamaño 100
        boolean encontrado = false; // Variable para saber si se ha encontrado el número
        int numeroBuscado;

        // Rellenar el array con números aleatorios entre 1 y 100
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1; // Números aleatorios entre 1 y 100
        }

        // Mostrar el arreglo generado (opcional, para que el usuario vea los números)
        System.out.println("Array generado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // Salto de línea

        // Número a buscar
        System.out.print("Ingrese el número que desea buscar en el arreglo: ");
        numeroBuscado = scanner.nextInt();

        // Buscar el número en el array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroBuscado) {
                System.out.println("El número está en la posición: " + i);
                encontrado = true;
                break; // Salir bucle
            }
        }

        // Si no se encuentra el número
        if (!encontrado) {
            System.out.println("El numero no existe en el array");
        }


    }
}