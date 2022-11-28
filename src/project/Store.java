package project;

public class Store {
    
    String name;
    String address;
    int nbWorkers;
    int nbEmployees;
    int nbMaximumEmployees;
    boolean isOpen;
    
	//test
    public Store(String name, String address, int nbEmployees, int nbMaximumEmployees, boolean isOpen) {
    	this.name = name;
    	this.address = address;
    	this.nbWorkers = 0;
    	this.nbEmployees = nbEmployees;
    	this.nbMaximumEmployees = nbMaximumEmployees;
    	this.isOpen = isOpen;
	}
    
    public void openTheStore() {
		this.isOpen = true;
		System.out.println("Bienvenue dans votre store pr�f�r� !");
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
    
    public void workerComeToWork(String nameWorker) {
    	this.nbWorkers++;
		System.out.println("Bienvenue au travail " + nameWorker + " !");
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
    

}
