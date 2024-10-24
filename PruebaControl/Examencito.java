import java.util.Random;
import java.util.Scanner;

public class Examencito {

    public static void main(String[] args) {
        String[][] tablero = new String[10][10];
        int[] numerosUsuario = new int[10];

        // Llenar el tablero con x
        llenarTableroX(tablero);

        // Mostrar el tablero inicial lleno de x
        System.out.println("Tablero 'X':");
        imprimirTablero(tablero);

        // Pedir al usuario que ingrese numeros
        pedirNumerosUsuario(numerosUsuario);

        // Reemplazar las x con los números ingresados por el usuario en posiciones aleatorias
        reemplazarNumerosEnTableroAleatoriamente(tablero, numerosUsuario);

        // Mostrar tablero actualizado
        System.out.println("\nTablero nuevo:");
        imprimirTablero(tablero);
    }

    // Función llenar el tablero con 'X'
    public static void llenarTableroX(String[][] tablero) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j] = "X";
            }
        }
    }

    // Función imprimir el tablero numeros
    public static void imprimirTablero(String[][] tablero) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Función pedir números al usuario
    public static void pedirNumerosUsuario(int[] numerosUsuario) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIngresa 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numerosUsuario[i] = scanner.nextInt();
        }
    }

    // Función para reemplazar las x
    public static void reemplazarNumerosEnTableroAleatoriamente(String[][] tablero, int[] numerosUsuario) {
        Random rand = new Random();
        int contador = 0;

        // Insertar numeros
        while (contador < 10) {
            int fila = rand.nextInt(10);
            int columna = rand.nextInt(10);

            // insertar numero si posicion vacia
            if (tablero[fila][columna].equals("X")) {
                tablero[fila][columna] = Integer.toString(numerosUsuario[contador]);
                contador++;
            }
        }
    }
}


