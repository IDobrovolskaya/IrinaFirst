import java.util.Scanner;
/**
 * This is my second Calculator.
 * @author Irina Dobrovolskaya
 */
public class Calculate_Irina {
    public static void main(String[] args) {
        /* Just printing of text "Для вычисления дробных чисел введите первое число, затем второе число"*/
        System.out.println("Сложение дробных чисел!");
        Scanner scanner = new Scanner(System.in);
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
        scanner.close();}
    }
