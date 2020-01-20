package practice;

import org.testng.annotations.Test;

public class RotateArray {
    
    
    @Test
    public void rotateArray() {
        int a[]= {6,-5,4,-3,1,12};
        int ShiftRight=5;
        int []arrayRotated=Solution(a,ShiftRight);
        System.out.println("The value of the rotated array is");
        for(int i=0;i<arrayRotated.length;i++) {
            System.out.print(arrayRotated[i]+"\t");
        }
    }

    private int[] Solution(int[] a, int shiftRight) {
        int arraySize=a.length;
        int temp[]=new int[arraySize];
        int k=0;
        if(shiftRight==0) {
            return a;
        }
        else {
        while(k!=shiftRight) {
            int j=0;
            temp[j++]=a[arraySize-1];
        for(int i=0;i<arraySize-1;i++) {
            temp[j]=a[i];
            j++;
        }
        for(int i=0;i<temp.length;i++) {
            a[i]=temp[i];
        }
        k++;
        }
        return temp;
        }
    }
    
}

