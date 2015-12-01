package yamaha;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Alejandra Martínez Cuevas A01334599
 * @author David Sánchez Almanza A01210766
 */
public class MotorcycleProductionManager implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Motorcycle motorcycle = (Motorcycle) o;
        System.out.printf("The Motorcycle factory is in %s%n", motorcycle.getState());
    }
    
}
    