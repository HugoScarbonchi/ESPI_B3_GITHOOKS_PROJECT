package project;

public class Main {

	public static void main(String[] args) {
		Store bordeauxAppleStore = new Store("Apple Store de Bordeaux", "Rue Sainte-Catherine", 20, 100, false);
		Customer johnDoe = new Customer("John", "Doe", 20, 1000, bordeauxAppleStore);
		
		// Store fermé
		// johnDoe.buyProduct(new Product("MacBook Pro 14 Pouces", 2000, TypeProduct.MACBOOK));
		
		bordeauxAppleStore.openTheStore();

		// Produit indisponible
		johnDoe.buyProduct(new Product("MacBook Pro 14 Pouces", 2000, TypeProduct.MACBOOK));
		
		bordeauxAppleStore.addAvailableProduct(new Product("MacBook Pro 14 Pouces", 2000, TypeProduct.MACBOOK));
		bordeauxAppleStore.addAvailableProduct(new Product("iPhone 13 Pro", 1700, TypeProduct.IPHONE));
		bordeauxAppleStore.addAvailableProduct(new Product("AirPods", 200, TypeProduct.AIRPODS));
		bordeauxAppleStore.addAvailableProduct(new Product("AirTag", 35, TypeProduct.ACCESSORIES));

		johnDoe.buyProduct(new Product("MacBook Pro 14 Pouces", 2000, TypeProduct.MACBOOK));
		johnDoe.buyProduct(new Product("iPhone 13 Pro", 1700, TypeProduct.IPHONE));
		johnDoe.buyProduct(new Product("AirTag", 35, TypeProduct.ACCESSORIES));
		
		// Pas assez d'argent
		johnDoe.buyTheBag();
		System.out.println();
		johnDoe.budget += 7500;
		johnDoe.buyTheBag();
		

		bordeauxAppleStore.addAvailableProduct(new Product("iMac 24 Pouces", 1669, TypeProduct.IMAC));
		
		
		johnDoe.buyProduct(new Product("Microsoft Surface", 1200, TypeProduct.AUTRES));
		johnDoe.buyProduct(new Product("iMac 24 Pouces", 1669, TypeProduct.IMAC));
		
		bordeauxAppleStore.catalog();
		
		johnDoe.buyTheBag();
		
		// L'employé vend des produits
		

		Customer jessieLion = new Customer("Jessie", "Lion", 30, 3000, bordeauxAppleStore);
		
		Employee employee = new Employee("Julia", "Fisher", 25, bordeauxAppleStore, 1800);

		employee.sellProduct(new Product("Microsoft Surface", 1200, TypeProduct.AUTRES), jessieLion);
		employee.sellProduct(new Product("MacBook Pro 14 Pouces", 2000, TypeProduct.MACBOOK), jessieLion);
		
		jessieLion.whatIsInTheBag();
		
		jessieLion.buyTheBag();
		
		
//		bordeauxAppleStore.addAvailableProduct(new Product("MacBook Air M2", 1500, TypeProduct.MACBOOK));
//		employee.sellProduct(new Product("MacBook Air M2", 1500, TypeProduct.MACBOOK), jessieLion);
		
		System.out.println();
		employee.yearSellingCheck();
		System.out.println();
		employee.yearSellingCheck();
	
		
		
		
	}

}
