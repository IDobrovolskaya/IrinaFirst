package Calculate_OOP;
import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.util.Scanner;
public class Calculate_OOP {
    private float f1;
    private float f2;
    private Calculate_Operation calculate_operation;

    public Calculate_OOP(float f1, float f2, Calculate_Operation calculate_operation) {
        this.f1 = f1;
        this.f2 = f2;
        this.calculate_operation = calculate_operation;
    }

    public float result (){
        return calculate_operation.Vicheslenie(f1, f2);
    }

    public static void main(String[] args) {
        System.out.println("Запуск калькулятора!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число!");
        float f1 = scanner.nextFloat();
        System.out.println("Введите второе число!");
        float f2 = scanner.nextFloat();
        System.out.println("Выберите операцию: Вычитание(-) или Сложение (+)");
        String operation = scanner.next();
        Calculate_Operation calculate_operation = null;
        if (operation.equals("+"))
            calculate_operation = new Calculator_Addition();
        else if (operation.equals("-"))
            calculate_operation = new Calculator_Sabsrtation();

        if (calculate_operation == null) {
            System.out.println("Вы не выбрали операцию");
            return;
        }
        Calculate_OOP calculate = new Calculate_OOP(f1, f2, calculate_operation);
        float r = calculate.result();
        System.out.println("Результат вычисления равен " + r );
    }

}
