package day11.task2;

public class Warrior extends Hero implements PhysAttack {


    double physDef;
    double magicDef;
    int physAtt;



    public Warrior() {
        ;
        this.physDef = 0.8;
        this.magicDef = 0;
        this.physAtt = 30;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                '}';
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.health-=physAtt;
    }
}
