package model;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Description voiture = new Description();
		voiture.setPrix(500);
		voiture.setModel("Fiat multipla");
		voiture.setPrix2(1500);
		voiture.setModel2("Ferrari multipla");
		voiture.reserverTaxi();
	}

}
