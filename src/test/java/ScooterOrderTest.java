import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;



public class ScooterOrderTest {
    private WebDriver driver;

    @Test
    public void checkOrderUpOne() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterOrder scooterOrder = new ScooterOrder(driver);

        //Тест заказа самоката по кнопке "Заказать" вверху страницы
        scooterOrder.clickInButtonOrderUp();
        scooterOrder.fillOrderOne();
        assertThat(scooterOrder.getTextAfterOrder(), startsWith("Заказ оформлен"));

    }
    @Test
    public void checkOrderUpTwo() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterOrder scooterOrder = new ScooterOrder(driver);

        //Тест заказа самоката по кнопке "Заказать" вверху страницы
        scooterOrder.clickInButtonOrderUp();
        scooterOrder.fillOrderTwo();
        assertThat(scooterOrder.getTextAfterOrder(), startsWith("Заказ оформлен"));

    }
    @Test
    public void checkOrderDownOne() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterOrder scooterOrder = new ScooterOrder(driver);

        //Тест заказа самоката по кнопке "Заказать" внизу страницы
        scooterOrder.clickInButtonOrderDown();
        scooterOrder.fillOrderOne();
        assertThat(scooterOrder.getTextAfterOrder(), startsWith("Заказ оформлен"));
    }
    @Test
    public void checkOrderDownTwo() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        ScooterOrder scooterOrder = new ScooterOrder(driver);

        //Тест заказа самоката по кнопке "Заказать" внизу страницы
        scooterOrder.clickInButtonOrderDown();
        scooterOrder.fillOrderTwo();
        assertThat(scooterOrder.getTextAfterOrder(), startsWith("Заказ оформлен"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
