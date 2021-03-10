// deklariramo javni razred Kozarec
public class Kozarec {

	// deklariramo lastnosti kozarca
	private int kolicinaVsebine;
	private int kapaciteta;
	private String vrstaVsebine;

	//deklariramo konstruktor
	public Kozarec(int k){

		// Inicializiramo lastnosti
		kolicinaVsebine = 0;
		kapaciteta = k;
		vrstaVsebine = "";		
	}

	// deklariramo metodo za polnjenje
	public boolean napolni(int kv, String vv){

		// preverimo ali je dovolj prostora za polnjenje
		if(kolicinaVsebine + kv <= kapaciteta){
			// ce je dovolj prostora
			kolicinaVsebine = kolicinaVsebine + kv;
			// zapisemo vrsto vsebine
			vrstaVsebine = vv;
			// vrnemo uspesnost polnjenja
			return true;

		}
		else {

			// ce ni prostora napolnimo do vrha
			kolicinaVsebine = kapaciteta;
			// vrnenmo false
			return false;
		}

	}

	// metoda vrne nivo kozarca
	public int getKolicinaVsebine(){		
		return kolicinaVsebine;
	}

	// metoda vrne vrsto vsebine
	public String getVrstaVsebine(){		
		return vrstaVsebine;
	}

	// metoda vrne nivo kozarca
	public int getKapaciteta(){		
		return kapaciteta;
	}


	// Definiramo glavno javno staticno metodo main
	public static void main(String[] args) {

		// Izpiše pozdrav na zaslon
		System.out.println("Pozdravljen, svet!");
	}	
} 