package practice;

import org.testng.annotations.Test;

public class reverseIntegerAndString {
    
    @Test
    public void reverseInteger() {
        int num=-123;
        int reverseNum=0;
        int max=(int) (Math.pow(2, 31)-1);
        int min=-(int) (Math.pow(2, 31))-1;
        System.out.println("The max value is "+max);
        while(num!=0) {
            if(reverseNum> max/10 || reverseNum<min/10 || num==-1) {
                reverseNum=0;
                break;
            }
            reverseNum=reverseNum*10;
            reverseNum=reverseNum+(num%10);
            num=num/10;
        }
        System.out.println("The reversed integer is "+reverseNum  );
    }
    
    @Test
    public void reverseString() {
        
    }


}
