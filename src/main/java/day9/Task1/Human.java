package day9.Task1;

public class Human {

    private final String name;

    Human(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public void printInfo(){
        System.out.println("Этот человек с именем " + name);

    }
}

class Student extends Human{

    private String groupName;
    Student(String name, String groupName) {
        super(name);
        this.groupName=groupName;
    }

    public String getGroupName() {
        return groupName;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Этот студент с именем " + getName());

    }
}

class Teacher extends Human{

    private String subjectName;
    Teacher(String name, String subjectName){
        super(name);
        this.subjectName=subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getName());

    }

}