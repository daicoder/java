package com;

/**
 * @author <a href="mailto:daiju3@crnet.com.hk">daiju3</a>
 * @version 1.0.0
 * @description   快排
 * @since 2018/7/12 10:45
 */
public class QuickSort {


    public static void main(String[] args) {
        int a[]={12,20,4,16,1,43,56,32,444,112,6666};
        int start=0;
        int end =a.length-1;
        quickSort(a,start,end);
        for(Integer i:a){
            System.out.println(i);
        }
    }

    public static void quickSort(int [] a,int low ,int high){
        int start=low;
        int end=high;
        int key=a[low];

        while (end>start){
            //从后往前比较
            while (end>start&&a[end]>=key)
                end--;
                if(a[end]<=key){
                    int temp=a[end];
                    a[end]=a[start];
                    a[start]=temp;
                }
                //从前往后比较
            while (end>start&&a[start]<=key)//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                start++;
                if(a[start]>=key){
                    int temp=a[start];
                    a[start]=a[end];
                    a[end]=temp;
                }
        }
        //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用

        //递归
        if(start>low) quickSort(a,low,start-1);
        if(end<high) quickSort(a,end+1,high);

    }
}
