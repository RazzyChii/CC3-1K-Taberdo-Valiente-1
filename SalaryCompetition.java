package salarycompetition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class SalaryCompetition {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df2 = new DecimalFormat("#.00");
        
        SimpleEmployee se1 = new SimpleEmployee();
        SimpleEmployee se2 = new SimpleEmployee();
        
        se1.setName("Jon");
        se1.setWeeklyGross(1500);
        
        se2.setName("Ann");
        se2.setWeeklyGross(1500);
        
        System.out.print("Enter Namme: ");
        String name = br.readLine();
        System.out.print("Enter Weekly Gross: ");
        double weeklySales = Double.parseDouble(br.readLine());
        
        System.out.println("\n****** Snow Enterprises *****");
        System.out.println("Employee Name:\t\t" + name);
        System.out.println("Gross Salary:\t\t" + df2.format(((weeklySales))));
        System.out.println("Bonus:\t\t\t" + df2.format(((8.5/100)*weeklySales)));
        System.out.println("Net Weekly Salary:\t" + df2.format((weeklySales)));
        System.out.println("Classification:\t\t" + classify((weeklySales)));
    }
    public double netweekly(double weeklySales){
        double netweeklySales = ((8.5/100)*weeklySales)+1500;
        return netweeklySales;
    }
    public static char classify(double netweeklySales){
        char employeeClass = ' ';
        char[] classification = {'A', 'B', 'C', 'D', 'E', 'F'};
        int[] x = {1500, 2000, 2500,300, 3500, 4000};
        int[] y = {1999, 2499, 2999, 3499, 3999, 1000000};
        for(int i = 0; i < classification.length; i++){
            if(netweeklySales >= x[i] && netweeklySales <= y[i]){
                employeeClass = classification[i];
            }
        }
        return employeeClass;
    }
}