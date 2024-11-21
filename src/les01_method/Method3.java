package les01_method;

public class Method3 {
    public static void main(String[] args) {
        signIn("Петя");
        signIn("Вася");
    }

    public static void signIn(String name) {
        if (name.equals("Вася")) {
            System.out.println("Вход запрещен");
            return; // прерывает работу метода (до 12 строчки программа не доходит)

        }
        System.out.println("Добро пожаловать " + name);
    }
}
