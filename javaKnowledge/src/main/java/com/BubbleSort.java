package com;

import java.math.BigDecimal;

/**
 * @author <a href="mailto:daiju3@crnet.com.hk">daiju3</a>
 * @version 1.0.0
 * @description   冒泡排序算法以及优化
 * @since 2018/6/25 19:46
 */
public class BubbleSort {
    public static final BigDecimal FINAL_NUMBER = BigDecimal.valueOf(100);

    public static void main(String[] args) {
     int a[]={111,2,3234,4323,24,421,999,65656,3332,44,55,333};
     bubbleSort3(a);
     for(int i:a){
         System.out.println(i);
     }

    }

    public static void exchange(Integer a){
        a=2222;
    }


    public static void bubbleSort1(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
  //优化1
    public static void bubbleSort2(int a[]){
        for(int i=0;i<a.length;i++){
            boolean isExchange=true;
            for (int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    isExchange=false;
                }
            }
            if(isExchange){
                break;
            }
        }
    }

    public static void bubbleSort3(int a[]){
       int temp=0;
        //记录最后一次交换的位置
        int lastExchangeIndex=0;
        //无序数列的边界，每次只需要比较到这里为止
        int sortBorder=a.length-1;
        for(int i=0;i<a.length;i++){
          //有序标记，每一轮的初始值为true
            boolean isSort=true;
            for(int j=0;j<sortBorder;j++){
                if(a[j]>a[j+1]){
                     temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    isSort=false;//有元素交换，所以不是有序，标记变为false
                    lastExchangeIndex=j;//把无序数列的边界更新为最后一次交换元素的位置
                }
            }
            sortBorder=lastExchangeIndex;
            if(isSort){
                break;
            }
        }

    }
}
