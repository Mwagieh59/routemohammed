package dayfour;

import java.util.Scanner;

public class rectangle {
        Scanner input = new Scanner(System.in);
        public double length;
        public double width;


        public double calcArea(){
            System.out.println("Please enter the length " );
            double length = input.nextDouble();
            System.out.println("Please enter the width ");
            double width = input.nextDouble();
            double area = length * width;
            System.out.println("The area of the rectangle is " + area);
            return area; //its function to store value of the area
        }
}
