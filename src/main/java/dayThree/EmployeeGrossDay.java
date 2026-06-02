package dayThree;

import java.util.Scanner;

public class EmployeeGrossDay {
    public static void main(String[] args) {
        int hourRate = 15;
        int weeklyHourRate = 40;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your weekly hour rate");
        double empworkhour = sc.nextDouble();
        while (empworkhour > weeklyHourRate || empworkhour <= 0){
            System.out.println("your weekly hour rate is out of range");
            System.out.println("enter your weekly hour rate");
            empworkhour = sc.nextDouble();
        }
        double salary = empworkhour * hourRate;
        System.out.println("your salary is: " + salary + "$");

    }
}
