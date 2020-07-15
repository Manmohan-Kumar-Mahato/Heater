
/**
 * Model the operation of heater, with a temperature.
 * 
 * @author Manmohan 
 * @version 1.0 
 */
public class Heater 
{
    //The current temprature
    private double temperature;
    /*
     * Create a Heater object, with initial temperature
     * of 15 degrees.
     */
    public Heater()
    {
        this.temperature = 15.0;
    }
    /**
     * Decrease the temperature by 5 degrees.
     */
    public void warmer()
    {
        temperature += 5.0;
    }
    /**
     * Decrease the temperature by 5 degrees.
     */
    public void cooler()
    {
        temperature -= 5.0;
    }
}
