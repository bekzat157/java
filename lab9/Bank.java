class Bank {

    static double interestRate = 0.1;

    static double calculateInterest(double amount) {
        return amount * interestRate;
    }

    public static void main(String[] args) {
        System.out.println("Interest: " + Bank.calculateInterest(1000));
    }
}
