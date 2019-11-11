
public class Ember {

	// Alt + Shif + s - konstruktor / getter setter generálás
	//Ctrl + shift + f - kód rendezés
	private String vezetekNev;
	private String keresztNev;
	private int eletkor;

	public Ember(String vezetekNev, String keresztNev, int eletkor) {
		this.vezetekNev = vezetekNev;
		this.keresztNev = keresztNev;
		this.eletkor = eletkor;
	}

	public String getVezetekNev() {
		return vezetekNev;
	}

	public void setVezetekNev(String vezetekNev) {
		this.vezetekNev = vezetekNev;
	}

	public String getKeresztNev() {
		return keresztNev;
	}

	public void setKeresztNev(String keresztNev) {
		this.keresztNev = keresztNev;
	}

	public int getEletkor() {
		return eletkor;
	}

	public void setEletkor(int eletkor) {
		this.eletkor = eletkor;
	}

	@Override
	public String toString() {
		return vezetekNev + " " + keresztNev + " " + eletkor;
	}
}
