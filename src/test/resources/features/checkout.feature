Feature: Checkout feature

 Scenario: check that checkout page is shown after clicking the Buy button for any product
    Given product page is open
    When select any product from the list and click the "Buy" button
    Then checkout page is open: "First name" input, "Last name" input, "Country" selector, "City" selector, "Zip code" input, "Payment method" radio buttons, "Save info" checkbox and button "Continue"

 Scenario: check that the success page is shown after successful  checkout
    Given product page is open
    When select any product from the list and click the "Buy" button
    And fill all required fields and press continue button on the check out page
    Then success page is open: "Thank You" label and "Continue" button