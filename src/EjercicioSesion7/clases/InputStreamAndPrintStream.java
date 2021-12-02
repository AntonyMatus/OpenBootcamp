package EjercicioSesion7.clases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class InputStreamAndPrintStream {

    public InputStreamAndPrintStream(){}

    public InputStreamAndPrintStream(InputStream in, PrintStream out) throws FileNotFoundException, IOException {
        byte []datos = new byte[20];
        datos = in.readAllBytes();
        out.write(datos);


    }
}
