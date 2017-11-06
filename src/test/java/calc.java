import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calc {

        private static WebDriver driver;

    @BeforeClass
    public static void start ()
    {
    driver = new ChromeDriver();
    driver.get("file:///C:/Users/nenas/Downloads/calc.html");
    }

    @Test
    public void add_test ()
    {
        driver.findElement(By.xpath("//input[@value='C']")).click();
        driver.findElement(By.xpath("//input[@value='9']")).click();
        driver.findElement(By.xpath("//input[@value='+']")).click();
        driver.findElement(By.xpath("//input[@value='5']")).click();
        driver.findElement(By.xpath("//input[@value='=']")).click();
        Assert.assertEquals("14",driver.findElement(By.id("resultsbox")).getAttribute("value"));


    }
    @Test
    public void sub_test ()

    {
        driver.findElement(By.xpath("//input[@value='C']")).click();
        driver.findElement(By.xpath("//input[@value='5']")).click();
        driver.findElement(By.xpath("//input[@value='-']")).click();
        driver.findElement(By.xpath("//input[@value='9']")).click();
        driver.findElement(By.xpath("//input[@value='=']")).click();
        Assert.assertEquals("-4",driver.findElement(By.id("resultsbox")).getAttribute("value"));
    }

    @Test
    public void mult_test ()

    {
        driver.findElement(By.xpath("//input[@value='C']")).click();
        driver.findElement(By.xpath("//input[@value='6']")).click();
        driver.findElement(By.xpath("//input[@value='x']")).click();
        driver.findElement(By.xpath("//input[@value='5']")).click();
        driver.findElement(By.xpath("//input[@value='=']")).click();
        Assert.assertEquals("30", driver.findElement(By.id("resultsbox")).getAttribute("value"));
    }

    @Test
    public void div_test ()
    {
        driver.findElement(By.xpath("//input[@value='C']")).click();
        driver.findElement(By.xpath("//input[@value='8']")).click();
        driver.findElement(By.xpath("//input[@value='/']")).click();
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.xpath("//input[@value='=']")).click();
        Assert.assertEquals("4",driver.findElement(By.id("resultsbox")).getAttribute("value"));
    }
    @AfterClass
    public static void stop ()
    {
    driver.quit();
    }
}

