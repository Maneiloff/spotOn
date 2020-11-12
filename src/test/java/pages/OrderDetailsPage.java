package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrderDetailsPage {
    public OrderDetailsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='order_name']")
    public WebElement Name;

    @FindBy(xpath = "//textarea[@id='order_address']")
    public WebElement Address;

    @FindBy(xpath = "//input[@id='order_email']")
    public WebElement Email;

    @FindBy(xpath = "//select[@id='order_pay_type']")
    public WebElement PayType;

    @FindBy(xpath = "//*[@id=\"order_pay_type\"]/option[2]")
    public WebElement Check;

    @FindBy(xpath = "//*[@id=\"order_pay_type\"]/option[3]")
    public WebElement CreditCard;

    @FindBy(xpath = "//*[@id=\"order_pay_type\"]/option[4]")
    public WebElement PurchaseOrder;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement PlaceOrderButton;






}
