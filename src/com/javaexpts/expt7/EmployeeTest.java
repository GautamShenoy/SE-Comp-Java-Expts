package com.javaexpts.expt7;
import java.util.*;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> epmRec = new ArrayList<Employee>();
        String choice, name, project;
        int reentry = 1;
        double salary, hike;
        while(reentry == 1) {
            System.out.println("Who are you ?? [1 : Manager 2 : Worker] . Press 3 to exit");
            choice = sc.next();
            if (choice.toLowerCase().equals("manager") || choice.equals("1") ){
                System.out.println("Enter your name");
                name = sc.nextLine();
                name = sc.nextLine();
                System.out.println("Enter project name");
                project = sc.nextLine();
                System.out.println("Enter salary");
                salary = sc.nextDouble();
                System.out.println("Enter hike amount (will be 2x automatically)");
                hike = sc.nextDouble();
                Manager m1 = new Manager(name,salary);
                m1.setProject(project);
                m1.giveRaise(hike);
                epmRec.add(m1);
            }
            else if ( choice.toLowerCase().equals("worker") || choice.equals("2") ) {
                System.out.println("Enter your name");
                name = sc.nextLine();
                name = sc.nextLine();
                System.out.println("Enter salary");
                salary = sc.nextDouble();
                System.out.println("Enter hike amount ");
                hike = sc.nextDouble();
                Worker w1 = new Worker(name,salary);
                w1.giveRaise(hike);
                epmRec.add(w1);
            }
            else if ( choice.equals("3")) {
                break;
            }
            else {
                System.out.println("The value entered by you doesnt correspond to choices given !! \nDo you want to e" +
                        "nter again ? {1: Yes 2 : No} ");
                reentry = sc.nextInt();
                if (reentry != 1) {
                    System.out.println("Sure to exit ?? (1 to re-enter , 2 to exit )");
                    reentry = sc.nextInt();
                }
            }
        }
        System.out.println("Done storing all records");
        System.out.println("Records of Employees logged in today ");
        for ( int i = 0 ; i < epmRec.size() ; i ++) {
            System.out.println("Employee " + (i+1) + " :-");
            System.out.println("Designation : " + epmRec.get(i).getDesignation() );
            System.out.println("Name : " + epmRec.get(i).getName());
            if (epmRec.get(i).getDesignation().toLowerCase().equals("manager")) {
                Manager m2 =(Manager) epmRec.get(i);
                System.out.println("Project name : " + m2.getProject());
            }
            System.out.println("Salary : " + epmRec.get(i).getSalary());
        }
    }
}
