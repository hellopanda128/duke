import java.util.Scanner;

public class Ui{

    Scanner sc;

    public Ui() {
        sc = new Scanner(System.in);
    }

    public void showWelcome() {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println(logo + "Hello! I'm Duke \nWhat can I do for you?");
    }

    public void showLine() {
        System.out.println("_______");
    }

    public String readCommand() {
        return sc.nextLine();
    }
    
    public void showError(String msg) {
        System.out.println(msg);
    } 

    public static void printAddedMsg() {
        System.out.println("Task added!");
    }

    public void showLoadingError() {
        System.out.println("Loading Error!");
    }

}