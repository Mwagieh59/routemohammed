package dayfour;

import java.util.Scanner;

public class StudentAverageScore {
    static void main() {
        int stNumber = 2;
        int stcourse = 4;
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= stNumber; i++){
            int total = 0;

            for(int j = 1; j <= stcourse; j++){
                System.out.println("enter score for course  " + j + "for student "+ i);
                double score = sc.nextDouble();
                total += score;
            }
            double average = total / stcourse;
            System.out.println("the average of st " + i + " is" + average);
        }

    }
}
