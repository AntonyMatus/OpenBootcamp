package EjercicioSesion7.clases;

public class ArrayBidimensional {

    public ArrayBidimensional(){

        int [][] Bidi = {{1, 5, 10, 20}, {2, 8, 20, 40}};

        for (int i = 0; i < Bidi.length; i++){
            for( int j = 0; j < Bidi[i].length; j++){
                System.out.println("La posición es :" + i+", "+j+ " El Valor es: "+ Bidi[i][j]);
            }
        }
    }
}
