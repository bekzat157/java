import java.util.Scanner;

public class Syzyqtyq {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Есеп нөмірін таңдаңыз (1-27): ");
        int n = scanner.nextInt();

        switch (n) {

            case 1: {
                double x = scanner.nextDouble();
                double f = Math.cbrt(Math.exp(2 * x))
                        - Math.abs(Math.sin(Math.PI * x / (x + 2.0 / 3)))
                        + 1.7;
                System.out.println(f);
                break;
            }

            case 2: {
                double x = scanner.nextDouble();
                double f = Math.log(Math.abs(x - 1.5))
                        + Math.pow(x, 4.0 / 5)
                        + Math.cbrt(Math.exp(3 * x)) + 4;
                System.out.println(f);
                break;
            }

            case 3: {
                double x = scanner.nextDouble();
                double f = Math.tan(5 * x / 3)
                        + Math.log(Math.abs(2 * x + 5)) + 1.8;
                System.out.println(f);
                break;
            }

            case 4: {
                double x = scanner.nextDouble();
                double f = Math.cos(5 * x)
                        + Math.sqrt(Math.PI + Math.abs(2 - x));
                System.out.println(f);
                break;
            }

            case 5: {
                double x = scanner.nextDouble();
                double f = Math.pow(x, 5)
                        + Math.log(Math.sqrt(Math.PI + Math.abs(5 - x)));
                System.out.println(f);
                break;
            }

            case 6: {
                double x = scanner.nextDouble();
                double f = Math.pow(x, 7)
                        + (int) x / 2
                        + (int) x % 5
                        + Math.exp(5 * x);
                System.out.println(f);
                break;
            }

            case 7: {
                double x = scanner.nextDouble();
                double f = (int) x % 6
                        + Math.pow(x, 3) * Math.log(Math.pow(x, 2));
                System.out.println(f);
                break;
            }

            case 8: {
                double x = scanner.nextDouble();
                double f = Math.pow(x, 3.0 / 5)
                        + 4
                        + Math.sin(Math.pow(x, 4))
                        + Math.tan(Math.pow(x, 3));
                System.out.println(f);
                break;
            }

            case 9: {
                double x = scanner.nextDouble();
                double f = Math.pow(Math.exp(3 * x) + 7, 1.0 / 4)
                        + Math.cos(Math.pow(x, 5))
                        + Math.log(Math.abs(3 * x + 7));
                System.out.println(f);
                break;
            }

            case 10: {
                double x = scanner.nextDouble();
                double f = Math.log(5 * x)
                        + Math.pow(x, 5) * Math.sin(Math.pow(x, 3))
                        + Math.tan(Math.pow(x, 4));
                System.out.println(f);
                break;
            }

            case 11: {
                double x = scanner.nextDouble();
                double f = Math.tan(Math.sin(Math.PI * x))
                        + Math.pow(x, 7)
                        + Math.cbrt(Math.exp(2 * x + 3));
                System.out.println(f);
                break;
            }

            case 12: {
                double x = scanner.nextDouble();
                double f = Math.log(Math.abs(5 * x + 3))
                        + Math.cos(Math.PI * x * x)
                        + Math.tan(Math.pow(x, 3));
                System.out.println(f);
                break;
            }

            case 13: {
                double x1 = scanner.nextDouble();
                double y1 = scanner.nextDouble();
                double x2 = scanner.nextDouble();
                double y2 = scanner.nextDouble();
                double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                System.out.println(d);
                break;
            }

            case 14: {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                System.out.println(Math.sqrt(a * a + b * b));
                System.out.println(a * b / 2);
                break;
            }

            case 15: {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                System.out.println(a + b);
                System.out.println(a - b);
                System.out.println(a * b);
                break;
            }

            case 16: {
                double a = scanner.nextDouble();
                System.out.println(Math.sqrt(3) * a * a / 4);
                break;
            }

            case 17: {
                double c = scanner.nextDouble();
                double a = scanner.nextDouble();
                double b = Math.sqrt(c * c - a * a);
                double r = (a + b - c) / 2;
                System.out.println(b);
                System.out.println(Math.PI * r * r);
                break;
            }

            case 18: {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double p = (a + b + c) / 2;
                double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(2 * s / a);
                System.out.println(0.5 * Math.sqrt(2 * b * b + 2 * c * c - a * a));
                System.out.println(Math.sqrt(b * c * ((b + c) * (b + c) - a * a)) / (b + c));
                break;
            }

            case 19: {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                System.out.println((a + b) / 2);
                System.out.println(Math.sqrt(Math.abs(a * b)));
                break;
            }

            case 20: {
                double t1 = scanner.nextDouble();
                double v1 = scanner.nextDouble();
                double t2 = scanner.nextDouble();
                double v2 = scanner.nextDouble();
                System.out.println((t1 * v1 + t2 * v2) / (v1 + v2));
                break;
            }

            case 21: {
                double r = scanner.nextDouble();
                int k = scanner.nextInt();
                System.out.println(2 * k * r * Math.sin(Math.PI / k));
                break;
            }

            case 22: {
                double r1 = scanner.nextDouble();
                double r2 = scanner.nextDouble();
                double r3 = scanner.nextDouble();
                System.out.println(1 / (1 / r1 + 1 / r2 + 1 / r3));
                break;
            }

            case 23: {
                double h = scanner.nextDouble();
                System.out.println(Math.sqrt(2 * 9.8 * h));
                break;
            }

            case 24: {
                double a = scanner.nextDouble();
                System.out.println(Math.pow(a, 3));
                System.out.println(6 * a * a);
                break;
            }

            case 25: {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                System.out.println((a + b) / 2);
                System.out.println(Math.sqrt(a * b));
                break;
            }

            case 26: {
                double x = scanner.nextDouble();
                double y = scanner.nextDouble();
                System.out.println((Math.abs(x) + Math.abs(y)) / (1 + Math.abs(x * y)));
                break;
            }

            case 27: {
                double r = scanner.nextDouble();
                System.out.println(Math.PI * r * r);
                break;
            }

            default:
                System.out.println("Қате нөмір терілген.");
        }
    }
}