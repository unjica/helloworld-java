// deklariramo javni razred Krigel, ki razširja razred Kozarec
/**
 * @author Sanja
 *
 */
public class Krigel extends Kozarec {

    // deklariramo lastnosti ki so znacilne samo za krigle ne pa za vse tipa kozarec
    private String material;
    private String oblikaRocaja;
    private boolean imaPokrov;
    private boolean pokrovOdprt;

    // deklariramo nov konstruktor
    public Krigel(int k, String m, String or, boolean ip) {

        // Klicemo konstruktor nadrazreda
        super(k);

        // Inicializiramo lastnosti
        material = m;
        oblikaRocaja = or;
        imaPokrov = ip;
        pokrovOdprt = false;
    }

    // Deklariramo nove metode
    public void odpriPokrov() throws Exception {

        // ce krigel nima pokrova, vrze izjemo
        if (!imaPokrov) {

            throw new Exception("Krigel nima pokrova!");

        }

        // spremenimo lastnosti
        pokrovOdprt = true;
    }

    // metoda vrne material
    public String getMaterial() {

        return material;
    }
}