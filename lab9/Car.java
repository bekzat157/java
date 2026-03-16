class Car {

    class Engine {
        int power = 150;

        void show() {
            System.out.println("Мощность двигателя: " + power + " HP");
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        Car.Engine engine = car.new Engine();
        engine.show();
    }
}
