package main;

import model.Student;
import service.StudentService;

    public class Main {
        public static void main(String[] args) {

            //8  Объектінің құрылуы
            Student s1 = new Student("Қаракөз", 18, "Дизайнер");
            Student s2 = new Student("Бекзат", 19, "Финансы и основы экономика");
            Student s3 = new Student(); // әдепкі конструктор

            //4 Бір-бірінен тәуелсіз объектілер
            s1.showInfo();
            s2.showInfo();
            s3.showInfo();

           //5 Әдіс арқылы объектіні өзгерту
            s3.changeMajor("Математика");
            s3.showInfo();

            //7 Класстардың өзара әрекеті
            StudentService service = new StudentService();
            service.printStudent(s1);
            //8 Бағдарлама аяқталған соң объектілер жойылады
        }
    }


