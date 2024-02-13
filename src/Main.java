import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        boolean isEnd = false;
        Scanner scanner = new Scanner(System.in);
        while (!isEnd) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();
            if (!word.equals("end")) {
                System.out.println("You entered: "+ word);
            } else {
                isEnd = true;
                System.out.println("Goodbye! \n");
            }
        }

        Map<String, String> cats = new HashMap<>();
        cats.put("Барсик", "рыжий");
        cats.put("Мурзик", "черный");
        cats.put("Рыжик", "рыжий");
        cats.put("Мурка", "черная");
        cats.put("Васька", "белый");
        cats.put("Томасина", "серый");
        cats.put("Кристина", "рыжая");
        cats.put("Пушок", "белый");
        cats.put("Дымка", "серый");
        cats.put("Кузя", "черный");

        Set<String> keySet = cats.keySet();
        for (String key : keySet) {
            System.out.printf("key - %s \n", key);
        }
        System.out.println("_______________");
        cats.forEach((key, value) -> System.out.printf("key - %s, value - %s\n", key, value));
    }
}