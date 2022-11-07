import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        boolean exit = false;
        int songCount = -1;
        ArrayList<String> songList = new ArrayList<String>();
        ArrayList<String> artistList = new ArrayList<String>();
        ArrayList<String> playsList = new ArrayList<String>();
        while (exit == false){
            System.out.print("MAIN MENU \n\n1. Add Song \n2. Remove Song \n3. List Songs \n4. List Top Song \n5. Exit Program \n\nPlease enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            String option = scanner.nextLine();
            System.out.println("");
            if (option.equals("1")){
                System.out.print("Enter name of song: ");
                songList.add(scanner.nextLine());
                System.out.print("Enter name of artist: ");
                artistList.add(scanner.nextLine());
                System.out.print("Enter number of plays: ");
                playsList.add(scanner.nextLine());
                songCount = songCount + 1;
                System.out.println("Song Added\n");
            }
            else if (option.equals("2")){
                boolean found = false;
                int songNumber = 0;
                System.out.print("Enter name of song to remove: ");
                String remove = scanner.nextLine();
                while (found == false){
                    if (songNumber > songCount){
                        System.out.println("Song not found, returning to main menu.\n");
                        found = true;
                    }
                    else if (remove.equals(songList.get(songNumber))){
                        songList.remove(songNumber);
                        artistList.remove(songNumber);
                        playsList.remove(songNumber);
                        songCount = songCount - 1;
                        found = true;
                        System.out.println("Song Removed\n");
                    }
                    else{
                        songNumber = songNumber + 1;
                    }
                }
            }
            else if (option.equals("3")){
                int songNumber = 0;
                if (songCount > -1){
                    while (songNumber <= songCount){
                        System.out.println("Song " + (songNumber + 1) + ": " + songList.get(songNumber) + " by " + artistList.get(songNumber) + ", " + playsList.get(songNumber) + " plays.");
                        songNumber = songNumber + 1;
                    }
                System.out.println("");
                }
                else{
                    System.out.println("No songs added\n");
                }
            }
            else if (option.equals("4")){
                System.out.print("Enter minimum number of plays: ");
                String minimumPlays = scanner.nextLine();
                int minPlays = Integer.parseInt(minimumPlays);
                System.out.println("");
                int songNumber = 0;
                int songDisplay = 1;
                boolean enoughPlays = false;
                while (songNumber <= songCount){
                    int playsNumber = Integer.parseInt(playsList.get(songNumber));
                    if (minPlays <= playsNumber){
                        System.out.println("Song " + (songDisplay) + ": " + songList.get(songNumber) + ", " + artistList.get(songNumber) + ", " + playsList.get(songNumber) + " plays.");
                        enoughPlays = true;
                        songDisplay = songDisplay + 1;
                    }
                    songNumber = songNumber + 1;
                }
                if (enoughPlays == false){
                    System.out.println("No songs have this many plays");
                }
                System.out.println("");
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