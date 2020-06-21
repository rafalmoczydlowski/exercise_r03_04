import java.util.ArrayList;
import java.util.List;

public class IntSequence {

    // statyczna metoda, która zwraca ciąg parametrów
    public static List<Integer> of (int... args) {
        if (args.length == 0) {
            return null;
        }
        List<Integer> myList = new ArrayList<>();
        for (int next : args) {
            myList.add(next);
        }
        return myList;
    }

    // statyczna metoda, która zwraca nieskończony ciąg parametru
    public static void constant (int n) {
        int number = n;
        for (int i = 0; number == n; i++) {
            number = n;
            System.out.println(number);
        }
    }
}
