package dayTwo;

public class operators {
    static void main(String[] args) {
        /*int x = 10;
        int y = 20;
        System.out.println(x == y);
        System.out.println(x=y);
        System.out.println("x = " + x );
        System.out.println(x == y);


        double a = 15.0;
        int b = 15;
        System.out.println( a == b );//true
        System.out.println(a!=b);//false*/


        /*int a = 25;
        System.out.println( a );
        int b = 25 ;
        System.out.println( a+b );
        a = a+5;
        System.out.println(a);
        a += 5;
        System.out.println(a);
        a = a -5;
        a -= 5;
        System.out.println(a);
        a = a*5;
        a *= 5;
        System.out.println(a);
        a = a/5;
        a/= 5;
        System.out.println(a);
        System.out.printf("the dev of a/5 = " + a );*/

        //relational operators
        /*int a = 7;
        int b = 5;
        int c = 7;
        int d = 7;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //logical operators  unary&binary
        boolean v1 = true;
        boolean v2 = true;

        System.out.println(v1&&v2);
        System.out.println(v1||v2);

        System.out.println(a > b && b < c);//T
        System.out.println(a > b && b > c);//F
        System.out.println(a < b || d > a);//F
        System.out.println(a <= b || d >= c);//T



        int adabi = 20;
        int elmi = 15;
        boolean tamioz = true;


        //لو جاب في الادبي اكتر من العلمي بس معاه تميز يدخل علمي
        if( adabi > elmi || tamioz){
            System.out.println("ادخل علمي");
        }else {
            System.out.println("ادخل ادبي");
        }
        //increment && decrement operators
        int num = 10;
        System.out.println(num++);//post
        System.out.println(num);//11


        System.out.println(++num);//pre

        int numb = 5;
        System.out.println(num);
        System.out.println(--num);
        System.out.println(num++);
        System.out.println(num);*/


        //ternary operator
        int a = 18 , b = 10 , c ;
        c = ( a > b ) ? a : b ;   // لو a اكبر استخدمها والعكس
        System.out.println(" the largest value is " +c );

        if (a > b)
            c = a;
        else
            c = b;










    }
}
