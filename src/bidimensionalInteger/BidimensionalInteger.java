package bidimensionalInteger;

public class BidimensionalInteger {

    int[][] matriz;

    public BidimensionalInteger(int filas, int columnas){
        matriz = new int[filas][columnas];
        init();
    }

    private void init(){
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                matriz[i][j] = i;
            }
        }
    }

    public String print(){
        String toReturn = "";
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                toReturn += matriz[i][j] + "\t";
            }
            toReturn += "\n";
        }
        return toReturn;
    }
}
