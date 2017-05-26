
/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehicle
{
    // A unique ID for this taxi.
    protected String id;
    // The destination of this taxi.
    protected String destination;
    // The location of this taxi.
    protected String location;

    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle(String id)
    {
       this.id = id;
    }

        /**
     * Return the status of this shuttle.
     * @return The status.
     */
    public String getStatus()
    {
        String returnString;
        returnString = id + " at " + location;
        if(destination != null){
               returnString += " headed for " + destination;
            }
            else {
                returnString += " and is not booked.";
            }
            return returnString;
    }

        /**
     * Return the ID of the shuttle.
     * @return The ID of the shuttle.
     */
    public String getID()
    {
        return id;
    }
    
    /**
     * Return the location of the shuttle.
     * @return The location of the shuttle.
     */
    public String getLocation()
    {
        return location;
    }
    
    /**
     * Return the destination of the shuttle.
     * @return The destination of the shuttle.
     */
    public String getDestination()
    {
        return destination;
    }    
    
        /**
     * Indicate that this vehicle has arrived at its destination.
     * As a result, it will be free.
     */
    public void arrived()
    {
        location = destination;
    }
}
