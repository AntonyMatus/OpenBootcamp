package EjercicioSesion5.clases;

import EjercicioSesion5.interfaces.CocheCRUD;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    List<Coche> coches = new ArrayList<>();

    public CocheCRUDImpl(){}

    public CocheCRUDImpl(List<Coche> coches) {
        this.coches = coches;
    }

    public void save(){
        System.out.println("save");
    }
    @Override
    public void save( Coche coche) {
        coches.add(coche);
    }

    @Override
    public List<Coche> finAll() {
        return coches;
    }



    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "coches=" + coches +
                '}';
    }
}
