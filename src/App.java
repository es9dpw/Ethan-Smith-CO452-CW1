import java.util.Scanner;

public class App {
    public static void main(String[] args){
        boolean exit = false;
        while (exit == false);
            System.out.println("MAIN MENU");
            System.out.println("");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. List Songs");
            System.out.println("4. List Top Song");
            System.out.println("5. Exit Program");
            System.out.println("");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your choice: ");
            String option = scanner.nextLine();
    }
}