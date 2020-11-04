package ba.unsa.etf.rpr;

public class Artikl {
    private double cijena;
    private String naziv = null, kod = null;

    public Artikl(String naziv, double cijena, String kod) {
        this.cijena = cijena; this.naziv = naziv; this.kod = kod;
    }
    public Artikl(Artikl artikl) {
        cijena = artikl.cijena; naziv = artikl.naziv; kod = artikl.kod;
    }

    public String ispisi() {
        String ispis = "Naziv artikla: " + getNaziv() + "\tCijena artikla: " + getCijena();
        System.out.println(ispis);
        return ispis;
    }
    public double getCijena() {
        return cijena;
    }
    public String getNaziv() {
        return naziv;
    }
    public String getKod() {
        return kod;
    }
}
