package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i <= 20000; i++) {
            s +=i + " ";
        }
        System.out.println(s);

        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы String, в мс.:" + (stopTime - startTime));

        long startTimeSB = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");


        }
        System.out.println(sb);

        long stopTimeSB = System.currentTimeMillis();
        System.out.println("Длительность работы StringBuilder, в мс.:" + (stopTimeSB - startTimeSB));

    }

}
