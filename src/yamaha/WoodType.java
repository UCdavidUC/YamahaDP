package yamaha;

import java.math.BigDecimal;

/**
 *
 * @author alejandramartinez1
 */
public class WoodType extends Decorator {
    
    public WoodType(GuitarDecoration decoration) {
        super(decoration);
    }

    @Override
    String addition() {
        return "Adding high quality wood to build";
    }

    @Override
    BigDecimal additionalPrice() {
        return new BigDecimal(8000);
    }
    
}
