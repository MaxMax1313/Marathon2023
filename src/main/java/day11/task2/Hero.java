package day11.task2;

public abstract class Hero implements PhysAttack{

   public int health = 100;
   double physDef;
   double magicDef;
   int physAtt;
   int magicAtt;

   @Override
   public void physicalAttack(Hero hero) {
      if(hero.health - (physAtt - physAtt*hero.physDef)<0) {
         hero.health=0;
      }
      else {hero.health -= physAtt - physAtt*hero.physDef;}

   }
}
