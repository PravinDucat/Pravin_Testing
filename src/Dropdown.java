import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) {
        System.out.println("start selenium Projects");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.opencart.com/index.php?route=account/register");
        WebElement element = driver.findElement(By.id("input-country"));
        //element.sendKeys();

        Select dropdown =new Select(element);

        dropdown.selectByVisibleText("Algeria");

        //dropdown.selectByIndex(5);

        //dropdown.selectByValue("95");

        if(dropdown.isMultiple())
        {
            System.out.println("dropdown is multiple");
        }
        else
        {
            System.out.println("dropdown is not multiple");
        }

        List<WebElement> ddoptions = dropdown.getOptions();
        System.out.println("Total option:" +ddoptions.size());
        for(WebElement dl :ddoptions)
        {
            System.out.println(dl.getText());
        }
        driver.close();

    }
}
