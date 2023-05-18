
/**
 * Indicate that there was no passenger at a pickup point.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class ExistingPassengerException extends RuntimeException
{
    private Vehicle vehicle;
    /**
     * Constructor for objects of class MissingPassengerException.
     * @param vehicle The vehicle expecting a passenger.
     */
    public ExistingPassengerException(Vehicle vehicle)
    {
        super("Vehichle already has a passenger");
    }

    /**
     * @return The vehicle for which there was no passenger.
     */
    public Vehicle getVehicle()
    {
        return vehicle;
    }
}
