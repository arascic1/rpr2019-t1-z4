package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket x = new Supermarket();
        Artikl y = new Artikl("test", 1, "test");
        x.dodajArtikl(y); Artikl[] niz = x.getArtikli();
        assertEquals(y, niz[0]);
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket x = new Supermarket();
        Artikl y = new Artikl("test", 1, "test");
        x.dodajArtikl(y);
        assertAll(() -> { assertEquals(y, x.izbaciArtiklSaKodom("test")); },
                () -> { assertNull(x.izbaciArtiklSaKodom("fail")); });
    }
}