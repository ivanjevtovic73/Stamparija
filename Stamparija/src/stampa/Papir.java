package stampa;

public class Papir implements Stampanje, Prikazi {

	private String gramaza;
	private String sadrzaj;
	private String boja;
	
	public Papir(String gramaza, String sadrzaj, String boja) {
		super();
		this.gramaza = gramaza;
		this.sadrzaj = sadrzaj;
		this.boja = boja;
	}

	
	public String getGramaza() {
		return gramaza;
	}

	public void setGramaza(String gramaza) {
		this.gramaza = gramaza;
	}

	public String getSadrzaj() {
		return sadrzaj;
	}

	public void setSadrzaj(String sadrzaj) {
		this.sadrzaj = sadrzaj;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public String pripremitiZaStampu() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void prikaziNaEkranu() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String pripremiZaStampu() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
