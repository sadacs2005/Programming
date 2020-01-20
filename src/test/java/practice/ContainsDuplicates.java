package practice;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class ContainsDuplicates {
    
    @Test
    public void containsDuplicates() {
        int a[]= {0,1,1};
        boolean isDuplicate=solution(a);
        if(isDuplicate) {
            System.out.println("The array contains duplicates");
        }
        else {
            System.out.println("The array does not contain duplicates");
        }
    }

    //Using collections
    private boolean solution(int[] a) {
        List<Integer> al= new ArrayList<Integer>();
        for(int i=0;i<a.length-1;i++) {
            al.add(a[i]);
            if(al.contains(a[i+1])) {
                return true;
            }
        }
        
        return false;
    }

    /*    //Using arrays
    private boolean solution(int[] a) {
       int size=a.length;
       for(int i=0;i<size;i++) {
           for(int j=i+1;j<size;j++) {
               if(a[i]==a[j])
                   return true;
           }
       }
        return false;
    }*/
    

}
