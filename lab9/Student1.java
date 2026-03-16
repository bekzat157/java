class Student1 {
        String name;
        static String university = "Almaty Technological University";

        Student1(String name) {
            this.name = name;
        }

        void show() {
            System.out.println(name + " studies at " + university);
        }

        public static void main(String[] args) {
            Student1 s1 = new Student1("Bekzat");
            Student1 s2 = new Student1("Karakoz");

            s1.show();
            s2.show();
        }
    }
