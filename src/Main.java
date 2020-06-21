import java.util.List;

public class Main {
    public static void main(String [] args) {

        List<Integer> myList = IntSequence.of(98, 23, 3, 99, 9, -11);
        System.out.println(myList);
        System.out.println("============================");
        IntSequence.constant(8);
    }
}
