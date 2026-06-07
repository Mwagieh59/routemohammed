package dayfour;

import java.util.Scanner;

public class letterSearch {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        boolean letterFound = false;

        for (int i = 0; i < fullName.length(); i++) {
            char searchl = fullName.charAt(i);
            if (searchl == 'A' || searchl == 'a') {
                letterFound = true;
                break;
            }

        }
        if(letterFound  ){
            System.out.println("your name " + fullName +" contain A or a");
        }
        else{
            System.out.println("your name " + fullName +" Doesnt contain A or a");
        }
        
    }
}
