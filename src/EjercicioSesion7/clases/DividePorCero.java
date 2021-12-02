package EjercicioSesion7.clases;

public class DividePorCero {

    public DividePorCero(){}

    public DividePorCero(int a, int b) throws ArithmeticException {

        int resultado = a / b;
        if (resultado == 0){
            throw new ArithmeticException();
        }
    }
}
