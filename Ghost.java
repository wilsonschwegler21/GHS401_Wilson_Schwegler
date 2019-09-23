
/**
 * Write a description of class Ghost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghost
{
    //INSTANCE VARIABLES FOR THE CLASS GHOST 
    private String color;
    private int speed;
    private int level;
    //ZERO-ARGUMENT CONDTRUCTOR, BASICALLY IT MAKES A DEFAULT GHOST
    public Ghost(){
        color = null;
        speed = 0;
        level = 1;
    }
    
    //TWO-ARGUMENT CONSTRUCTOR, CAN SET THE INSTANCE VARIABLES TO ANYTHING DESIRED
    public Ghost(String color, int speed){
        this.color = color;
        this.speed = speed;
    }
    
        public void bumpSpeed(){
        this.speed++;
    }
    
        public void bumpSpeed(int bump){
        this.speed+=bump;
    }
    
    public void doubleColor(){
        this.color = this.color + this.color;
    }
    public void levelUp(){
        this.level++;
    }
        
    //PUBLIC MEANS OTHER CLASSES HAVE ACCESS TO TO THIS METHOD
    //STRING IS THE RETURN-TYPE OF THIS METHOD, IT GIVES BACK A STRING
    //TOSTRING IS THE NAME OF THIS METHOD
    public String toString(){
        return "Color: " + this.color + " Speed: " + this.speed + " Level: " + this.level;
    }
    
    
}
