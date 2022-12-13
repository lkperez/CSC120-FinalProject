import java.util.Scanner;
public class Bathroom extends Rooms {

     /** int to store amount of attempts user makes unlocking the safe */
     static int attempts;

    /** boolean to store wether or not the user has the key */
    static boolean key;

    /** Constructor */
    public Bathroom(String name, String description, String objects) {
        super(name, description, objects);
    }
    
    /**
     * prints out the statement if user chooses to look in the shower
     */
    public static void shower(){
        System.out.println("You have looked in the shower. There is nothing there.");
    }

    /**
     * prints out the statement if user chooses to look in the medicine cabinet
     */
    public static void medicineCabinet(){
        System.out.println("You have tried looking in the cabinet but you cannot open it. Enter the safeword to access the medicine cabinet.");
    }

    /**
     * prints out the statement if the user chooses to look in the toilet 
     */
    public static void toiletSeat(){
        System.out.println("You have looked under the toilet seat! There's a paper with this word: Honey!");
    }

    /**
     * prints out different door statements depending on if you have the key or not
     */
    public static void door(){
        // System.out.println("You need a key to open the door. Open it using the key.");       
        if (key = true){
         System.out.println("Congrats! You've completed the Escape Room!\n");
        }
         if (key = false){
             System.out.println("Sorry, you need the key! Go find the key!\n");
         }
     }

    /**
     * prints inventory when you select inventory
     */
    public static void printInventory(){
        System.out.println("Here is your inventory:");
    }

    /**
     * prints help statement and gives you a hint
     */
    public static void help(){
        System.out.println("Remember, you need a codeword to open the medicine cabinet. The word can be found somewhere gross!");
    }

    /**
     * prints quit statement to end game if user chooses to
     */
    public static void quit(){
        System.out.println("You have quit the came. We hope you can come back again to play!");
    }

    /**
     * prints the safe statement and will ask you for the code and if you have the safe code, you can tell safe and it will give you the key
     */
    public static void safe(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the passcode to unlock the safe and get the key!\n");
        int response = scan.nextInt();        
        while (response == 420){
        if (response == 420 || attempts < 3){
           System.out.println("Yay! You have unlocked the safe and now have the key!\n");
           break;
       }    

         while (response != 123 || attempts < 3) {
               System.out.println("Wrong code, try again!\n");
               attempts += 1;
          if(attempts > 3) {
               System.out.println("Too many attempts! Try and find the code and come back!\n");
               break;
           } }
       }
    }

    /**
     * tells you to hit w so that it will move on to the menu
     * @param scnr takes in user input
     */
    public static void wToContinue(Scanner scnr){
        String answer = "";
        while(!answer.equalsIgnoreCase("w")){
            System.out.println("Press 'w' to continue.\n");
            answer = scnr.nextLine();
        }
    }

     /**
     * Menu of the options a player can do
     */
    public static void menu(){   
        System.out.println("What do you want to do? Select a number below:\n"
         + "1. Look in the shower\n"
         + "2. Look in the medicine cabinet\n"
         + "3. Look in the toilet\n"
         + "4. Open the safe\n"
         + "5. Open the door\n"
         + "6. Look through inventory\n"
         + "7. Get help\n"
         + "8. Quit game\n");
     }


    public static void main(String[] args) {            

        while(true){
        menu();
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        //requires you to pick one of the annswer options, can't pick another number 
        while(answer > 9 || answer < 1) {
            System.out.println("Please pick one of the options.");
            answer = scan.nextInt();
            scan.nextLine();
        }
        switch(answer) {

        case 1: shower();
                break;
        case 2: medicineCabinet();
                break;
        case 3: toiletSeat();;
                break;
        case 4: safe();;
                break;
        case 5: door();
                break;
        case 6: printInventory();
                break;
        case 7: help();
                break;
        case 8: quit();
                System.exit(1);
        }
        wToContinue(scan);



   }

    }


}
