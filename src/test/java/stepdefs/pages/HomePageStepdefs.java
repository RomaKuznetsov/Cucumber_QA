package stepdefs.pages;

import io.cucumber.java.en.Given;
import services.HomeService;

public class HomePageStepdefs {

    private final HomeService homeService = new HomeService();

    @Given("product page is open")
    public void productPageIsOpen() {

    }
}
