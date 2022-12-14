public class Clue {

    /** String to store the clue's name */
    private String name;

    /** String to store the clue's description */
    private String description;

    /** int to store the amount of clues there are */
    private int amount;

    /** Constructor */ 
    public Clue(int amount, String name, String description) {
        this.name = name;
        this.description = description;
        this.amount = amount;
    }

    /** Getter for name */
    public String getName() {
        return name;
    }

    /** Getter for description */
    public String getDescription() {
        return description;
    }
    
    /** Getter for amount */
    public int getamount() {
        return amount;
    }

    /** Setter for name */
    public void setName(String name) {
        this.name = name;
    }

    /** Setter for description */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /** Setter for amount */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /** 
     * prints a string with the attributes
     */
    public String toString() {
        return "There is " + this.amount + " " + this.name + " and it looks like " + this.description;
    }

    public static void main(String[] args) {
        Clue code = new Clue(1, "desk", "a stained brown desk with golden knobs on the drawers");
        System.out.println(code);
      }
}