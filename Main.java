
import java.util.Random;


public class Main {
    private static final int MAX_FILA_TABLERO =  10;
    private static final int MAX_COLUMNA_TABLERO = 10;
    private static char[][] tablero; 
    
    public static void main(String[] args) {
        //1.Inicializo mi matriz tablero
        
        tablero = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];
        
        //2.Rellenar tablero con 'L'
        
        for(int i = 0; i < MAX_FILA_TABLERO; i++) {
            for(int j = 0; j < MAX_COLUMNA_TABLERO; j++){
            
                tablero[i][j] = 'L';
            
            }
    
        }
        
        //3.Imprimir Tablero
        imprimirTablero(); 
        
     
        //4.Asignar Bart
        Random aleatorio = new Random(); 
        int filaAleatorio = aleatorio.nextInt(MAX_FILA_TABLERO);
        int columnaAleatorio = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
        
        tablero[filaAleatorio][columnaAleatorio] = 'B';
        
        for(int i = 0; i < MAX_FILA_TABLERO; i++){
            for(int j = 0; j < MAX_COLUMNA_TABLERO; j++){
            
            }
            
            
        }
        
        //5.Repartir 10 Homer dentro del tablero.
        
        int filaAleatorioHomer;
        int columnaAleatorioHomer; 
        for(int i = 0; i < 10; i++) {
          do{
            filaAleatorioHomer = aleatorio.nextInt(MAX_FILA_TABLERO);
            columnaAleatorioHomer = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
          
          }while(tablero[filaAleatorioHomer][columnaAleatorioHomer]!='L'); 
          
          //Cuando tablero[filaAleatorioHomer][columnaAleatorioHomer]='L'
        tablero[filaAleatorioHomer][columnaAleatorioHomer] = 'H';
        }
        
        
        //6.Imprimir tablero
        imprimirTablero(); 
        
        //Muro
        int filaAleatorioMuro;
        int columnaAleatorioMuro = 0; 
        for(int i = 0; i < 10; i++) {
          do{
            filaAleatorioMuro = aleatorio.nextInt(MAX_FILA_TABLERO);
            columnaAleatorioMuro = aleatorio.nextInt(MAX_COLUMNA_TABLERO);
          
          }while(tablero[filaAleatorioMuro][columnaAleatorioMuro]!='L'); 
          
          //Cuando tablero[filaAleatorioHomer][columnaAleatorioHomer]='L'
        tablero[filaAleatorioMuro][columnaAleatorioMuro] = 'M';
        }
        imprimirTablero(); 
    
    }

    
    //Funcion imprimir tablero
    private static void imprimirTablero(){
    for(int i = 0; i < MAX_FILA_TABLERO; i++){
            for(int j = 0; j < MAX_COLUMNA_TABLERO; j++){
                System.out.print(tablero[i][j] + " ");
            
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
      
      
    
}
