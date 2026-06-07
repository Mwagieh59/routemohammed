package dayfour;

public class Main {
    //
    /*/*public static */void main(String[] args) {
        /*Sum s = new Sum();
        s.sum2num(10,20);
        hamada();*/
        /*rectangle rectangle = new rectangle();  // now im calling method from class
        // i have a cope of rectangle class that had a rectangle method so i have the ability to view what insid this class
        double x = rectangle.calcArea();*/
        rectangle   r1 = new rectangle();
        r1.setLength(10);
        r1.setWidth(20);
        double total = r1.calcArea();
        System.out.println("The area of the rectangle is: " + total);

        //لو عايز استخد ال method في نفس ال class
        rectangle r2 = new rectangle();
        r2.setLength(5000);
        r2.setWidth(20);
        double r2total =r2.calcArea();
        System.out.println("The area of the rectangle is: " + r2total);
        public double bothtotal = total + r2total;
        System.out.println("The area of both rectangle is: " + bothtotal);

    }
    public static void hamada(){
        System.out.println("hello hamada");
    }
    public void num(int a,int b){
        int sum = a+b;
        System.out.println("the sum of " + a + " and " + b + " is " + sum);
    }
}
