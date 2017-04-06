package ohtu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester {

    private static String url = "http://localhost:4567";
    
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/klint/ohtu/chromedriver"); 
        
        tryLogin("pekka", "akkep");
        tryLogin("pekka", "asdasfsa");
        tryLogin("asdwasd", "wasdasd");
        
        registerAndLogout("asdasd", "asdasd");
    }
    
    private static WebDriver getWebDriver(){
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        
        return driver;
    }
    
    private static void registerAndLogout(String username, String password){
        WebDriver driver = getWebDriver();
        
        sleep(1);
        
        WebElement element = driver.findElement(By.linkText("register new user"));
        element.click();
        
        element = driver.findElement(By.name("username"));
        element.sendKeys(username);
        element = driver.findElement(By.name("password"));
        element.sendKeys(password);
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys(password);
        
        sleep(2);
        
        element.submit();
        
        sleep(1);
        
        element = driver.findElement(By.linkText("continue to application mainpage"));
        element.click();
        
        sleep(1);
        
        element = driver.findElement(By.linkText("logout"));
        element.click();
        
        sleep(1);
        
        driver.quit();
    }
    
    private static void tryLogin(String username, String password){
        WebDriver driver = getWebDriver();
        
        sleep(1);
        
        WebElement element = driver.findElement(By.linkText("login"));
        element.click();

        sleep(1);

        element = driver.findElement(By.name("username"));
        element.sendKeys(username);
        element = driver.findElement(By.name("password"));
        element.sendKeys(password);
        element = driver.findElement(By.name("login"));
        
        sleep(2);
        element.submit();

        sleep(1);
        
        driver.quit();
    }
    
    private static void sleep(int n){
        try{
            Thread.sleep(n*1000);
        } catch(Exception e){}
    }
}
