import java.util.Scanner;

/**
 * This is my max element.
 * // * @author Irina Dobrovolskaya
 */
public class HomeWork_3_max_element {
    public static void main(String[] args) {
        /* Just printing of text "Массив слов"*/
        System.out.println("Сколько слов вы хотите ввести?");
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        System.out.println("Введите слова!");
        String[] array = new String[x1];
        for (int i = 0; i < array.length; i++) {
            String w = scanner.next();
            array[i] = w;
            System.out.println(array[i]);
        }
        String max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > max.length())
                max = array[i];
        }
        System.out.println(" Самое длинное слово " + max);

        scanner.close();

    }
}