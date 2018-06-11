package priv.mlodyalgol.sort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

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
                switchElements(inputTable,j, changed);
            }
            if(changed) break;
        }
        System.out.println("Sorted =" + Arrays.toString(inputTable));
    }

    private static  void switchElements(int[] inputTable, int j,boolean changed) {
        if(inputTable[j] > inputTable[j+1]){
            int temp = inputTable[j];
            inputTable[j] = inputTable[j+1];
            inputTable[j+1] = temp;
            changed = true;
        }
    }

    private static void seedTable(int[] seededTable){
        Random random = new Random();
        for(int i=0;i < seededTable.length;i++){
            seededTable[i] = random.nextInt(seededTable.length);
        }
    }
}
