package yamaha;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author David
 */
public class BoatProductionManager implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Boat boat = (Boat) o;
        System.out.printf("The boat factory changed to: %s%n", boat.getState());
    }
    
}