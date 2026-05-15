package dayOne;

public class FristJavaProgram {

    public static void main(String[] args) {
        System.out.println("hello ham");

        /*String name = "moh";

        String x = "2+2";
        System.out.println(x);

        String X = "10";
        String y = "15";
        System.out.println(X + y);

        int num1 = 1;
        int num2 = 2;
        System.out.println(num1 + num2);

        float f = 12.09f;
        System.out.println(f);

        double d = 44.55;
        double l = 55.33;

        System.out.println(d);
        System.out.println(l);*/

        String firstName = "mohammed";
        String lastName = "wagieh";

        String fullName = firstName + " " + lastName;

        String job = "swt";

        int age = 26;

        String dateOfBirth = "28/9/1999";

        double income = 30000;

        double tax = income * 0.15;
        double net = income - tax;

        System.out.println("Hello My Name is: " + fullName +
                "\nMy age is: " + age +
                "\nMy job is: " + job +
                "\nMy income after tax is: " + (income - tax) +
                "\nMy date of birth is: " + dateOfBirth);


        System.out.printf("Hello My Name is:  %s%n"
                        + "My age is: %d%n"
                        + "My job is : %s%n"
                        + "My income after tax is: %f%n",
                fullName, age, job ,  net);
    }
}
