package Calculate_OOP;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculateTests {

    @Test(expected = MyException.class)
    public void Calculate_DivisionZero() {
        float f1 = 1;
        float f2 = 0;
        new Calculate_OOP(f1, f2, new Calculate_Division()).result();
    }

    @Test
    public void Calculate_Sabsrtation() {
        float f1 = 5;
        float f2 = 2;
        float r = new Calculate_OOP(f1, f2, new Calculator_Sabsrtation()).result();
        assertEquals("Операция вычитания работает неверно", 3,0, r);
    }

    @Test
    public void Calculate_Division() {
        float f1 = 6;
        float f2 = 2;
        float r = new Calculate_OOP(f1, f2, new Calculate_Division()).result();
        assertEquals("Операция деления работает неверно", 3,0, r);
    }
    @Test
    public void Calculate_Multiplication() {
        float f1 = 2;
        float f2 = 2;
        float r = new Calculate_OOP(f1, f2, new Calculate_Multiplication()).result();
        assertEquals("Операция умножения работает неверно", 4,0, r);
    }

    @Test
    public void Calculate_Addition() {
        float f1 = 6;
        float f2 = 6;
        float r = new Calculate_OOP(f1, f2, new Calculator_Addition()).result();
        assertEquals("Операция сложения работает неверно", 12,0, r);
    }
}

