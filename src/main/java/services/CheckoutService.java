package services;

import enums.City;
import enums.Country;
import enums.PaymentType;
import org.assertj.core.api.SoftAssertions;
import pages.CheckoutPage;

import static utils.Assertions.isVisible;

public class CheckoutService {

    private final CheckoutPage checkoutPage = new CheckoutPage();

    public void fillAllRequiredFields(final String firstName, final String lastName, final Country country, final City city, final String zip, final boolean saveInfo, final PaymentType paymentType) {
        checkoutPage.getFirstNameInput().clearAndType(firstName);
        checkoutPage.getLastNameInput().clearAndType(lastName);
        checkoutPage.getCountrySelector().select(country.getCountryName());
        checkoutPage.getCitySelector().select(city.getCityName());
        checkoutPage.getZipInput().clearAndType(zip);
        if (saveInfo) {
            checkoutPage.getSaveInfoLbl().check();
        }
        switch (paymentType) {
            case CASH:{
                checkoutPage.getCashLbl().check();
                break;
            }
            case CREDIT_CARD: {
                checkoutPage.getCreditCard().check();
            }
        }
    }
    public void pressContinueBtn(){
        checkoutPage.getContinueBtn().click();
    }
    public void isAllRequiredFieldsAreVisible(SoftAssertions softAssertions){
        isVisible(softAssertions, checkoutPage.getFirstNameInput(), "First name");
        isVisible(softAssertions, checkoutPage.getLastNameInput(), "Last name");
        isVisible(softAssertions, checkoutPage.getCountrySelector(), "Country");
        isVisible(softAssertions, checkoutPage.getCitySelector(), "City");
        isVisible(softAssertions, checkoutPage.getZipInput(), "Zip");
        isVisible(softAssertions, checkoutPage.getCashLbl(), "Cash");
        isVisible(softAssertions, checkoutPage.getCreditCard(), "Credit Card");
    }

    public void isContinueVisible(SoftAssertions softAssertions){
        isVisible(softAssertions, checkoutPage.getContinueBtn(), "Continue");
    }
}
