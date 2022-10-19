package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String symbols, String word) {

        String[] symbolForWord = symbols.split("");
        List<String> list = new ArrayList<>();
        for (var i = 0; i < symbolForWord.length; i++) {
            list.add(symbolForWord[i]);
        }
            for (var j = 0; j < word.length(); j ++) {
                var word1 = word.toLowerCase().substring(j, j + 1);
                if (list.contains(word1)) {
                    list.remove(word1);
                } else {
                    return false;
        }
        } return true;
        }
    }


//END

