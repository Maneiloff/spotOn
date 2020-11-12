package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPuppyListPage2 {
    public MainPuppyListPage2(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/div[6]/a[1]")
    public WebElement SecondPage;

    @FindBy(xpath = "(//input[@class='rounded_button'])[1]")
    public WebElement SparkyViewDetails;

    @FindBy(xpath = "(//input[@class='rounded_button'])[2]")
    public WebElement SpudViewDetails;

    @FindBy(xpath = "(//input[@class='rounded_button'])[3]")
    public WebElement TipsyViewDetails;

    @FindBy(xpath = "(//input[@class='rounded_button'])[4]")
    public WebElement TopsyViewDetails;

    @FindBy(xpath = "//input[@class='rounded_button']")
    public WebElement AdoptMeButton;
}
