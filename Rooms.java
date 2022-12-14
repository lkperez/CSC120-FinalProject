public class Rooms {
    /** String to store the room's name */
    private String name;

    /** String to store the rooms object's */
    private String objects;

    /** String to store the room's description */
    private String description;

    /** Constructor */ 
    public Rooms(String name, String description, String objects) {
        this.name = name;
        this.description = description;
        this.objects = objects;
    }

    /** Getter for name */
    public String getName() {
        return name;
    }

     /** Getter for description */
    public String getDescription() {
        return description;
    }
    
     /** Getter for objects */
    public String getobjects() {
        return objects;
    }

    /** Setter for name */
    public void setName(String name) {
        this.name = name;
    }

    /** Setter for description */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * prints a string with the attributes
     */
    public String toString() {
        return this.name + " is a room with" + this.description + ". In this room there is a " + this.objects + ".";
    }

    public static void main(String[] args) {
        Rooms claRooms = new Rooms("DTI", " white tile floors with white painted walls", "desk");
        System.out.println(claRooms);
      }
}