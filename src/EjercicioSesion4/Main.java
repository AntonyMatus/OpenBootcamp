package EjercicioSesion4;

import EjercicioSesion4.clases.SmartPhone;
import EjercicioSesion4.clases.SmartWatch;

public class Main {

    public static void main(String[] args) {

        // Crear objetos de las 3 clases

        SmartDivice iphone = new SmartDivice("iphone","12 Pro Max",29999,true);
        SmartPhone xiaomi = new SmartPhone("Xiaomi","Redmi Note 8",8999,true,"MIUI 10.4 Android 9 Pie","5G");
        SmartWatch miWatch = new SmartWatch("Mi Watch","Lite 1.4",1079,true,"TPU",false);


        //imprimir la informarcion por consola de cada clase

        // Impresion clase Super SmartDivice
        System.out.println("Impresion clase Super SmartDivice:");
        System.out.println("La Marca es: "+ iphone.marca);
        System.out.println("El Modelo es: "+iphone.modelo);
        System.out.println("El Precio es: "+iphone.precio);
        System.out.println("Tiene conectividad Wifi: "+iphone.wifi);

        // Impresion de los valores de la clase hija SmartPhone
        System.out.println("Impresion de los valores de la clase hija SmartPhone:");
        System.out.println("La Marca es: "+xiaomi.marca);
        System.out.println("El Modelo es: "+xiaomi.modelo);
        System.out.println("El Precio es: "+xiaomi.precio);
        System.out.println("El Sistema Operativo es: "+xiaomi.SO);
        System.out.println("La conectividad es: "+xiaomi.conectividad);

        // Impresion de los valores de la clase hija SmartWatch
        System.out.println("Impresion de los valores de la clase hija SmartWatch: ");
        System.out.println("La Marca es: "+miWatch.marca);
        System.out.println("El Modelo es: "+miWatch.modelo);
        System.out.println("El Precio es: "+miWatch.precio);
        System.out.println("Tiene conectividad Wifi: "+miWatch.wifi);
        System.out.println("El tipo de Correa es: "+miWatch.tipoCorrea);
        System.out.println("Tiene ranura Sim Telefonica? :"+miWatch.simTelefonico);

    }
}
