import java.util.Scanner;
public class Bathroom extends Rooms {

    public Bathroom(String name, String description, String objects) {
        super(name, description, objects);
    }
    
    public static void shower(){
        System.out.println("You have looked in the shower. There is nothing there.");
    }

    public static void medicineCabinet(){
        System.out.println("You have tried looking in the cabinet but you cannot get in. Enter the safeword to access the medicine cabinet.");
    }

    public static void toiletSeat(){
        System.out.println("You have looked under the toilet seat! There's a paper with this word: Honey!");
    }

    public static void door(){
        System.out.println("You need a key to open the door. Open it using the key");
    }

    public static void printInventory(){
        System.out.println("Here is your inventory:");
    }

    public static void help(){
        System.out.println("Remember, you need a codeword to open the medicine cabinet. The word can be found somewhere gross!");
    }

    public static void quit(){
        System.out.println("You have quit the came. We hope you can come back again to play!");
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What do you want to do?\n"
        + "1. Look in shower\n"
        + "2. Look in the medicine cabinet\n"
        + "3. Look under the toilet seat\n"
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
            case 1: shower();
                    break;
            case 2: toiletSeat();
                    break;
            case 3: medicineCabinet();
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
    
