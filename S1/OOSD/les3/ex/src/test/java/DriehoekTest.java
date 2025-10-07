import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import domein.Driehoek;

public class DriehoekTest {
    @Test
    public void maakDriehoek_DrieGeldigeZijden_MaaktDriehoek() {
        Driehoek d = new Driehoek(3, 4, 5);
        Assertions.assertEquals(3, d.getA());
        Assertions.assertEquals(4, d.getB());
        Assertions.assertEquals(5, d.getC());
    }

    @Test
    public void maakDriehoek_ZijdeANetTeKlein_MaaktDriehoekMetZijdeAGelijkAan1() {
        Driehoek d = new Driehoek(0, 5, 8);
        Assertions.assertEquals(Driehoek.STANDAARD_WAARDE, d.getA());
        Assertions.assertEquals(5, d.getB());
        Assertions.assertEquals(8, d.getC());
    }

    @Test
    public void maakDriehoek_ZijdeATeKlein_MaaktDriehoekMetZijdeAGelijkAan1() {
        Driehoek d = new Driehoek(-10, 5, 8);
        Assertions.assertEquals(Driehoek.STANDAARD_WAARDE, d.getA());
        Assertions.assertEquals(5, d.getB());
        Assertions.assertEquals(8, d.getC());
    }

    @Test
    public void maakDriehoek_ZijdeBNetTeKlein_MaaktDriehoekMetZijdeBGelijkAan1() {
        Driehoek d = new Driehoek(5, 0, 8);
        Assertions.assertEquals(5, d.getA());
        Assertions.assertEquals(Driehoek.STANDAARD_WAARDE, d.getB());
        Assertions.assertEquals(8, d.getC());
    }

    @Test
    public void maakDriehoek_ZijdeBTeKlein_MaaktDriehoekMetZijdeBGelijkAan1() {
        Driehoek d = new Driehoek(5, -10, 8);
        Assertions.assertEquals(5, d.getA());
        Assertions.assertEquals(Driehoek.STANDAARD_WAARDE, d.getB());
        Assertions.assertEquals(8, d.getC());
    }

    @Test
    public void maakDriehoek_ZijdeCNetTeKlein_MaaktDriehoekMetZijdeCGelijkAan1() {
        Driehoek d = new Driehoek(5, 8, 0);
        Assertions.assertEquals(5, d.getA());
        Assertions.assertEquals(8, d.getB());
        Assertions.assertEquals(Driehoek.STANDAARD_WAARDE, d.getC());
    }

    @Test
    public void maakDriehoek_ZijdeCTeKlein_MaaktDriehoekMetZijdeCGelijkAan1() {
        Driehoek d = new Driehoek(5, 8, -10);
        Assertions.assertEquals(5, d.getA());
        Assertions.assertEquals(8, d.getB());
        Assertions.assertEquals(Driehoek.STANDAARD_WAARDE, d.getC());
    }

    @Test
    public void isRechthoekig_RechthoekigeDriehoekMetSchuineZijdeA_retourneertTrue() {
        Driehoek d = new Driehoek(5, 3, 4);
        Assertions.assertTrue(d.isRechthoekig());
    }

    @Test
    public void isRechthoekig_RechthoekigeDriehoekMetSchuineZijdeB_retourneertTrue() {
        Driehoek d = new Driehoek(3, 5, 4);
        Assertions.assertTrue(d.isRechthoekig());
    }

    @Test
    public void isRechthoekig_RechthoekigeDriehoekMetSchuineZijdeC_retourneertTrue() {
        Driehoek d = new Driehoek(3, 4, 5);
        Assertions.assertTrue(d.isRechthoekig());
    }

    @Test
    public void isRechthoekig_GeenRechthoekigeDriehoek_retourneertFalse() {
        Driehoek d = new Driehoek(5, 4, 5);
        Assertions.assertFalse(d.isRechthoekig());
    }
}
