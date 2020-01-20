package practice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParentTest1 {
    
    @BeforeClass
    public void TestBeforeClass1() {
        System.out.println("The test is Parent Before Class");
    }
    
    @Test
    public void Test01() {
        System.out.println("The test is Parent Test1");
    }
    

}
