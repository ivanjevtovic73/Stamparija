package stampa.A;

import stampa.Papir;
import stampa.Prikazi;

public class A0 extends Papir implements Prikazi {

	public A0(String gramaza, String sadrzaj, String boja) {
		super(gramaza, sadrzaj, boja);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prikaziNaEkranu() {
		System.out.println(getSadrzaj());
	}

}
