
/**
 * Write a description of class ArraysAndStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArraysAndStuff2
{
    // instance variables - replace the example below with your own
    public static void main(){
        
        //int[] myArray = new int[8];
        
        //System.out.println(myArray.length);
        
        
        //for(int i=0; i < myArray.length; i++) {
          //  myArray[i] = i*15;
            
        //}
        // for(int i=0; i < myArray.length; i++) {
           // System.out.println("Value is " + myArray[i]);
            
        //}
        
        //double num = Math.random();
        
        //random number between 90 and 100 inclusive
        int num;
        
        for(int i=0; i < 30; i++){
            num = (int)((Math.random()*11)+90);
            System.out.println(num);
            System.out.println("remainder when dividing by 2 is: "+num%2);
    }


        
        
    }

}

