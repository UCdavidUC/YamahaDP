package yamaha;

import java.math.BigDecimal;

/**
 *
 * @author alejandramartinez1
 */
public class DuoGuitar extends Decorator {

    public DuoGuitar(GuitarDecoration decoration) {
        super(decoration);
    }
    
    @Override
    String addition() {
        return "Adding duo guitar extension, now you can play acoustic or electric";
    }

    @Override
    BigDecimal additionalPrice() {
        return new BigDecimal(20000);
    }
    
    
    
}
