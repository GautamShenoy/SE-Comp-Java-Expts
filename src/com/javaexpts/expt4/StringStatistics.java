package com.javaexpts.expt4;
import java.util.Scanner;

public class StringStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input ;
        System.out.println("enter your string");
        input = sc.nextLine();
        String aux = "";
        int count = 1;
        for (int i = 0 ; i < input.length() ; i++){
            String name = "";
            name += input.charAt(i);
            if (aux.contains(name) == false) {
                for (int j = i +1 ; j < input.length() ; j++) {
                    if (input.charAt(i) == input.charAt(j)) {
                        String name1 = "";
                        name1 += input.charAt(i);
                        if (aux.contains(name1)) {
                            count++;
                        }
                        else {
                            aux += input.charAt(j);
                            count ++;
                        }
                        name1 = "";
                    }
                }
                System.out.println("letter " + input.charAt(i) + " repeated : " + count + " times");
                count = 1;
                name = "";
            }
            name = "";
        }
        System.out.println("enter char to replace and to be replaced ");
        String replace = sc.next();
        String tobeReplace = sc.next();
        String replacement = input;
        replacement = replacement.replace(replace,tobeReplace);
        System.out.println("After replacement : " + replacement);
    }
}
