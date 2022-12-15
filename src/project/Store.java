package project;

import java.util.ArrayList;

public class Store {
    
    String name;
    String address;
    int nbWorkers;
    int nbEmployees;
    int nbMaximumEmployees;
    boolean isOpen;
    ArrayList<Product> productsAvailable;
    
    public Store(String name, String address, int nbEmployees, int nbMaximumEmployees, boolean isOpen) {
    	this.name = name;
    	this.address = address;
    	this.nbWorkers = 0;
    	this.nbEmployees = nbEmployees;
    	this.nbMaximumEmployees = nbMaximumEmployees;
    	this.isOpen = isOpen;
    	productsAvailable = new ArrayList<Product>();
	}
    
    public void openTheStore() {
		this.isOpen = true;
		System.out.println("Bienvenue dans votre store préféré à " + address +  " !!!");
	}
    
    public void closeTheStore() {
    	this.nbWorkers = 0;
		isOpen = false;
	}
    
    
    public boolean canComeToWork() {
		if(nbEmployees == nbMaximumEmployees) {
			System.out.println("Il y a trop de monde, nous n'avons plus de poste pour vous.");
			return false;
		} else {
			System.out.println("Bienvenue !");
			return true;
		}
	}
    
    public void addAvailableProduct(Product product) {
		productsAvailable.add(product);
		System.out.println("[ New !  -  " + name + " ]    Le produit " + product.getName() + " est maintenant disponible à " + product.getPrice() + "€.");
	}
    
    public boolean isAvailable(Product product) {
    	for(Product productAvailable: productsAvailable) {
    		if (product.getName() == productAvailable.getName() && product.getTypeProduct() == productAvailable.getTypeProduct()) {
				return true;
			}
    	}
    	return false;
	}
    
    public void catalog() {
		System.out.println();
		System.out.println("~ ~ ~ PRODUITS DISPONIBLES DANS CE MAGASIN ~ ~ ~");
		System.out.println();
		for(Product product: productsAvailable) {
			System.out.println(product.getName() + " : " + product.getPrice() + "€");
		}
		System.out.println();
		System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
		System.out.println();
	}
    
    public void workerComeToWork(String nameWorker) {
    	this.nbWorkers++;
		System.out.println("Bienvenue au travail " + nameWorker + " !");
	}
    
    public float catalogPrice() {
    	float catalogPrice = 0;
    	for(Product product: productsAvailable) {
    		catalogPrice += product.getPrice();
    	}
		return catalogPrice;
	}
    public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    
    public String getAddress() {
		return address;
	}
    public void setAddress(String address) {
		this.address = address;
	}
    
    public int getNbEmployees() {
		return nbEmployees;
	}
    public void setNbEmployees(int nbEmployees) {
		this.nbEmployees = nbEmployees;
	}
    
    public int getNbMaximumEmployees() {
		return nbMaximumEmployees;
	}
    public void setNbMaximumEmployees(int nbMaximumEmployees) {
		this.nbMaximumEmployees = nbMaximumEmployees;
	}
    
    public int getNbWorkers() {
		return nbWorkers;
	}
    public void setNbWorkers(int nbWorkers) {
		this.nbWorkers = nbWorkers;
	}
    
    public boolean getIsOpen() {
		return isOpen;
	}
    public void setIsOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
    public ArrayList<Product> getProductsAvailable() {
		return productsAvailable;
	}
	
}
