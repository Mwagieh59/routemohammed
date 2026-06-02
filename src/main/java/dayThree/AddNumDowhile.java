package dayThree;

import java.util.Scanner;

public class AddNumDowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag;

        do{
            System.out.println("enter 1st number");
            double num1 = sc.nextDouble();
            System.out.println("enter 2nd number");
            double num2 = sc.nextDouble();

            double sum = num1 + num2;
            System.out.println("the sum is " + sum);

            System.out.println("would you like to add another number");
            flag = sc.nextBoolean();

            if(flag == false){
                System.out.println("thank you for using this program");
            }

        }
        while (flag);
    }
}
