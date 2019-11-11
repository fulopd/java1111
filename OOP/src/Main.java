import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
//		Ember[] emberek = new Ember[10];
//		String[] vezetekNevek = {"Szabó", "Nagy", "Gipsz", 
//								 "Fekete", "Szilágyi", "Majoros", 
//								 "Keve", "Lakatos", "Orsós",
//								 "Takács"};
//		String[] keresztNevek = {"Ádám","Éva","Béla","József","Szilvi",
//							   "Andi","Áron","Boglárka","Zoltán","Ágnes"};
//		Random rnd = new Random();
//		
//		
//		for (int i = 0; i < emberek.length; i++) {
//			emberek[i] = new Ember(vezetekNevek[rnd.nextInt(10)],
//								   keresztNevek[rnd.nextInt(10)], 
//								   rnd.nextInt(100)+1
//								   );
//			System.out.println(emberek[i]);
//		}
		
		
		Auto[] autok = new Auto[4];
		Random rnd = new Random();
		String[][] markak = {
							 {"Opel", "Astra", "Cadett", "Meriva"},
						 	 {"Renault", "Mégane", "laguna", "Fluence"},
							 {"BMW", "320d", "530i", "x5"},
						 	 {"Citroen", "c1", "c2", "c3"}						 	 
							};
		
		for (int i = 0; i < markak.length; i++) {
			int a = rnd.nextInt(4);
			autok[i] = new Auto(
						markak[a][0], 
						markak[a][rnd.nextInt(4)],
						rnd.nextInt(3000));
			System.out.println(autok[i]);
		}
	}

}
