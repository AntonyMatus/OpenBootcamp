package PracticaFinal;

import java.io.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Crea un programa de tu elección que utilice InputStream, PrintStream
 * excepciones, un HashMap y un ArrayList, LinkedList o array.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        HashMap<String, String> petsName = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        PrintStream fileOut = new PrintStream("C:\\Users\\tony_\\IdeaProjects\\EjerciciosJavaBasico\\src\\EjercicioFinal\\fichero\\fileOut.txt");

        int option = 0;

        do {
            System.out.println("choose an option:");
            System.out.println("1. Enter the name and type of pet that you have at home.");
            System.out.println("2. Exit the program.");
            try {
                option = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid option.");
            }

            if (option == 1){
                try {
                    System.out.println("Enter your pet name:");
                    String name = sc.next().trim().toLowerCase();

                    System.out.println("Introduce the type of pet you have:");
                    String pets = sc.next().trim().toLowerCase();

                    InputStream nameIn = new ByteArrayInputStream(name.getBytes());
                    InputStream petsIn = new ByteArrayInputStream(pets.getBytes());

                    byte[] dataName = nameIn.readAllBytes();
                    String nameString = new String(dataName);

                    byte[] dataPets = petsIn.readAllBytes();
                    String petsString = new String(dataPets);

                    petsName.put(nameString,petsString);
                    fileOut.println(petsName);
                } catch (IOException e) {
                    System.out.println("Error: "+ e.getMessage());
                }
                continue;
            } if (option == 2 ){
                break;
            } else {
                break;
            }
        } while ( option == 1);
    }
}
