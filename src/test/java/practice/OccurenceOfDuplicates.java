package practice;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class OccurenceOfDuplicates {

    @Test
    public void findDuplicateOccurence() {
        int[] integerArray = {
                1,1,1,2,3,2,4
        };
        ArrayList<Integer> integerList = new ArrayList<Integer>();

        for (int i = 0; i < integerArray.length; i++) {
            int numberOfOccurance = 1;
            while (!integerList.contains(integerArray[i]) || (i==integerArray.length)) {
                integerList.add(integerArray[i]);
                for (int j = i+1; j < integerArray.length; j++) {
                    if (integerArray[i] == integerArray[j]) {
                        numberOfOccurance++;
                    }
                }
                System.out.println("The number of occurances of " + integerArray[i] + " is " + numberOfOccurance);
            }
        }
    }
}
