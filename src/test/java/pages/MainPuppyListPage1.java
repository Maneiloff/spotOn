package pages;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class MainPuppyListPage1 {
    public MainPuppyListPage1(){PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//input[@class='rounded_button'])[1]")
    public WebElement BrookViewDetails;

    @FindBy(xpath = "(//input[@class='rounded_button'])[2]")
    public WebElement HannaViewDetails;

    @FindBy(xpath = "(//input[@class='rounded_button'])[3]")
    public WebElement MaggieMaeViewDetails;

    @FindBy(xpath = "(//input[@class='rounded_button'])[4]")
    public WebElement RubySueViewDetails;

    @FindBy(xpath = "//input[@class='rounded_button']")
    public WebElement AdoptMeButton;

    @FindBy(xpath = "//p[@id='notice']")
    public WebElement Thanks;

}
