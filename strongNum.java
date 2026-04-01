
public class strongNum {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = 145;
        int temp = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num = num / 10;
        }

        if (sum == temp) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }
}