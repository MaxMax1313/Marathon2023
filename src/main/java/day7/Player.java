package day7;

public class Player {

    private int stamina;
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;

    private static int countPlayers;

    Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6){
        countPlayers ++;}

    }

    public int getStamina() {
        return stamina;
    }

    public static void getCountPlayers() {
        System.out.println(countPlayers);
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina --;
        }
        else {
            countPlayers--;
        }
    }
    public static void info(){
        if(countPlayers==5){
            System.out.println("Команды неполные. На поле еще есть " + (6-countPlayers) + " свободное место.");
        }
        else if(countPlayers<6){
            System.out.println("Команды неполные. На поле еще есть " + (6-countPlayers) + " свободных мест.");
        }
        else {
            System.out.println("На поле нет свободных мест");
        }
    }
}