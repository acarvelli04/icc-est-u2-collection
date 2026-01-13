package Controlleres;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import models.Maquina;

public class MaquinasController {
    

    public Set<Maquina> ordenarPorSubred(List<Maquina> maquinas){
        Set<Maquina> maquinas0 = new TreeSet<>();

        for (Maquina maquina : maquinas) {
            maquinas0.add(maquina);
        }

        return maquinas0;//temporal
        
    }
}
