package com.javaexpts.expt4;
import java.io.*;
import java.util.*;

public class StudentsNameList {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fr = new FileReader("C:\\Users\\goura\\IdeaProjects\\Java_Expts_SE_Comp\\src\\com\\javaexpts\\expt4\\studentlist.txt");
            BufferedReader br = new BufferedReader(fr);
            String name = "", temporary;
            while ((temporary = br.readLine()) != null) {
                name += temporary;
                name += '\n';
            }
            String[] splitter = name.split("\n");
            List<String> names = new ArrayList<String>();
            names = Arrays.asList(splitter);
            List<String> repeatedWords = new ArrayList<String>();
            List<Integer> repWordCount = new ArrayList<Integer>();
            List<String> distinctNames = new ArrayList<String>();
            int count = 1;
            for (int i = 0 ; i < names.size() ; i++) {
                if ( repeatedWords.contains ( names.get(i).toUpperCase() ) )
                    continue;
                else {
                    for ( int j =i +1 ; j < names.size() ; j++) {
                        if (names.get(i).equals(names.get(j))) {
                            if (repeatedWords.contains ( names.get(i).toUpperCase() ) ){
                                count += 1;
                            }
                            else {
                                repeatedWords.add( names.get(i).toUpperCase() );
                                count += 1;
                            }
                        }
                    }
                    repWordCount.add(count);
                    count  = 1;
                }
            }
            System.out.println("Distinct names : ");
            for (String s : names ) {
                if (repeatedWords.contains(s.toUpperCase()) == false)
                System.out.println(s.toUpperCase());
            }
            System.out.println("Duplicate names : ");
            for ( String s : repeatedWords )
                System.out.println(s);
        }
        catch (FileNotFoundException e) {
            System.out.println("No such file found");
            e.printStackTrace();
        }
    }
}
