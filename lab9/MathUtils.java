class MathUtils {

    static int square(int n) {
        return n * n;
    }

    static int cube(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {
        System.out.println(MathUtils.square(8));
        System.out.println(MathUtils.cube(12));
    }
}
