package yamaha;

import java.util.Observable;

/**
 *
 * @author Alejandra Martínez Cuevas A01334599
 * @author David Sánchez Almanza A01210766
 */
public class Motorcycle extends Observable {
    
    public enum State {
        IN_PRODCUTION, WAITING;
    }
    
    private State state = State.WAITING;
    
    public State getState() {
        return state;
    }
    
    public void buildMotorcycle() {
        state = State.IN_PRODCUTION;
        setChanged();
        notifyObservers();
    }
    
    public void waitForOrder() {
        state = State.WAITING;
        setChanged();
        notifyObservers();
    }
    
    private double gasCapacity;
    private double wheelSize;
    private float price;
    private int quantity;
    private int year;
    private String model;

    public void setGasCapacity(double gasCapacity) {
        this.gasCapacity = gasCapacity;
    }

    public void setWheelSize(double wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public Motorcycle(String model, float price, int quantity) { 
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }
    
    public static class Builder {
        
        private double gasCapacity;
        private double wheelSize;
        private float price;
        private int quantity;
        private int year;
        private String model;
        
        public Builder(String model, float price, int quantity) {
            this.model = model;
            this.price = price;
            this.quantity = quantity;
        }
        
        public Builder gasCapacity(double capacity) {
            gasCapacity = capacity;
            return this;
        }
        
        public Builder wheelSize(double wheelSize) {
            this.wheelSize = wheelSize;
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
        
        public Builder year(int year) {
            this.year = year;
            return this;
        }
        
        public Builder model(String model) {
            this.model = model;
            return this;
        }
        
        public Motorcycle build() {
            return new Motorcycle(this);
        }
    }
    
    private Motorcycle(Builder builder) {
        gasCapacity = builder.gasCapacity;
        wheelSize = builder.wheelSize;
        price = builder.price;
        quantity = builder.quantity;
        year = builder.year;
        model = builder.model;
    }
    
        
}
