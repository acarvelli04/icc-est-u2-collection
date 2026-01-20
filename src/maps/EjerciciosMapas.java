package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EjerciciosMapas {

    public Map<Integer, Integer> contarDuplicados(List<Integer> list) {
        Map<Integer, Integer> conteo = new HashMap<>();
        
        for (Integer num : list) {
            conteo.put(num, conteo.getOrDefault(num, 0) + 1);
        }

        /** Forma alternativa sin usar getOrDefault 
        if (conteo.containsKey(num))    {
            int current = conteo.get(num);
            conteo.put(num, current + 1);
        } else {
            conteo.put(num, 1);
        }
        */

        return conteo;
        
    }

    public int noHayDuplicados(List<Integer> list2) {
        Map<Integer, Integer> conteo = new HashMap<>();
        
        for (Integer num : list2) {
            conteo.put(num, conteo.getOrDefault(num, 0) + 1);
        }

        for (Integer num : list2) {
            if (conteo.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }

    public void maximoPorCarrera(Map<String, Integer> datos) {
        Map<String, Integer> maxPorCarrera = new HashMap<>();

        for (String key : datos.keySet()) {
        String carrera = key.split("-")[0];
        int nota = datos.get(key);
        if (!maxPorCarrera.containsKey(carrera) 
                || nota > maxPorCarrera.get(carrera)) {
            maxPorCarrera.put(carrera, nota);
        }
    }

    for (String carrera : maxPorCarrera.keySet()) {
        System.out.println(carrera + " -> " + maxPorCarrera.get(carrera));
    }

    }

    public List<String> ranking(List<String[]> entradas) {

    Map<String, Integer> mejoresPuntajes = new HashMap<>();

    for (String[] entrada : entradas) {
        String nombre = entrada[0];
        int puntaje = Integer.parseInt(entrada[1]);//para comparar

        
        if (!mejoresPuntajes.containsKey(nombre) ||
            puntaje > mejoresPuntajes.get(nombre)) {
            mejoresPuntajes.put(nombre, puntaje);
        }
    }

    
    List<Map.Entry<String, Integer>> lista =
            new ArrayList<>(mejoresPuntajes.entrySet());

    
    lista.sort((a, b) -> b.getValue() - a.getValue());

    
    List<String> resultado = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : lista) {
        resultado.add(entry.getKey() + " - " + entry.getValue());
    }

    return resultado;
    }

    
}
