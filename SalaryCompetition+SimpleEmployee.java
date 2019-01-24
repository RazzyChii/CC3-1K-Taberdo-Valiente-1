package salarycompetition;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SalaryCompetition {
    
    public static double percent = 0.005;
    public static double salary = 1500;
    public static double bonus = 0;
    public static double netweekly = 0;
    
    public static void main(String[] args) {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner br = new Scanner(System.in);
        //DecimalFormat df2 = new DecimalFormat("#.00");
        
        SimpleEmployee se1 = new SimpleEmployee();
        SimpleEmployee se2 = new SimpleEmployee();
        
        se1.setName("Jon");
        se1.setWeeklyGross(1500);
        
        se2.setName("Ann");
        se2.setWeeklyGross(1500); 
        
        System.out.print("Enter Name: ");
        String name = br.nextLine();
        while(name.isEmpty()){
            System.out.println("Please Enter Employee Name: "); //repeats 
            name = br.nextLine();
        }
        System.out.print("Enter Weekly Gross: ");
        double gross = br.nextDouble();
        bonus = gross * percent;
        DecimalFormat df = new DecimalFormat("######0.00");
        if (salary<1500){
            System.out.println("Please Enter a salary above 1500:");  //repeats
             gross = br.nextDouble();
        }else{
            System.out.println("Name: \t\t" + name);
            System.out.println("Weekly Gross: \t\t" + df.format(gross));
        
        System.out.println("\n****** Snow Enterprises *****");
        System.out.println("Employee Name:\t\t" + name);
        System.out.println("Gross Salary:\t\t" + df.format(gross));
        System.out.println("Bonus:\t\t\t" + df.format(bonus));
        netweekly();
        classify();
        }
    }
    public static void netweekly(){
        DecimalFormat df = new DecimalFormat("######0.00"); //its important to copy and paste that to avoid Errors
        netweekly = bonus + 1500;
        System.out.println("Net Weekly Salary:\t" + df.format(netweekly));
    }
    public static void classify(){
            if(netweekly>1500 && netweekly<1999){
                System.out.println("Classification:\t\t A");
            }else if(netweekly>2000 && netweekly<2499){
                System.out.println("Classification:\t\t B");
            }else if(netweekly>2500 && netweekly<2999){
                System.out.println("Classification:\t\t C");
            }else if(netweekly>3000 && netweekly<3499){
                System.out.println("Classification:\t\t D");
            }else if(netweekly>3500 && netweekly<3999){
                System.out.println("Classification:\t\t E");
            }else if(netweekly>4000){
                System.out.println("Classification:\t\t F");
            }
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
        
        public void setFixedSalary(float salary){
            this.FixedSalary = salary;
        }    
            public float getFixedSalary(){
                return this.FixedSalary;
            }
         
        public void setWeeklyGross(double weeklySales){
            this.WeeklyGross = weeklySales;
        }    
            public double getWeeklyGross(){
                return this.WeeklyGross;
            }
        
        public void setBonusRate(double bonus){
            this.BonusRate = bonus;
        }
             public double getBonusRate(){
                 return this.BonusRate;
            }    
}


Output:
Enter Name: Jon
Enter Weekly Gross: 1500
Name: 		Jon
Weekly Gross: 		1500.00

****** Snow Enterprises *****
Employee Name:		Jon
Gross Salary:		1500.00
Bonus:			    7.50
Net Weekly Salary:	1507.50
Classification:		 A
