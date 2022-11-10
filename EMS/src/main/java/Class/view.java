package Class;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class view {
    private controle controller;
    Scanner in;
    
    public view () throws FileNotFoundException{
        controller = new controle();
        in = new Scanner(System.in);
    }
    
    public void start() throws FileNotFoundException{
        services();
        while (true){
            System.out.print("Enter number of service --> ");
            int service = in.nextInt();
            switch(service){
                case 1: addEmployee(); break;
                case 2: search(); break;
                case 3: viewDataEmployees(); break;
                case 4: controller.writeFile(); break;
                case 5: System.exit(0);
            }
        }
    }
    
    public void addEmployee(){
        System.out.println("Enter data of new employee.");
        String []txt = new String[3];
        int []number = new int[3];
        System.out.print("Enter first name -> ");
        txt[0] = in.next();
        System.out.print("Enter last name -> ");
        txt[1] = in.next();
        System.out.print("Enter his age -> ");
        number[0] = in.nextInt();
        System.out.print("Enter join date -> ");
        number[1] = in.nextInt();
        System.out.print("Enter his phone number -> ");
        txt[2] = in.next();
        System.out.print("Enter his ID -> ");
        number[2] = controller.counterId(0);
        boolean Repeat = controller.RepeatCheck(new employee(txt, number));
        if(Repeat)
            System.out.println("There is already employee with this ID");
        else{
            boolean check = controller.addNewEmployee(txt, number);
            if(check)
                System.out.println("Added");
            else
                System.out.println("Not added");
        }
    }
    
    public void viewDataEmployees(){
        employee []emp = controller.viewEmployees();
        
        System.out.println("___________________________");
        for(int i=0; i<20; i++){
            if(emp[i] != null){
                System.out.println(i+1 + " ) " + emp[i].toString());
                System.out.println("___________________________");
            }
        }
    }
    
    public void search(){
        System.out.print("Enter employee ID : ");
        int id = in.nextInt();
        employee emp = controller.searchEmployee(id);
        
        if(emp != null){
            System.out.println("___________________________");
            System.out.println(emp.toString());
            System.out.println("___________________________");
        }
        else
            System.out.println("No employee with this ID");
    }
    
    public void services(){
        System.out.println("|-------Welcome to Behar ALmesk-------|");
        System.out.println("|                                     |");
        System.out.println("|      What service do you want?      |");
        System.out.println("|                                     |");
        System.out.println("|           ---------------           |");
        System.out.println("| (1)  Add an employee                |");
        System.out.println("| (2)  Searching for an employee      |");
        System.out.println("| (3)  View employee data             |");
        System.out.println("| (4)  Write in a file                |");
        System.out.println("| (5)  To close program               |");
        System.out.println("|           ---------------           |");
        System.out.println("|                                     |");
        System.out.println("|-------------------------------------|");
    }
}
