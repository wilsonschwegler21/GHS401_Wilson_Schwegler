import javax.swing.JOptionPane;
/**
 * Write a description of class Dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dog
{
    private String name;
    private String breed;
    private int weight;
    public Dog(){
        this.name = null;
        this.breed = null;
        this.weight = 0;
    }
    public Dog(String name, String breed, int weight){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }
    //RETURN TYPE IS A DOUBLE
    public int getWeight(){
        return this.weight;
    }
    public String toString(){
        return "name: " + this.name + " Breed: " + this.breed + " weight: " + this.weight;
    }
}
