public class armstrongNUm_method {
    public static boolean isArmstrong(int num) {
        int sum = 0;
        int temp = num;
        for (int i = 0; num > 0; i++) {
            int d = num % 10;
            sum += d * d * d;
            num = num / 10;
        }
        return sum == temp;
    }

    public static void main(String[] args) {
        int num = 153;
        {
            System.out.println(isArmstrong(num));

        }
    }
}
