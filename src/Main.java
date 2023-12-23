import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Predicate<String> predicate = element -> element.startsWith("t");

        Stream<String> names = Stream.of("tuuuuuc ", "tgc ", "prenses ", "tatli ", "cilgin ");
        names.filter(predicate).forEach(System.out::print);

    }
}