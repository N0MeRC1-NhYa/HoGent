import domein.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

public class ProductTest {

    private Product p1, p2, p3;

    @BeforeEach
    public void before() {
        p1 = new Product("Veggie Smoothie", 1.48, 21, 5);
        p2 = new Product("Fruit Smoothie", 1.48, 12, 10);
    }

    @Test
    public void maakProduct_NormaleData_MaaktProduct() {
        Product p = new Product("Spa Bruis", 1.50, 10, 20);
        Assertions.assertEquals("Spa Bruis", p.getNaam());
        Assertions.assertEquals(1.50, p.getPrijsExclBtw());
        Assertions.assertEquals(10, p.getBtwPercentage());
        Assertions.assertEquals(20, p.getKortingStuksPercentage());
    }

    @Test
    public void maakProduct_KortingStuksPercentageNetGrootGenoeg_MaaktProduct() {
        Product p = new Product("Spa Bruis", 1.50, 10, 0);
        Assertions.assertEquals("Spa Bruis", p.getNaam());
        Assertions.assertEquals(1.50, p.getPrijsExclBtw());
        Assertions.assertEquals(10, p.getBtwPercentage());
        Assertions.assertEquals(0, p.getKortingStuksPercentage());
    }

    @Test
    public void maakProduct_KortingStuksPercentageNetNietTeGroot_MaaktProduct() {
        Product p = new Product("Spa Bruis", 1.50, 10, Product.BOVENGRENS_KORTING_STUKS);
        Assertions.assertEquals("Spa Bruis", p.getNaam());
        Assertions.assertEquals(1.50, p.getPrijsExclBtw());
        Assertions.assertEquals(10, p.getBtwPercentage());
        Assertions.assertEquals(Product.BOVENGRENS_KORTING_STUKS, p.getKortingStuksPercentage());
    }

    @Test
    public void maakProduct_KortingStuksPercentageNetTeKlein_MaaktProductMetKortingStuksPercentage0() {
        Product p = new Product("Spa Bruis", 1.50, 21, -1);
        Assertions.assertEquals("Spa Bruis", p.getNaam());
        Assertions.assertEquals(1.50, p.getPrijsExclBtw());
        Assertions.assertEquals(21, p.getBtwPercentage());
        Assertions.assertEquals(0, p.getKortingStuksPercentage());
    }

    @Test
    public void maakProduct_KortingStuksPercentageTeKlein_MaaktProductMetKortingStuksPercentage0() {
        Product p = new Product("Spa Bruis", 1.50, 21, -50);
        Assertions.assertEquals("Spa Bruis", p.getNaam());
        Assertions.assertEquals(1.50, p.getPrijsExclBtw());
        Assertions.assertEquals(21, p.getBtwPercentage());
        Assertions.assertEquals(0, p.getKortingStuksPercentage());
    }

    @Test
    public void maakProduct_KortingStuksPercentageNetTeGroot_MaaktProductMetKortingStuksPercentage0() {
        Product p = new Product("Spa Bruis", 1.50, 21, 51);
        Assertions.assertEquals("Spa Bruis", p.getNaam());
        Assertions.assertEquals(1.50, p.getPrijsExclBtw());
        Assertions.assertEquals(21, p.getBtwPercentage());
        Assertions.assertEquals(0, p.getKortingStuksPercentage());
    }

    @Test
    public void maakProduct_KortingStuksPercentageTeGroot_MaaktProductMetKortingStuksPercentage0() {
        Product p = new Product("Spa Bruis", 1.50, 21, 88);
        Assertions.assertEquals("Spa Bruis", p.getNaam());
        Assertions.assertEquals(1.50, p.getPrijsExclBtw());
        Assertions.assertEquals(21, p.getBtwPercentage());
        Assertions.assertEquals(0, p.getKortingStuksPercentage());
    }

    @Test
    public void maakProduct_BtwPercentageNetGrootGenoeg_MaaktProduct() {
        Product p = new Product("Spa Bruis", 1.50, Product.ONDERGRENS_BTW, 20);
        Assertions.assertEquals("Spa Bruis", p.getNaam());
        Assertions.assertEquals(1.50, p.getPrijsExclBtw());
        Assertions.assertEquals(Product.ONDERGRENS_BTW, p.getBtwPercentage());
        Assertions.assertEquals(20, p.getKortingStuksPercentage());
    }

    @Test
    public void maakProduct_BtwPercentagePercentageNetNietTeGroot_MaaktProduct() {
        Product p = new Product("Spa Bruis", 1.50, Product.BOVENGRENS_BTW, 20);
        Assertions.assertEquals("Spa Bruis", p.getNaam());
        Assertions.assertEquals(1.50, p.getPrijsExclBtw());
        Assertions.assertEquals(Product.BOVENGRENS_BTW, p.getBtwPercentage());
        Assertions.assertEquals(20, p.getKortingStuksPercentage());
    }

    @Test
    public void maakProduct_BtwPercentageNetTeKlein_MaaktProductMetBtwPercentage21() {
        Product p = new Product("Spa Bruis", 1.50, 5, 20);
        Assertions.assertEquals("Spa Bruis", p.getNaam());
        Assertions.assertEquals(1.50, p.getPrijsExclBtw());
        Assertions.assertEquals(Product.BOVENGRENS_BTW, p.getBtwPercentage());
        Assertions.assertEquals(20, p.getKortingStuksPercentage());
    }

    @Test
    public void maakProduct_BtwPercentageTeKlein_MaaktProductMetBtwPercentage21() {
        Product p = new Product("Spa Bruis", 1.50, 1, 20);
        Assertions.assertEquals("Spa Bruis", p.getNaam());
        Assertions.assertEquals(1.50, p.getPrijsExclBtw());
        Assertions.assertEquals(Product.BOVENGRENS_BTW, p.getBtwPercentage());
        Assertions.assertEquals(20, p.getKortingStuksPercentage());
    }

    @Test
    public void maakProduct_BtwPercentageNetTeGroot_MaaktProductMetBtwPercentage21() {
        Product p = new Product("Spa Bruis", 1.50, 22, 20);
        Assertions.assertEquals("Spa Bruis", p.getNaam());
        Assertions.assertEquals(1.50, p.getPrijsExclBtw());
        Assertions.assertEquals(Product.BOVENGRENS_BTW, p.getBtwPercentage());
        Assertions.assertEquals(20, p.getKortingStuksPercentage());
    }

    @Test
    public void maakProduct_BtwPercentageTeGroot_MaaktProductMetBtwPercentage21() {
        Product p = new Product("Spa Bruis", 1.50, 35, 20);
        Assertions.assertEquals("Spa Bruis", p.getNaam());
        Assertions.assertEquals(1.50, p.getPrijsExclBtw());
        Assertions.assertEquals(Product.BOVENGRENS_BTW, p.getBtwPercentage());
        Assertions.assertEquals(20, p.getKortingStuksPercentage());
    }

    @Test
    public void maakProduct_PrijsExclBtwNetPositief_MaaktProduct() {
        Product p = new Product("Spa Bruis", Double.MIN_VALUE, 20, 20);
        Assertions.assertEquals("Spa Bruis", p.getNaam());
        Assertions.assertEquals(Double.MIN_VALUE, p.getPrijsExclBtw());
        Assertions.assertEquals(20, p.getBtwPercentage());
        Assertions.assertEquals(20, p.getKortingStuksPercentage());
    }

    @Test
    public void maakProduct_PrijsExclBtwNul_MaaktProductMetPrijs1() {
        Product p = new Product("Spa Bruis", 0, 20, 20);
        Assertions.assertEquals("Spa Bruis", p.getNaam());
        Assertions.assertEquals(Product.DEFAULT_PRIJS_EXCL_BTW, p.getPrijsExclBtw());
        Assertions.assertEquals(20, p.getBtwPercentage());
        Assertions.assertEquals(20, p.getKortingStuksPercentage());
    }

    @Test
    public void maakProduct_PrijsExclBtwNegatief_MaaktProductMetPrijs1() {
        Product p = new Product("Spa Bruis", -10, 20, 20);
        Assertions.assertEquals("Spa Bruis", p.getNaam());
        Assertions.assertEquals(Product.DEFAULT_PRIJS_EXCL_BTW, p.getPrijsExclBtw());
        Assertions.assertEquals(20, p.getBtwPercentage());
        Assertions.assertEquals(20, p.getKortingStuksPercentage());
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void maakProduct_NaamNietGekend_MaaktProductMetNaamOnbekend(String naam) {
        Product p = new Product(naam, 20, 15, 20);
        Assertions.assertEquals(Product.NAAM_ONBEKEND, p.getNaam());
        Assertions.assertEquals(20, p.getPrijsExclBtw());
        Assertions.assertEquals(15, p.getBtwPercentage());
        Assertions.assertEquals(20, p.getKortingStuksPercentage());
    }

    @Test
    public void setPrijsExclBtw_WijzigtPrijsExclBtw() {
        p2.setPrijsExclBtw(3.77);
        Assertions.assertEquals(3.77, p2.getPrijsExclBtw());
    }

    @Test
    public void setPrijsExlBtw_PrijsPositief_SteltPrijsIn() {
        p2.setPrijsExclBtw(33.66);
        Assertions.assertEquals(33.66, p2.getPrijsExclBtw());
    }

    @Test
    public void setPrijsExlBtw_PrijsNetPositief_SteltPrijsIn() {
        p2.setPrijsExclBtw(Double.MIN_VALUE);
        Assertions.assertEquals(Double.MIN_VALUE, p2.getPrijsExclBtw());
    }

    @Test
    public void setPrijsExlBtw_Prijs0_WijzigtPrijsNiet() {
        p2.setPrijsExclBtw(0);
        Assertions.assertEquals(1.48, p2.getPrijsExclBtw());
    }

    @Test
    public void setPrijsExlBtw_PrijsNegatief_WijzigtPrijsNiet() {
        p2.setPrijsExclBtw(-10.5);
        Assertions.assertEquals(1.48, p2.getPrijsExclBtw());
    }

    @Test
    public void berekenPrijsMetBtw_ProductMetBtwPercentage21ZonderKortingStuks_RetourneertPrijsMetBtw() {
        Assertions.assertEquals(1.79, p1.berekenPrijs(1), 0.01);
    }

    @Test
    public void berekenPrijsMetBtw_ProductMetBtwPercentage21MetKortingStuks_RetourneertPrijsMetBtw() {
        Assertions.assertEquals(10.20, p1.berekenPrijs(6), 0.01);
    }

    @Test
    public void berekenPrijsMetBtw_Aantal0_Retourneert0() {
        Assertions.assertEquals(0.0, p1.berekenPrijs(0));
    }
}
