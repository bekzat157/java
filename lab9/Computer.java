class Computer {

    class Processor {
        double frequency = 2.7;

        void show() {
            System.out.println("Частота процессора: " + frequency + " GHz");
        }
    }

    public static void main(String[] args) {
        Computer c = new Computer();
        Computer.Processor p = c.new Processor();
        p.show();
    }
}
