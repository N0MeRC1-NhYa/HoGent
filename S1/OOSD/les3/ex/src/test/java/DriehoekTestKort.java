import domein.Driehoek;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class DriehoekTestKort {
    private Driehoek d1;

    @BeforeEach
    public void before() {
        d1 = new Driehoek(3, 4, 5);
    }
    @Test
    public void maakDriehoek_DrieGeldigeZijden_MaaktDriehoek() {

        Assertions.assertEquals(3, d1.getA());
        Assertions.assertEquals(4, d1.getB());
        Assertions.assertEquals(5, d1.getC());
    }

    @ParameterizedTest
    @ValueSource(ints = {-10, 0})
    public void maakDriehoek_ZijdeATeKlein_MaaktDriehoekMetZijdeAGelijkAan1(int z) {
        Driehoek d = new Driehoek(z, 5, 8);
        Assertions.assertEquals(Driehoek.STANDAARD_WAARDE, d.getA());
        Assertions.assertEquals(5, d.getB());
        Assertions.assertEquals(8, d.getC());
    }

    @ParameterizedTest
    @ValueSource(ints = {-10, 0})
    public void maakDriehoek_ZijdeBNetTeKlein_MaaktDriehoekMetZijdeBGelijkAan1(int z) {
        Driehoek d = new Driehoek(5, z, 8);
        Assertions.assertEquals(5, d.getA());
        Assertions.assertEquals(Driehoek.STANDAARD_WAARDE, d.getB());
        Assertions.assertEquals(8, d.getC());
    }


    @ParameterizedTest
    @ValueSource(ints = {-10, 0})
    public void maakDriehoek_ZijdeCNetTeKlein_MaaktDriehoekMetZijdeCGelijkAan1(int z) {
        Driehoek d = new Driehoek(5, 8, z);
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

        Assertions.assertTrue(d1.isRechthoekig());
    }

    @Test
    public void isRechthoekig_GeenRechthoekigeDriehoek_retourneertFalse() {
        Driehoek d = new Driehoek(5, 4, 5);
        Assertions.assertFalse(d.isRechthoekig());
    }
}