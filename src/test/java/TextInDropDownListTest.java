import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TextInDropDownListTest {
    WebDriver driver;
    private final String expectedText;
    private final int indexElement;
    private final int indexElementText;

    public TextInDropDownListTest(String expectedText,int indexElement, int indexElementText) {
        this.expectedText = expectedText;
        this.indexElement = indexElement;
        this.indexElementText = indexElementText;
    }
    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][] {
                {"Да, обязательно. Всем самокатов! И Москве, и Московской области.",7,7},
                {"Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",6,6},
                {"Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",5,5},
                {"Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",4,4},
                {"Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",2,2},
                {"Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",1,1},
                {"Сутки — 400 рублей. Оплата курьеру — наличными или картой.",0,0},
                {"Только начиная с завтрашнего дня. Но скоро станем расторопнее.",3,3},
        };
    }
    @Before
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        WebElement questionsAboutImportant = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionsAboutImportant);
    }


    @Test
    public void checkText() {
        TextInDropDownList textInDropDownList = new TextInDropDownList(driver);
        textInDropDownList.clickButton(indexElement);
        assertEquals(expectedText,textInDropDownList.getText(indexElementText));
    }
    @After
    public void tearDown() {
        driver.quit();
    }}

