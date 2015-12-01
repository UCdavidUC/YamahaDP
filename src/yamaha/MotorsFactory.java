package yamaha;

/**
 *
 * @author Alejandra Martinez Cuevas A01334599
 * @version 1.0
 */
public class MotorsFactory implements YamahaMotorsFactory {

    @Override
    public Motorcycle createMotorcycle() {
        Motorcycle motorcycle = new Motorcycle.Builder("Sports TC5000", 50000, 24).build();
        return motorcycle;
    }

    @Override
    public Boat createBoat() {
        Boat boat = new Boat.Builder("Aquatic 5000", 128000, 50).build();
        return boat;
    }

    @Override
    public Snowmobile createSnowmobile() {
        Snowmobile snowmobile = new Snowmobile.Builder("Snowball 9000", 500000, 10).build();
        return snowmobile;
    }
    
}
