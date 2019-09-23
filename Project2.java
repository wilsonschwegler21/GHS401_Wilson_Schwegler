import javax.swing.JOptionPane;
import java.util.Random;
/**
 * Write a description of class Project2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Project2
{
    public static void main(){
        int low = Integer.parseInt(JOptionPane.showInputDialog("Enter a low value"));
        int high = Integer.parseInt(JOptionPane.showInputDialog("Enter a high Value"));
        Random random = new Random();
        if(low > high){
            System.out.println("Enter valid values");
 
        }
        
        else{
            int[] myArray = new int[8];
            int num;
            int oddNums = 0;
            int evenNums = 0;
            for(int i=0; i < myArray.length; i++) {
                num = random.nextInt(high - low + 1) + low;
                System.out.println(num);
                
                int counter = i;
                int numo = num%2;
                if (numo == 0){
                    System .out.println("Element # " + (counter+=1) + " in the array is " + num + " which is even.");
                    evenNums += 1;
                }
                else{
                    System .out.println("Element # " + (counter+=1) + " in the array is " + num + " which is odd.");
                    oddNums += 1;
                }
                
            }
            System.out.println("The array has " + evenNums + " even numbers and " + oddNums + " odd numbers.");
            
        }

    }
}
