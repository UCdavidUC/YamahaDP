package yamaha;

import java.math.BigDecimal;

/**
 *
 * @author alejandramartinez1
 */
public class Pedals extends Decorator {
    
    public Pedals(GuitarDecoration decoration) {
        super(decoration);
    }

    @Override
    String addition() {
        return "Adding pedals to guitar equipment.";
    }

    @Override
    BigDecimal additionalPrice() {
        return new BigDecimal(5000);
    }
    
}
