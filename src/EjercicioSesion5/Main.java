package EjercicioSesion5;

import EjercicioSesion5.clases.Coche;
import EjercicioSesion5.clases.CocheCRUDImpl;

public class Main {
    public static void main(String[] args) {

        CocheCRUDImpl cocheImpl = new CocheCRUDImpl();

        // Creando varios Coches haciendo llamado a la clase Coche

        Coche coche1 = new Coche("Negro","BMW","6",2888.99,15.69);
        Coche coche2 = new Coche("Azul","Audi","4a",2888.99,15.69);
        Coche coche3 = new Coche("Rojo","Renault","6T",2888.99,15.69);
        Coche coche4 = new Coche("Verde","peugeot","8B",2888.99,15.69);

        //Agregando coches desde la clase CocheImpl

        cocheImpl.save(coche1);
        cocheImpl.save(coche2);
        cocheImpl.save(coche3);
        cocheImpl.save(coche4);

        System.out.println(cocheImpl);

        // imprimir el nombre del metodo - (save)

        cocheImpl.save();

        // imprimir todos los coches

        System.out.println(cocheImpl.finAll());

        // imprimir nombre del metodo delete

        cocheImpl.delete();



    }
}
