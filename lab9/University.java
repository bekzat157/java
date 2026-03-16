class University {

    class Student {
        String name;
        String major;

        Student(String name, String major) {
            this.name = name;
            this.major = major;
        }

        void show() {
            System.out.println(name + " - " + major);
        }
    }

    public static void main(String[] args) {
        University u = new University();
        University.Student s = u.new Student("Bekzat", "Information Systems");

        s.show();
    }
}
