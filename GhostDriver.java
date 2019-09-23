
/**
 * Write a description of class GhostDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GhostDriver
{
    public static void main(){
        Ghost g1 = new Ghost();
        Ghost g2 = new Ghost();
        
        //System.out.println(g1.toString());
        Ghost g4 = new Ghost("chartruse",99);
        System.out.println(g4.toString());
        g4.bumpSpeed(7); //INCREASE SPEED BY CUSTOM VALUE
        System.out.println(g4.toString());
        g4.bumpSpeed(); //INCREASE SPEED BY 1
        System.out.println(g4.toString());
        g4.doubleColor();
        System.out.println(g4.toString());
        g4.levelUp();
        System.out.println(g4.toString());
    }
}
