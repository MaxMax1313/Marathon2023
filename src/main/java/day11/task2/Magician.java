package day11.task2;

public class Magician extends Hero implements MagicAttack {

    public Magician() {
        physDef = 0;
        magicDef = 0.8;
        physAtt = 5;
        magicAtt = 20;
    }

    @Override
    public void magicalAttack(Hero hero) {
        if(hero.health -  (magicAtt - magicAtt*hero.magicDef)<0) {
            hero.health=0;
        }
        else {
            hero.health -= magicAtt - magicAtt * hero.magicDef;
        }
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
