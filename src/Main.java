import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> wordsList = new ArrayList<>();

        boolean isEnd = false;
        Scanner scanner = new Scanner(System.in);
        while (!isEnd) {
            System.out.print("Enter a next word: ");
            String word = scanner.nextLine();
            if (!word.equals("end")) {
                wordsList.add(word);
            } else {
                isEnd = true;
                System.out.println("Your words: ");
                wordsList.forEach(System.out::println);
                System.out.println("Goodbye! \n");
            }
        }


        Cat[] catsArray = new Cat[10];

        catsArray[0] = new Cat("Барсик", "рыжий");
        catsArray[1] = new Cat("Мурзик", "черный");
        catsArray[2] = new Cat("Рыжик", "рыжий");
        catsArray[3] = new Cat("Мурка", "черная");
        catsArray[4] = new Cat("Васька", "белый");
        catsArray[5] = new Cat("Томасина", "серый");
        catsArray[6] = new Cat("Кристина", "рыжая");
        catsArray[7] = new Cat("Пушок", "белый");
        catsArray[8] = new Cat("Дымка", "серый");
        catsArray[9] = new Cat("Кузя", "черный");


        Map<String, String> cats = new HashMap<>();
        Arrays.stream(catsArray).forEach(cat -> cats.put(cat.getName(), cat.getColor()));

        Set<String> keySet = cats.keySet();
        for (String key : keySet) {
            System.out.printf("key - %s \n", key);
        }
        System.out.println("_______________");
        cats.forEach((key, value) -> System.out.printf("key - %s, value - %s\n", key, value));
    }
}