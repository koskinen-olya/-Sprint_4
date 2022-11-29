import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScooterOrder {
    private WebDriver driver;

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
    public void fillOrder(String name, String lastName, String city, String numbers, String date){
        driver.findElement(fieldName).sendKeys(name);
        driver.findElement(fieldLastName).sendKeys(lastName);
        driver.findElement(fieldAddress).sendKeys(city);
        driver.findElement(fieldMetro).click();
        WebElement stationMetro = driver.findElement(By.cssSelector("div.select-search__select"));
        stationMetro.click();
        driver.findElement(fieldNumber).sendKeys(numbers);
        driver.findElement(buttonNext).click();

        driver.findElement(fieldDate).sendKeys(date);
        driver.findElement(fieldTime).click();
        driver.findElement(fieldTimeChoose).click();
        driver.findElement(fieldColour).click();

        driver.findElement(buttonOrder).click();
        driver.findElement(buttonYes).click();

    }


    public void clickInButtonOrder(String button){
        WebElement buttonDown = driver.findElement(By.xpath(".//button[@class ='" + button + "' and text() = 'Заказать']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", buttonDown);
        driver.findElement(By.xpath(".//button[@class ='" + button + "' and text() = 'Заказать']")).click();
    }

}