package priv.mlodyalgol.sort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort extends AbstractSort{

    public static void main(String[] args) {
        int[] table = new int[20];
        seedTable(table);
        sort(table);

    }

    private static void sort(int[] inputTable){
        System.out.println("Unsorted =" + Arrays.toString(inputTable));
        for(int i=0;i<inputTable.length;i++){
            boolean changed=false;
            for(int j=0;j<inputTable.length-i-1;j++){
                if(inputTable[j] > inputTable[j+1]) {
                    switchElements(inputTable, j);
                    changed = true;
                }
            }
            if(!changed) break;
        }
        System.out.println("Sorted =" + Arrays.toString(inputTable));
    }

}
