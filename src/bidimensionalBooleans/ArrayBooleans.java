package bidimensionalBooleans;

public class ArrayBooleans {
    boolean[][] matrizBiBo;

    public ArrayBooleans(int dimension) {
        matrizBiBo = new boolean[dimension][dimension];
        init();

    }

    private void init() {
        for (int i = 0; i < matrizBiBo.length; i++) {
            for (int j = 0; j < matrizBiBo[i].length; j++) {
                if (matrizBiBo.length % 2 == 0) {
                    if ((i == matrizBiBo.length / 2 || i == matrizBiBo.length / 2 - 1) &&
                            (j == matrizBiBo.length / 2 || j == matrizBiBo.length / 2 - 1)) {
                        matrizBiBo[i][j] = true;
                    }
                }else{
                    if(i == matrizBiBo.length/2 && j == matrizBiBo.length/2){
                        matrizBiBo[i][j] = true;
                    }
                }
            }
        }
    }

    public String print() {
        String toReturn = "";
        for (int i = 0; i < matrizBiBo.length; i++) {
            for (int j = 0; j < matrizBiBo[i].length; j++) {
                toReturn += matrizBiBo[i][j] + " ";
            }
            toReturn += "\n";
        }
        return toReturn;
    }
}

