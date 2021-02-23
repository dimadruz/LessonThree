import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Random random = new Random();
            int a = random.nextInt(10);
            int b = 10;
            int d = 0;
            int c;
            System.out.println("Угадайте число от 0 до 9");
            for (int i = 0; i < 3; i++) {
                if (scanner.hasNextInt()) {
                    b = scanner.nextInt();
                    d++;
                } else {
                    scanner.nextLine();
                    continue;
                }
                if (b == a) {
                    System.out.println("Вы угадали!Повторить игру? 1 -да / 0 - нет");
                  continue;
                }
                if (b < a) {
                    System.out.println("Число больше");
                }
                if (b > a) {
                    System.out.println("Число меньше");
                } if (d == 3 ){
                    System.out.println( "Вы проиграли!Повторить игру? 1 - да / 0 - нет");
                }

            }
        while (true){
            if (scanner.hasNextInt()){
            c = scanner.nextInt();
            }else {
                scanner.nextLine();
                continue;
            }

            if ( c !=1 && c!=0){
                continue;
            }else{
                break;
            }
            }if ( c == 0){
                break;
        }
        }
    }
}









