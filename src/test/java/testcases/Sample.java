package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample {

    @DataProvider
    public Object[][] getData(){
 return new Object[][]{
         {"mayank","India","SDET"}
    };
 }

    @Test(dataProvider = "getData")
    public void automate(String name , String location , String profile){
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayank.rathore\\Desktop\\driver\\chromedriver_102\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://naveenautomationlabs.com/opencart/");



        System.out.println(name);
        System.out.println(location);
        System.out.println(profile);

    }
}
