
/**
 * Write a description of class Pandas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pandas
{
    // instance variables - replace the example below with your own
    private String country;
    private double weight;
    public Pandas()
    {
        this.country = null;
        this.weight = 0.0;
    }
    public Pandas(String country, double weight){
        this.country = country;
        this.weight = weight;
    }
    //SETTER OR MUTATE METHODS
    public void setweight(double weight){
        this.weight = weight;
    }
    public void setcountry(String country){
        this.country = country;
    }
    //GETTER METHODS
    public String getcountry(){
            return this.country;
    }
    public double getweight(){
        return this.weight;
    }
    public String toString(){
        return "Country: " + this.country + " Weight: " + this.weight;
    }

  
}
