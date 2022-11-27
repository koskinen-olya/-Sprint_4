import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import static org.junit.Assert.assertEquals;


public class TextInDropDownListTest {
    private WebDriver driver;

    @Test
    public void checkTextHowMuch() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        TextInDropDownList textInDropDownList = new TextInDropDownList(driver);
        //Скролл до "Вопросы о важном"
        WebElement questionsAboutImportant = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionsAboutImportant);

        //Проверка текста у пункта "Сколько это стоит? И как оплатить?"
        textInDropDownList.clickButton_whatIsThePrice();
        assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.",textInDropDownList.getText_whatIsThePrice());
    }
    @Test
    public void checkTextManyScooters() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        TextInDropDownList textInDropDownList = new TextInDropDownList(driver);
        //Скролл до "Вопросы о важном"
        WebElement questionsAboutImportant = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionsAboutImportant);

        //Проверка текста у пункта "Хочу сразу несколько самокатов! Так можно?"
        textInDropDownList.clickButton_manyScooters();
        assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",textInDropDownList.getText_manyScooters());


    }
    @Test
    public void checkTextTimeRent() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        TextInDropDownList textInDropDownList = new TextInDropDownList(driver);
        //Скролл до "Вопросы о важном"
        WebElement questionsAboutImportant = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionsAboutImportant);

        //Проверка текста у пункта "Как рассчитывается время аренды?"
        textInDropDownList.clickButton_timeOfRent();
        assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",textInDropDownList.getText_timeOfRent());

    }
    @Test
    public void checkTextScooterToday() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        TextInDropDownList textInDropDownList = new TextInDropDownList(driver);
        //Скролл до "Вопросы о важном"
        WebElement questionsAboutImportant = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionsAboutImportant);

        //Проверка текста у пункта "Можно ли заказать самокат прямо на сегодня?"
        textInDropDownList.clickButton_scooterToday();
        assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.",textInDropDownList.getText_scooterToday());

    }
    @Test
    public void checkTextBackEarlier() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        TextInDropDownList textInDropDownList = new TextInDropDownList(driver);
        //Скролл до "Вопросы о важном"
        WebElement questionsAboutImportant = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionsAboutImportant);

        //Проверка текста у пункта "Можно ли продлить заказ или вернуть самокат раньше?"
        textInDropDownList.clickButton_extendOrReturn();
        assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",textInDropDownList.getText_extendOrReturn());

    }
    @Test
    public void checkTextChargerWithScooter() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        TextInDropDownList textInDropDownList = new TextInDropDownList(driver);
        //Скролл до "Вопросы о важном"
        WebElement questionsAboutImportant = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionsAboutImportant);

        //Проверка текста у пункта "Вы привозите зарядку вместе с самокатом?"
        textInDropDownList.clickButton_chargerWithScooter();
        assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",textInDropDownList.getText_chargerWithScooter());

    }

    @Test
    public void checkTextCancelOrder() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        TextInDropDownList textInDropDownList = new TextInDropDownList(driver);
        //Скролл до "Вопросы о важном"
        WebElement questionsAboutImportant = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionsAboutImportant);

        //Скролл до элемента с вопросом "Можно ли отменить заказ?"
        WebElement cancelOrder = driver.findElement(By.id("accordion__heading-6"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", cancelOrder);


        //Проверка текста у пункта "Можно ли отменить заказ?"
        textInDropDownList.clickButton_cancelOrder();
        assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",textInDropDownList.getText_cancelOrder());

    }
    @Test
    public void checkTextInMKAD() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        TextInDropDownList textInDropDownList = new TextInDropDownList(driver);
        //Скролл до "Вопросы о важном"
        WebElement questionsAboutImportant = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", questionsAboutImportant);

        //Скролл до элемента с вопросом "Можно ли отменить заказ?"
        WebElement cancelOrder = driver.findElement(By.id("accordion__heading-6"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", cancelOrder);


        //Проверка текста у пункта "Я жизу за МКАДом, привезёте?"
        textInDropDownList.clickButton_beyondMKAD();
        assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.",textInDropDownList.getText_beyondMKAD());

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
