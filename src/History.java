import java.util.ArrayList;
import java.util.HashSet;

public class History {
    private static ArrayList<Dot> dots = new ArrayList<>();

    public static void addDot(Dot dot) {
        dots.add(dot);
    }

    public static void showDots() {
        if (!dots.isEmpty()) {
            System.out.println("X\t\tY\t\tR\t\tРезультат");
            for (Dot dot : dots) {
                System.out.print(dot.getXCoordinate() + "\t\t");
                System.out.print(dot.getYCoordinate() + "\t\t");
                System.out.print(dot.getRRadius() + "\t\t");
                System.out.println(dot.getGotHit());
            }
        } else if (dots.isEmpty()) {
            System.out.println("Выстрелов еще не было");
        } else {
            System.out.println("Ошибка");
        }
    }
}
