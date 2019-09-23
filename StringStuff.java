import javax.swing.JOptionPane;
/**
 * Write a description of class StringStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringStuff
{
  public static void main(){
      //String name = "greg";
     // String name2 = "greg";
      String[] classmates = {"Wilson", null, "Bob", "Austin"};
      
     for(int i=0; i <classmates.length; i++){
         if(classmates[i] != null){
            System.out.println(classmates[i].length());
        }

        }
      
      
      
      
      /**
      int a = 10;
      int b = 10;
      if(name.equals(name2)){
          System.out.println("they are the same");
        }
      else{
          System.out.println("They are no twins");
        }
      */
      
      
      
    }
}
