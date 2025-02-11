package org.example;

public class quickSort {



    private void sap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    private int partition(int[] arr,int l, int r){
        int pivot = arr[r];

        int i = l-1;
        for(int j = l;j<=r-1;j++){
            if(arr[j] < pivot){
                i++;
                sap(arr,i,j);
            }
        }
        sap(arr,i+1,r);
        return i+1;


    }
    public void quickSort(int[] arr, int l, int r){

        if(l<r){
            int pi  = partition(arr,l,r);

            quickSort(arr,l,pi-1);
            quickSort(arr,pi+1,r);
        }

    }

}
