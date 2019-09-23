import javax.swing.JOptionPane;
/**
 * Write a description of class WhereIsWaldo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WhereIsWaldo
{
    // instance variables - replace the example below with your own
    public static void main(){
        String School = JOptionPane.showInputDialog("What school do you go to?");
        String Mascot = JOptionPane.showInputDialog("What is "+(School)+ "'s mascot?");
        if(School.equals("Granada")){
            if(Mascot.equals("Matadors")){
                String[] characters = {"Marty McFly", "Mufasa", "Waldo", "Elmo", null}; 
                for(int i=0; i < characters.length; i++){
                    if(characters[i] != null){
                        if(characters[i].equals("Waldo")){
                            System.out.println("We found him! " +(characters[i])+ " is in spot " +(i + 1)+ "!");
                        }
                        else{
                            System.out.println("We did not find Waldo at spot " + (i + 1) + ". In this spot is " + (characters[i]) + ".");
                        }    
                        }
                    else{
                        System.out.println("Spot " +(i+1)+ " is empty (null)");
                    }
            }
        }
            else{
                System.out.println("Incorrect mascot");
            }
              
        }
        else{
            System.out.println("Incorrect school");
        }
        
        
        
        
        
        
    }
}
