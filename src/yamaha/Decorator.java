package yamaha;

import java.math.BigDecimal;

/**
 *
 * @author alejandramartinez1
 */
public abstract class Decorator implements GuitarDecoration {
    
    public final GuitarDecoration guitar;
    
    public Decorator(GuitarDecoration guitar) {
        this.guitar = guitar;
    }
    
    abstract String addition();
    
    abstract BigDecimal additionalPrice();
    
}
