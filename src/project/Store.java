public class Store {
    
    String name;
    String address;
    int nbWorkers;
    int nbEmployees;
    int nbMaximumEmployees;
    boolean isOpen;
    
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
		System.out.println("Bienvenue dans votre store préféré !");
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
    

}
