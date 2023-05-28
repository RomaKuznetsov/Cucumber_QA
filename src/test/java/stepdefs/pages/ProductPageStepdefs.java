package stepdefs.pages;

import io.cucumber.java.en.When;
import services.ProductsService;

public class ProductPageStepdefs {

    private final ProductsService productsService = new ProductsService();

    @When("select any product from the list and click the \"Buy\" button")
    public void selectAnyProductFromTheListAndClickTheButton() {
        productsService.buyRandomProducts();
    }
}
