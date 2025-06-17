import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] name = {"홍성현", "김백기", "강윤정", "고종우"};

//        Arrays.stream(name).forEach(n -> System.out.println(n));

        Arrays.stream(name).forEach(System.out::println);
    }
}