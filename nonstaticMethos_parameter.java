public class nonstaticMethos_parameter {
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        nonstaticMethos_parameter a = new nonstaticMethos_parameter();
        int result = a.add(3, 5);
        System.out.println(result);
    }

}
