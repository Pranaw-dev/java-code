                        // JAVA IF ELSE AGE CRITERIA

//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the age = ");
//        int age = scanner.nextInt();
//
//        if(age>18){
//            System.out.println("\nYour age criteria falls under 'Adult'");
//        }
//        else {
//            System.out.println("\nYour age criteria falls under 'Not and Adult'");
//        }
//    }
//}

                        // JAVA IF , ELSE(IF, ELSE)

//import java.util.*;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("The first digit a is = ");
//        int a = scanner.nextInt();
//
//        System.out.print("The second digit b is = ");
//        int b = scanner.nextInt();
//
//        if(a==b){
//            System.out.println("The inputs a == b");
//        }
//        else{
//            if(a>b){
//                System.out.println("The input a > b");
//            }
//            else{
//                System.out.println("The input a < b");
//            }
//        }
//    }
//}

                            // JAVA PROBLEM SOLVING IF ELSE STATEMENT

//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("The first digit input is = ");
//        int a = scanner.nextInt();
//        System.out.print("The second digit input is = ");
//        int b = scanner.nextInt();
//
//        if(a ==b ){
//            System.out.println("the digit a = b");
//        }
//        else if(a > b ){
//            System.out.println("the digit a > b");
//        }
//        else{
//            System.out.println("the digit a < b");
//        }
//    }
//}

                            //                  usage button in java ----------

//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your preference : \n" + "1. hello\n" + "2. namaste\n" + "3. bonjour\n");
//
//        int button = scanner.nextInt();
//
//        switch (button){
//            case(1):
//                System.out.println("hello");
//                break;
//            case(2):
//                System.out.println("namaste");
//                break;
//            case(3):
//                System.out.println("bonjour");
//                break;
//            default:
//                System.out.println("invalid input");
//        }
//    }
//}



//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("the first number is : ");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int d = scanner.nextInt();
//        int e = scanner.nextInt();
//        int f = scanner.nextInt();
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(f);
//
//    }
//}

//import java.util.*;
//public class Main{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("enter the digit , 3 or 24 : ");   o/p's here are , 1st 3 and 2nd 24. ->>>>>> correct o/p
//        int a = scanner.nextInt();
//
//        if (a % 2 != 0) {
//            System.out.println("Weird");
//        } else if (a >= 2 && a <= 5) {
//            System.out.println("Not Weird");
//        } else if (a >= 6 && a <= 20) {
//            System.out.println("Weird");
//        } else if (a % 2 == 0) {
//            System.out.println("Not Weird");
//        } else {
//            System.out.println("input is wrong");
//        }
//    }
//}

//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("enter an integer : ");
//        int myInt = scanner.nextInt();
//
//        System.out.print("enter a float no, but double integer based : ");
//        double myDouble = scanner.nextDouble();
//        scanner.nextLine();
//
//        System.out.println("\n");
//
//        System.out.print("enter any string : ");
//        String myString = scanner.nextLine();
//
//        scanner.close();
//
//        System.out.println("String: " + myString);
//        System.out.println(myString);
//
//        System.out.println("Double: " + myDouble);
//        System.out.println(myDouble);
//
//        System.out.println("Int: " + myInt);
//        System.out.println(myInt);
//    }
//}

                                    // java
                                    // 100 ----------- i/p like this

//import java.util.*;
//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("your entered string 1 is : ");
//        String str = scanner.nextLine();
//        int s = str.length();
//        System.out.println("the length of your string is : "+s);
//        System.out.print("enter the number 1 : ");
//        int num = scanner.nextInt();
//        String numStr = Integer.toString(num);
//
////        ================================
//
//        scanner.nextLine();
//        System.out.print("your entered string 2 is : ");
//        String str1 = scanner.nextLine();
////        System.out.print("enter the string 2 : ");
//        int s1 = str1.length();
//        System.out.println("the length of your string is : "+s1);
//        System.out.print("enter the number 2 : ");
//        int num1 = scanner.nextInt();
//        String numStr1 = Integer.toString(num1);
//
////        =================================
//
//        scanner.nextLine();
//        System.out.print("your entered string 3 is : ");
//        String str2 = scanner.nextLine();
////        System.out.print("enter the string 3 : ");
//        int s2 = str2.length();
//        System.out.println("the length of your string is : "+s2);
//        System.out.print("enter the number 3 : ");
//        int num2 = scanner.nextInt();
//        String numStr2 = Integer.toString(num2);
//
////        =================================
//
//
//        System.out.println("================================");
//
////            for(z=0; z<=11; z++)
////            while(z<=15)
//            {
//                if (numStr.length() == 3) {
//                    System.out.println(str + " ".repeat(15-s) + num);
//                } else if (numStr.length() == 2) {
//                    System.out.println(str + " ".repeat(15-s) + "0" + num);
//                }
//            }
//
//            {
//                if (numStr1.length() == 3) {
//                    System.out.println(str1 + " ".repeat(15-s1) + num1);
//                } else if (numStr1.length() == 2) {
//                    System.out.println(str1 + " ".repeat(15-s1) + "0" + num1);
//                }
//            }
//
//            {
//                if (numStr2.length() == 3) {
//                    System.out.println(str2 + " ".repeat(15-s2) + num2);
//                } else if (numStr2.length() == 2) {
//                    System.out.println(str2 + " ".repeat(15-s2) + "0" + num2);
//                }
//            }
//
//        System.out.println("================================");
//    }
//}


//                                          print table code -----

//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("enter the number : ");
//        int num = scanner.nextInt();
//        if(num>=2 && num<=20){
//            for(int i=1; i<11 ;i++){
//                System.out.println(num+" x "+i+" = "+num*i);
//            }
//        }
//        else{
//            System.out.println("the digit entered is beyond or not in the limit");
//        }
//    }
//}

                        //                  print pattern code ---

//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("enter the design which u want to print , like * = ");
//        String design = scanner.nextLine();
//        System.out.print("enter the number of time you want to print the design = ");
//        int num = scanner.nextInt();
//
//            for(int i = 0; i <= num; i++){
//                System.out.println((design.repeat(i)));
//            }
//    }
//}

//                              to print a pattern where we take rows and columns input by user ------

//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("enter number of rows u wanna print = ");
//        int rows = scanner.nextInt();
//        System.out.print("enter number of columns u wanna print = ");
//        int columns = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("enter the symbol u wanna print = ");
//        String symbol = scanner.nextLine();
//
//        for(int i=1; i<=rows; i++){
//            for (int j=1; j<=columns; j++){
//                if(i==1 || j==1 || rows==i || columns==j){
//                    System.out.print(symbol);
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

import java.util.*;
public class Main{
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("enter the number of rows u wanna print = ");
            int rows = scanner.nextInt();

                for(int i=rows ; i>=1 ; i--){
                    for(int j=1 ; j<=i ; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }

                for(int k=1 ; k<=rows ; k++){
                    for(int l=1 ; l<=k ; l++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
        }


    }
}