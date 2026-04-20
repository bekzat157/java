import java.util.Random;
public class tasks7 {

        public static void main(String[] args) {
            Random rand = new Random();
            int san;

            do {
                san = rand.nextInt(10); // 0-9
                System.out.println(san);
            } while (san != 0);

            System.out.println("0 шықты, тоқтады.");
        }
    }

