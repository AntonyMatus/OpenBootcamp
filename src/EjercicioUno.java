public class EjercicioUno {
    public static void main(String[] args) {
        //1. numericos

        //1.1 enteros
        byte variable1 = 5;
        short variable2 = 10;
        int variable3 = 30;
        long variable4 = 100;
        //1.2. decimales
        float variable5 = 5.5f;
        double variable6 = 10.5d;
        //2. booleano
        boolean variable7 = false;
        boolean variable8 = true;
        //3. texto
        char variable9 = 'a';
        String variable10 = "Lorem";

        // Tipos de Datos Numericos

        System.out.println("El tipo de dato Byte representa 8 bits: " + variable1);
        System.out.println("El tipo entero short tiene el tamaño de 2 bytes (16 bits), permite representar la multitud de valores igual a 2 elevado a 16: 2^16 = 65 536. Puesto que el tipo short es con signos y contiene los valores tanto positivos, como negativos, el rango de valores se oscila entre -32 768 y 32 767. "+ variable2);
        System.out.println("El tipo entero int tiene el tamaño de 4 bytes (32 bits). El valor mínimo es de —2 147 483 648, el valor máximo es de 2 147 483 647. " + variable3 );
        System.out.println("Representa un tipo de dato de 16 bits con signo. De esta manera almacena valores numéricos de -32.768 a 32.767. "+ variable4);

        //Tipos de datos decimales
        System.out.println("Es un tipo dato para almacenar números en coma flotante con precisión simple de 32 bits. Ejemplo: "+ variable5);
        System.out.println("Es un tipo de dato para almacenar números en coma flotante con doble precisión de 64 bits. Ejemplo: "+variable6);

        //Tipo de Dato Booleano
        System.out.println("Sirve para definir tipos de datos booleanos. Es decir, aquellos que tienen un valor de true o false. Ocupa 1 bit de información. Ejemplo: Si a una Persona ya le aplicaron la vacuna contra el Covid entonces hay solo 2 respuestas: "+ variable7+" "+ "o "+variable8);

        //Tipos de Datos de Texto
        System.out.println("Es un tipo de datos que representa a un carácter Unicode sencillo de 16 bits. Ejemplo: " + variable9);
        System.out.println("el tipo de dato String podemos manejar cadenas de caracteres separadas por dobles comillas. Ejemplo: "+variable10);
    }
}
