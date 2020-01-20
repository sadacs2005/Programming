package practice;

import org.testng.annotations.Test;

public class Test2 {
   
    @Test
    public void execute() {
        Test1 ob1 =new Test1();
        Test1 ob2= new Test1(2,3);
        ob2.cal();
        
    }
    

}
