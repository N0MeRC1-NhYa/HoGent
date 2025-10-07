package cui;

import domein.Product;

import java.util.Scanner;

public class ProductApplicatie {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new ProductApplicatie().start();
    }

    private void start(){
        double totaal = 0;
        Product[] products = {new Product("pannenkoek", 0.125, 21, 5),
                new Product("pannenkoek met suiker", 2, 6, 10),
                new Product("pannenkoek met choco", 2.2, 6, 15)};
        for (Product product : products)
            totaal += product.berekenPrijs(geefAantalStucks(product.getNaam()));
        System.out.printf("Aan de kassa zal u %.2f EURO moeten betalen.", totaal);
    }

    private int geefAantalStucks(String naam){
        System.out.printf("Hoeveel stucks wilt u van \'%s\'? ", naam);
        return this.sc.nextInt();
    }
}
