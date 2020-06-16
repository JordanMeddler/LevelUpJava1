package Tasks.LessonEight;

import java.util.*;

public class Frequent {
    public static void main(String[] args) {
//        Раскомментировать секцию scanner если очень хочется ввести строку с консоли :)
//        Scanner sc = new Scanner(System.in);
//        String string = sc.nextLine();

        String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                "ut labore et dolore dolore dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco " +
                "laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in " +
                "voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat " +
                "non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";

//        Мы не проговаривали какие именно символы мы будем удалять из строки, остановлюсь на этих
//        Изначально обернул каждый replace в if, но потом подумал что смысла в моем случае в нем не так уж и много
        string = string.replace("!", "");
        string = string.replace(",", "");
        string = string.replace("?", "");
        string = string.replace(":", "");
        string = string.replace(".", "");

        string = string.toLowerCase();
        String[] words = string.split(" ");

        HashMap<String, Integer> wordsOccurences = new HashMap<>();

        for (String s : words) {
            int counter = 0;
            for (String word : words) {
                if (s.equals(word)) {
                    counter++;
                }
            }
            wordsOccurences.put(s, counter);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordsOccurences.entrySet());
        list.sort(Map.Entry.comparingByValue());

        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list){
            result.put(entry.getKey(), entry.getValue());
        }

        for (int i = 0; i < 10; i++) {

        }
    }

}
