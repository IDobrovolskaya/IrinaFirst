import java.util.Random;
public class HomeWork_4_array {
    public static void main(String[] args) {
        Random w = new Random();
        int intArray[] = new int[20];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = w.nextInt(20) - 10;
            System.out.println(" Случайные значения массива " + intArray[i]);
        }
        int max = -11;
        int maxI = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > max && intArray[i]<0) {
                max = intArray[i];
                maxI = i;
            }
        }
        System.out.println(" Максимальное отрицательное значение массива " + max);

        int min = 11;
        int minI = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < min && intArray[i]>=0) {
                min = intArray[i];
                minI = i;
            }
        }
        System.out.println(" Минимальное положительное значение массива " + min);

               int r = intArray[minI];
        intArray[minI] = intArray[maxI];
        intArray[maxI] = r;

        System.out.println("Изменены местами максимальное и минимальное значения" );
        System.out.println(" Максимальное значение массива " + min);
        System.out.println(" Минимальное значение массива " + max);

    }
}