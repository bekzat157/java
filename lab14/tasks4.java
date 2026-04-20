import java.util.Scanner;
public class tasks4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Сан енгізіңіз: ");
            int san = sc.nextInt();

            int max = 0;

            do {
                int d1 = san % 10;
                if (d1 > max) {
                    max = d1;
                }
                san /= 10;
            } while (san > 0);

            System.out.println("Ең үлкен цифр: " + max);
        }
    }
