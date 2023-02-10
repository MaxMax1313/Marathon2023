package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    double physDef;
    double magicDef;
    int physAtt;
    int magicAtt;

    public Magician(double physDef, double magicDef, int physAtt, int magicAtt) {
        this.physDef = 0;
        this.magicDef = 0.8;
        this.physAtt = 5;
        this.magicAtt = 20;
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.health-=magicAtt;

    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.health-=physAtt;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                ", health=" + health +
                '}';
    }
}
