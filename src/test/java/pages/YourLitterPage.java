package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YourLitterPage {
    public YourLitterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='collar']")
    public WebElement CollarAndLeashCheckbox;

    @FindBy(xpath = "//input[@id='toy']")
    public WebElement ChewToyCheckbox;

    @FindBy(xpath = "//input[@id='carrier']")
    public WebElement TravelCarrierCheckbox;

    @FindBy(xpath = "//input[@id='vet']")
    public WebElement FirstVetVisitCheckbox;

    @FindBy(xpath = "//input[@value='Complete the Adoption']")
    public WebElement CompletetheAdoptionButton;

    @FindBy(xpath = "//input[@value='Adopt Another Puppy']")
    public WebElement AdoptAnotherPuppyButton;

    @FindBy(xpath = "//input[@value='Change your mind']")
    public WebElement ChangeYourMindButton;

    @FindBy(xpath = "(//input[@id='collar'])[1]")
    public WebElement MultipleCollarsOne;

    @FindBy(xpath = "(//input[@id='collar'])[2]")
    public WebElement MultipleCollarsTwo;

    @FindBy(xpath = "//*[@id=\"content\"]/table/tbody/tr[7]/td[4]/h2")
    public WebElement PriceForSecondPuppy;


    @FindBy(xpath = "//*[@id=\"content\"]/table/tbody/tr[1]/td[4]/h2")
    public WebElement PriceOfPuppy;

    @FindBy(css = ".collar-amount")
    public WebElement PriceOfCollar;

    @FindBy(css = ".toy-amount")
    public WebElement PriceOfChewToy;

    @FindBy(css = ".carrier-amount")
    public WebElement PriceOfTravel;

    @FindBy(css = ".vet-amount")
    public WebElement PriceOfFirstVet;

    @FindBy(xpath = "//*[@id=\"content\"]/table/tbody/tr[7]/td[3]/h2")
    public WebElement TotalPrice;
}
