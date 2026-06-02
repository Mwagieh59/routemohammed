package dayThree;

import java.util.Scanner;

public class conditionalStatement {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("enter a number");
        int num = scanner.nextInt();
        if (num == 0) {
            System.out.println("its zero");
        }
        else if (num>0){
            System.out.println("+ve num");
        }
        else{
            System.out.println("-ve num");
        }*/
        /*System.out.println("enter 1st num");
        int num1 = scanner.nextInt();
        System.out.println("enter 2nd num");
        int num2 = scanner.nextInt();
        System.out.println("enter 3rd num");
        int num3 = scanner.nextInt();
        if (num1 == num2 && num1 == num3){
            System.out.println("not allowed");
        }
        else if (num1 > num2 && num1 > num2) {
            System.out.println("the greatest num " + num1 + " is number 1");
        }
        else if (num2 > num3 && num2 > num1) {
            System.out.println("the greatest num " + num2 + " is number 2");
        }
        else {
            System.out.println("the greatest num " + num3 + " is number 3");
        }*/

        /*System.out.println("enter day number");
        int num = scanner.nextInt();
        if (num == 1){
            System.out.println("sunday");
        } else if (num == 2 ) {
            System.out.println("Monday");
        } else if (num == 3 ) {
            System.out.println("tuesday");
        } else if (num == 4) {
            System.out.println("wednesday");
        }
        else {
            System.out.println("not allowed please enter from 1 to 4");
        }*/
        System.out.println("enter a dayName");
        String dayname = scanner.next();
        switch (dayname)
        {
            case "sunday":
                System.out.println(1);
                break;
            case "monday":
                System.out.println(2);
                break;
            case "tuesday":
            System.out.println(3);
            break;
            case "wednsday":
            System.out.println(4);
            break;
            case "thurusday":
            System.out.println(5);
            break;
            case "friday":
                System.out.println(6);
                break;
            case "saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("invalid dayname");
        }




    }
}
