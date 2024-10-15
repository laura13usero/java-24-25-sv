package simpsonprogfuncional;

import java.util.Random;
import java.util.Scanner;

public class SimpsonProgFuncional {
    private static final int MAX_FILA_TABLERO = 10;
    private static final int MAX_COLUMNA_TABLERO = 10;
    private static char[][] tablero;
    private static int filaBart;
    private static int columnaBart;
    
    private static void imprimirTablero(){
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                //[0,0],[0,1],[0,2],[0,3],ETC
                System.out.print(tablero[i][j] + " "); 
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    private static void asignarLibreACasilla(char caracter){
        //2º) Rellenar el tablero 'L'
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                //[0,0],[0,1],[0,2],[0,3],ETC
                tablero[i][j] = caracter;
            }
        }
    } 
    private static void asignarPersonajesACasillaLibre(char caracter, int numRepeteciones){
        //4º) Asignar a Bart 
        Random aleatorio = new Random();
        int filaAleatorio = -1;
        int columnaAleatorio = -1;
        for(int i = 0; i<numRepeteciones; i++){
            do{
                filaAleatorio = aleatorio.nextInt(MAX_FILA_TABLERO);//0-9
                columnaAleatorio = aleatorio.nextInt(MAX_COLUMNA_TABLERO);//0-9
            }while (tablero[filaAleatorio][columnaAleatorio]!='L');
            tablero[filaAleatorio][columnaAleatorio] = caracter;
        }
        if(caracter=='B'){
            filaBart = filaAleatorio;
            columnaBart = columnaAleatorio;
        }
    }
//    private static void asignarCaracterACasillasLibres(char caracter){
//        Random aleatorio = new Random();
//        // 6º) Repartir 10 Homer dentro del tablero
//        int filaAleatorioHomer;
//        int columnaAleatorioHomer;
//        for (int i = 0; i < 10; i++) {
//            do{
//                filaAleatorioHomer = aleatorio.nextInt(MAX_FILA_TABLERO);//0-9
//                columnaAleatorioHomer = aleatorio.nextInt(MAX_COLUMNA_TABLERO);//0-9
//            }while (tablero[filaAleatorioHomer][columnaAleatorioHomer]!='L');                
//            // Cuando tablero[filaAleatorioHomer][columnaAleatorioHomer]='L'
//            tablero[filaAleatorioHomer][columnaAleatorioHomer] = caracter;
//        }
//    }
    
    public static void main(String[] args) {
        // 1º) Inicializo mi matriz tablero
        tablero = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];
        asignarLibreACasilla('L');
        //3º) Imprimir tablero
        imprimirTablero();
        asignarPersonajesACasillaLibre('B', 1);
        //5º) Imprimir tablero
        imprimirTablero();
        asignarPersonajesACasillaLibre('H',10);
        //7º) Imprimir tablero
        imprimirTablero();
        asignarPersonajesACasillaLibre('M',10);
        imprimirTablero();
        tablero[MAX_FILA_TABLERO-1][MAX_COLUMNA_TABLERO-1] = 'F';
        imprimirTablero();
        
        /*Desplazamiento de Bart*/
            /*A--> Izquierda*/
            /*S--> Abajo*/
            /*D--> Derecha*/
            /*W--> Arriba*/
         Scanner lector = new Scanner(System.in);
        /*****************************************************************/ 
        /*JUGAR*/
        /*****************************************************************/
        int vidas = 10;
        do{
            System.out.println("Dime el desplazamiento que quieres realizar");
            System.out.println("A--> Izquierda, S--> Abajo, D--> Derecha, W--> Arriba");
            String desplazamiento = lector.nextLine();
            System.out.println("Desplazamiento=" + desplazamiento);
            switch(desplazamiento){
                case "A":// Izquierda
                       if((columnaBart - 1) >=0){
                           columnaBart = columnaBart - 1; //Ya lo tenemos en la casilla 0, -1, Se sale del array
                           switch (tablero[filaBart][columnaBart]){
                                   case 'H':
                                           vidas = vidas-1;
                                           tablero[filaBart][columnaBart] = 'B';
                                           tablero[filaBart][columnaBart+1] = 'L';
                                           System.out.println("Has perdido una vida. "
                                                   + "Te quedan=" + vidas + " vidas.");
                                           break;
                                   case 'L':
                                           tablero[filaBart][columnaBart] = 'B';
                                           tablero[filaBart][columnaBart+1] = 'L';
                                           break;
                                   case 'M':
                                           System.out.println("El muro no te deja desplazarte a esta casilla.");
                                           columnaBart = columnaBart + 1;
                                       break;
                           }
                       }else{
                           System.out.println("Desplazamiento prohibido. Límite de tablero.");
                       }
                       break;
                case "S":
                       break;
                case "D":
                       break;
                case "W":
                       break;
                default:
                       break;
            }
            imprimirTablero();
        }while(vidas>0);
        /*****************************************************************/
            
    }
    
    }
