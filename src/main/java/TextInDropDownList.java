import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class TextInDropDownList {
    private WebDriver driver;
    private By whatIsThePrice = By.id("accordion__heading-0");
    private By textWhatIsThePrice = By.xpath("//*[@id=\"accordion__panel-0\"]/p");

    private By manyScooters = By.id("accordion__heading-1");
    private By textManyScooters = By.xpath("//*[@id=\"accordion__panel-1\"]/p");

    private By timeOfRent = By.id("accordion__heading-2");
    private By texttimeOfRent = By.xpath("//*[@id=\"accordion__panel-2\"]/p");

    private By scooterToday = By.id("accordion__heading-3");
    private By textscooterToday = By.xpath("//*[@id=\"accordion__panel-3\"]/p");

    private By extendOrReturn = By.id("accordion__heading-4");
    private By textextendOrReturn = By.xpath("//*[@id=\"accordion__panel-4\"]/p");

    private By chargerWithScooter = By.id("accordion__heading-5");
    private By textchargerWithScooter = By.xpath("//*[@id=\"accordion__panel-5\"]/p");

    private By cancelOrder = By.id("accordion__heading-6");
    private By textCancelOrder = By.xpath("//*[@id=\"accordion__panel-6\"]/p");

    private By beyondMKAD = By.id("accordion__heading-7");
    private By textBeyondMKAD = By.xpath("//*[@id=\"accordion__panel-7\"]/p");

    public TextInDropDownList(WebDriver driver){
        this.driver = driver;
    }

    //Методы для пункта "Сколько это стоит? И как оплатить?"
    public void clickButton_whatIsThePrice (){
        driver.findElement(whatIsThePrice).click();
    }
    public String getText_whatIsThePrice(){
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(textWhatIsThePrice));
        return driver.findElement(textWhatIsThePrice).getText();
    }

    //Методы для пункта "Хочу сразу несколько самокатов! Так можно?"
    public void clickButton_manyScooters (){
        driver.findElement(manyScooters).click();
    }
    public String getText_manyScooters(){
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(textManyScooters));
        return driver.findElement(textManyScooters).getText();
    }

    //Методы для пункта "Как рассчитывается время аренды?"
    public void clickButton_timeOfRent (){
        driver.findElement(timeOfRent).click();
    }
    public String getText_timeOfRent(){
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(texttimeOfRent));
        return driver.findElement(texttimeOfRent).getText();
    }

    //Методы для пункта "Можно ли заказать самокат прямо на сегодня?"
    public void clickButton_scooterToday (){
        driver.findElement(scooterToday).click();
    }
    public String getText_scooterToday(){
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(textscooterToday));
        return driver.findElement(textscooterToday).getText();
    }

    //Методы для пункта "Можно ли продлить заказ или вернуть самокат раньше?"
    public void clickButton_extendOrReturn (){
        driver.findElement(extendOrReturn).click();
    }
    public String getText_extendOrReturn(){
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(textextendOrReturn));
        return driver.findElement(textextendOrReturn).getText();
    }

    //Методы для пункта "Вы привозите зарядку вместе с самокатом?"
    public void clickButton_chargerWithScooter (){
        driver.findElement(chargerWithScooter).click();
    }
    public String getText_chargerWithScooter(){
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(textchargerWithScooter));
        return driver.findElement(textchargerWithScooter).getText();
    }

    //Методы для пункта "Можно ли отменить заказ?"
    public void clickButton_cancelOrder (){
        driver.findElement(cancelOrder).click();
    }
    public String getText_cancelOrder(){
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(textCancelOrder));
        return driver.findElement(textCancelOrder).getText();
    }

    //Методы для пункта "Я жизу за МКАДом, привезёте?"
    public void clickButton_beyondMKAD (){
        driver.findElement(beyondMKAD).click();
    }
    public String getText_beyondMKAD(){
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(textBeyondMKAD));
        return driver.findElement(textBeyondMKAD).getText();
    }

}
