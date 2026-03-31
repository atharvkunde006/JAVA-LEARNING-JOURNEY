
public class method_return {
    public static void main(String[] args) {
        System.out.println(square(5));
        System.out.println(squareroot(5));
    }

    static double square(double number) {
        return number * number;
    }

    static double squareroot(double number) {
        return number * number * number;
    }

}
