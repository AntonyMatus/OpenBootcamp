package EjercicioSesion4.clases;

import EjercicioSesion4.SmartDivice;

public class SmartPhone extends SmartDivice {

    //1. atributos
    public String SO;
    public String conectividad;
    //2. constructor

    public SmartPhone (){}

    public SmartPhone(String marca, String modelo,  int precio, boolean wifi, String SO, String conectividad) {
        super(marca, modelo, precio, wifi);
        this.SO = SO;
        this.conectividad = conectividad;
    }
}
