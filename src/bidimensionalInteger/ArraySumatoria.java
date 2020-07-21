package bidimensionalInteger;

import bidimensionalBooleans.ArrayBooleans;

import java.util.Random;

//Crear un array 4x4 de enteros. Las 3 primeras filas tendrán valores aleatorios y la cuarta, contendrá la suma de los elementos de cada columna
public class ArraySumatoria {
    private int[][] matriz;
    Random rndm = new Random();

    public ArraySumatoria(int filas, int columnas){
        matriz = new int[filas][columnas];
        init();
    }

    private void init(){
        for (int i = 0; i < matriz.length-1; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                //if(i != matriz.length-1){
                    matriz[i][j] = rndm.nextInt(11);
                    matriz[matriz.length-1][j] += matriz[i][j];
                //}else{
                    //for (int k = 0; k < matriz.length-1 ; k++) {
                    //    matriz[i][j] += matriz[k][j];
                    //}
                //}
            }
        }
    }

    public String print(){
        String toReturn = "";
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        return toReturn;
    }
}
