package practice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChildParent1 extends ParentTest1 {
    
    ParentTest1 ob1=new ParentTest1();
    

    @BeforeClass
    public void TestBeforeClass2() {
        System.out.println("The test is Child Before Class");
    }
    
    @Test
    public void Test02() {
        System.out.println("The test is Child Test1");
    }
}
