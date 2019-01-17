package eggs;
import java.util.Scanner;

public class Eggs {

    public static void main(String[] args) {
        Scanner k = new Scanner (System.in);
        System.out.print("How many eggs are there? ");
        int eggs = k.nextInt();
        String K = computeDozen(eggs);
        System.out.print(K);
    }
    public static String computeDozen(int Green){
        int dozen = Green/12;
        int rem = Green%12;
        String egg = Green + " eggs is " + dozen + " full dozen (with " + rem + " eggs remaining)";
        return egg;
    }
}


Output:
How many eggs are there? 50
50 eggs is 4 full dozen (with 2 eggs remaining)

if the number is below 50:
How many eggs are there? 36
36 eggs is 3 full dozen (with 0 eggs remaining)
