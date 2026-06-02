package dayThree;

public class breakAndContinue {

    public static void main(String[] args) {

        // break example
        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                break;

            System.out.println(i);
        }

        System.out.println("----------------------------------------------");

        // continue example (ascending)
        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                continue;

            System.out.println(i);
        }

        System.out.println("----------------------------------------------");

        // continue example (descending)
        for (int i = 10; i > 0; i--) {
            if (i == 5)
                continue;

            System.out.println(i);
        }

        System.out.println("----------------------------------------------");

        // break example (descending)
        for (int i = 10; i > 0; i--) {
            if (i == 5)
                break;

            System.out.println(i);
        }
    }
}