package Gitshubexample.TestNGIntroduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
Test : Marks a class or a method as a part of the test.
@BeforeMethod: This will be executed before every @test annotated method.
@AfterMethod: This will be executed after every @test annotated method.

 */

public class BeforeMethodandAfterMethod {
    //duplicate method in 1 instance

    public WebDriver dd;

    @BeforeMethod
    public void Setup()
    {

    dd=new ChromeDriver();
    }

    @AfterMethod
    public void teardown()
    {

        dd.close();
    }


    @Test
    public void VerifyGoogle()
    {


        dd.get("https://www.google.com/");
        dd.manage().window().maximize();

    }

    @Test  //This is Test annotation
    public void VerifyAmazon() {


        dd.get("https://www.amazon.in/");
        dd.manage().window().maximize();
    }

    @Test
        public void VerifyDemo()
        {
            dd.get("https://www.edso.in/");
            dd.manage().window().maximize();

        }
}
