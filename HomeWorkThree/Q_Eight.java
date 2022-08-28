package HomeWorkThree;
import java.util.Scanner;
public class Q_Eight {
    public static void main(String[] args) {
        
        int hours, minutes;
        double salary = 0, hourly_salary;
        String name;
        Scanner in = new Scanner (System.in);
        
        System.out.println("Enter name and salary of an employee...");
        System.out.print("Name : ");
        name = in.next();
        System.out.print("Salary : ");
        hourly_salary = in.nextDouble();
        System.out.println("How much hours and minutes the employee worked in the last week : ");
        System.out.print("The hours : ");
        hours = in.nextInt();
        System.out.print("The minutes : ");
        minutes = in.nextInt();
        
        for (int i=1; i<=hours; i++){
            if (i > 40)
                salary += (1.50 * hourly_salary);
            else
                salary += hourly_salary;
        }
        for (int i=1; i<=minutes; i++){
            salary += hourly_salary/60; 
        }
        
        System.out.println("The number of employee " + name + " working hours in the last week is -->" + hours  +" : " + minutes);
        System.out.println("Reserved salary is : " + salary);
    }
}
