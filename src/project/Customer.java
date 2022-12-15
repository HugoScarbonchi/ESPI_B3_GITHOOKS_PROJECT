package project;

import java.util.ArrayList;

public class Customer extends Person {
	double budget;
	String accountIdentifier;
	ArrayList<Product> bag;
	Store visitedStore;
	
	public Customer(String firstName, String lastName, int age, float budget, Store visitedStore) {
		super(firstName, lastName, age);
		this.budget = budget;
		bag = new ArrayList<Product>();
		this.visitedStore = visitedStore;
	}
	
	public Customer(String firstName, String lastName, int age, float budget, String accountIdentifier, Store visitedStore) {
		super(firstName, lastName, age);
		this.budget = budget;
		this.accountIdentifier = accountIdentifier;
		bag = new ArrayList<Product>();
		this.visitedStore = visitedStore;
	}
	
	public void stopIfClose() {
		if (!visitedStore.isOpen) {
			System.out.println("Désolé mais le magasin n'est pas encore ouvert...");
			System.exit(1);
		}

	}
	
	private void addToBag(ArrayList<Product> listeProducts) {
		for(Product product: listeProducts) {
			bag.add(product);
		}

	}
	
	private double bagAmmount() {
		double totalPrice = 0;
		for(Product product: bag) {
			totalPrice += product.getPrice();
		}
		return totalPrice;
	}
	
	public void buyProduct(Product product) {
		stopIfClose();
	
		if (!visitedStore.isAvailable(product)) {
			System.out.println("Désolé mais nous n'avons pas le produit " + product.getName() + " en magasin.");
			return;
		}
		
		ArrayList<Product> listProducts = new ArrayList<Product>();
		listProducts.add(product);
		switch (product.typeProduct){
	
		case MACBOOK: {
			listProducts.add(new Product("Chargeur", 40, TypeProduct.ACCESSORIES));
			System.out.println("En plus de votre " + product.getName() + ", nous vous avons rajouté un " + listProducts.get(1).getName() + " à " + listProducts.get(1).getPrice() + "€.");
			break;
		}
		case IMAC: {
			listProducts.add(new Product("Souris", 20, TypeProduct.ACCESSORIES));
			listProducts.add(new Product("Clavier", 75, TypeProduct.ACCESSORIES));
			System.out.println("En plus de votre " + product.getName() + ", nous vous avons rajouté un " + listProducts.get(1).getName() + " à " + listProducts.get(1).getPrice() + "€ et des " + listProducts.get(2).getName() + " à " + listProducts.get(2).getPrice() + "€.");
			break;
		}
		case IPHONE: {
			listProducts.add(new Product("Chargeur", 40, TypeProduct.ACCESSORIES));
			listProducts.add(new Product("EarPods", 20, TypeProduct.ACCESSORIES));
			System.out.println("En plus de votre " + product.getName() + ", nous vous avons rajouté un " + listProducts.get(1).getName() + " à " + listProducts.get(1).getPrice() + "€ et des " + listProducts.get(2).getName() + " à " + listProducts.get(2).getPrice() + "€.");
			break;
		}
		default:
			System.out.println("Vous n'avez pas besoin d'accessoires supplémentaires avec le produit " + product.getName() + ".");;
		}
		
		addToBag(listProducts);
		

	}
	
	
	private boolean canBuyBag() {
		return this.budget > this.bagAmmount();
	}
	
	public void whatIsInTheBag() {
		System.out.println();
		System.out.println("Nom : " + lastName + "    Prénom : " + firstName);
		System.out.println();
		System.out.println("======= VOTRE PANIER =======");
		System.out.println();
		for(Product product: bag) {
			System.out.println(product.getPrice() + "€   -   " + product.getName());
		}
		System.out.println();
		System.out.println("----------------------------");
		System.out.println();
		System.out.println("Total : " + bagAmmount() + "€");
		System.out.println();
		System.out.println("============================");
		System.out.println();

	}
	
	public void buyTheBag() {
		stopIfClose();
		System.out.println();
		System.out.println("===================================");
		System.out.println("===================================");
		System.out.println("====                           ====");
		System.out.println("====    PASSAGE À LA CAISSE    ====");
		System.out.println("====                           ====");
		System.out.println("===================================");
		System.out.println("===================================");
		System.out.println();
		whatIsInTheBag();
		if (canBuyBag()) {
			budget = budget - bagAmmount();
			System.out.println();
			System.out.println("###  PAIEMENT ACCEPTÉ  ###");
			System.out.println();
			System.out.println("Il vous reste " + budget + "€");
			System.out.println("Merci pour vos achats, et à bientôt chez " + visitedStore.getName() + " !");
			bag = new ArrayList<Product>();
		} else {
			System.out.println();
			System.out.println("###  PAIEMENT REFUSÉ  ###");
			System.out.println();
			System.out.println("Malheuresement, ça ne va pas être possible d'achter cela, il vous manque : " + (this.bagAmmount() - this.budget) + "€");
			System.out.println("Vous avez " + budget + "€.");
		}

	}
	
}
