public class perfectNum_method {
    static boolean isnumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int num = 28;
        {
            System.out.println(isnumber(num));
        }
    }
}
