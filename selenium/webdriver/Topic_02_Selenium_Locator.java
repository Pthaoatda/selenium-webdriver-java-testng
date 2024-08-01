package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Topic_02_Selenium_Locator {
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String osName = System.getProperty("os.name");

    @BeforeClass
    public void beforeClass() {
        if (osName.contains("Windows")) {
            System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
        } else {
            System.setProperty("webdriver.gecko.driver", projectPath + "/browserDrivers/geckodriver");
        }

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/register");
    }

    // Selenium version 1.x/ 2.x/ 3.x/ 4.x
    // Có 8 loại lacator
    // Selenium Locator = HTML Attribute
    // Id/ Class/ Name = Trùng với 3 attribute HTML
    // LinkText/ Patial LinkText : HTML Link ( thẻ a)
    // Tagname : HTML Tagname
    // CSS/ Xpath

    // Selenium version 4.x có thêm 1 số loại locator khác
    // Class - Relative Locator ( Locator tương đối)
    // above/ near/ bellow/ leftOf/ rightOff

    // UI Testing chia làm 2 phần : FUI ( Function User Interface) và GUI (Graphic UI) : Test Font size/ Color/ Position/ Location/..


    // TestNG : Order Testcase theo alphabet ( 0-9 A-Z)
    // Firstname textbox- HTML code

    @Test
    public void TC_01_ID() {
        // By nhận kiểu String, các method nhận kiểu String
        // Tìm element có Id = FirstName
        driver.findElement(By.id("FirstName")).sendKeys("Jack");
    }

    @Test
    public void TC_02_Class() {
        driver.findElement(By.className("header-logo"));
    }

    @Test
    public void TC_03_Name() {
        driver.findElement(By.name("DateOfBirthDay"));
    }

    @Test
    // Tagname trong TH tìm xem có bao nhiêu thẻ giống nhau

    public void TC_04_Tagname() {
        driver.findElement(By.tagName("input"));
    }

    @Test
    public void TC_05_LinkText() {
        // Độ chính xác cao = tuyệt đối = toàn bộ
        driver.findElement(By.linkText("Shipping & returns"));
    }

    @Test
    public void TC_06_Partial_Linktext() {
        // Độ chính xác không cao = tương đối = 1 phần (đầu/ giữa / cuối)
        driver.findElement(By.partialLinkText("for vendor"));
    }

    @Test
    public void TC_07_CSS() {
        // CSS với ID
        driver.findElement(By.cssSelector("input[id='FirstName']"));
        driver.findElement(By.cssSelector("input#FirstName"));
        driver.findElement(By.cssSelector("#FirstName"));

        // CSS với Class
        driver.findElement(By.cssSelector("div[class='page-title']"));
        driver.findElement(By.cssSelector("div.page-title"));
        driver.findElement(By.cssSelector(".page-title"));

        // CSS với Name
        driver.findElement(By.cssSelector("input[id='FirstName']"));

        // CSS với Tagname
        driver.findElement(By.cssSelector("input"));

        // CSS với Link
        driver.findElement(By.cssSelector("a[href='/customer/addresses"));

        // CSS với PartialLink
        driver.findElement(By.cssSelector("a[href*='addresses']"));

    }

    @Test
    public void TC_08_Xpath() {
        // Xpath vs ID
        driver.findElement(By.xpath("//input[@id='FirstName']"));

        // Xpath vs Class
        driver.findElement(By.xpath("//div[@class='page-title']"));

        // Xpath vs Name
        driver.findElement(By.xpath("//input[@id='FirstName']"));

        // Xpath vs tagname
        driver.findElement(By.xpath("//input"));

        // Xpath vs link
        driver.findElement(By.xpath("//a[@href='/customer/addresses']"));
        driver.findElement(By.xpath("//a[text()='Addresses']"));


        // Xpath vs partial link
        driver.findElement(By.xpath("//a[contains(@href,'addresses')]"));

    }
    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}

