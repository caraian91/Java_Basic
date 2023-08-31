import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_Selenium {
    public static void main(String[] args) throws InterruptedException {
        // Invoking Browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://myelectrica.ro/index.php?pagina=login");
        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.name("myelectrica_utilizator")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"myelectrica_pass\"]")).sendKeys("Test123");
        driver.findElement(By.id("myelectrica_login_btn")).click();
        // Sleep
        Thread.sleep(3000);
        driver.close();
    }
}
