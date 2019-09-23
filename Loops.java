import java.util.Random;
/**
 * Write a description of class Loops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Loops
{
    // instance variables - replace the example below with your own\
    public static void main(){
        
        String[] FirstNames = {"mike","Jhon","Bob","zelda"};
        int num;
        int num2;
        String[] LastNames = {"Ross","Cates","Bing","Keller"};
        System.out.println("First Name\t\tLast Name");
        Random random = new Random();
        for(int i = 0; i<10; i++){
            num = random.nextInt(FirstNames.length - 0);
            num2 = random.nextInt(LastNames.length - 0);
            System.out.println(FirstNames[num]+ "\t\t\t" + LastNames[num2]);
            
        }
        int a = FirstNames.length-1;
        while (a >= 0){
            System.out.println(FirstNames[a]);
            a--;
            
        }
        
    }

}
