package model;

import java.util.Scanner;

public class Description implements Hotel {

	int prix;
	String model;
	int prix2;
	String model2;
	@Override
	public int reserverTaxi() {
		// TODO Auto-generated method stub
		System.out.println("What Price? 1: voiture de lux, 2: voiture pas chere");
		Scanner sc= new Scanner(System.in);
		int userChoice= sc.nextInt();
		if(userChoice == 1) {
			System.out.println("the cost of the car is: "+ prix+"€"+"\nYour car model is: "+ model);
			
		}else if(userChoice == 2) {
			System.out.println("the cost of the car is: "+ prix2+"€"+"\nYour car model is: "+ model2);
		}else {
			System.out.println("Please choose from the menu");
		}
		return 0;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getPrix2() {
		return prix2;
	}

	public void setPrix2(int prix2) {
		this.prix2 = prix2;
	}

	@Override
	public void descriptionPiscineLuxe() {
		// TODO Auto-generated method stub
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel2() {
		return model2;
	}

	public void setModel2(String model2) {
		this.model2 = model2;
	}

}
