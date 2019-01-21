package cc3act2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class CC3Act2 {
    
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df2 = new DecimalFormat("#.00");
        
        
        SimpleEmployee se1 = new SimpleEmployee();
        SimpleEmployee se2 = new SimpleEmployee();
        
        se1.setName("Mark");
        se1.setWeeklyGross(10000);
        se1.setClassification('A');
        
        se2.setName("Jake");
        se2.setWeeklyGross(50000);
        se2.setClassification('C');
        
        /*System.out.println("Name: " + se1.getName() + "\n"
                + "Bonus: " + se1.getBonusRate() + "\n"
                + "Fixed Salary: " + se1.getFixedSalary() + "\n"
                + "WeeklyGross: " + se1.getWeeklyGross() + "\n"
                + "Class: " + se1.getClass());*/
        
        System.out.print("Enter Name: ");
        String name = br.readLine();
        System.out.print("Enter Weekly Gross: ");
        double grossWeeklySales = Double.parseDouble(br.readLine());
        
        System.out.println("\n****** Snow Enterprises ******");
        System.out.println("Employee Name:\t\t" + name);
        System.out.println("Gross Salary:\t\t" + df2.format(((grossWeeklySales))));
        System.out.println("Bonus:\t\t\t" + df2.format(((8.5/100)*grossWeeklySales)));
        System.out.println("Net Weekly Salary:\t" + df2.format(netWeekly(grossWeeklySales)));
        System.out.println("Classification:\t\t" + classify(netWeekly(grossWeeklySales)));
    }   
    public static double netWeekly(double grossWeeklySales){
        double netWeeklySalary = ((8.5/100)*grossWeeklySales)+1500;
        return netWeeklySalary;
    }  
    public static char classify(double netWeeklySalary){
        char employeeClass = ' ';
        char[] classification = {'A', 'B', 'C', 'D', 'E', 'F'};
        int[] x = {1500, 2000, 2500, 3000, 3500, 4000};
        int[] y = {1999, 2499, 2999, 3499, 3999, 1000000};
        for(int i = 0; i < classification.length; i++){
            if(netWeeklySalary >= x[i] && netWeeklySalary <= y[i]){
                employeeClass = classification[i];
            }
        }
        return employeeClass;
    }
}