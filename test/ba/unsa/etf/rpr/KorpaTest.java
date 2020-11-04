package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Artikl x = new Artikl("test", 1, "testKod");
        Korpa k = new Korpa();
        Assertions.assertAll(() -> assertTrue(k.dodajArtikl(x)),
                () -> assertThrows(ArrayIndexOutOfBoundsException.class,
                        () -> { for(int i = 1; i <= 50; i++) k.dodajArtikl(x); }));
    }

    @Test
    void getArtikli() {
        Korpa k = new Korpa();
        Artikl x = new Artikl("test", 1, "test");
        k.dodajArtikl(x);
        Artikl[] niz = k.getArtikli();
        assertEquals(niz[0], x);
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa k = new Korpa();
        Artikl x = new Artikl("test", 1, "test");
        k.dodajArtikl(x);
        Artikl test = k.izbaciArtiklSaKodom("test");
        Assertions.assertAll(() -> assertEquals(test, x),
                () -> assertNull(k.izbaciArtiklSaKodom("fail")));
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa k = new Korpa();
        Artikl x = new Artikl("test", 1, "test");
        for(int i = 0; i < 50; i++) k.dodajArtikl(x);
        assertEquals(k.dajUkupnuCijenuArtikala(), 50);
    }
}