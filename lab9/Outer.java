class Outer {

    class Inner {
        void show() {
            System.out.println("Привет от внутренного класса");
        }
    }

    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner inner = obj.new Inner();
        inner.show();
    }
}
