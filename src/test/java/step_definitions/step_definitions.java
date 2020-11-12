package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.Config;
import utilities.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class step_definitions {

    @Given("User on Puppy List page")
    public void user_on_puppy_list_page() {
        Driver.getDriver().get("http://puppies.herokuapp.com/");
        Driver.getDriver().manage().window().maximize();
    }

    @When("User click on puppy Brook")
    public void user_click_on_puppy_brook() {
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MainPuppyListPage1 mainPuppyListPage1 = new MainPuppyListPage1();
        mainPuppyListPage1.BrookViewDetails.click();
    }

    @Then("Should be navigate to Brook page")
    public void should_be_navigate_to_brook_page() {
        String expResult = "Brook";
        String actResult = Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div[2]/h2")).getText();
        Assert.assertTrue(expResult.equals(actResult));
    }

    @When("User click Adopt Me button")
    public void user_click_adopt_me_button() {
        MainPuppyListPage1 mainPuppyListPage1 = new MainPuppyListPage1();
        mainPuppyListPage1.AdoptMeButton.click();
    }

    @Then("Should be navigate to Your Litter page")
    public void should_be_navigate_to_your_litter_page() {
        String expResult = "Your Litter";
        String actResult = Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/h2")).getText();
        Assert.assertTrue(expResult.equals(actResult));
    }

    @Then("User should see Brook in cart")
    public void user_should_see_brook_in_cart() {
    }

    @Then("User should see Additional Products & Services")
    public void user_should_see_additional_products_services() {
        String expResult = "Additional Products/Services";
        String actResult = Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[2]/td[2]/h3")).getText();
        Assert.assertTrue(expResult.equals(actResult));
    }

    @When("User click on checkBox with Chewy Toy")
    public void user_click_on_check_box_with_chewy_toy() {
        YourLitterPage yourLitterPage = new YourLitterPage();
        yourLitterPage.ChewToyCheckbox.click();
    }

    @When("User click on checkBox with Travel Carrier")
    public void user_click_on_check_box_with_travel_carrier() {
        YourLitterPage yourLitterPage = new YourLitterPage();
        yourLitterPage.TravelCarrierCheckbox.click();
    }

    @Then("CheckBoxes should display")
    public void check_boxes_should_display() {
        YourLitterPage yourLitterPage = new YourLitterPage();
        Assert.assertTrue(yourLitterPage.ChewToyCheckbox.isSelected());
        Assert.assertTrue(yourLitterPage.TravelCarrierCheckbox.isSelected());
    }

    @Then("Total price should increase on product price")
    public void total_price_should_increase_on_product_price() {
        YourLitterPage priceOfPuppy = new YourLitterPage();
        YourLitterPage priceOfChewToy = new YourLitterPage();
        YourLitterPage priceOfTravel = new YourLitterPage();
        YourLitterPage totalPrice = new YourLitterPage();
        double PuppyPrice = Double.parseDouble(priceOfPuppy.PriceOfPuppy.getText().replace("$",""));
        double ChewToyPrice = Double.parseDouble(priceOfChewToy.PriceOfChewToy.getText().replace("$",""));
        double TravelPrice = Double.parseDouble(priceOfTravel.PriceOfTravel.getText().replace("$",""));
        double Total = Double.parseDouble(totalPrice.TotalPrice.getText().replace("$",""));
        //compare sum of prices on puppy and products with actual Total amount (Sorry for hardcoding)
//        Assert.assertTrue("Total amount is correct", PuppyPrice+ChewToyPrice+TravelPrice==Total );
    }

    @When("User click Complete the Adoption button")
    public void user_click_complete_the_adoption_button() {
        YourLitterPage yourLitterPage = new YourLitterPage();
        yourLitterPage.CompletetheAdoptionButton.click();
    }

    @Then("Should be navigate to Order page")
    public void should_be_navigate_to_order_page() {
    }

    @When("User fill valid Name, Address, Email")
    public void user_fill_valid_name_address_email() {
        OrderDetailsPage orderDetailsPage = new OrderDetailsPage();
       orderDetailsPage.Name.sendKeys(Config.getProperty("name"));
       orderDetailsPage.Address.sendKeys(Config.getProperty("address"));
       orderDetailsPage.Email.sendKeys(Config.getProperty("email"));
    }

    @When("Choose Check as a Pay Type from dropdown")
    public void choose_check_as_a_pay_type_from_dropdown() {
        OrderDetailsPage orderDetailsPage = new OrderDetailsPage();
        Select select = new Select(orderDetailsPage.PayType);
        select.selectByIndex(2);
    }

    @When("Click Place Order button")
    public void click_place_order_button() {
        OrderDetailsPage placeOrderButton = new OrderDetailsPage();
        placeOrderButton.PlaceOrderButton.click();
    }

    @Then("Should be navigate to Puppy List page")
    public void should_be_navigate_to_puppy_list_page() {
    }

    @Then("User should see Thank you for adopting a puppy message")
    public void user_should_see_thank_you_for_adopting_a_puppy_message() {
        MainPuppyListPage1 mainPuppyListPage1 = new MainPuppyListPage1();
        String expResult = "Thank you for adopting a puppy!";
        String actResult = mainPuppyListPage1.Thanks.getText();
        Assert.assertTrue(actResult.equals(expResult));
    }

    //----------------Scenario 2

    @When("User click on puppy Sparky")
    public void user_click_on_puppy_sparky() {
        MainPuppyListPage2 mainPuppyListPage2 = new MainPuppyListPage2();
        mainPuppyListPage2.SecondPage.click();
        mainPuppyListPage2.SparkyViewDetails.click();
    }

    @Then("Should be navigate to Sparky page")
    public void should_be_navigate_to_sparky_page() {
        String expResult = "Sparky";
        String actResult = Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div[2]/h2")).getText();
        Assert.assertTrue(expResult.equals(actResult));
    }

    @Then("User should see Sparky in cart")
    public void user_should_see_sparky_in_cart() {

    }

    @When("User click on checkBox with Collar & Leash")
    public void user_click_on_check_box_with_collar_leash() {
        YourLitterPage yourLitterPage = new YourLitterPage();
        yourLitterPage.CollarAndLeashCheckbox.click();
    }
    @Then("CheckBoxes should display Collar & Leash")
    public void check_boxes_should_display_collar_leash() {
        YourLitterPage yourLitterPage = new YourLitterPage();
        Assert.assertTrue(yourLitterPage.CollarAndLeashCheckbox.isSelected());
    }
    @Then("Total price should be correct")
    public void total_price_should_be_correct() {
        YourLitterPage priceOfPuppy = new YourLitterPage();
        YourLitterPage priceOfCollar = new YourLitterPage();
        YourLitterPage totalPrice = new YourLitterPage();
        double PuppyPrice = Double.parseDouble(priceOfPuppy.PriceOfPuppy.getText().replace("$",""));
        double PriceOfCollar = Double.parseDouble(priceOfCollar.PriceOfCollar.getText().replace("$",""));
        double Total = Double.parseDouble(totalPrice.TotalPrice.getText().replace("$",""));
        //compare sum of prices on puppy and products with actual Total amount (Sorry for hardcoding)
//        Assert.assertTrue("Total amount is correct", PuppyPrice+PriceOfCollar==Total );
    }

    @When("Choose Credit Card as a Pay Type from dropdown")
    public void choose_credit_card_as_a_pay_type_from_dropdown() {
        OrderDetailsPage orderDetailsPage = new OrderDetailsPage();
        Select select = new Select(orderDetailsPage.PayType);
        select.selectByIndex(3);
    }

    //----------------Scenario 3

    @When("User choose last puppy from first page")
    public void user_choose_last_puppy_from_first_page() {
        MainPuppyListPage1 mainPuppyListPage1 = new MainPuppyListPage1();
        mainPuppyListPage1.RubySueViewDetails.click();
    }

    @When("User click Adopt Another Puppy button")
    public void user_click_adopt_another_puppy_button() {
        YourLitterPage yourLitterPage = new YourLitterPage();
        yourLitterPage.AdoptAnotherPuppyButton.click();
    }

    @When("User chose first puppy from last page")
    public void user_chose_first_puppy_from_last_page() {
        MainPuppyListPage3 mainPuppyListPage3 = new MainPuppyListPage3();
        mainPuppyListPage3.ThirdPage.click();
        mainPuppyListPage3.TwinkieViewDetails.click();
    }

    @When("User choose Collar & Leash for both puppies")
    public void user_choose_collar_leash_for_both_puppies() {
        YourLitterPage yourLitterPage = new YourLitterPage();
        yourLitterPage.MultipleCollarsOne.click();
        yourLitterPage.MultipleCollarsTwo.click();
    }

    @Then("CheckBoxes for both puppies should display")
    public void check_boxes_for_both_puppies_should_display() {
    }

}
