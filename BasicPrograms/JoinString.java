import java.util.Arrays;

public class JoinString {
    public static void main(String[] args) {
        String[] strings = {"a", "b", "c", "d", "e"};
        // |a|b|c|d|e , the initial | join is not what we want
        String reduce = Arrays.stream(strings).reduce("", (a, b) -> a + "|" + b);
        // a|b|c|d|e, filter the initial "" empty string
        String reduce2 = Arrays.stream(strings).reduce("", (a, b) -> {
            if (!"".equals(a)) {
                return a + "|" + b;
            } else {
                return b;
            }
        });
        // a|b|c|d|e , better uses the Java 8 String.join :)
        String join = String.join("|", strings);

        System.out.println(reduce + reduce2+join);
    }
    
}
