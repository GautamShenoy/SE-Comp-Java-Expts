package com.javaexpts.expt6;
import java.util.*;


public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Employee> empRec = new Vector<Employee>();
        int size;
        System.out.println("Enter the number of employees : ");
        size = sc.nextInt();
        for (int i =0 ;i < size ; i++) {
            Employee e1 = new Employee();
            e1.setData();
            empRec.add(e1);
        }
        for (int i =0 ;i < size ; i++) {
            System.out.println("Employee " + (i+1) + " credentials : ");
            empRec.get(i).showData();
        }
    }
}
