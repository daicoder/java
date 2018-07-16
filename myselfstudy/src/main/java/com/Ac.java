package com;

import java.util.Stack;

/**
 * @author <a href="mailto:daiju3@crnet.com.hk">daiju3</a>
 * @version 1.0.0
 * @description
 * @since 2018/6/29 16:31
 */
public class Ac {

    public static String reverse(String s){
        char [] str=s.toCharArray();
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<str.length;i++){
            stack.push(str[i]);
        }

        String reversed="";
        for(int i=0;i<str.length;i++){
            reversed+=stack.pop();
        }
        return reversed;
    }

    public static String reverse2(String s){
        int length=s.length();
        String reversed="";
        for(int i=0;i<length;i++){
            reversed=s.charAt(i)+reversed;
        }
        return reversed;
    }
    public static void main(String[] args) {
        String a=reverse("abcdefg");
        String b=reverse2("abcdefgh");
        System.out.println(a);
        System.out.println(b);
    }
}
