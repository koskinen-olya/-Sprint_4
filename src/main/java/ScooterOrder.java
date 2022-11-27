import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScooterOrder {
    private WebDriver driver;
    //локатор для верхней кнопки "Заказать"
    private By buttonOrderUp = By.xpath(".//button[@class ='Button_Button__ra12g' and text() = 'Заказать']");
    //локатор для нижней кнопки "Заказать"
    private By buttonOrderDown = By.xpath(".//button[@class ='Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Заказать']");
    //локатор для поля "Имя"
    private By fieldName = By.xpath(".//*[@placeholder = '* Имя']");
    //локатор для поля "Фамилия"
    private By fieldLastName = By.xpath(".//*[@placeholder = '* Фамилия']");
    //локатор для поля "Адрес"
    private By fieldAddress = By.xpath(".//*[@placeholder = '* Адрес: куда привезти заказ']");
    //локатор для поля "Станция метро"
    private By fieldMetro = By.className("select-search__input");
    //локатор для поля "Телефон"
    private By fieldNumber = By.xpath(".//*[@placeholder = '* Телефон: на него позвонит курьер']");
    //локатор для кнопки "Далее"
    private By buttonNext = By.xpath(".//button[text()='Далее']");
    //локатор для поля "Когда привезти самокат"
    private By fieldDate = By.xpath(".//*[@placeholder = '* Когда привезти самокат']");
    //локатор для поля "Срок аренды"
    private By fieldTime = By.className("Dropdown-arrow");
    //локатор для поля "Срок аренды"
    private By fieldTimeChoose = By.xpath(".//div[@class = 'Dropdown-option' and text() = 'двое суток']");
    //локатор для поля "Цвет самоката"
    private By fieldColour = By.className("Checkbox_Label__3wxSf");
    //локатор для кнопки "Заказать" после заполнения заказа
    private By buttonOrder = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button[2]");
    //локатор для кнопки "Да" после заполнения заказа
    private By buttonYes = By.xpath(".//button[text()='Да']");
    //локатор для плашки успешного оформления заказа
    private By successOrder = By.className("Order_ModalHeader__3FDaJ");


    public ScooterOrder(WebDriver driver){
        this.driver = driver;
    }

    public String getTextAfterOrder(){
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(successOrder));
        return driver.findElement(successOrder).getText();
    }
    public void fillOrderOne(){
        driver.findElement(fieldName).sendKeys("Имя");
        driver.findElement(fieldLastName).sendKeys("Фамилия");
        driver.findElement(fieldAddress).sendKeys("город Москва");
        driver.findElement(fieldMetro).click();
        WebElement stationMetro = driver.findElement(By.cssSelector("div.select-search__select"));
        stationMetro.click();
        driver.findElement(fieldNumber).sendKeys("89778999889");
        driver.findElement(buttonNext).click();

        driver.findElement(fieldDate).sendKeys("02.11.2022");
        driver.findElement(fieldTime).click();
        driver.findElement(fieldTimeChoose).click();
        driver.findElement(fieldColour).click();

        driver.findElement(buttonOrder).click();
        driver.findElement(buttonYes).click();

    }
    public void fillOrderTwo(){
        driver.findElement(fieldName).sendKeys("Двойное имя");
        driver.findElement(fieldLastName).sendKeys("Фамилия");
        driver.findElement(fieldAddress).sendKeys("село Иваново");
        driver.findElement(fieldMetro).click();
        WebElement stationMetro = driver.findElement(By.cssSelector("div.select-search__select"));
        stationMetro.click();
        driver.findElement(fieldNumber).sendKeys("+79887897764");
        driver.findElement(buttonNext).click();

        driver.findElement(fieldDate).sendKeys("02.11.2023");
        driver.findElement(fieldTime).click();
        driver.findElement(fieldTimeChoose).click();
        driver.findElement(fieldColour).click();

        driver.findElement(buttonOrder).click();
        driver.findElement(buttonYes).click();

    }

    public void clickInButtonOrderUp(){
        driver.findElement(buttonOrderUp).click();
    }

    public void clickInButtonOrderDown(){
        WebElement buttonDown = driver.findElement(By.className("Home_FinishButton__1_cWm"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", buttonDown);
        driver.findElement(buttonOrderDown).click();
    }



}