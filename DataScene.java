import org.code.theater.*;
import org.code.media.*;

/**
 * Represents a Scene to be played in the Theater using data from
 * a choses dataset
 */
public class DataScene extends Scene {

  private GasPrice[] gasPrices; // 1D array of gas price objects

    /**
     * Constructor
     */
    public DataScene() {
        gasPrices = createGasPrices(); 
    }


  
  // Returns a 1D array of GasPrice objects using the txt files in this project 

public GasPrice[] createGasPrices() {
  /*
  *Makes a 1d array list of the dates using the dates txt file and doing it with the gas prices also 
  *Makes a new length and checks and reads through the files using 1d arrays 
  */
    String[] datesArray = FileReader.toStringArray("dates.txt"); //1d array of dates using the  dates txt file 
    double[] gasPricesArray = FileReader.toDoubleArray("USAverageGasPrices.txt"); //1d array of the gas prices using the USAverageGasPrices txt file 
  
    GasPrice[] gasPrices = new GasPrice[datesArray.length]; //Makes a new length

    for (int i = 0; i < gasPrices.length; i++) {
        gasPrices[i] = new GasPrice(datesArray[i], gasPricesArray[i]); //checks and reads through the files using 1d arrays 
    }

    return gasPrices; //returns the gas prices objects array
}
/*
*Uses a algorithm to find the lowest price by using the get method in the gas price to find the lowest price and
* then also print out the date that was recorded to have the lowest gas price in the united states
*/
  
 public void findLowestPrice() {
        if (gasPrices.length > 0) { // Check if there are gas prices
            GasPrice lowestPrice = gasPrices[0]; 

            for (int i = 1; i < gasPrices.length; i++) {
                if (gasPrices[i].getUSAverageGasPrices() < lowestPrice.getUSAverageGasPrices()) {
                    lowestPrice = gasPrices[i];
                }
            }
/*
 *Prints out the text "The lowest gas price was $:"  and then prints out the loweest price using the get average us prices and then the text "on"
 * and then it prints the lowest price using the get dates and the method above
 */
            System.out.println("The lowest gas price was $" + lowestPrice.getUSAverageGasPrices() + " on " + lowestPrice.getDates()); 
        } else {   
            System.out.println("No gas price data .");                        
        }
    }
//Algorithm that finds the highests price by getting the Dates and prices and finding  the highest one 
public void findHighestPrice() {
    if (gasPrices.length > 0) {
        double highestPrice = gasPrices[0].getUSAverageGasPrices();

        for (GasPrice gasPrice : gasPrices) {
            highestPrice = Math.max(highestPrice, gasPrice.getUSAverageGasPrices()); 
        }

        System.out.println("Highest Gas Price: $" + highestPrice); //Returns Highest gas price: $ and then the actually highestPrice
    } else {
        System.out.println("No gas price data"); //If the first print ln does not work it will print out no gas price data availiable instead 
    }
}
public  GasPrice getRandomGasPrice(){ 
int randomIndex = (int) (Math.random() * gasPrices.length);  //Makes a int random index and uses math.random to multiply a random value in the gas prices txt file to  print out a random value

return gasPrices[randomIndex]; //returns the random value 
  
}

  public void drawScene() {
    clear("white");
setTextHeight(15);
    setTextColor("black");
        GasPrice randomGasPrice = getRandomGasPrice();
      drawText(randomGasPrice.toString(), 20, 40);

        
  }

}
  





  



