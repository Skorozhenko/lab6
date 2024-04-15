import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TrianglePuzzleTest {
    private WebDriver driver;

    @Test
    public void testTrianglePuzzle() {
        driver = new ChromeDriver();
        driver.get("https://playground.learnqa.ru/puzzle/triangle");

        WebElement giveUpButton = driver.findElement(By.xpath("//button[text()='Я сдаюсь']"));
        Assert.assertTrue(giveUpButton.isDisplayed(), "Кнопка 'Я сдаюсь' не найдена на странице");
        giveUpButton.click();

        WebElement answersLink = driver.findElement(By.linkText("Ссылка на ответы"));
        Assert.assertTrue(answersLink.isDisplayed(), "Ссылка на ответы не найдена на странице");

        WebElement hideAnswersButton = driver.findElement(By.xpath("//button[text()='Спрятать ответы']"));
        Assert.assertTrue(hideAnswersButton.isDisplayed(), "Кнопка 'Спрятать ответы' не найдена на странице");

        if (answersLink.isDisplayed() && hideAnswersButton.isDisplayed()) {
                System.out.println("Успешно выполнено");
            }
        driver.quit();
    }
}