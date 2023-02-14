package day12.task5;

public class Artists {
    String name;
    int age;

    public Artists(String name, int i) {
        this.name=name;
        this.age = i;
    }

    @Override
    public String toString() {
        return "Artists{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
