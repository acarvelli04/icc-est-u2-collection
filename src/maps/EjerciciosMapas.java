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
        return conteo;
    }
    
}
