package Calculate_OOP;

import java.util.Scanner;

public class Calculate_Division implements Calculate_Operation {
    public float Vicheslenie(float f1, float f2) {
        if (f2==0)
            throw new MyException("Деление на 0 запрещено");

        return f1 / f2;
    }
}
