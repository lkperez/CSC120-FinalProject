import java.util.Scanner;
public class Bedroom extends Rooms {
    
    /** int to store amount of attempts user makes unlocking the safe */
    static int attempts; 
    
    /** boolean to store wether or not the user has the key */
    static boolean key;


    /** Constructor */
    public Bedroom(String name, String description, String objects) {
        super(name, description, objects);
        key = false;
        attempts = 0;
    }
    
    /**
     * prints out the statement if user chooses to look in the bed
     */
    private static void bed(){
        System.out.println("You have looked under the bed. There isn't anything there!");
    }

    /**
     * prints out the statement if user chooses to look in the bookshelf
     */
    private static void bookshelf(){
        System.out.println("You have looked in the bookshelf. You found a book with a code on the front. This is the code: UpUpDown.");
    }

    /**
     * prints out the statement if user chooses to look in the closet
     */
    private static void closet(){
        attempts = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("There is a locked box! You tried to open it, but couldn't. It asks you for a code. You have three tries to guess it right.");
        while (attempts < 3){
            String response = scan.nextLine();
            if (response.equals("UpUpDown")){
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
    private static void door(){
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
        System.out.println("Here is your inventory:");
    }

    /**
     * prints help statement and gives you a hint
     */
    public static void help(){
        System.out.println("Remember, you need a code to unlock the box. It's hidden in something you use for school!");
    }

     /**
     * prints quit statement to end game if user chooses to
     */
    public static void quit(){
        System.out.println("You have quit the room. We hope you can come back and play again!");
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
         + "1. Look in the bed\n"
         + "2. Look in the bookshelf\n"
         + "3. Look in the closet\n"
         + "4. Open the door\n"
         + "5. Look through inventory\n"
         + "6. Get help\n"
         + "7. Quit room\n");
     }

    /**
     * Controls the option menu through the while loops and allows access to the information in the Escape Room class
     * @param scan creates scanner
     * @param answer asks for user input on what option you choose
     */
    public static int BedRoomRoom() {            

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


        while (answer < 9 || answer > 1)
        {
            switch(answer) 
            {

                case 1: bed();
                        break;
                case 2: bookshelf();
                        break;
                case 3: closet();
                        break;
                case 4: door();
                        break;
                case 5: printInventory();
                        break;
                case 6: help();
                        break;
                case 7: quit();
                        return 1;
            }
            wToContinue(scan);
            menu();
            answer = scan.nextInt();
        }


    }


}

}