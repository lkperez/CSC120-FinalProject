import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class EscapeRoom {
   /** ArrayList to store a map of rooms */ 
    private ArrayList <Rooms>map;

    /** List of string that stores the command for the game */
    List<String> commands = new ArrayList<>(Arrays.asList("n", "s", "w", "e"));

    /** Constructor */
    public EscapeRoom(){
        this.map = new ArrayList<Rooms>();
        map.add(new Rooms("office", "brown stained wooden floors and walls", "desk and chair"));
        map.add(new Rooms("Bathroom", "white tiled floors and walls", "shower, medicine cabinet, and toilet"));
        map.add(new Rooms("Bedroom", "brown stained wooden floors and grey painted walls", "bed, bookshelf, and closet"));
    }    

    /**
     * If user chooses to go left they end up in the office
     */
    public static void office(){
        System.out.println("You have gone left so you are now in the office. It has brown, stained wooden floors and walls. There is a desk, a chair, and a safe.");
    
        int exit = Office.OfficeRoom();
        
        if (exit == 1)
        {
            EscapeRoom.gameLogic();
        }
    }

    /**
     * If user chooses to go right they end up in the bathroom
     */
    public static void bathroom(){
        System.out.println("You have gone right so you are now in the bathroom. It has white til stained floors and walls. There is a shower, a medicine cabinet, and a toilet.");
        
        int exit = Bathroom.BathroomRoom();
        if (exit == 1)
        {
            EscapeRoom.gameLogic();
        }
    }

    /**
     * If user chooses to go foward they end up in the bedroom
     */
    public static void bedroom(){
        System.out.println("You have gone forward so you are now in the bedroom. It has brown stained wooden floors and grey painted walls. There is a bed, a bookshelf, and a closet");
        int exit = Bedroom.BedRoomRoom();

        if (exit == 1)
        {
            EscapeRoom.gameLogic();
        }
    }

    public static void quit(){
        System.out.println("You have quit the game. We hope you can come back and play again!");
    }

    /**
     * User needs to press w in order to continue the game
     * @param scnr create scanner
     * @param input asks for user input
     */
    public static void wToContinue(Scanner scnr, String input){
        while (!input.equalsIgnoreCase("w")) {
            System.out.println("Press \"w\" to continue.");
            input = scnr.nextLine();
        }
    } 

     /**
     * This connects the Room classes together and allows you to loop back to main Escape room
     * @param scan create scanner
     * @param answer asks for user input on what option you choose
     */
    public static void gameLogic()
    {
        while(true){
            directions();

            Scanner scan = new Scanner(System.in);
            int answer = scan.nextInt();

            //requires you to pick one of the annswer options, can't pick another number 
            while(answer > 4 || answer < 1) {
                System.out.println("Please pick one of the options.");
                answer = scan.nextInt();
                scan.nextLine();
            }
            switch(answer) {
            case 1: office();
                    break;
            case 2: bathroom();
                    break;
            case 3: bedroom();
                    break;
            case 4: quit();
                    return;
                } 
            wToContinue(scan, "");
        }
    }

    /**
     * The direction users can go in 
     */
    public static void directions(){ 
        System.out.println("Which room do you want to start in?\n"
            + "1. Office\n"
            + "2. Bathroom\n"
            + "3. Bedroom\n"
            + "4  Quit\n");
    }

    public static void main(String[] args) {
    //Opening prompt for escape room
        System.out.println("Welcome to the Escape Room!");
        System.out.println("""
        There will be three rooms the bedroom, office, and bathroom. 
        You can start in any room but in order to go from one room to another you need to find a key in each room to unlock the door.
        Get the clues to find the key.""");
        //Ask player for name
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        while (scan.hasNextLine()) {
            String input = scan.nextLine();
            if (input == null || input.trim().isEmpty()) {
            // Error for no input, keeps asking for name 
            System.out.print("Please, what is your name?\n");
            scan.hasNextLine();
        } else {
            // Print name
            System.out.println("Welcome to the Escape Room " + input + " Good luck" + " !");
            wToContinue(scan, input);
            break;
        } // End of conditional
    } // End of while loop
        //Ask player for which room they want to start in

        gameLogic();
    }

    private static void EscapeRoom() {
    }
}
