package lesson4;

public class TriangleArea {
    public int triangleArea ( int a, int b, int c) throws MyException {
        if (a < 0 || b < 0 || c < 0) throw new MyException("Число < 0");
        if (a + b <= c || a + c <= b || b + c <= a) throw new MyException ("Треугольник не существует");
        int result = (a + b + c) / 2;
        return result;
    }
}
