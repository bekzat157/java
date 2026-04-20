import java.util.Scanner;
public class tasks9 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String pass;

            do {
                System.out.print("Пароль енгізіңіз (кемінде 6 символ): ");
                pass = sc.nextLine();
            } while (pass.length() < 6);

            System.out.println("Пароль қабылданды!");
        }
    }

