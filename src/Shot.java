import java.util.Scanner;

public class Shot {
    public static void newShot() {
        Scanner keyboard = new Scanner(System.in);
        Dot dot = new Dot();
        System.out.println("Введите координату X");
        dot.setXCoordinate(keyboard.nextDouble());
        System.out.println("Введите координату Y");
        dot.setYCoordinate(keyboard.nextDouble());
        System.out.println("Введите радиус R");
        dot.setRRadius(keyboard.nextDouble());
        System.out.println("Стреляем!");
        dot.setGotHit(ShootingCheck.checkDot(dot.getXCoordinate(), dot.getYCoordinate(), dot.getRRadius()));
        System.out.println(dot.getGotHit());
        History.addDot(dot);
    }
}
