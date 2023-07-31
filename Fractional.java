import java.util.*;

class FractionalOperations {
    private int x, y;

    FractionalOperations() {
        super();
    }

    FractionalOperations(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int FindGcd() {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public void addition(int n1, int n2, int d1, int d2) {
        int res = d1 * d2;
        n1 *= d2;
        n2 *= d1;
        int sum = n1 + n2;

        FractionalOperations operations = new FractionalOperations(res, sum);
        sum /= operations.FindGcd();
        res /= operations.FindGcd();
        System.out.println("Addition: " + sum + "/" + res);
    }

    public void subtraction(int n1, int n2, int d1, int d2) {
        int res = d1 * d2;
        n1 *= d2;
        n2 *= d1;
        int sub = n1 - n2;
        FractionalOperations operations = new FractionalOperations(res, sub);
        sub /= operations.FindGcd();
        res /= operations.FindGcd();

        if (sub == 0) {
            System.out.println("Subtraction: 0");
        } else {
            System.out.println("Subtraction: " + sub + "/" + res);
        }
    }

    public void multiplication(int n1, int n2, int d1, int d2) {
        int res = d1 * d2;
        int mul = n1 * n2;
        FractionalOperations operations = new FractionalOperations(res, mul);
        mul /= operations.FindGcd();
        res /= operations.FindGcd();

        if (mul == 0) {
            System.out.println("Multiplication: 0");
        } else {
            System.out.println("Multiplication: " + mul + "/" + res);
        }
    }

    public void division(int n1, int n2, int d1, int d2) {
        int mul1 = n1 * d2;
        int mul2 = n2 * d1;
        FractionalOperations operations = new FractionalOperations(mul1, mul2);
        mul1 /= operations.FindGcd();
        mul2 /= operations.FindGcd();

        if (mul1 == 0) {
            System.out.println("Division: 0");
        } else {
            System.out.println("Division: " + mul1 + "/" + mul2);
        }
    }
}

public class Fractional {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter numerator1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter numerator2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter denominator1 : ");
        int d1 = sc.nextInt();
        System.out.print("Enter denominator2 : ");
        int d2 = sc.nextInt();

        FractionalOperations operations = new FractionalOperations();
        operations.addition(n1, n2, d1, d2);
        operations.subtraction(n1, n2, d1, d2);
        operations.multiplication(n1, n2, d1, d2);
        operations.division(n1, n2, d1, d2);

    }
}
