package task2;

public class ZeroOrInfinity {
    public static void main(String[] args) {
        int n = 20; // максимальный  факториал без переполнения
        double u;
        // u = sumFactorial(n)/ factorial(n);
        u = (1 / factorial(n)) * sumFactorial(n);
        System.out.format("%.6f", u);

    }

    public static double factorial(int n) {
        long b = 1;
        for (int i = 1; i <= n; i++) {
            b *= i;
        }
        return b;
    }

    public static double sumFactorial(int n) {
        long b = 0;
        for (int i = 1; i <= n; i++) {
            b += factorial(i);
        }
        return b;
    }

}
