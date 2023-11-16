package StriversDSA.datastructures;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map aMap = new HashMap();
        aMap.put(100,"ABC");
        aMap.put(200,"BCD");
        aMap.put(300,"CDE");
        aMap.put(300,"DEF");
        aMap.put(null,null);
        aMap.put(null,null);
        System.out.println(aMap);
    }
}
