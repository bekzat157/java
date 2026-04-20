import java.util.Scanner;
public class tasks6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Сан енгізіңіз: ");
            int san = sc.nextInt();

            int count = 0;

            do {
                int d = san % 10;
                if (d % 2 == 0) {
                    count++;
                }
                san /= 10;
            } while (san > 0);

            System.out.println("Жұп цифрлар саны: " + count);
        }
    }

