package com;

/**
 * @author <a href="mailto:daiju3@crnet.com.hk">daiju3</a>
 * @version 1.0.0
 * @description
 * @since 2018/7/12 16:02
 */
public class IntegetComper {

    public static Integer max = Integer.MAX_VALUE;


    public static void main(String[] args) {


        int a[]={1,2,3,42323,213,43323,55555,221332,996};
        int start=0;
        int end=a.length-1;
        System.out.println(a.length);
        quickSort(a,start,end);
        for(int i:a){
            System.out.println(i);
        }
    }


    public static void quickSort(int []a, int low, int high) {
        int start = low;
        int end = high;
        int key = a[low];

        while (end > start) {
            while (end > start && a[end] >= key)
                end--;
            if (a[end] <= key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            while (end > start && a[start] <= key)
                start++;
            if (a[start] >= key) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        if(start>low) quickSort(a,low,start-1);
        if(end<high) quickSort(a,end+1,high);
    }
}
