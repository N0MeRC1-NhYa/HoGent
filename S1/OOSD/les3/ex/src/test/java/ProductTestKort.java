import domein.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class ProductTestKort {

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

    @ParameterizedTest
    @ValueSource(ints = { 0, Product.BOVENGRENS_KORTING_STUKS})
    public void maakProduct_KortingStuksPercentageNetOK_MaaktProduct(int kortingPerc) {
        Product p = new Product("Spa Bruis", 1.50, 10, kortingPerc);
        Assertions.assertEquals("Spa Bruis", p.getNaam());
        Assertions.assertEquals(1.50, p.getPrijsExclBtw());
        Assertions.assertEquals(10, p.getBtwPercentage());
        Assertions.assertEquals(kortingPerc, p.getKortingStuksPercentage());
    }


    @ParameterizedTest
    @ValueSource(ints = { -1, -50, Product.BOVENGRENS_KORTING_STUKS + 1, 88})
    public void maakProduct_KortingStuksPercentageNietOK_MaaktProductMetKortingStuksPercentage0(int kortingPerc) {
        Product p = new Product("Spa Bruis", 1.50, 21, kortingPerc);
        Assertions.assertEquals("Spa Bruis", p.getNaam());
        Assertions.assertEquals(1.50, p.getPrijsExclBtw());
        Assertions.assertEquals(21, p.getBtwPercentage());
        Assertions.assertEquals(0, p.getKortingStuksPercentage());
    }


    @ParameterizedTest
    @ValueSource(ints = { Product.ONDERGRENS_BTW, Product.BOVENGRENS_BTW})
    public void maakProduct_BtwPercentageNetOK_MaaktProduct(int btw) {
        Product p = new Product("Spa Bruis", 1.50, btw, 20);
        Assertions.assertEquals("Spa Bruis", p.getNaam());
        Assertions.assertEquals(1.50, p.getPrijsExclBtw());
        Assertions.assertEquals(btw, p.getBtwPercentage());
        Assertions.assertEquals(20, p.getKortingStuksPercentage());
    }


    @ParameterizedTest
    @ValueSource(ints = {Product.BOVENGRENS_BTW + 1, 35,Product.ONDERGRENS_BTW - 1, 1})
    public void maakProduct_BtwPercentageNietOK_MaaktProductMetBtwPercentage21(int btw) {
        Product p = new Product("Spa Bruis", 1.50, btw, 20);
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

    @ParameterizedTest
    @ValueSource(ints = {0,-10})
    public void maakProduct_PrijsExclBtwNul_MaaktProductMetPrijs1(int prijs) {
        Product p = new Product("Spa Bruis", prijs, 20, 20);
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

    @ParameterizedTest
    @ValueSource(doubles = {33.66,Double.MIN_VALUE})
    public void setPrijsExlBtw_PrijsPositief_SteltPrijsIn(double prijs) {
        p2.setPrijsExclBtw(prijs);
        Assertions.assertEquals(prijs, p2.getPrijsExclBtw());
    }


    @ParameterizedTest
    @ValueSource(doubles = {0, -10.5})
    public void setPrijsExlBtw_PrijsNietOK_WijzigtPrijsNiet(double prijs) {
        p2.setPrijsExclBtw(prijs);
        Assertions.assertEquals(1.48, p2.getPrijsExclBtw());
    }


    @Test
    public void berekenPrijsMetBtw_ProductMetBtwPercentage21ZonderKortingt6Stuks_RetourneertPrijsMetBtw() {
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
