package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArtiklTest {

    @Test
    void ispisi() {
        Artikl x = new Artikl("test", 1, "test");
        Artikl y = new Artikl(x);
        assertEquals("Naziv artikla: test\tCijena artikla: 1.0", y.ispisi());
    }
}