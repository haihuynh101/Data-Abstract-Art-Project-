
/**
 * Represents gas prices  with dates
 */
public class GasPrice {

  private String  dates; //The dates of when the gas prices were recorded
  private double USAverageGasPrices;  // The United States average gas price during that date 
   
        // Constructor 
  public GasPrice(String dates, double USAverageGasPrices) {
        this.dates = dates; //Sets the dates
        this.USAverageGasPrices = USAverageGasPrices; // Sets the average gas prices for the U.S
    }

    public String getDates() {

        return dates; //Gets and returns the dates 
      }

    public double getUSAverageGasPrices() {
        return USAverageGasPrices; //Gets and returns the United States average gas prices during a certain date 
    }
}


  
  /** toString Method override */

 
  


