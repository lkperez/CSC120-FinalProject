import java.util.Scanner;
public class Bedroom extends Rooms {

    public Bedroom(String name, String description, String objects) {
        super(name, description, objects);
    }
    
    

    private static void bed(){
        System.out.println("You have looked under the bed. There isn't anything there!");
    }

    private static void bookshelf(){
        System.out.println("You have looked in the bookshelf. You found a book with a code on the front. This is the code: UpUpDown.");
    }

    private static void closet(){
        System.out.println("There is a locked box! You need a code to open the lock.");
    }

    private static void door(){
        System.out.println("You need a key to open the door. Open it using the key");
    }
   
    public static void printInventory(){
        System.out.println("Here is your inventory:");
    }

    public static void help(){
        System.out.println("Remember, you need a code to unlock the lock box. It's hidden in something you use for school!");
    }

    public static void quit(){
        System.out.println("You have quit the came. We hope you can come back again to play!");
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What do you want to do? Pick a number:\n"
        + "1. Look under the bed\n"
        + "2. Look in the bookshelf\n"
        + "3. Look in the closet\n"
        + "4. Open the door\n"
        + "5. Look through inventory\n"
        + "6. Get help\n"
        + "7. Quit game\n");
        int answer = scan.nextInt();

        while(answer > 6 || answer < 1) {
            System.out.println("pick one of the options");
            answer = scan.nextInt();
        }
        switch(answer) {
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
                    break;
        }
        scan.close();

    }


}

