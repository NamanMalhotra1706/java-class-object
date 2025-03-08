import java.util.Scanner;

public class Employee{

    String name;
    int id;
    int salary;

    Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getEmployeeName(){
        return name;
    }

    public int getEmployeeId(){
        return id;
    }

    public int getEmployeeSalary(){
        return salary;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Employee name: ");
        String employeeName = sc.nextLine();

        System.out.print("Enter the Employee Id: ");
        int employeeId = sc.nextInt();

        System.out.print("Enter the Employee Salary: ");
        int employeeSalary = sc.nextInt();

        Employee employee1 = new Employee(employeeName,employeeId,employeeSalary);
        System.out.println("Employee name: " + employee1.getEmployeeName());
        System.out.println("Empoyee Id: " + employee1.getEmployeeId());
        System.out.println("Empoyee Salary: " + employee1.getEmployeeSalary());
    }
}


// Sample Case
// Enter the Employee name: Naman Malhotra
// Enter the Employee Id: 2110990913
// Enter the Employee Salary: 5000000

// Output
// Employee name: Naman Malhotra
// Empoyee Id: 2110990913
// Empoyee Salary: 5000000