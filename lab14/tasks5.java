import java.util.Scanner;
public class tasks5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Сан енгізіңіз: ");
            int san = sc.nextInt();

            int or = san;
            int rev = 0;

            do {
                rev = rev * 10 + san % 10;
                san /= 10;
            } while (san > 0);

            if (or == rev)
                System.out.println("Палиндром");
            else
                System.out.println("Палиндром емес");
        }
    }

