package EjercicioSesion7.clases;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListEjercise {

    public ArrayListEjercise(){}

    public ArrayListEjercise(ArrayList<String> animales){



        LinkedList<String> LinkedListAnimales = new LinkedList<>(animales);

        for (String animal : animales){
            System.out.println("Elemento de la lista es: "+ animal);
        }
        System.out.println("\n");
        for (String animal : LinkedListAnimales){
            System.out.println("Elemento del LinkedList es: "+ animal);
        }
    }

    public void ArrayListBucleFor(){

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            numeros.add(i+1);

            for (int j = 0; j < numeros.size(); j++){
                if (numeros.get(j) % 2 == 0)
                    numeros.remove(numeros.get(j));
            }

        for (Integer numero : numeros) System.out.println(numero + " ");

    }
}
