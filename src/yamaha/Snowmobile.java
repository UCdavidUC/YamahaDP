package yamaha;

/**
 *
 * @author Alejandra Martínez Cuevas A01334599
 * @author David Sánchez Almanza A01210766
 */
public class Snowmobile {
    
    private double gasCapacity;
    private String tractionType;
    private float price;
    private int quantity;
    private String model;
    private int year;

    public void setGasCapacity(double gasCapacity) {
        this.gasCapacity = gasCapacity;
    }

    public void setTractionType(String tractionType) {
        this.tractionType = tractionType;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public Snowmobile(String model, float price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }
    
    public static class Builder {
        
        private double gasCapacity;
        private String tractionType;
        private float price;
        private int quantity;
        private String model;
        private int year;
        
        public Builder(String model, float price, int quantity) {
            this.model = model;
            this.price = price;
            this.quantity = quantity;
        }
        
        public Builder gasCapacity(double gasCapacity) {
            this.gasCapacity = gasCapacity;
            return this;
        }
        
        public Builder tractionType(String tractionType) {
            this.tractionType = tractionType;
            return this;
        }
        
        public Builder price(float price) {
            this.price = price;
            return this;
        }
        
        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }
        
        public Builder model(String model) {
            this.model = model;
            return this;
        }
        
        public Builder year(int year) {
            this.year = year;
            return this;
        }
        
        public Snowmobile build() {
            return new Snowmobile(this);
        }
        
    }
    
    private Snowmobile(Builder builder) {
        gasCapacity = builder.gasCapacity;
        tractionType = builder.tractionType;
        price = builder.price;
        quantity = builder.quantity;
        model = builder.model;
        year = builder.year;
    }
    
    
}
