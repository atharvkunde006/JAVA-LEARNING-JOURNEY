public class armstrongNum {
    public static void main(String[] args) {
        int num = 153;
        int sum = 0;
        for (int i = 0; num > 0; i++) {
            int d = num % 10;
            sum += d * d * d;
            num = num / 10;
        }
        if (sum == 153) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not armstrong number");
        }
    }

}
