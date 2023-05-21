public class Main {
    public static void main(String[] args) {
        int a = 1000;
        int b = 5000;

        if (b > 1000) {
            System.out.println((b-1000) * 1.0 / 100);
        } else {
            System.out.println("сумма пополнения меньше тысячи");
        }
    }
}