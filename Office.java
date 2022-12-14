         
import java.util.Scanner;

public class Office extends Rooms {
    
    /** int to store amount of attempts user makes unlocking the safe */
    static int attempts;
    
    /** boolean to store wether or not the user has the key */
    static boolean key;

    /** Constructor */
    public Office(String name, String description, String objects) {
        super(name, description, objects);
        key = false;
        attempts = 0;
    }


    /**
     * prints out the desk statement if you choose the desk option in main  
     */
    public static void desk(){
        System.out.println("You have looked into the drawer of the desk but there is nothing there!\n");
    }

    /**
     * prints out the chair statement if you choose the chair option in main 
     */
    public static void chair(){
        System.out.println("You have looked under the chair. Here is the code: 123\n");
    }

    /**
     * prints the safe statement and will ask you for the code and if you have the safe code, you can tell safe and it will give you the key
     */
    public static void safe(){
        attempts = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the passcode to unlock the safe and get the key!\n");
        while (attempts < 3){
        int response = scan.nextInt();        
        if (response == 123){
        System.out.println("Yay! You have unlocked the safe and now have the key!\n");
            key = true;
            break;
             } 
             else if (attempts < 2){
                System.out.println("Please try again!");
            }
            attempts += 1;
        }
        if (attempts == 3){
            System.out.println("Sorry, too many attempts. Find the code and try again!");
        }               
    } 
        
    /**
     * prints out different door statements depending on if you have the key or not
     */
    public static void door(){
       if (key == true){
        System.out.println("Congrats! You've completed the Escape Room!\n");
       }
        if (key == false){
            System.out.println("Sorry, you need the key! Go find the key!\n");
        }
    }

    /**
     * prints inventory when you select inventory
     */
    public static void printInventory(){
        System.out.println("Here is your inventory:\n");
    }

    /**
    * prints help statement and gives you a hint
     */   
    public static void help(){
        System.out.println("Remember, you need a code to unlock the safe. It's hidden where a person can rest! \n");
    }

    /**
     * prints quit statement to end game if user chooses to
     */ 
    public static void quit(){
        System.out.println("You have quit the game. We hope you can come back again to play!\n");
    }

    /**
     * tells you to hit w so that it will move on to the menu
     * @param scnr takes in user input
     */   
    public static void wToContinue(Scanner scnr){
        String answer = "";
        while(!answer.equalsIgnoreCase("w")){
            System.out.println("Press 'w' to continue.");
            answer = scnr.nextLine();
        }
    }

    /**
     * Menu of the options a player can do
     */
    public static void menu(){   
       System.out.println("What do you want to do? Select a number below:\n"
        + "1. Look in the drawer of the desk\n"
        + "2. Look under the chair\n"
        + "3. Open the safe\n"
        + "4. Open the door\n"
        + "5. Look through inventory\n"
        + "6. Get help\n"
        + "7. Quit game\n");
    }



    public static void main(String[] args) {            

        while(true){
        menu();
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        //requires you to pick one of the annswer options, can't pick another number 
        while(answer > 7 || answer < 1) {
            System.out.println("Please pick one of the options.");
            answer = scan.nextInt();
            scan.nextLine();
        }
        switch(answer) {

        case 1: desk();
                break;
        case 2: chair();
                break;
        case 3: safe();
                break;
        case 4: door();
                break;
        case 5: printInventory();
                break;
        case 6: help();
                break;
        case 7: quit();
                System.exit(1);
        }
        wToContinue(scan);



   }

    }
}
