import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        boolean exit = false;
        //Creating variable used to check whether user has exited program
        int songCount = -1;
        //Creating variable used to see how many sonsg there are
        ArrayList<String> songList = new ArrayList<String>();
        ArrayList<String> artistList = new ArrayList<String>();
        ArrayList<String> playsList = new ArrayList<String>();
        //Creating each array list for songs, artists and amount of plays
        while (exit == false){
        //Creating a loop checking whether the user has asked to exit the program
            System.out.print("MAIN MENU \n\n1. Add Song \n2. Remove Song \n3. List Songs \n4. List Top Songs \n5. Exit Program \n\nPlease enter your choice: ");
            //Main menu showing all option
            Scanner scanner = new Scanner(System.in);
            String option = scanner.nextLine();
            //Taking the choice of the option from the user
            System.out.println("");
            if (option.equals("1")){
            //Checks if the user has entered option 1
                System.out.print("Enter name of song: ");
                songList.add(scanner.nextLine());
                System.out.print("Enter name of artist: ");
                artistList.add(scanner.nextLine());
                System.out.print("Enter number of plays: ");
                playsList.add(scanner.nextLine());
                songCount = songCount + 1;
                System.out.println("Song Added\n");
                //Asks the user for the name, artist and plays of each song, and adds them to each array list then adds 1 to the song count
            }
            else if (option.equals("2")){
            //Checks if the user has entered option 2
                boolean found = false;
                //Creating variable used to check whether the song requested has been found
                int songNumber = 0;
                //Creating variable used to check whether the all songs have been searched
                System.out.print("Enter name of song to remove: ");
                String remove = scanner.nextLine();
                //asks user for name of song and takes there input
                while (found == false){
                //Creating a loop checking whether the song requested has been found
                    if (songNumber > songCount){
                        System.out.println("Song not found, returning to main menu.\n");
                        found = true;
                    //checking if the program has checked every song in the array list
                    }
                    else if (remove.equals(songList.get(songNumber))){
                    //checking if the song requested is in the array list
                        songList.remove(songNumber);
                        artistList.remove(songNumber);
                        playsList.remove(songNumber);
                        songCount = songCount - 1;
                        found = true;
                        System.out.println("Song Removed\n");
                    //if song is found it removes each song, takes 1 away from the song count and breaks the loop
                    }
                    else{
                        songNumber = songNumber + 1;
                    //Increases song number to move to next song in the array list
                    }
                }
            }
            else if (option.equals("3")){
            //Checks if the user has entered option 3
                int songNumber = 0;
                //Creating variable used to check whether the all songs have been displayed
                if (songCount > -1){
                //Creating an if statement to check if tehre are any songs
                    while (songNumber <= songCount){
                    //Creating a loop to check whether the all songs have been displayed
                        System.out.println("Song " + (songNumber + 1) + ": " + songList.get(songNumber) + " by " + artistList.get(songNumber) + ", " + playsList.get(songNumber) + " plays.");
                        songNumber = songNumber + 1;
                    //Displays each song, artist and number of plays
                    }
                System.out.println("");
                }
                else{
                    System.out.println("No songs added\n");
                }
                //If there are no songs added this is displayed
            }
            else if (option.equals("4")){
            //Checks if the user has entered option 4
                System.out.print("Enter minimum number of plays: ");
                String minimumPlays = scanner.nextLine();
                //Asks the user for the minimum number of plays
                int minPlays = Integer.parseInt(minimumPlays);
                //Coverts the string from the scanner to an integer
                System.out.println("");
                int songNumber = 0;
                //Creating variable used to check whether all songs have been searched
                int songDisplay = 1;
                //Creating variable used to display number of songs to user
                boolean enoughPlays = false;
                //Creating variable used to check whether any songs have enough plays to be displayed
                while (songNumber <= songCount){
                //Creating a loop to check whether the all songs have been checked
                    int playsNumber = Integer.parseInt(playsList.get(songNumber));
                    //Coverts the string from the array list to an integer
                    if (minPlays <= playsNumber){
                    //checks if each song has enough plays
                        System.out.println("Song " + (songDisplay) + ": " + songList.get(songNumber) + ", " + artistList.get(songNumber) + ", " + playsList.get(songNumber) + " plays.");
                        enoughPlays = true;
                        songDisplay = songDisplay + 1;
                        //displays songs with enough plays, tells the program at least one song has enough plays, and adds 1 to the song display
                    }
                    songNumber = songNumber + 1;
                    //adds 1 to the song number
                }
                if (enoughPlays == false){
                    System.out.println("No songs have this many plays");
                }
                //checks to see if any songs had enough plays
                System.out.println("");
            }
            else if (option.equals("5")){
            //Checks if the user has entered option 5
                System.out.println("Exiting Program");
                exit = true;
                //Breaks the main loop of the program so it ends
            }
            else{
                System.out.println("Invalid option, try again:\n");
            }
            //Checks if the user has entered anything but the 5 options and returns an error if they have
        }
    }
}