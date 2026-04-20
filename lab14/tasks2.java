import java.util.Scanner;
public class tasks2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Сан енгізіңіз: ");
            int san = sc.nextInt();

            int count = 0;

            do {
                count++;
                san /= 10;
            } while (san != 0);

            System.out.println("Цифр саны: " + count);
        }
    }

