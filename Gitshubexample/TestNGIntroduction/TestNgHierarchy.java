package Gitshubexample.TestNGIntroduction;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgHierarchy {
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
 @Test
    public  void T4()
    {
        System.out.println("This is Test 4");
    }
 @Test
    public  void T5()
    {
        System.out.println("This is Test 5");


}
     @Test
    public  void T6()
    {
        System.out.println("This is Test 6");


}

