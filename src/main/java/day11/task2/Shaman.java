package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack {

    double physDef;
    double magicDef;
    int physAtt;
    int magicAtt;

    public Shaman(double physDef, double magicDef, int physAtt, int magicAtt) {
        this.physDef = 0.2;
        this.magicDef = 0.2;
        this.physAtt = 10;
        this.magicAtt = 15;
    }

    @Override
    public void healHimself() {
        health += 50;
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += 30;

    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.health -=magicAtt;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.health-=physAtt;

    }

    @Override
    public String toString() {
        return "Shaman{" +
                "physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                ", health=" + health +
                '}';
    }
}
