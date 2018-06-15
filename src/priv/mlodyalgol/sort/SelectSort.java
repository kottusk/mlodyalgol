package priv.mlodyalgol.sort;

import java.util.Arrays;

public class SelectSort extends AbstractSort{
    public static void main(String[] args) {
        int[] table = new int[10];
        seedTable(table);
        sort(table);

    }

    private static void sort(int[] pTable){
        System.out.println("Unsorted =" + Arrays.toString(pTable));
        for(int i=0;i < pTable.length;i++){
            int minElement=pTable[i];
            int minIndex=i;
            for(int j=i;j < pTable.length;j++){
                if(pTable[j] < minElement){
                    minElement=pTable[j];
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                pTable[minIndex]=pTable[i];
                pTable[i] = minElement;
            }
            System.out.println("Int =" + Arrays.toString(pTable));
        }
        System.out.println("Sorted =" + Arrays.toString(pTable));
    }

}
