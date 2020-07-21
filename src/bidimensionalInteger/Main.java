package bidimensionalInteger;

public class Main {
    public static void main(String[] args) {

        BidimensionalInteger bi = new BidimensionalInteger(8, 10);
        System.out.println(bi.print());

        ValorPosicion vp = new ValorPosicion(4,5);
        System.out.println(vp.print());

        ArraySumatoria as = new ArraySumatoria(5,7);
        System.out.println(as.print());

    }
}
