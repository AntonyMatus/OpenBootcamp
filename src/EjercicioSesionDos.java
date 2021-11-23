public class EjercicioSesionDos {

    public static void main(String[] args) {

        double precioTotal = precioMasIVA(150.75);
        System.out.println("El precio final del producto mas el IVA es: " + precioTotal);
    }

    static double precioMasIVA(double precio) {
        /* calculamos el IVA dado que en méxico el iva es el 15% multiplicamos el precio por 0.15
        *  Sumamos el precio del producto mas el iva para optener el resultado final
        */
        double iva = precio * 0.15;

        return precio + iva;

    }
}
