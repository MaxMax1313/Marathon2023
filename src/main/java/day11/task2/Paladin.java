package day11.task2;

public class Paladin extends Hero implements Healer{
    static final int MAX_HEALTH =100;

    public Paladin() {
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }

    @Override
    public void healHimself() {
        if(health + 25 >MAX_HEALTH){
            health=MAX_HEALTH;
        }
        else {
            health+=25;
        }

    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.health + 10 > MAX_HEALTH){
            hero.health=MAX_HEALTH;
        }
        else {
            hero.health+=10;
        }

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
