package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPuppyListPage3 {
    public MainPuppyListPage3(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id=\"content\"]/div[6]/a[2]")
    public WebElement ThirdPage;

    @FindBy(xpath = "(//input[@class='rounded_button'])[1]")
    public WebElement TwinkieViewDetails;

    @FindBy(xpath = "//input[@class='rounded_button']")
    public WebElement AdoptMeButton;
}
