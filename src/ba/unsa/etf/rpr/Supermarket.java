package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    private int polozaj = 0;

    public Artikl[] getArtikli() {
        Artikl[] output = new Artikl[polozaj + 1];
        for(int i = 0; i < polozaj; i++) output[i] = artikli[i];
        return output;
    }
    public void dodajArtikl(Artikl artikl) {
        artikli[polozaj++] = artikl;
    }
    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i = 0; i < polozaj; i++) {
            if(artikli[i] == null) continue;
            if(artikli[i].getKod().equals(kod)) {
                Artikl temp = artikli[i];
                artikli[i] = null;
                polozaj--;
                return temp;
            }
        }
        return null;
    }
}