public class Map extends Rooms{

    /** int to store directions of the rooms */
    private int n, s, w, e; 

    /** Constructor */
    public Map(String name, String description, String objects, int north, int south, int west, int east) {
        super(name, description, objects);
        this.n = north;
        this.s = south;
        this.w = west;
        this.e = east;
    }

    //accessors

    /** Getter for north */
    public int getN(){
        return n;
    }

    /** Setter for north */
    public void setN(int north){
        this.n = north;
    }

    /** Getter for south */
    public int getS(){
        return s;
    }
    
    /** Setter for south */
    public void setS(int south){
        this.s = south;
    }
    
    /** Getter for west*/
    public int getW(){
        return w;
    }
    
    /** Setter for west */
    public void setW(int west){
        this.w = west;
    }
    
    /** Getter for east */
    public int getE(){
        return e;
    }

    /** Setter for east */
    public void setE(int east){
        this.e = east;
    }

    public static void main(String[] args) {
      }
}
