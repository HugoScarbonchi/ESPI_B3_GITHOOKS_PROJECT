package project;

public class Product {

    String name;
    Collection collection;
    long price;

    public Product(String name) {

        this.name = name;
    
    }
    
    public Product(String name, long price) {
    
        this.name = name;
        this.price = price;
    
    }
    
    public Product(String name, long price, Collection collection) {
    
        this.name = name;
        this.price = price;
        this.collection = collection;
    
    }
    
    public void ajouterPromotion(long promo) {
        
        this.price = this.price - promo;
    
    }
    
    public void ajouterPromotion(float pourcentage) {
    	
        this.price = (long) (this.price - this.price * pourcentage);
    
    }
    
    
    
    public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    
    public Collection getCollection() {
		return collection;
	}
    public void setCollection(Collection collection) {
        this.collection = collection;
    }
    
    public long getPrice() {
		return price;
	}
    public void setPrice(long price) {
		this.price = price;
	}
    
}