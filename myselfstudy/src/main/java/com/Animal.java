package com;

/**
 * @author <a href="mailto:daiju3@crnet.com.hk">daiju3</a>
 * @version 1.0.0
 * @description
 * @since 2018/6/27 9:10
 */
 abstract class Animal {



    public static  void quickSort(int a[],int low,int high){
        int start=low;
        int end =high;
        int key=a[low];


        while (end>start){
            while (end>start&&a[end]>=key)

                end--;
            if(a[end]<=key){
                int temp=a[end];
                a[end]=a[start];
                a[start]=temp;
            }

            while (end>start&&a[start]<=key)
                start++;
                if(a[start]>=key){
                    int tem=a[start];
                    a[start]=a[end];
                    a[end]=tem;
                }
        }
        if(start>low)quickSort(a,low,start-1);
        if(end<high)quickSort(a,end+1,high);
    }

    public static void main(String[] args) {
        int[] a = {12,20,5,16,15,1,30,45,23,9};
        int start = 0;
        int end = a.length-1;
        quickSort(a,start,end);
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }

    }
}
