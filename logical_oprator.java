public class logical_oprator {
    public static void main(String[] args) {

        String color = "Black";
        int size = 11;

        String s1 = "White";
        int s1_size = 11;

        String s2 = "Black";
        int s2_size = 10;

        String s3 = "Black";
        int s3_size = 11;

        String s4 = "White";
        int s4_size = 12;

        boolean res = color == s1 && size == s1_size;
        System.out.println(res);

        String res2 = !(s3 == color || s3_size == size) ? "Buy" : "dont by";

        System.out.println(res2);

    }

}