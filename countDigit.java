package loops;

public class countDigit {
    public static void main(String[] args) {
        int num = 15154;
        int count = 0;
        int sum = 0;
        System.out.println("num:" + num);
        while (num != 0) {
            int d = num % 10;
            sum = sum + d;
            count++;
            num = num / 10;
        }
        System.out.println("sum:" + sum);
        System.out.println("count:" + count);
        System.out.println("num:" + num);
    }

}
