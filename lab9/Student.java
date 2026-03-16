class Student {
    String name;
    int age;
    static int count = 0;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;

    }

    public static void main(String[] args) {
        new Student("Bekzat", 19);
        new Student("Karakoz", 18);
        new Student("Arsen", 18);

        System.out.println("Студенттер саны: " + Student.count);


    }
}
