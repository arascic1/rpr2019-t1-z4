package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] korpica = new Artikl[50];
    static int polozaj = 0;

    public boolean dodajArtikl(Artikl artikal) {
        korpica[polozaj++] = artikal;
        return polozaj <= 50;
    }
    public Artikl[] getArtikli() {
        return korpica;
    }
    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i = 0; i < polozaj; i++)
            if(korpica[i].getKod().equals(kod)) {
                Artikl temp = korpica[i];
                korpica[i] = null; polozaj--;
                return temp;
            }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int sum = 0;
        for(Artikl x : korpica) if(x != null) sum += x.getCijena();
        return sum;
    }
}
