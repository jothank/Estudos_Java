import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.stream()
                .map(n -> n.doubleValue())
                .forEach(System.out::println);

        BigDecimal dois = new BigDecimal(2);

        list.stream()
                .map(BigDecimal::new)
                .map(b -> dois.multiply(b))
                .map(b -> b.doubleValue())
                .forEach(System.out::println);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list1.replaceAll(n -> n * 2);
        list1.forEach(System.out::println);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, " OI");
        map.put(1, " HELLO");
        map.put(2, " HI");
        map.put(3, " OLA");

        map.forEach((k, v) -> System.out.println(k + v));

        map.compute(1, (k, v) -> v + " E AI!");
        map.forEach((k, v) -> System.out.println(k + v));

        map.merge(3, "!", (v1, v2) -> v1 + v2);
        map.forEach((k, v) -> System.out.println(k + v));

        map.replaceAll((k, v) -> v + "!");
        map.forEach((k, v) -> System.out.println(k + v));

    }
}