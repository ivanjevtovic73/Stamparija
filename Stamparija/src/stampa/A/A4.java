package stampa.A;

import stampa.Papir;
import stampa.Prikazi;
import stampa.Stampanje;

public class A4 extends Papir implements Stampanje, Prikazi {

	public A4(String gramaza, String sadrzaj, String boja) {
		super(gramaza, sadrzaj, boja);
	}

	@Override
	public void prikaziNaEkranu() {
		System.out.println(getSadrzaj());
	}

	@Override
	public String pripremiZaStampu() {
		return getSadrzaj();
	}

}
