package EjercicioSesion5.interfaces;

import EjercicioSesion5.clases.Coche;

import java.util.ArrayList;
import java.util.List;

public interface CocheCRUD {

    void save(Coche coche);

    List<Coche> finAll();

    void delete();
}
