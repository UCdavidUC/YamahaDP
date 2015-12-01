package yamaha;

/**
 *
 * @author Alejandra Martínez Cuevas A01334599
 * @author David Sánchez Almanza A01210766
 */
public class Guitar implements GuitarDecoration {
    
    private String acousticRange;
    private String model;
    private int stringsCount; 
    private int quantity;
    private float price;
    private Material[] materials;

    public void setAcousticRange(String acousticRange) {
        this.acousticRange = acousticRange;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStringsCount(int stringsCount) {
        this.stringsCount = stringsCount;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setMaterials(Material[] materials) {
        this.materials = materials;
    }
    
    public Guitar(String model, float price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }
    
    public static class Builder {
        
        private String acousticRange;
        private String model;
        private int stringsCount; 
        private int quantity;
        private float price;
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
        
        public Builder stringsCount(int stringsCount) {
            this.stringsCount = stringsCount;
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
        
        public Builder materials(Material[] materials) {
            this.materials = materials;
            return this;
        }
        
        public Guitar build() {
            return new Guitar(this);
        }
    }
    
    private Guitar(Builder builder) {
        acousticRange = builder.acousticRange;
        model = builder.model;
        stringsCount = builder.stringsCount;
        quantity = builder.quantity;
        price = builder.price;
        materials = builder.materials;
    }
    
}
