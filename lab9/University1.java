class University1 {

    static int studentCount = 0;

    University1() {
        studentCount++;
    }

    public static void main(String[] args) {
        new University1();
        new University1();
        new University1();

        System.out.println("Total students: " + studentCount);
    }
}
