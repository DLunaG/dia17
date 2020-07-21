package bidimensionalFloat;

import java.text.DecimalFormat;
import java.util.Random;

public class ArrayBidimensional {

    Random rndm = new Random();
    DecimalFormat df = new DecimalFormat("#.##");
    float[][] matrizBi;

    public ArrayBidimensional(int dimension){
        matrizBi = new float[dimension][dimension];
        arrayInit();
    }

    private void arrayInit() {
        //iteración para dar valores aleatorios:
        for (int i = 0; i < matrizBi.length; i++) {
            for (int j = 0; j < matrizBi[i].length; j++) {
                matrizBi[i][j] = rndm.nextFloat()*10;
            }
        }
    }

    public String print(){
        String toReturn = "";
        for (int i = 0; i < matrizBi.length; i++) {
            for (int j = 0; j < matrizBi[i].length; j++) {
                toReturn += df.format(matrizBi[i][j]);
                toReturn += " ";
            }
            toReturn += "\n";
        }
        return toReturn;
    }
}
