package program;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int c = sc.nextInt();

        for (int i=1; i <= c;i++){
            System.out.println("Employee #"+ i +" data: ");
            System.out.print("Outsourced (y/n)?: ");
            char sn = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.next();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hour = sc.nextInt();
            System.out.print("Value per hour: ");
            double value = sc.nextDouble();

            if (sn == 'y'){
                System.out.print("Additional charge: ");
                double charge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name,hour,value,charge));
            }
            else {
                employees.add(new Employee(name,hour,value));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}