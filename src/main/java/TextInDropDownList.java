import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class TextInDropDownList {

    private WebDriver driver;

    //Метод для получения локаторов элементов

    public TextInDropDownList(WebDriver driver){
        this.driver = driver;
    }

    //Метод для клика по элементу
    public void clickButton (int index){
        driver.findElement(By.id("accordion__heading-" + index)).click();
    }

    //Метод для получения текста элемента
    public String getText (int index){
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"accordion__panel-"+ index +"\"]/p")));
        return driver.findElement(By.xpath("//*[@id=\"accordion__panel-"+ index +"\"]/p")).getText();
    }

}
