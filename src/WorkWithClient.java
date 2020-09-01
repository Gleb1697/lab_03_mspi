import java.util.Scanner;

public class WorkWithClient {
    private final Scanner keyboard;

    public WorkWithClient(Scanner keyboard) {
        this.keyboard = keyboard;
    }

    public void startApp() {
        if (this.keyboard != null) {
            String clientInput;
            boolean exitFlag = true;
            System.out.println("Здравствуйте!");
            System.out.println("Для получения справки по командам программы введите \"help\"");
           do {
               clientInput = this.keyboard.nextLine();
               switch (clientInput) {
                   case "help":
                       Help.printHelp();
                       break;
                   case "shot":
                       Shot.newShot();
                       break;
                   case "history":
                       History.showDots();
                       break;
                   case "exit":
                       exitFlag = Exit.changeExitFlag(exitFlag);
                       break;
                   default:
                       System.out.println("Такой команды нет, попробуйте еще раз.");
                       System.out.println(clientInput);
               }
           } while (exitFlag);
        }
    }
}