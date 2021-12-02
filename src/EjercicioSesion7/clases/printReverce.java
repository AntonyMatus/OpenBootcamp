package EjercicioSesion7.clases;

public class printReverce {

    public printReverce(){}

    public String Reverce(String cadena) {

        String textRevece = "";

        for (int i = cadena.length()-1; i >= 0; i--){
            textRevece = textRevece + " " + cadena.charAt(i);

        }
        System.out.println("La palabra al reves es: "+textRevece);
        return textRevece;
    }
}
