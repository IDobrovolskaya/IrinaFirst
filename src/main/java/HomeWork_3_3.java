import java.util.Scanner;

/**
 * @author Irina Dobrovolskaya
 */
public class HomeWork_3_3 {
    public static void main(String[] args) {
        /* Just printing of text "Введите номер задачи - 1-запустится Калькулятор, 2- max массив"*/

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите номер задачи - 1-запустится Калькулятор, 2- max массив");
            int numberTask = scanner.nextInt();
        switch (numberTask) {
            case 1: {
                System.out.println("Сложение дробных чисел!");

                System.out.println("Введите первое число!");
                float f1 = scanner.nextFloat();
                System.out.println("Введите второе число!");
                float f2 = scanner.nextFloat();
                System.out.printf("Сумма чисел равна %.4f", f1 + f2);

                System.out.println("\n\nВычитание дробных чисел!");
                System.out.println("Введите первое число!");
                f1 = scanner.nextFloat();
                System.out.println("Введите второе число!");
                f2 = scanner.nextFloat();
                System.out.printf("Разность чисел равна %.4f", f1 - f2);

                System.out.println("\n\nУмножение дробных чисел!");
                System.out.println("Введите первое число!");
                float d1 = scanner.nextFloat();
                System.out.println("Введите второе число!");
                float d2 = scanner.nextFloat();
                System.out.printf("Произведение чисел равна %.4f", d1 * d2);

                System.out.println("\n\nДеление дробных чисел!");
                System.out.println("Введите первое число!");
                f1 = scanner.nextFloat();
                System.out.println("Введите второе число!");
                f2 = scanner.nextFloat();
                System.out.printf("Частное чисел равно %.4f", f1 / f2);
                scanner.close();
            }
            break;
            case 2: {
                /* Just printing of text "Массив слов"*/
                System.out.println("Сколько слов вы хотите ввести?");

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


    }
}