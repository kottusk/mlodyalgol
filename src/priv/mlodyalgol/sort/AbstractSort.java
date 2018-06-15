package priv.mlodyalgol.sort;

import java.util.Random;

public class AbstractSort {

    public static  void switchElements(int[] inputTable, int j) {
        int temp = inputTable[j];
        inputTable[j] = inputTable[j+1];
        inputTable[j+1] = temp;

    }

    public static void seedTable(int[] seededTable){
        Random random = new Random();
        for(int i=0;i < seededTable.length;i++){
            seededTable[i] = random.nextInt(seededTable.length);
        }
    }

}
