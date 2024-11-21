package les01_method;

public class Solution {
    public static void main(String[] args) {
        printHello("Никита"); // вызов метода Hello (стр 13)
        printName("Никита", 3);

        printHello("Вася");
        printHello("Петя");
        printName("Помогите", 100);
    }

    public static void printHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void printName(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

}
