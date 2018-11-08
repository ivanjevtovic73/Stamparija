package stampa;

public class Stampac {

	private Integer brojKopija;
	
	public Stampac(Integer brojKopija) {
		super();
		this.brojKopija = brojKopija;
	}
	
	public void stampaj(Stampanje s) {
		if(brojKopija >= 0) {
		System.out.println("Izlaz na stampac je:  " + s.pripremiZaStampu());
		brojKopija--;
		} else 
			System.out.println("Nema papira!");
	}
	
	public void prikaziNaEkranu(Prikazi prikazi) {
		System.out.println("Stampa se na ekranu:  ");
		prikazi.prikaziNaEkranu();
	}
	
	public Integer getBrojKopija() {
		return brojKopija;
	}
	
	public void setBrojKopija(Integer brojKopija) {
		this.brojKopija = brojKopija;
	}
	
	public void stampaj(Stampanje s, Integer brojKopija) {
		for(int i=0; i < brojKopija; i++)
			stampaj (s);
			
	}
	
}
