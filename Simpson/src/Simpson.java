public class Simpson {
    //VISIBLE A NIVEL DE LA CLASE SIMPSON
    static char [][] tablero = new char [10][10];
    //FIN
 //Software de gestión de venta ONLINE
    public static void rellenarTablero(char pers){
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++) tablero[i][j] = pers;
        }
    }

    public static void imprimirTablero(){
        for(int i=0; i<10; i++){
            System.out.println();
            for(int j =0; j<10; j++)
                System.out.print(tablero[i][j]);
        }


    }

    public static void main(String[] args) {
        char personaje = '#';
        rellenarTablero(personaje);

        imprimirTablero();
    }











}
