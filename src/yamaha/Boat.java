package yamaha;

import java.util.Observable;

/**
 *
 * @author Alejandra Martínez Cuevas A01334599
 * @author David Sánchez Almanza A01210766
 */
public class Boat extends Observable {
    
    public enum State {
        IN_PRODCUTION, WAITING;
    }
    
    private State state = State.WAITING;
    
    public State getState () {
        return state;
    }
    
    public void buildBoat() {
        state = State.IN_PRODCUTION;
        setChanged();
        notifyObservers();
    }
    
    public void waitForOder() {
        state = State.WAITING;
        setChanged();
        notifyObservers();
    }
    
    private double gasCapacity;
    private double boatLength;
    private float price;
    private int quantity;
    private String model;
    private int year;

    public void setGasCapacity(double gasCapacity) {
        this.gasCapacity = gasCapacity;
    }

    public void setBoatLength(double boatLength) {
        this.boatLength = boatLength;
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
    
    public Boat(String model, float price, int quantity) {
        this.model = model; 
        this.price = price;
        this.quantity = quantity;
    }
    
    public static class Builder {
        
        private double gasCapacity;
        private double boatLength;
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
        
        public Builder boatLength(double length) {
            boatLength = length;
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
        
        public Boat build() {
            return new Boat(this);
        }
        
    }
    
    private Boat(Builder builder) {
        gasCapacity = builder.gasCapacity;
        boatLength = builder.boatLength;
        price = builder.price;
        quantity = builder.quantity;
        model = builder.model;
        year = builder.year;
    }
    
    
    
}
