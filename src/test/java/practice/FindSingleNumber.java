package practice;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class FindSingleNumber {

    @Test
    public void findtheSingledigit() {
        int a[] = {
                1, 7, 2, 2, 1
        };
        int singleElement = coreAlgo(a);
        System.out.println("The single element is " + singleElement);
    }

    private int coreAlgo(int a[]) {
        List<Integer> duplicates = new ArrayList<Integer>();
        int i = 0;
        for (i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    duplicates.add(a[i]);
                    break;
                }
            }

            if (!duplicates.contains(a[i])) {
                break;
            }
        }
        return a[i];
    }
}
