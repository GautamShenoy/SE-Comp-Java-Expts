package com.javaexpts.expt3;
import java.io.*;

public class FileEvenOdd {
    public static void main(String[] args) throws IOException{
        try {
            FileReader fr = new FileReader("C:\\Users\\goura\\IdeaProjects\\Java_Expts_SE_Comp\\src\\com\\javaexpts\\expt3\\nos.txt");
            BufferedReader br = new BufferedReader(fr);
            String num;
            while ( (num = br.readLine() )!= null ) {
                if ( Integer.parseInt(num) % 2 ==0 )
                    System.out.println(num + " is Even");
                else
                    System.out.println(num + " is Odd");
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("no such file found");
            e.printStackTrace();
        }
    }
}
