import java.util.Scanner;
public class tasks8 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int san, sum = 0;

            do {
                System.out.print("Сан енгізіңіз (0 тоқтатады): ");
                san = sc.nextInt();
                sum += san;
            } while (san != 0);

            System.out.println("Қосынды: " + sum);
        }
    }

