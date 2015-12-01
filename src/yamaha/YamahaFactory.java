package yamaha;

/**
 *
 * @author 
 */
public interface YamahaFactory {
    
    public Motorcycle createMotorcycle();
    public Boat createBoat();
    public Snowmobile createSnowmobile();
    
    public Piano createPiano();
    public Guitar createGuitar();
    public Drum createDrum();

}
