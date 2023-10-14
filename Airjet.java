import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import java.util.List;
import java.time.Duration;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import java.util.List;
import java.time.Duration;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class Airjet {
	
	Logger logger = Logger.getLogger(Airjet.class.getName());
	static WebDriver driver;
	static WebElement Emailid;
	static WebElement Password;
	static WebElement mobile;
	static WebElement firstname;
	static WebElement Lastname;
	static WebElement cnfrmpass;
	static WebElement tiktno;
	
	
	@BeforeMethod
    public void setup() throws Exception {
                       
                driver = new ChromeDriver();         
                String url ="https://www.spicejet.com/";
                driver.get(url);
                driver.manage().window().maximize();         
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
	
	@Test(priority = 1)
    public void navigateToSignupUrlPage() {
		        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[1]/div[2]/div[2]/svg")).click();
		        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[1]/div/div/div[3]/div")).click();
		        String originalWindowHandle = driver.getWindowHandle();
		        for (String windowHandle : driver.getWindowHandles()) {
		            if (!windowHandle.equals(originalWindowHandle)) {
		                driver.switchTo().window(windowHandle);
		                break;
		            }
		        }
                String title1 = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div[1]/h1")).getText();
                Assert.assertEquals(title1,"Member Enrollment");
                logger.log(Level.INFO, "1.The Head Title below the menu: "+ title1);
    }
	
	@Test(priority = 2)
    public void clickSubmitButton() {
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[1]/div[2]/div[2]/svg")).click();
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[1]/div/div/div[3]/div")).click();
        String originalWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[7]/div[1]/a/button")).click();
        String title1 = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/div")).getText();
        Assert.assertEquals(title1,"Please fill all mandatory fields marked with an '*' to proceed");
        logger.log(Level.INFO, "1.The warning message in the top of the form: "+ title1);
    }
	
	@Test(priority = 3)
    public void clickSubmitButtonWithTitleAlone() {
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[1]/div[2]/div[2]/svg")).click();
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[1]/div/div/div[3]/div")).click();
        String originalWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/select")).click();
        WebElement firstResult = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/select/option[2]"));
        firstResult.click();
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[7]/div[1]/a/button")).click();
        String title1 = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/div")).getText();
        Assert.assertEquals(title1,"Please fill all mandatory fields marked with an '*' to proceed");
        logger.log(Level.INFO, "1.The warning message in the top of the form: "+ title1);
    }
	
	@Test(priority = 4)
    public void clickSubmitButtonWithFirstnameAlone() {
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[1]/div[2]/div[2]/svg")).click();
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[1]/div/div/div[3]/div")).click();
        String originalWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        firstname = driver.findElement(By.id("first_name"));
        firstname.sendKeys("Abcd");
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[7]/div[1]/a/button")).click();
        String title1 = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/div")).getText();
        Assert.assertEquals(title1,"Please fill all mandatory fields marked with an '*' to proceed");
        logger.log(Level.INFO, "1.The warning message in the top of the form: "+ title1);
    }
	
	@Test(priority = 5)
    public void clickSubmitButtonWithLastnameAlone() {
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[1]/div[2]/div[2]/svg")).click();
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[1]/div/div/div[3]/div")).click();
        String originalWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        Lastname = driver.findElement(By.id("last_name"));
        Lastname.sendKeys("X");
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[7]/div[1]/a/button")).click();
        String title1 = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/div")).getText();
        Assert.assertEquals(title1,"Please fill all mandatory fields marked with an '*' to proceed");
        logger.log(Level.INFO, "1.The warning message in the top of the form: "+ title1);
    }
	
	@Test(priority = 6)
    public void clickSubmitButtonWithMobileAlone() {
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[1]/div[2]/div[2]/svg")).click();
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[1]/div/div/div[3]/div")).click();
        String originalWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        mobile = driver.findElement(By.cssSelector("#react-root > div > div > div.container > div.box-full > div > div.register-form.col-12.col-xl-7.col-lg-8 > div:nth-child(4) > div:nth-child(1) > div > div.react-tel-input > input"));
        mobile.sendKeys("1234567890");
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[7]/div[1]/a/button")).click();
        String title1 = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/div")).getText();
        Assert.assertEquals(title1,"Please fill all mandatory fields marked with an '*' to proceed");
        logger.log(Level.INFO, "1.The warning message in the top of the form: "+ title1);
    }
	
	@Test(priority = 7)
    public void messageOnInvalidEmail() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[1]/div[2]/div[2]/svg")).click();
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[1]/div/div/div[3]/div")).click();
        String originalWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        Emailid = driver.findElement(By.id("email_id"));
        Emailid.sendKeys("dee");
        Thread.sleep(1000);
        String title1 = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/div")).getText();
        Assert.assertEquals(title1,"Please enter valid Email ID");
        logger.log(Level.INFO, "1.The warning message below the Email textbox: "+ title1);
    }
	
	@Test(priority = 8)
    public void messageOnInvalidPassword() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[1]/div[2]/div[2]/svg")).click();
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[1]/div/div/div[3]/div")).click();
        String originalWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        Password = driver.findElement(By.id("new_password"));
        Password.sendKeys("dee");
        Thread.sleep(1000);
        String title1 = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[5]/div[1]/div[3]/div/div")).getText();
        Assert.assertEquals(title1,"Password length should be min 8 & max 16 with at least 1 uppercase, 1 lowercase, a numeric value & a special character.");
        logger.log(Level.INFO, "1.The warning message below the Password textbox: "+ title1);
    }
	
	@Test(priority = 9)
    public void messageOnInvalidCnfrmPassword() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[1]/div[2]/div[2]/svg")).click();
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[1]/div/div/div[3]/div")).click();
        String originalWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        cnfrmpass = driver.findElement(By.id("new_password"));
        cnfrmpass.sendKeys("dee");
        Thread.sleep(1000);
        String title1 = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[5]/div[1]/div[3]/div/div")).getText();
        Assert.assertEquals(title1,"Password length should be min 8 & max 16 with at least 1 uppercase, 1 lowercase, a numeric value & a special character.");
        logger.log(Level.INFO, "1.The warning message below the Password textbox: "+ title1);
    }
	
	@Test(priority = 10)
    public void clickOnSignin() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[1]/div[2]/div[1]")).click();
        Thread.sleep(1000);
        String title1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[2]/div[2]")).getText();
        Assert.assertEquals(title1,"Log in to your account");
        logger.log(Level.INFO, "1.The title in the popup window: "+ title1);
    }
	
	@Test(priority = 11)
    public void clickOnSigninButton() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[1]/div[2]/div[1]")).click();
        Thread.sleep(1000);
        mobile = driver.findElement(By.id("main-container"));
        mobile.sendKeys("1234567890");
        Password = driver.findElement(By.id("main-container"));
        Password.sendKeys("Abcd666#***");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[2]/div[7]")).click();
        Thread.sleep(1000);
        String title1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[2]/div[4]/div[2]/div/div[2]/div/div")).getText();
        Assert.assertEquals(title1,"Please enter a valid mobile number");
        logger.log(Level.INFO, "1.The warning message below the FirstTextbox: "+ title1);
    }
	
	@Test(priority = 12)
    public void clickOnSigninWithInvalidmailid() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[1]/div[2]/div[1]")).click();
        Thread.sleep(1000);
        mobile = driver.findElement(By.id("main-container"));
        mobile.sendKeys("1234567890");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[2]/div[7]")).click();
        Thread.sleep(1000);
        String title1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[2]/div[4]/div[2]/div/div[2]/div/div")).getText();
        Assert.assertEquals(title1,"Please enter a valid mobile number");
        logger.log(Level.INFO, "1.The warning message below the FirstTextbox: "+ title1);
    }
	
	@Test(priority = 13)
    public void clickOnSigninWithInvalidPassword() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[1]/div[2]/div[1]")).click();
        Thread.sleep(1000);
        Password = driver.findElement(By.id("main-container"));
        Password.sendKeys("Abcd666#***");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[2]/div[7]")).click();
        Thread.sleep(1000);
        String title1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[2]/div[4]/div[2]/div/div[2]/div/div")).getText();
        Assert.assertEquals(title1,"Please enter a valid mobile number");
        logger.log(Level.INFO, "1.The warning message below the FirstTextbox: "+ title1);
    }
	
	@Test(priority = 14)
    public void searchForOneway() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[3]/div/div/div[1]/div[1]/div/div[1]/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[3]/div/div/div[1]/div[2]/div[3]/div[2]")).click();
        Thread.sleep(1000);
        
        WebElement searchBox = driver.findElement(By.cssSelector("#main-container > div > div.css-1dbjc4n.r-14lw9ot.r-1pi2tsx > div > div.css-1dbjc4n.r-bnwqim > div > div > div.css-1dbjc4n.r-1awozwy.r-14lw9ot.r-z2wwpe.r-18u37iz.r-1g7fiml.r-6e0ovw > input"));
        searchBox.sendKeys("Bengaluru");
        searchBox.sendKeys(Keys.ENTER);
        
        WebElement firstResult = driver.findElement(By.cssSelector("#main-container > div > div.css-1dbjc4n.r-14lw9ot.r-1pi2tsx > div > div.css-1dbjc4n.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-1sncvnh > div > div > div.css-1dbjc4n.r-6koalj.r-18u37iz"));
        firstResult.click();

        String title1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[3]/div/div/div[1]/div[2]/div[3]/div[3]")).getText();
        Assert.assertEquals(title1,"Bengaluru");
        logger.log(Level.INFO, "1.The Searched city below the To: "+ title1);
    }
	
	@Test(priority = 15)
    public void searchForRoundtrip() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[3]/div/div/div[1]/div[1]/div/div[2]/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[3]/div/div/div[1]/div[2]/div[3]/div[2]")).click();
        Thread.sleep(1000);
        
        WebElement searchBox = driver.findElement(By.cssSelector("#main-container > div > div.css-1dbjc4n.r-14lw9ot.r-1pi2tsx > div > div.css-1dbjc4n.r-bnwqim > div > div > div.css-1dbjc4n.r-1awozwy.r-14lw9ot.r-z2wwpe.r-18u37iz.r-1g7fiml.r-6e0ovw > input"));
        searchBox.sendKeys("Bengaluru");
        searchBox.sendKeys(Keys.ENTER);
        
        WebElement firstResult = driver.findElement(By.cssSelector("#main-container > div > div.css-1dbjc4n.r-14lw9ot.r-1pi2tsx > div > div.css-1dbjc4n.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-1sncvnh > div > div > div.css-1dbjc4n.r-6koalj.r-18u37iz"));
        firstResult.click();
        
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[3]/div/div/div[1]/div[6]")).click();

        String title1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[3]/div[2]")).getText();
        Assert.assertEquals(title1,"Unfortunately, there are no flights available.");
        logger.log(Level.INFO, "1.The warning text above the Search Again Box: "+ title1);
    }
	
	@Test(priority = 16)
    public void selectFlightForbooking() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[3]/div/div/div[1]/div[1]/div/div[2]/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[3]/div/div/div[1]/div[2]/div[3]/div[2]")).click();
        Thread.sleep(1000);
        
        WebElement searchBox = driver.findElement(By.cssSelector("#main-container > div > div.css-1dbjc4n.r-14lw9ot.r-1pi2tsx > div > div.css-1dbjc4n.r-bnwqim > div > div > div.css-1dbjc4n.r-1awozwy.r-14lw9ot.r-z2wwpe.r-18u37iz.r-1g7fiml.r-6e0ovw > input"));
        searchBox.sendKeys("Bengaluru");
        searchBox.sendKeys(Keys.ENTER);
        
        WebElement firstResult = driver.findElement(By.cssSelector("#main-container > div > div.css-1dbjc4n.r-14lw9ot.r-1pi2tsx > div > div.css-1dbjc4n.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-1sncvnh > div > div > div.css-1dbjc4n.r-6koalj.r-18u37iz"));
        firstResult.click();
        
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[3]/div/div/div[1]/div[6]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[4]/div/div/div/div[2]/div")).click();

        String title1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[3]/div[2]")).getText();
        Assert.assertEquals(title1,"Unfortunately, there are no flights available.");
        logger.log(Level.INFO, "1.The warning text above the Search Again Box: "+ title1);
    }
	
	@Test(priority = 17)
    public void clickOnFlightstatus() {
		        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[3]/div/div/div[2]/div/div/div[1]/a/div/div[2]")).click();
                String title1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[1]/div/div/div[2]")).getText();
                Assert.assertEquals(title1,"Flight Status");
                logger.log(Level.INFO, "1.The Head Title below the menu: "+ title1);
    }
	
	@Test(priority = 18)
    public void checkingTheFunctionOfstatusPage() {
		        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[3]/div/div/div[2]/div/div/div[1]/a/div/div[2]")).click();
		        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[1]")).click();
		        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div/div")).click();
		        WebElement searchBox = driver.findElement(By.cssSelector("#main-container > div > div.css-1dbjc4n.r-14lw9ot.r-1pi2tsx > div > div.css-1dbjc4n.r-bnwqim > div > div > div.css-1dbjc4n.r-1awozwy.r-14lw9ot.r-z2wwpe.r-18u37iz.r-1g7fiml.r-6e0ovw > input"));
		        searchBox.sendKeys("Bengaluru");
		        searchBox.sendKeys(Keys.ENTER);
		        
		        WebElement firstResult = driver.findElement(By.cssSelector("#main-container > div > div.css-1dbjc4n.r-14lw9ot.r-1pi2tsx > div > div.css-1dbjc4n.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-1sncvnh > div > div > div.css-1dbjc4n.r-6koalj.r-18u37iz"));
		        firstResult.click();
		        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[3]/div/div/div[1]/div")).click();
		        WebElement searchBox1 = driver.findElement(By.cssSelector("#main-container > div > div.css-1dbjc4n.r-14lw9ot.r-1pi2tsx > div > div.css-1dbjc4n.r-bnwqim > div > div > div.css-1dbjc4n.r-1awozwy.r-14lw9ot.r-z2wwpe.r-18u37iz.r-1g7fiml.r-6e0ovw > input"));
		        searchBox1.sendKeys("Kolkata");
		        searchBox1.sendKeys(Keys.ENTER);
		        
		        WebElement firstResult1 = driver.findElement(By.cssSelector("#main-container > div > div.css-1dbjc4n.r-14lw9ot.r-1pi2tsx > div > div.css-1dbjc4n.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-1sncvnh > div > div > div.css-1dbjc4n.r-6koalj.r-18u37iz"));
		        firstResult1.click();
		        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[5]/div")).click();
                String title1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[2]/div/div[1]/div[1]")).getText();
                Assert.assertEquals(title1,"Bengaluru\r\n"
                		+ "Kolkata\r\n"
                		+ "Sunday, 15 October, 2023");
                logger.log(Level.INFO, "1.The Head Title below the menu: "+ title1);
    }
	
	@Test(priority = 19)
    public void clickOnwebCheckin() {
		        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[3]/div/div/div[2]/div/div/div[2]/a/div/div[2]")).click();
                String title1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[1]/div/div/div[2]")).getText();
                Assert.assertEquals(title1,"Web Check-in");
                logger.log(Level.INFO, "1.The Head Title below the menu: "+ title1);
    }
	
	@Test(priority = 20)
    public void clickTheFetchBooking() {
		        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[3]/div/div/div[2]/div/div/div[2]/a/div/div[2]")).click();
		        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div/div/div[2]/div[3]/div[3]")).click();
		        
                String title1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div/div/div[2]/div[3]/div[1]/div/div[2]/div/div")).getText();
                Assert.assertEquals(title1,"Invalid PNR or Ticket Number");
                logger.log(Level.INFO, "1.The warning message below the First textbox: "+ title1);
    }
	
	@Test(priority = 21)
    public void checkingWithInvalidTicketNumber() {
		        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[3]/div/div/div[2]/div/div/div[2]/a/div/div[2]")).click();
		        tiktno = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div/div/div[2]/div[3]/div[1]/div/div[2]/div/input"));
		        tiktno.sendKeys("1234567890");
		        String title1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div/div/div[2]/div[3]/div[1]/div/div[2]/div/div")).getText();
                Assert.assertEquals(title1,"Invalid PNR or Ticket Number");
                logger.log(Level.INFO, "1.The warning message below the First textbox: "+ title1);
    }
	
	@Test(priority = 22)
	public void checkingWithInvalidLastname() {
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[3]/div/div/div[2]/div/div/div[2]/a/div/div[2]")).click();
        Lastname = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div/div/div[2]/div[3]/div[1]/div/div[2]/div/input"));
        Lastname.sendKeys("Z");
        String title1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div/div/div[2]/div[3]/div[1]/div/div[2]/div/div")).getText();
        Assert.assertEquals(title1,"Invalid PNR or Ticket Number");
        logger.log(Level.INFO, "1.The warning message below the First textbox: "+ title1);
    }
	
	@Test(priority = 23)
    public void clickOnBoardingPass() {
		        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[3]/div/div/div[2]/div/div/div[3]/a/div/div[2]")).click();
                String title1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[1]/div/div/div[2]")).getText();
                Assert.assertEquals(title1,"Web Check-in");
                logger.log(Level.INFO, "1.The Head Title below the menu: "+ title1);
    }
	
	@Test(priority = 24)
    public void clickOnBackOption() {
		        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[1]/div/div/div[1]")).click();
                String title1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[1]/div[1]/img")).getText();
                Assert.assertEquals(title1,"SpiceJet");
                logger.log(Level.INFO, "1.The Head Title below the menu: "+ title1);
    }
	
	@AfterMethod
    public void tearDown() {
                 List<WebElement> lgut = driver.findElements(By.xpath("//*[@id='top-menu-icon-div']/div[5]/div"));
                 if(lgut.size() != 0) {
                 driver.findElement(By.xpath("//*[@id='top-menu-icon-div']/div[5]/div")).click();
                 driver.findElement(By.linkText("Sign Out")).click();
                 }
                 driver.quit();
    }


}
