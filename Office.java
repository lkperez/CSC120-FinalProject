import java.util.Scanner;

public class Office extends Rooms {
    static int attempts;

    public Office(String name, String description, String objects) {
        super(name, description, objects);
    
    }

    
    public static void desk(){
        System.out.println("You have looked into the drawer of the desk but there is nothing there!");
    }

    public static void chair(){
        System.out.println("You have looked under the chair. Here is the code: 123");
    }

    public static void safe(){
       System.out.println("Enter the passcode to unlock the safe and get the key!");
    }

    public static void door(){
        System.out.println("You need a key to open the door. Open it using the key");
    }

    public static void printInventory(){
        System.out.println("Here is your inventory:");
    }

    public static void help(){
        System.out.println("Remember, you need a code to unlock the sage. It's hidden where a person can rest!");
    }

    public static void quit(){
        System.out.println("You have quit the game. We hope you can come back again to play!");
    }

    public static void menu(){
        System.out.println("What do you want to do?\n"
        + "1. Look in the drawer of the desk\n"
        + "2. Look under the chair\n"
        + "3. Open the safe\n"
        + "4. Open the door\n"
        + "5. Look through inventory\n"
        + "6. Get help\n"
        + "7. Quit game\n");
    }
 

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        menu();
        int answer = scan.nextInt();

        while(answer > 6 || answer < 1) {
            System.out.println("pick one of the options");
            answer = scan.nextInt();
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
                    break;
        }
        Scanner safe = new Scanner(System.in);
        Integer response = safe.nextInt();        
        while (response == 123){
        if (response == 123 || attempts < 3){
            System.out.println("Yay! You have unlocked the safe and now have the key!");
            menu();
            break;
        }    

          while (response != 123 || attempts < 3) {
                System.out.println("Wrong code, try again!");
                attempts += 1;
           if(attempts > 3) {
                System.out.println("Too many attempts! Try and find the code and come back!");
                menu();
                break;
            } }
        }
        safe.close();   

        scan.close();

    }
    }

/* 
        System.out.println("Remember you need a code to unlock the safe. Its hidden where a person can rest");
    }

}

     /*   Scanner scan1  = new Scanner(System.in);
        int response = scan1.nextInt();
        while (response == "123"){
            System.out.println("Wrong code, try again!");
            else if(response == "123"){
                System.out.println("Yay! You have unlocked the safe and now have the key!");
            }
        }             
               
        scan.close();

        Rooms claRooms = new Rooms("DTI", " white tile floors with white painted walls with ", " a shower, a medicine cabinet, and a toilet seat.");
        System.out.println(claRooms);
        System.out.println("Welcome to the Office!");
                if  {

                    System.out.print("Please put an option shown on the list\n");
                    scan.hasNextLine();
                } else {
                    // Print name
                    System.out.println("You have chosen " + name + "!");
                }
            */               
