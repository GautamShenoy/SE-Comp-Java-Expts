package com.javaexpts.expt4;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TutsExpt {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fr = new FileReader("C:\\Users\\goura\\IdeaProjects\\Java_Expts_SE_Comp\\src\\com\\javaexpts\\expt4\\studentlist.txt") ;
            BufferedReader br = new BufferedReader(fr);
            String str = "",s;
            while ((s=br.readLine())!=null){
                str+=s;
                str += '\n';
            }
            List<String> list = new ArrayList<String>();
            List<String> list1 = new ArrayList<String>();
            String[] splitter = str.split(" |\n");
            String[] splitter1 = str.split("\n");
            list = Arrays.asList(splitter);
            list1 = Arrays.asList(splitter1);
            int count = 0;
            for ( String s1 : list1) {
                count += s1.length();
                System.out.println(s1);
            }
            System.out.println("Total number of words : " + list.size());
            System.out.println("Total number of chars : " + count) ;
        }
        catch (FileNotFoundException e){
            System.out.println("No Such File Exists");
            e.printStackTrace();
        }
    }
}
