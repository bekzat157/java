class Course {

    String courseName = "Java Programming";

    class Student {
        String name;

        Student(String name) {
            this.name = name;
        }

        void show() {
            System.out.println(name + " studies " + courseName);
        }
    }

    public static void main(String[] args) {
        Course c = new Course();
        Course.Student s = c.new Student("Bekzat");

        s.show();
    }
}
