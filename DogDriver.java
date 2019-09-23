
/**
 * Write a description of class DogDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DogDriver
{
    public static void main(){
        Dog d1 = new Dog("Bob", "Pitbull", 35);
        Dog d2 = new Dog("dan", "Pitbull", 25);
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d1.getWeight());
    }
}
