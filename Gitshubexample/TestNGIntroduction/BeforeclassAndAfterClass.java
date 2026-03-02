package Gitshubexample.TestNGIntroduction;

import org.testng.annotations.*;

public class BeforeclassAndAfterClass {

    @BeforeMethod
    public void beforemethod()
    {
        System.out.println("this is before method");
    }

    @AfterMethod
    public void aftermethod()
    {
        System.out.println("This is aftermethod");
    }

    @BeforeClass
    public void bcm()
    {
        System.out.println("before class method");
    }

@AfterClass
    public void Acm()
    {
        System.out.println("After class method");
    }
    @Test
    public  void T1()
    {
        System.out.println("This is Test 1");
    }
    @Test
    public  void T2()
    {
        System.out.println("This is Test 2");
    }

    @Test
    public  void T3()
    {
        System.out.println("This is Test 3");
    }

}
