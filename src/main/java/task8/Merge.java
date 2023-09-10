package task8;

import java.util.ArrayList;

public class Merge {

    public static int[] indexes(double[] a, double[] b, boolean shifting){
        ArrayList<Integer> indexes = new ArrayList<>();
        int i=0,j=0,shift=0;
        while(i<a.length && j<b.length){
            if(a[i]>=b[j]){
                indexes.add(i+ (shifting ? shift : 0));
                j++;
                shift++;
            } else if(a[i]<b[j]){
                i++;
            }
        }
        while(j<b.length){
            indexes.add(i + (shifting ? shift : 0));
            shift++;
            j++;
        }
        return indexes.stream().mapToInt(Integer::intValue).toArray();
    }

}
