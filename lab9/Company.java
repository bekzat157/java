class Company {

    class Employee {
        String name;
        String position;


        Employee(String name, String position) {
            this.name = name;
            this.position = position;
        }

        void show() {
            System.out.println(name + " - " + position);
        }
    }

    public static void main(String[] args) {
        Company c = new Company();
        Company.Employee e = c.new Employee("Bekzat", "Administrator");

        e.show();
    }
}
