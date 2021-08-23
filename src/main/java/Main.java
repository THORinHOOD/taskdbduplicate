import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        System.out.println(countDuplicate(5, List.of(1, 2, 5, 3, 5, 5, 3, 2, 1, 5)));
    }


    public static <T> int countDuplicate(T value, List<T> list) {
        return Collections.frequency(list, value);
    }
}
