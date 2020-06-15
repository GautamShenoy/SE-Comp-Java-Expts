package com.javaexpts.expt11;
import java.util.Scanner;
import java.io.*;

public class ManagingIO {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\goura\\IdeaProjects\\Java_Expts_SE_Comp\\src\\com\\javaexpts\\expt13\\Student.dat",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            Scanner sc = new Scanner(System.in);
            int choice = 1;
            String firstName, lastName;
            int rollNumber;
            float subject1, subject2;
            while (choice == 1) {
                System.out.println("Enter first name and last name and roll number");
                firstName = sc.next();
                lastName = sc.next();
                rollNumber = sc.nextInt();
                System.out.println("Enter subject1 and subject2 marks");
                subject1 = sc.nextFloat();
                subject2 = sc.nextFloat();
                float average = ( subject1 + subject2 )/2;
                pw.println(firstName + " " + lastName + " " + rollNumber + " " + average);
                System.out.println("Do you want to enter more records ? (1 : Yes and 2 : No)");
                choice = sc.nextInt();
            }
            pw.close();
            FileReader fr = new FileReader("C:\\Users\\goura\\IdeaProjects\\Java_Expts_SE_Comp\\src\\com\\javaexpts\\expt13\\Student.dat");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw1 = new FileWriter("C:\\Users\\goura\\IdeaProjects\\Java_Expts_SE_Comp\\src\\com\\javaexpts\\expt13\\StudentBackup.dat");
            BufferedWriter bw1 = new BufferedWriter(fw1);
            PrintWriter pw1 = new PrintWriter(bw1);
            String str;
            int i =1;
            while ((str = br.readLine()) != null){
                System.out.println(i + " :- " + str );
                pw1.println(str);
                i++;
            }
            pw1.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("No Such File Found");
            e.printStackTrace();
        }
    }
}
