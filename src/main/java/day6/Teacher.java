package day6;

import java.util.Random;

public class Teacher {
    Teacher(String name, String lesson){
        this.name=name;
        this.lesson=lesson;
    }
    private String name;
    private String lesson;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    Random rnd = new Random();
    public void evaluate(Student s){

        int grade = rnd.nextInt(4)+2;
        String grade1 = "ОТЛИЧНО";
        if(grade==4){
            grade1="ХОРОШО";
        } else if (grade==3) {
            grade1="УДОВЛЕТВОРИТЕЛЬНО";
        } else if (grade==2) {
            grade1="НЕУДОВЛЕТВОРИТЕЛЬНО";

        }
        System.out.println("Преподаватель " + name +  " оценил студента с именем " + s.name +  " по предмету " + lesson +  " на оценку " + grade1 + ".");
    }

}
class Student{
    Student(String name){
        this.name=name;
    }
    String name;
}