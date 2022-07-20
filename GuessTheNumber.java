import java.util.Scanner;
public class GuessTheNumber {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача угадать число ");
        int range = 10;
        int number = (int) (Math.random()*range);
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int imput_number = scanner.nextInt();
            if (imput_number == number) {
                System.out.println("Вы угадали!");
                break;
            } else if (imput_number > number) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
        scanner.close();
    }
}
