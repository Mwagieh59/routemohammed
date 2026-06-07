package dayfour;

public class Main {
    //
    /*/*public static */void main(String[] args) {
        /*Sum s = new Sum();
        s.sum2num(10,20);
        hamada();*/
        rectangle rectangle = new rectangle();  // now im calling method from class
        // i have a cope of rectangle class that had a rectangle method so i have the ability to view what insid this class
        double x = rectangle.calcArea();
    }
    public static void hamada(){
        System.out.println("hello hamada");
    }
    public void num(int a,int b){
        int sum = a+b;
        System.out.println("the sum of " + a + " and " + b + " is " + sum);
    }
}
