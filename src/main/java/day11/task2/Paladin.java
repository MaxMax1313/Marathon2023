package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {
    double physDef;
    double magicDef;
    int physAtt;



    public Paladin() {

        this.physDef = 0.5;
        this.magicDef = 0.2;
        this.physAtt = 15;

    }

    @Override
    public void healHimself() {
        health += 25;
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += 10;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.health-=15;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", health=" + health +
                '}';
    }
}
