package project;

import java.util.ArrayList;

public class Employee extends Person {
	
	Store store;
	float salary;
	ArrayList<Product> productSold;
	
	public Employee(String firstName, String lastName, int age, Store store, float salary) {
		super(firstName, lastName, age);
		this.store = store;
		this.salary = salary;
		this.productSold = new ArrayList<Product>();
	}			

	
	public void sellProduct(Product product, Customer customer) {
		if (store.isAvailable(product)) {
			System.out.println(customer.getFirstName() + ", " + firstName + " va s'occuper de vous.");
			System.out.println("Vous voulez le produit " + product.getName() + " à " + product.getPrice() + "€. Nous l'avons en magasin, le voici !");
			productSold.add(product);
			customer.buyProduct(product);
		} else {
			System.out.println("Nous ne pouvons pas vendre le produit " + product.getName() + ", nous ne l'avons pas en magasin");
		}
	}
	
	public void yearSellingCheck() {
		System.out.println(firstName + " c'est l'heure du bilan annuel !");
		System.out.println("L'objectif de vente est de " + (store.catalogPrice()/4) + "€.");
		float totalPriceProductsSold = 0;
		for(Product product: productSold) {
			totalPriceProductsSold += product.getPrice();
		}
		
		System.out.println("Vous avez vendu un total de " + totalPriceProductsSold + "€.");
		
		if (totalPriceProductsSold > store.catalogPrice()/4) {
			System.out.println("Bravo ! Voici une promotion de 400€ !");
			float oldSalary = salary;
			this.getPromotion(400);
			System.out.println("Ancient salaire : " + oldSalary);
			System.out.println("Nouveau salaire : " + salary);
		} else if (store.catalogPrice()/4 > totalPriceProductsSold && totalPriceProductsSold > store.catalogPrice()/8) {
			System.out.println("Il va falloir faire mieux pour l'an prochain");
		} else {
			System.out.println("Réveillez-vous ! !");
		}
		
		productSold.clear();
	}
	
	
	public void getPromotion(int promotion) {
		salary += promotion;
	}

}
