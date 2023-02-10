package day11.task2;

public class Task2 {
    public static void main(String[] args) {

        Paladin paladin = new Paladin();
        Warrior warrior = new Warrior();
        System.out.println(paladin);

        paladin.healHimself();
        System.out.println(paladin);
        paladin.healTeammate(warrior);

        System.out.println(warrior);

    }
}
