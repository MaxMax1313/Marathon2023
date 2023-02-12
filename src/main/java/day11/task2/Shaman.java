package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack {
    static final int MAX_HEALTH =100;
    public Shaman() {
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
        magicAtt = 15;
    }

    @Override
    public void healHimself() {
        if(health + 50 >MAX_HEALTH){
            health=MAX_HEALTH;
        }
        else {
            health+=50;
        }


    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.health + 30 > MAX_HEALTH){
            hero.health=MAX_HEALTH;
        }
        else {
            hero.health+=30;
        }

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
        return "Shaman{" +
                "physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                ", health=" + health +
                '}';
    }
}
