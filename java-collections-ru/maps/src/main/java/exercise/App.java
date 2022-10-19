package exercise;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentense) {


        String[] words = sentense.split(" ");

        Map<String, Integer> map = new HashMap<>();


        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.equals("")) {
                return map;
            }
            if (!map.containsKey(word)) {
                map.put(word, 0);
            }
            map.put(word, map.get(word) + 1);
        }

//        System.out.println(map);
        return map;
    }

    public static String toString(Map<String, Integer> map) {
        if (map.isEmpty()) {
            return "{}";
        }
        StringBuilder mapAsString = new StringBuilder("{\n");
        for (String key : map.keySet()) {
            mapAsString.append("  " + key + ": " + map.get(key) + "\n");
        }
        String result = mapAsString.toString();
        String result1 = result.substring(0, result.length() - 1);
        return result1 + "\n}";

    }
}

//END



