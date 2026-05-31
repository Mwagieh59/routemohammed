package dayTwo;

import java.util.Scanner;

public class ifStatement {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your age :");
//        int age = sc.nextInt();
//        System.out.println("your age is:" + age );
//        //Scanner sc = new Scanner(System.in);
//        //System.out.println("enter name");
//        //string name = sc.nextLine();
//        //System.out.println("your name is ; " + name);
//        //ternary
////        String status = age >= 18 ? "good to vote" : "not allowed";
////        System.out.println("your status is :" + status );
//
//
//        if(age >= 18 ){
//            System.out.println("allowed");
//        }
//        else {
//            System.out.println("not allowed");
//        }
        System.out.println("verify num is even or odd");
        int num = sc.nextInt();
        if(num >= 0 ){
            if(num==0){
                System.out.println("zero not allowed");
            } else if (num % 2 == 0) {
                System.out.println("num is even");
            }
            else{
                System.out.println("num is odd");
            }
        }
        else{
            System.out.println("negative num not allowed");
        }



    }

}
