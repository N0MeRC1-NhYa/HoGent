import domein.Rechthoek;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RechthoekTest {

    @Test
    public void maakRechthoek_ZonderOpgaveVanLengteEnBreedte_MaaktDefaultRechthoek() {
        Rechthoek r = new Rechthoek();
        Assertions.assertEquals(10.0, r.getLengte());
        Assertions.assertEquals(7.0, r.getBreedte());
    }

    @Test
    public void maakRechthoek_GeldigeLengteEnBreedte_MaaktRechthoek() {
        Rechthoek r = new Rechthoek(2.5, 4.5);
        Assertions.assertEquals(2.5, r.getLengte());
        Assertions.assertEquals(4.5, r.getBreedte());
    }

    @Test
    public void maakRechthoek_LengteNetGrootGenoeg_MaaktRechthoek() {
        Rechthoek r = new Rechthoek(Double.MIN_VALUE, 4);
        Assertions.assertEquals(Double.MIN_VALUE, r.getLengte());
        Assertions.assertEquals(4.0, r.getBreedte());
    }

    @Test
    public void maakRechthoek_BreedteNetGrootGenoeg_MaaktRechthoek() {
        Rechthoek r = new Rechthoek(4, Double.MIN_VALUE);
        Assertions.assertEquals(4.0, r.getLengte());
        Assertions.assertEquals(Double.MIN_VALUE, r.getBreedte());
    }

    @Test
    public void maakRechthoek_LengteNetTeKlein_MaaktRechthoekMetLengte1() {
        Rechthoek r = new Rechthoek(0, 4);
        Assertions.assertEquals(Rechthoek.STANDAARD_WAARDE, r.getLengte());
        Assertions.assertEquals(4.0, r.getBreedte());
    }

    @Test
    public void maakRechthoek_LengteTeKlein_MaaktRechthoekMetLengte1() {
        Rechthoek r = new Rechthoek(-10.55, 4);
        Assertions.assertEquals(Rechthoek.STANDAARD_WAARDE, r.getLengte());
        Assertions.assertEquals(4.0, r.getBreedte());
    }

    @Test
    public void maakRechthoek_BreedteNetTeKlein_MaaktRechthoekMetBreedte1() {
        Rechthoek r = new Rechthoek(4, 0);
        Assertions.assertEquals(4.0, r.getLengte());
        Assertions.assertEquals(Rechthoek.STANDAARD_WAARDE, r.getBreedte());
    }

    @Test
    public void maakRechthoek_BreedteTeKlein_MaaktRechthoekMetBreedte1() {
        Rechthoek r = new Rechthoek(4, -10.55);
        Assertions.assertEquals(4.0, r.getLengte());
        Assertions.assertEquals(Rechthoek.STANDAARD_WAARDE, r.getBreedte());
    }

    @Test
    public void berekenOppervlakte_RetourneertOppervlakte() {
        Rechthoek r = new Rechthoek(2, 4);
        Assertions.assertEquals(8.0, r.berekenOppervlakte(), 0.01);
    }

    @Test
    public void berekenOmtrek_RetourneertOmtrek() {
        Rechthoek r = new Rechthoek(2, 4);
        Assertions.assertEquals(12.0, r.berekenOmtrek(), 0.01);
    }

}
