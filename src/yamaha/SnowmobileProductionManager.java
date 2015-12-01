package yamaha;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author David
 */
public class SnowmobileProductionManager implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Snowmobile snow = (Snowmobile) o;
        System.out.printf("The snowmobile factory is in : %s%n", snow.getState());
    }
    
}
