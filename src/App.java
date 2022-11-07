import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        boolean exit = false;
        int songNumber = 0;
        ArrayList<String> songList = new ArrayList<String>();
        ArrayList<String> artistList = new ArrayList<String>();
        ArrayList<String> playsList = new ArrayList<String>();
        while (exit == false){
            System.out.print("MAIN MENU \n\n1. Add Song \n2. Remove Song \n3. List Songs \n4. List Top Song \n5. Exit Program \n\nPlease enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            String option = scanner.next();
            System.out.println("");
            if (option.equals("1")){
                songNumber = songNumber + 1;
                System.out.print("Enter name of song: ");
                songList.add(scanner.next());
                System.out.print("Enter name of artist: ");
                artistList.add(scanner.next());
                System.out.print("Enter number of plays: ");
                playsList.add(scanner.next());
                System.out.println("Song Added\n");
            }
            else if (option.equals("2")){
                System.out.println("you picked 2\n");
            }
            else if (option.equals("3")){
                System.out.println("you picked 3\n");
            }
            else if (option.equals("4")){
                System.out.println("you picked 4\n");
            }
            else if (option.equals("5")){
                System.out.println("Exiting Program");
                exit = true;
            }
            else{
                System.out.println("Invalid option, try again:\n");
            }
        }
    }
}