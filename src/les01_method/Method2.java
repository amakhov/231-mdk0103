package les01_method;

public class Method2 {
    public static void main(String[] args) {
        sum(4,7);
        sum(8,6);
        sum(4,7, 33);
        sum(4,7, 33, 66);
    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void sum(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }
}
