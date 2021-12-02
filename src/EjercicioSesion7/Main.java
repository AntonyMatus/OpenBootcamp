package EjercicioSesion7;

import EjercicioSesion7.clases.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println(
                "1. Recorrer un Array y revertir los datos. \n" +
                "2. Crear un Array Unidimensional. \n" +
                "3. Crear un Array Bidimensional recorrer el array y mostrar posision y valor \n" +
                "4. Crear un Vector y eliminar el 2do y 3er elemento.  \n" +
                "5. Define el problema de un Vector cuano sobre pasa los elementos requeridos \n"+
                "6. Crea un ArrayListEjercise de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento. \n" +
                "7. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. \n" +
                "8. Crea una función DividePorCero. Esta, debe generar una excepción (\"throws\") a su llamante del tipo ArithmeticException que será capturada por su llamante \n" +
                "9. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: \"fileIn\" y \"fileOut\". \n" +
                "Introduce la Opcion que quieras Ejecutar del 1 al 9 \n" +
                "");

        int opcion=sc.nextInt();
        switch (opcion) {
            case 1 -> {

                String cadena = "Hola Mundo";
                printReverce textRevece = new printReverce();
                textRevece.Reverce(cadena);
            }
            case 2 -> {
                ArrayUnidimensional arrayUnidimensional = new ArrayUnidimensional();
            }
            case 3 -> {
                ArrayBidimensional Bidi = new ArrayBidimensional();
            }
            case 4 -> {

                Vector<String> colores = new Vector<>();
                colores.add("Azul");
                colores.add("Verde");
                colores.add("Rojo");
                colores.add("Amarillo");
                colores.add("Negro");

                colores.remove(1);
                colores.remove(1);
                VectorDeletePosition ejercicio4 = new VectorDeletePosition(colores);


            }
            case 5 -> {
                RespuestaVector respuestas = new RespuestaVector();
            }
            case 6 -> {
                ArrayList<String> animales = new ArrayList<>();
                animales.add("perro");
                animales.add("gato");
                animales.add("iguana");
                animales.add("tiburon");

                ArrayListEjercise arrayList = new ArrayListEjercise(animales);
            }
            case 7 -> {
                ArrayListEjercise arrayListBucle = new ArrayListEjercise();
                arrayListBucle.ArrayListBucleFor();
            }
            case 8 -> {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Introduce 2 numeros: ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                try {
                    DividePorCero dividePorCero = new DividePorCero(a, b);
                } catch (ArithmeticException e) {
                    System.out.println("Esto no puede hacerse");
                } finally {
                    System.out.println("Demo de código");
                }
            }
            case 9 -> {
                try {
                    InputStream fileInput = new FileInputStream("C:\\Users\\tony_\\IdeaProjects\\EjerciciosJavaBasico\\src\\EjercicioSesion7\\clases\\ficheros\\fileIn.txt");
                    PrintStream filePrint = new PrintStream("C:\\Users\\tony_\\IdeaProjects\\EjerciciosJavaBasico\\src\\EjercicioSesion7\\clases\\ficheros\\fileOut.txt");
                    InputStreamAndPrintStream sesion9 = new InputStreamAndPrintStream(fileInput,filePrint);
                    fileInput.close();
                    filePrint.close();

                } catch (FileNotFoundException e){
                    System.out.println("No se encontro el fichero seleccionado!");
                } catch (IOException e){
                    System.out.println("Error al leer el fichero");
                } finally {
                    System.out.println("El archivo ha sido copiado con Exito!!");
                }
            }
            default -> System.out.println("No existe la opcion instroducido: " + opcion);
        }



    }
}
