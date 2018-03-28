
package manydata;

import java.util.ArrayList;

public class ManyData {

    public static void main(String[] args) {
        String[] arrayInteger1 = {"11","22"};
        int[] arrayInteger2 = {1, 32, 4, 5, 6};
        
        ArrayList<String> arrayListString = new ArrayList<String>();
        arrayListString.add("aa");
        arrayListString.add("bb");
        System.out.println(arrayListString.get(1));
        
        ArrayList<Integer> arrayListInteger = new ArrayList<Integer>();
        arrayListInteger.add(1);
        arrayListInteger.add(32);
        arrayListInteger.add(6);
        arrayListInteger.add(1, 6);
        
        for (int i = 0; i < arrayListInteger.size(); i++) {
            System.out.print(arrayListInteger.get(i)+" ");
        }
        
        for (Integer integer : arrayListInteger) {
            System.out.println(integer + " ");
        }
    }
    
}
