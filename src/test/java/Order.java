import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import java.awt.event.ActionListener;

public class Order {
    WebDriver driver = new ChromeDriver();
    @Given("Login")
    public void login() throws InterruptedException {
        driver.get("https://jamtangan.com/login");
        driver.manage().window().maximize(); //Maximize windows
        Thread.sleep(5000); //delay for 5 second waiting for content load

        WebElement nantisaja = driver.findElement(By.xpath("//*[contains(text(),'Nanti Saja')]"));
        nantisaja.click();

        WebElement fieldemail = driver.findElement(By.name("username"));
        fieldemail.click();
        Thread.sleep(5000);


        WebElement inputemail = driver.findElement(By.name("username"));
        inputemail.sendKeys("stevendavidsz05@gmail.com");
        WebElement inputpassword = driver.findElement(By.name("password"));
        inputpassword.sendKeys("Rahasia1.");
        WebElement buttonlogin = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]/div/div/form/button"));
        buttonlogin.click();
        Thread.sleep(5000);

    }

    @When("choose product")
    public void chooseProduct() throws InterruptedException {
        WebElement chooseproduct = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[3]/ul/li[8]/a/div/p"));
        chooseproduct.click();
        Thread.sleep(6000);
        WebElement clickoke = driver.findElement(By.xpath("//*[contains(@class,'driver-close-btn')]"));
        clickoke.click();
        Thread.sleep(2000);
        WebElement productdetail = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[2]/div[4]/div[1]/div/a/div/div/div[1]/div[1]/picture/img"));
        productdetail.click();
        WebElement belisekarang = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/button"));
        belisekarang.click();
        Thread.sleep(5000);
        WebElement lanjutkan = driver.findElement(By.xpath("//*[contains(@class,'w-full md')]"));
        lanjutkan.click();
        Thread.sleep(3000);
    }

    @When("choose courier")
    public void chooseCourier() throws InterruptedException {
        WebElement pilihpengiriman = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/main/section[1]/div[2]/div/div[2]/button/div/div"));
        pilihpengiriman.click();
        Thread.sleep(2000);

        WebElement pilihkurir = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/main/section[1]/div[2]/div[2]/div/ul/li[1]/div/div[1]/div[1]"));
        pilihkurir.click();
    }

    @When("choose voucher")
    public void chooseVoucher() throws InterruptedException {
        WebElement pilihvoucher = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/main/section[2]/div/div/div[1]/div[1]/button/div/span[2]"));
        pilihvoucher.click();
        Thread.sleep(2000);
        WebElement oke = driver.findElement(By.xpath("//*[@id=\"driver-popover-item\"]/div[4]/button"));
        oke.click();
        WebElement gunakan = driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div/div/div[1]/div[3]/div[3]/div/div[2]/div[2]"));
        gunakan.click();
        Thread.sleep(2000);
        WebElement pakaivoucher = driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div/div/div[2]/div/div[2]/button"));
        pakaivoucher.click();
        Thread.sleep(2000);

    }

    @And("choose payment")
    public void choosePayment() throws InterruptedException {
        WebElement pilihpembayaran = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/main/section[2]/div/div/div[2]/div[3]/div/div[2]/button"));
        pilihpembayaran.click();
        Thread.sleep(5000);

        WebElement clickVA = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/main/section[1]/div/div[2]/div[2]/div/div[1]/div/div/p"));
        clickVA.click();
        Thread.sleep(2000);

        WebElement ordernow = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/main/section[2]/div[2]/div[3]/div/div[2]/button"));
        ordernow.click();
    }
}
