package yamaha;

/**
 *
 * @author Alejandra Martínez Cuevas A01334599
 * @author David Sánchez Almanza A01210766
 */
public class Piano {

    private String acousticRange;
    private String model;
    private int quantity;
    private float price;
    private String tone;
    private String type;
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

    public void setTone(String tone) {
        this.tone = tone;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMaterials(Material[] materials) {
        this.materials = materials;
    }
    
    public Piano(String model, float price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }
    
    public static class Builder {
        
        private String acousticRange;
        private String model;
        private int quantity;
        private float price;
        private String tone;
        private String type;
        // TODO materials
        private Material[] materials;
        
        public Builder(String model, float price, int quantity) {
            this.model = model;
            this.price = price;
            this.quantity = quantity;
        }
        
        public Builder acousticRange(String acousticRange) {
            this.acousticRange = acousticRange;
            return this;
        }
        
        public Builder model(String model) {
            this.model = model;
            return this;
        }
        
        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }
        
        public Builder price(float price) {
            this.price = price;
            return this;
        }
        
        public Builder tone(String tone) {
            this.tone = tone;
            return this;
        }
        
        public Builder type(String type) {
            this.type = type;
            return this;
        }
        
        public Builder materials(Material[] material) {
            this.materials = materials;
            return this;
        }
        
        public Piano build() {
            return new Piano(this);
        }
        
    }
    
    public Piano(Builder builder) {
        acousticRange = builder.acousticRange;
        model = builder.model;
        quantity = builder.quantity;
        price = builder.price;
        tone = builder.tone;
        type = builder.type;
        materials = builder.materials;
    }
    
}
