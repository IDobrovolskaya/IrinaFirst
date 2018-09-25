import java.util.Scanner;

public class Calculate_Irina {
    public static void main(String[] args) {
        /* Just printing of text "Для сложения дробных чисел введите первое число, затем второе число"*/
        System.out.println("Сложение дробных чисел!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число!");
        float f1 = scanner.nextFloat();
        System.out.println("Введите второе число!");
        float f2 = scanner.nextFloat();
        System.out.printf("Сумма чисел равна %.4f", f1 + f2);
        System.exit(0);
    }
}
