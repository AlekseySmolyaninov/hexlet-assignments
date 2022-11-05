package exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> bookList, Map<String, String> searchParams) {
        List<Map<String, String>> list = new ArrayList<>();
        String newParams = null;

        for (Map<String, String> book : bookList) {
            boolean isSame = false;
            for (Entry<String, String> param : searchParams.entrySet()) {
                if (book.containsKey(param.getKey()) && book.get(param.getKey()).equals(param.getValue())) {
                    isSame = true;
                }
            }
                if (isSame) {
                    list.add(book);
                }
            } return list;
    }
}



//END
