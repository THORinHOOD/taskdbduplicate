import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Main {


    public static void main(String[] args) {
//        System.out.println(countDuplicate(5, List.of(1, 2, 5, 3, 5, 5, 3, 2, 1, 5)));
//        System.out.println(countDuplicate("Chuck", List.of("Chuck", "lol", "kek", "Chuck")));
        forEachWithDelay(List.of(1, 4, 1, 4, 5, 2), 1000, System.out::println);
    }


    public static <T> int countDuplicate(T value, List<T> list) {
        return Collections.frequency(list, value);
    }

    public static <T> void forEachWithDelay(List<T> list, int delay, Consumer<T> consumer) {
        list.forEach(element -> {
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            consumer.accept(element);
        });
    }

}
