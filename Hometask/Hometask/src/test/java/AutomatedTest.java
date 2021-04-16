/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static java.lang.Thread.sleep;
import java.util.logging.Level;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.BasicConfigurator;  
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;


/**
 *
 * @author ahmet
 */
public class AutomatedTest {
    private static final Logger logger = LogManager.getLogger(AutomatedTest.class);
    private String SitedekiBaslik = "Türkiye'nin En Büyük Online Alışveriş Sitesi Hepsiburada.com";
    public AutomatedTest() {
    }

    public static void main(String[] args) {
         BasicConfigurator.configure();  
        logger.info("Test Otomasyon süreci başladı");
    
       AutomatedTest temp =new AutomatedTest();
        
        
        try {
            temp.shopping();
        } catch (InterruptedException ex) {
            Logger.getLogger(AutomatedTest.class.getName());
        }
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   
    @Test
  public void shopping() throws InterruptedException {
           
             System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
               logger.info("chrome driver programa dahil edildi");
		WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                logger.info("tarayıcı tam ekran yapıldı");
      driver.get("http://hepsiburada.com.tr");
      logger.info("ana sayfa yükleniyor");
      Thread.sleep(2000);
      String KontrolSiteBaslik=driver.getTitle();
      
      assertNotNull(KontrolSiteBaslik);
      assertEquals(KontrolSiteBaslik, SitedekiBaslik);
      logger.info("ana sayfanın yüklendiği kontrol edildi");
      WebElement login2 =driver.findElement(By.id("myAccount"));
      login2.click();
      Thread.sleep(2000);
      WebElement login3 =driver.findElement(By.id("login"));
      login3.click();
      Thread.sleep(2000);
      WebElement username=driver.findElement(By.id("txtUserName"));
      WebElement password=driver.findElement(By.id("txtPassword"));
      WebElement login= driver.findElement(By.id("btnLogin"));
      logger.info("giriş yapılıyor");
      

username.sendKeys("goeyrf2708@spidite.com");
password.sendKeys("12345678A");
login.click();
Thread.sleep(3000);

     WebElement searchBox=driver.findElement(By.xpath("//*[@id=\"SearchBoxOld\"]/div/div/div[1]/div[2]/input"));
      //searchBox.click();
      
      searchBox.sendKeys("bilgisayar");
      
      Thread.sleep(1000);
      //searchBox.submit();
      Thread.sleep(1000);
      searchBox.sendKeys(Keys.ENTER);
      Thread.sleep(1000);
      WebElement sayfa=driver.findElement(By.xpath("//*[@id=\"pagination\"]/ul/li[2]/a"));
      sayfa.click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div/div/div/div[2]/section/div[1]/div[4]/div/div/div/div/ul/li[3]/div/a")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("addToCart")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div/div/div/div[1]/div[2]/button[1]")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/section/section/ul/li/div/div/div[2]/div[4]/div[2]/div/a[1]")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath(("/html/body/div/div/div/div[2]/div/div[2]/section/section/ul/li/div/div/div[2]/div[4]/div[2]/div/a[2]"))).click();
       Thread.sleep(2000);
      
       driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/section/section/ul/li/div/div/div[2]/div[4]/div[2]/div/a[2]")).click();
          Thread.sleep(2000);
           driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/section/section/ul/li/div/div/div[2]/div[4]/div[2]/div[2]/div/div/div/button[2]")).click();
    
      Thread.sleep(3000);
    driver.quit();
  }
}
        