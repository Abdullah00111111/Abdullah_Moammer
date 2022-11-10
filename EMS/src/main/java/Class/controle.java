package Class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class controle {
    private employee[] employees;
    private int numOfEmployee;
    
    public controle() throws FileNotFoundException{
        employees = new employee[20];
        numOfEmployee = 0;
        readFile();
    }

    public boolean addNewEmployee(String txt[], int number[]){
        if(numOfEmployee<employees.length){
            employee emp = new employee(txt, number);
            employees[numOfEmployee] = emp;
            numOfEmployee++;
            return true;
        }
        else
            return false;
    }
    
    public employee[] viewEmployees(){
        return employees;
    }
    
    public employee searchEmployee(int id){
        int i = 0;
        boolean found = false;
        while(!found && i < employees.length){
            if(employees[i] != null){
                if(employees[i].getID() == id){
                    found = true;
                }
                else
                    i++;
            }
            else
                i++;
        }
        if(i < employees.length)
            return employees[i];
        else
            return null;
    }
    
    public int counterId(int max){
        int i=0;
        while(i < employees.length){
             if(employees[i] != null){
                 if(employees[i].getID() > max){
                     max = employees[i].getID();
                 }
                 else
                      i++;
             }
             else
                 i++;
        }
        return max+1;
    }
    
    public boolean RepeatCheck(employee emp){
        for(int i=0; i < numOfEmployee; i++){
            if(employees[i].equals(emp))
                return true;
        }
        return false;
    }
    
    public void readFile() throws FileNotFoundException{
        Scanner in = new Scanner(new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\EMS\\src\\main\\java\\Class\\Employee_Data.txt"));
        while(in.hasNextLine()){
            String []txt = new String[3];
            int []number = new int[3];
            
            txt[0] = in.next(); // first name
            txt[1] = in.next(); // last name
            number[0] = in.nextInt(); // Age
            txt[2] = in.next(); // phone number
            number[1] = in.nextInt(); // join date
            number[2] = in.nextInt(); // ID
            
            addNewEmployee(txt, number);
        }
        in.close();
    }
    
    public void writeFile() throws FileNotFoundException{
        PrintWriter writer = new PrintWriter(new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\EMS\\src\\main\\java\\Class\\Employee_Data.txt"));
        
        for(int i=0; i<numOfEmployee; i++){
            writer.write("\n" + employees[i].getfName() + " " + employees[i].getlName() + " " + employees[i].getAge() + " " + employees[i].getPhoneNumber() + " " + employees[i].getJoinDate() + " " + employees[i].getID());
        }
        writer.close();
    }
}
