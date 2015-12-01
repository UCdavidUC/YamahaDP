package yamaha;

/**
 *
 * @author Alejandra Martínez Cuevas A01334599
 * @author David Sánchez Almanza A01210766
 */
public class Drum {
    
    private String acousticRange;
    private String model;
    private int quantity;
    private float price;
    private double percussionDiameter;
    private Material[] materials;

    public void setAcousticRange(String acousticRange) {
        this.acousticRange = acousticRange;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setPercussionDiameter(double percussionDiameter) {
        this.percussionDiameter = percussionDiameter;
    }

    public void setMaterials(Material[] materials) {
        this.materials = materials;
    }
    
    public Drum(String model, float price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }
    
    public static class Builder {
        
        private String acousticRange;
        private String model;
        private int quantity;
        private float price;
        private double percussionDiameter;
        private Material[] materials;
        
        public Builder(String model, float price, int quantity) {
            this.model = model;
            this.price = price;
            this.quantity = quantity;
        }
        
        public Builder acousticRange(String a) {
            acousticRange = a;
            return this;
        }
        
        public Builder model(String m) {
            model = m;
            return this;
        }
        
        public Builder quantity(int q) {
            quantity = q;
            return this;
        }
        
        public Builder price(float p) {
            price = p;
            return this;
        }
        
        public Builder percussionDiameter(double pD) {
            percussionDiameter = pD;
            return this;
        }
        
        public Builder materials(Material[] materials) {
            this.materials = materials;
            return this;
        }
        
        public Drum build() {
            return new Drum(this);
        }
        
    }
    
    private Drum(Builder builder) {
        acousticRange = builder.acousticRange;
        model = builder.model;
        quantity = builder.quantity;
        price = builder.price;
        percussionDiameter = builder.percussionDiameter;
        materials = builder.materials;
    }
    
}
