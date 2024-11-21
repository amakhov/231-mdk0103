package les01_method;

public class Class {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("... ");
        for (int i = 0; i < 101; i++) {
            Thread.sleep(1000);
            System.out.print("\r... " + i + "%");
        }
    }
}
