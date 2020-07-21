package bidimensionalInteger;
//Crear un array de 3x3 de enteros, cada uno con el valor de su posición absoluta (0 1 2 / 3 4 5 / 6 7 8)
public class ValorPosicion {

    private int[][] matriz;

    public ValorPosicion(int filas, int columnas){
        matriz = new int[filas][columnas];
        init();
    }

    private void init(){
        int posicion = 0;
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                matriz[i][j] = posicion;
                posicion++;
            }
        }
    }

    public String print(){
        String toReturn = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        return toReturn;
    }
}
