import java.util.Scanner;

public class Office extends Rooms {
    static int attempts;
    static boolean key;

    public Office(String name, String description, String objects) {
        super(name, description, objects);
        key = false;
        attempts = 3;

    }

    //prints out the desk statement if you choose the desk option in main  
    public static void desk(){
        System.out.println("You have looked into the drawer of the desk but there is nothing there!\n");
    }

    //prints out the chair statement if you choose the chair option in main
    public static void chair(){
        System.out.println("You have looked under the chair. Here is the code: 123\n");
    }
    //prints the safe statement and will ask you for the code and if you have the safe code, you can tell safe and it will give you the key
    public static void safe(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the passcode to unlock the safe and get the key!\n");
        int response = scan.nextInt();        
        while (attempts < 4){
        response = scan.nextInt();
        if (response == 123){
           System.out.println("Yay! You have unlocked the safe and now have the key!\n");
           break;
         } 
         else {
            System.out.println("Please try again!");
            attempts += 1;
            break;
         }
        }
        while (attempts > 4){
            response = scan.nextInt();
            System.out.println("Too many attempts! Try and find the code and come back! \n");
            break;
         }
     //    else{
       //     System.out.println("Error. Answer not found.");}
       //  else {
         //   System.out.println("Sorry, try again!");
           // break;}
        //while (attempts > 3){    
          //  System.out.println("Too many attempts! Try and find the code and come back!\n");
            //break;
        //}

            } 
        

      //   while (response != 123 || attempts < 3) {
        //       System.out.println("Wrong code, try again!\n");
             
       
    

    //prints out different door statements depending on if you have the key or not
    //problem - haven't made it so it decides if its false or not
    public static void door(){
       // System.out.println("You need a key to open the door. Open it using the key.");       
       if (key = true){
        System.out.println("Congrats! You've completed the Escape Room!\n");
       }
        if (key = false){
            System.out.println("Sorry, you need the key! Go find the key!\n");
        }
    }

    //prints inventory when you select inventory
    public static void printInventory(){
        System.out.println("Here is your inventory:\n");
    }

    //prints help statement and gives you a hint
    public static void help(){
        System.out.println("Remember, you need a code to unlock the safe. It's hidden where a person can rest! \n");
    }

    //prints quit and ends the program
    public static void quit(){
        System.out.println("You have quit the game. We hope you can come back again to play!\n");
    }

    //tells you to hit w so that it will move on to the menu 
    public static void wToContinue(Scanner scnr){
        String answer = "";
        while(!answer.equalsIgnoreCase("w")){
            System.out.println("Press 'w' to continue.\n");
            answer = scnr.nextLine();
        }
    }
    //our standard menu - asks you to select a number
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
                        

                
Scanner scan = new Scanner(System.in);
        menu();
        int answer = scan.nextInt();

        while(answer > 7 || answer < 1) {
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



                */               
