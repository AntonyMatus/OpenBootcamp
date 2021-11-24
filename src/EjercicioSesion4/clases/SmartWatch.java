package EjercicioSesion4.clases;

import EjercicioSesion4.SmartDivice;

public class SmartWatch  extends SmartDivice {

    //1. atributos
    public String tipoCorrea;
    public boolean simTelefonico;
    //2. constructor
    public SmartWatch(){}

    public SmartWatch(String marca, String modelo, int precio, boolean wifi, String tipoCorrea, boolean simTelefonico) {
        super(marca, modelo, precio, wifi);
        this.tipoCorrea = tipoCorrea;
        this.simTelefonico = simTelefonico;
    }


}
