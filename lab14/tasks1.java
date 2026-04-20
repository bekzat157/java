import java.util.Scanner;
public class tasks1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("N енгізіңіз: ");
            int n = sc.nextInt();

            int sum = 0, i = 1;

            do {
                sum += i;
                i++;
            } while (i <= n);

            System.out.println("Қосынды: " + sum);
        }
    }

