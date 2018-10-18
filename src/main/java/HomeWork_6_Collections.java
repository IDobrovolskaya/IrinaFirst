import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HomeWork_6_Collections {
    public static void main(String[] args) throws FileNotFoundException {

        /* Just printing of text "Есть входной файл с набором слов, написанных через пробел"*/
        Scanner scanner = new Scanner(new File("D:\\Projects\\IrinaFirst\\src\\main\\java\\File_Irina.txt"));
        scanner = scanner.useDelimiter("\\s+");
        final List<String> words = new ArrayList<String>();
        while (scanner.hasNext()) {
            String word = scanner.next();
            words.add(word);
        }
        System.out.println("Слова из файла:");
        System.out.println(words);
        scanner.close();

        //Сортировка слов в альфавитном порядке
        Collections.sort(words);
        System.out.println("\nОтсортированные слова:");
        System.out.println(words);


        /* "Вычислить, сколько раз каждое слово встречается в файле"*/
        Map<String, Integer> statistics = new HashMap<>();
        for (String word : words) {
            Integer count = statistics.get(word);
            if (count == null) {
                count = 0;
            }
            statistics.put(word, ++count);
        }
        System.out.println("\nСтатистика одинаковых слов:");
        System.out.println(statistics);

//       Слово с максимльным количетвом повторений
        String maxword = "";
        Integer maxcount = 0;
        for (String max : statistics.keySet()) {
            Integer count = statistics.get(max);
            if (count > maxcount) {
                maxcount = count;
                maxword = max;
            }
        }
        System.out.println("\nСлово с максимальным повторением:");
        System.out.println("Слово: " +"" + maxword +" Встречается " + maxcount + " раз (а)");
    }
}




