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
        //se1.setClassifications('A'); (optional cause it dosen't affect the results)
        
        se2.setName("Ann");
        se2.setWeeklyGross(1500);
        //se2.setClassifications('C'); (optional cause it dosen't affect the results)
        
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
        int[] x = {1500, 2000, 2500, 3000, 3500, 4000};
        int[] y = {1999, 2499, 2999, 3499, 3999, 1000000};
        for(int i = 0; i < classification.length; i++){
            if(netweeklySales >= x[i] && netweeklySales <= y[i]){
                employeeClass = classification[i];
            }
        }
        return employeeClass;
    }
}

//create a class along with salarycompetition to make a class for the employees to support the salarycompetition
package salarycompetition;

public class SimpleEmployee {
    
    String Name;
    char Classification;
    float FixedSalary;
    double WeeklyGross;
    double BonusRate;
    
    SimpleEmployee(){    
    }
    
        public void setName(String empname){
            this.Name = empname;
        }
            public String getName(){
                return this.Name;
            }
        
        public void setClassifications(char classify){
            this.Classification = classify;
        }    
            public char getClassifications(){
                return this.getClassifications();
            }
        
        //public void setFixedSalary(float salary){
        //    this.FixedSalary = salary;
        //}    
            public float getFixedSalary(){
                return this.FixedSalary;
            }
         
        public void setWeeklyGross(double weeklySales){
            this.WeeklyGross = weeklySales;
        }    
            public double getWeeklyGross(){
                return this.WeeklyGross;
            }
            
             public double getBonusRate(){
                 return this.BonusRate;
            }    
}



Output:
Enter Namme: Jon
Enter Weekly Gross: 1500

****** Snow Enterprises *****
Employee Name:		Jon
Gross Salary:		1500.00
Bonus:			127.50
Net Weekly Salary:	1500.00
Classification:		D

//if the Weekly Gross is above 1500, there's a chance for the classification to raise up
//however if the number is below 150 for example 120 there won't be a classification to rank

Enter Namme: Ann
Enter Weekly Gross: 120

****** Snow Enterprises *****
Employee Name:		Ann
Gross Salary:		120.00
Bonus:			10.20
Net Weekly Salary:	120.00
Classification:		

//and if the Weekly Gross is 0, it will be still zero with no classification
