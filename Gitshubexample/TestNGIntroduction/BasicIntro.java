package Gitshubexample.TestNGIntroduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicIntro {

    //we can define the test case without any main method
//always give Test annotation
    //we can handle multiple test cases with diffrent url

    @Test  //This is Test annotation
    public void VerifyDemo()
    {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.edso.in/");
        driver.manage().window().maximize();
        driver.close();
    }


    @Test  //This is Test annotation
    public void VerifyGoogle()
    {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.close();
    }

    @Test  //This is Test annotation
    public void VerifyAmazon()
    {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.close();
    }
}
