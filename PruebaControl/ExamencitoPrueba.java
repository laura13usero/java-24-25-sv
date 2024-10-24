import java.util.Scanner;

public class ExamencitoPrueba {

    public static void main(String[] args) {
        String[][] tablero = new String[10][10];
        int[] numerosUsuario = new int[100];

        // Llenar el tablero con x
        llenarTableroX(tablero);

        // Mostrar tablero de x
        System.out.println("Tablero inicial de 'X':");
        imprimirTablero(tablero);

        // Pedir al usuario que ingrese 100 números
        pedirNumerosUsuario(numerosUsuario);

        // Reemplazar las x con los números ingresados por el usuario
        reemplazarNumerosEnTablero(tablero, numerosUsuario);

        // Mostrar el tablero actualizado
        System.out.println("\nTablero actualizado con los números del usuario:");
        imprimirTablero(tablero);
    }

    // Función para llenar el tablero con x
    public static void llenarTableroX(String[][] tablero) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j] = "X";
            }
        }
    }

    // Función para imprimir el tablero
    public static void imprimirTablero(String[][] tablero) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Función para pedir 100 números al usuario
    public static void pedirNumerosUsuario(int[] numerosUsuario) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIngresa 100 números para llenar el tablero:");

        for (int i = 0; i < 100; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numerosUsuario[i] = scanner.nextInt();
        }
    }

    // Función para reemplazar las X con los números ingresados por el usuario
    public static void reemplazarNumerosEnTablero(String[][] tablero, int[] numerosUsuario) {
        int contador = 0;

        for (int i = 0; i < 10 && contador < 100; i++) {
            for (int j = 0; j < 10 && contador < 100; j++) {

                // Convertir el número del usuario a una cadena
                tablero[i][j] = Integer.toString(numerosUsuario[contador]);
                contador++;
            }
        }
    }
}
