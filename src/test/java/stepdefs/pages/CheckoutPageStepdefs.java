package stepdefs.pages;

import enums.City;
import enums.Country;
import enums.PaymentType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import services.CheckoutService;

public class CheckoutPageStepdefs {

    @Rule
    public final ErrorCollector collector = new ErrorCollector();
    private final CheckoutService checkoutService = new CheckoutService();

    @Then("checkout page is open: \"First name\" input, \"Last name\" input, \"Country\" selector, \"City\" selector, \"Zip code\" input, \"Payment method\" radio buttons, \"Save info\" checkbox and button \"Continue\"")
    public void checkoutPageIsOpenInputInputSelectorSelectorInput() {
        SoftAssertions softAssertions = new SoftAssertions();
        checkoutService.isAllRequiredFieldsAreVisible(softAssertions);
        checkoutService.isContinueVisible(softAssertions);
        softAssertions.assertAll();
    }

    @And("fill all required fields and press continue button on the check out page")
    public void fillAllRequiredFieldsAndPressContinueButtonOnTheCheckOutPage() {
        checkoutService.fillAllRequiredFields("Roman", "Kuznetsov", Country.BELARUS, City.MINSK,
                "230000", true, PaymentType.CASH);
        checkoutService.pressContinueBtn();
    }
}
