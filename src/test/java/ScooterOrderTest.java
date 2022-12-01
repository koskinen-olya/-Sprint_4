import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;


@RunWith(Parameterized.class)
public class ScooterOrderTest {
    WebDriver driver;
    private final String button;
    private final String date;
    private final String numbers;
    private final String city;
    private final String lastName;
    private final String name;

    public ScooterOrderTest(String button, String name, String lastName, String city, String numbers, String date) {
        this.button = button;
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.numbers = numbers;
        this.date = date;
    }

    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][] {
                {"Button_Button__ra12g","Имя","Фамилия", "Москва", "+79887886787", "28.11.2022"},
                {"Button_Button__ra12g","Двойное имя","ДругаяФамилия", "Самара", "89887886787", "28.11.2023"},
                {"Button_Button__ra12g Button_Middle__1CSJM","Двойное имя","ДругаяФамилия", "Самара", "89887886787", "28.11.2023"},
                {"Button_Button__ra12g Button_Middle__1CSJM","Имя","Фамилия", "Москва", "+79887886787", "28.11.2022"},

        };
    }
    @Before
    public void openBrowser(){
        //System.setProperty("webdriver.edge.driver", "C:\\WebDriver\\bin\\msedgedriver.exe");
        //driver = new EdgeDriver();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void checkTextAfterOrder() {
        ScooterOrder scooterOrder = new ScooterOrder(driver);
        scooterOrder.clickInButtonOrder(button);
        scooterOrder.fillOrder(name,lastName,city,numbers,date);
        assertThat(scooterOrder.getTextAfterOrder(), startsWith("Заказ оформлен"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
