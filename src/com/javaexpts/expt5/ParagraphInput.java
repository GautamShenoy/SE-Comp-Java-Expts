package com.javaexpts.expt5;
import java.util.*;

public class ParagraphInput {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paragraph ($$ on a new line to terminate inputting)");
        String paragraph = "" , input;
        while (sc.hasNext()) {
            input = sc.nextLine();
            if (input.equals("$$"))
                break;
            input += '\n';
            paragraph +=input.toUpperCase();
        }
        String[] splitter = paragraph.split(" |\n");
        List<String> words = new ArrayList<String>();
        words = Arrays.asList(splitter);
        System.out.println(words.size());
        System.out.println("The total number of words : " + words.size() );
        List<String> repeatedWords = new ArrayList<String>();
        List<Integer> repWordCount = new ArrayList<Integer>();
        int count = 1;
        for (int i = 0 ; i < words.size() ; i++) {
            if ( repeatedWords.contains ( words.get(i).toUpperCase() ) )
                continue;
            else {
                for ( int j =i +1 ; j < words.size() ; j++) {
                    if (words.get(i).equals(words.get(j))) {
                        if (repeatedWords.contains ( words.get(i).toUpperCase() ) ){
                            count += 1;
                        }
                        else {
                            repeatedWords.add( words.get(i).toUpperCase() );
                            count += 1;
                        }
                    }
                }
                repWordCount.add(count);
                count  = 1;
            }
        }
        int j = 0;
        System.out.println("The Duplicate Words are : ");
        if (repeatedWords.isEmpty()){
            System.out.println("No Duplicate Words");
        }
        else {
            for (String s : repeatedWords)
                System.out.print(s + " ");
            j = 0;
            for (int i = 0; i < (repWordCount.size() - 1); i++) {
                for (int k = i + 1; k < repWordCount.size(); k++) {
                    if (repWordCount.get(i) < repWordCount.get(k))
                        j = k;
                }
            }
            System.out.println("\nMost frequently used word : " + repeatedWords.get(j) + " : " + repWordCount.get(j) + " times");
            System.out.println("Enter the element to be replaced with the most frequently used element");
            String replacement = sc.nextLine();
            paragraph = paragraph.replace(repeatedWords.get(j), replacement);
            System.out.println("Your paragraph after replacement : \n" + paragraph);
        }
    }
}
