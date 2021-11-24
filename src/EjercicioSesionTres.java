public class EjercicioSesionTres {

    public static void main(String[] args) {

        String[] diasDeLaSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes","Sabado", "Domingo"};

        String cadenaConcatenada = "";

        for (int i = 0; i < diasDeLaSemana.length; i++){
            cadenaConcatenada = cadenaConcatenada + " " + diasDeLaSemana[i];
        }

        System.out.println(cadenaConcatenada);
    }
}
