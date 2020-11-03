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

    public void ispisi() {
        System.out.println("Naziv artikla: " +
                getNaziv() + "\tCijena artikla: " + getCijena()); // ispis null reference??
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
