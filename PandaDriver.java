
/**
 * Write a description of class PandaDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PandaDriver
{
    public static void main(){
        String[] pandaArray = {new Pandas("China", 834.3), new Pandas("Mexico", 834.3), new Pandas("Japan", 834.3)};
        for (int i=0; i<pandaArray.length; i++){
            
            System.out.println(pandaArray[i]);
        }
        
        /*
         * pandaArray[i] += new Pandas("China", 834.3);
        Pandas p1 = new Pandas("China" , 832.33);
        double currentweight = p1.getweight();
        currentweight += 1000.0;
        p1.setweight(currentweight);
        System.out.println(p1.getweight());
        System.out.println(p1.toString());
        p1.setweight(755.11);
        System.out.println(p1.toString());
        p1.setcountry("Japan");
        System.out.println(p1.toString());
        System.out.println(p1.getcountry());
        */
       
    }
}
