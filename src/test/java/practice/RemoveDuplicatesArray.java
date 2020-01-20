package practice;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class RemoveDuplicatesArray {
    
    
    public int removeDuplicatesFromSortedArray(int[] num) {
        int temp[]= new int[num.length];
        List <Integer> noDuplicatesList=new ArrayList<Integer>();
        int j=0;
        
        if(num.length==0|num.length==1) {
            return num.length;
        }
        for(int i=0;i<num.length-1;i++) {
            if(num[i]!=num[i+1]) {
                temp[j++]=num[i];
            }
        }
            temp[j++]=num[num.length-1];
            
        /* for(int k=0;k<j;k++) {
             num[k]=temp[k];
         }*/
            for(int i=0;i<j;i++) {
                noDuplicatesList.add(temp[i]);
            }
            
            System.out.println("The array after removing duplicates is ");
            for(int i=0;i<noDuplicatesList.size();i++) {
                System.out.print(noDuplicatesList.get(i)+" ");
            }
        return j;
    }
    
    @Test
    public void mainMethod() {
        
        int num[]= {1,2,2,3,3,3};
        int arraysize=removeDuplicatesFromSortedArray(num);
        System.out.println("The size of the array after removing duplicates is "+arraysize);
        
    }
}
