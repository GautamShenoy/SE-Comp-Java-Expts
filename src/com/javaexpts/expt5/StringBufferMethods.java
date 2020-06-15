package com.javaexpts.expt5;

import java.util.Scanner;

public class StringBufferMethods {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string ");
        StringBuffer name = new StringBuffer("HELLO");
        StringBuffer str =new StringBuffer(sc.nextLine());
        System.out.println("test Char at position 1 : "+str.charAt(1));
        System.out.println("testing deleting at position 0: "+str.deleteCharAt(0));
        System.out.println("testing appending with HELLO : "+str.append(" HELLO"));
        System.out.println("testing capacity of string  : "+str.capacity()+" Bytes");
        System.out.println("testing equals on string with word HELLO "+str+" and "+name+" : "+name.equals(str));
    }

}
