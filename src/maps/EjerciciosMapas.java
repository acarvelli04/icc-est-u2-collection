package maps;

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
    
}
