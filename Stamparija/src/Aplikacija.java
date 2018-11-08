import stampa.Stampac;
import stampa.A.A0;
import stampa.A.A4;

public class Aplikacija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Stampac stampac = new Stampac(5);
	
	A4 a4 = new A4("15g", "Zadatak za stampu.", "bela");
	A0 a0 = new A0("20g", "Probaj da me odstampas!", "zuta");
	
	stampac.prikaziNaEkranu(a4);
	stampac.prikaziNaEkranu(a0);
	
	 	
	//	stampac.stampaj(a4,4); 	- 	ne moze da se stampa jer format unosa nije odgovarajuci
	//	stampac.stampaj(a0);	-	ne moze da se stampa zbog interfejsa
			
	}

}
