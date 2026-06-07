package dayfour;

import java.util.Scanner;

public class rectangle {
        Scanner input = new Scanner(System.in);
        private double length;
        private double width;

        public void setLength(double length) {
            if (length > 0)
                this.length = length;
            else
                System.out.println("the length is -ve");
        }
        public double getlength() {
            return length;
        }
        public void setWidth(double width) {
            if (width > 0)
                this.width = width;
            else
                System.out.println("the width is -ve");
        }
        public double getwidth() {
            return length;
        }
        public double calcArea () {
            return length * width;
            //return getlength() * getwidth();
        }



        /*public double calcArea(){
            System.out.println("Please enter the length " );
            double length = input.nextDouble();
            System.out.println("Please enter the width ");
            double width = input.nextDouble();
            double area = length * width;
            System.out.println("The area of the rectangle is " + area);
            return area; //its function to store value of the area*/

}
