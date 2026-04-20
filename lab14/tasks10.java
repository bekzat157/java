import java.util.Scanner;
public class tasks10 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int san;
            int min = Integer.MAX_VALUE;

            do {
                System.out.print("Сан енгізіңіз (0 тоқтатады): ");
                san = sc.nextInt();

                if (san != 0 && san < min) {
                    min = san;
                }
            } while (san != 0);

            System.out.println("Ең кіші сан: " + min);
        }
    }

