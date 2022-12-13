import java.util.ArrayList;

public class Player{

    /** String to player's name */
    private String name;

     /** ArrayList to store card owner's name */
    private ArrayList<Clue> inventory = new ArrayList<Clue>(); //player's inventory(where they store clues)

     /** Constructor */
    public Player(String name){
        this.name = name;
    }

    /** Getter for name */
    public String getName(){
        return name;
    }

    /** Getter for inventory*/
    public ArrayList<Clue> getInventory(){
        return inventory;
    }

    /** Setter for name */
    public void setName(String name) {
        this.name = name;
    }

    /** Setter for inventory */
    public void setInventory(ArrayList<Clue> inventory) {
        this.inventory = inventory;
    }

    /** 
     * adds clue to inventory when player finds one 
     * @param Item clue player finds
     */
    public void addItem(Clue Item) {
        inventory.add(Item);
        System.out.println(Item.getName() + " was added to your inventory.");
    }
    
    /** 
     * removes clue to inventory when player finds one 
     * @param Item clue player finds
     */
    public void removeItem(Clue Item) {
        inventory.remove(Item);
        System.out.println(Item.getName() + " was removed from your inventory.");
    }

    /** 
     * prints a string with the attributes
     */
    public String toString() {
        return this.name + " has" + this.inventory;
    }

    public static void main(String[] args) {
        Player Person = new Player("Jerry");
        System.out.println(Person);
      }
}
