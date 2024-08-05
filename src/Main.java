//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //Variables
        String name = "Muskan";
        String name2 = name;
        name = "Ankit";
        System.out.println(name2);          //Muskan
        System.out.println(name);           //Ankit
        System.out.println(name.charAt(3));
        System.out.println(name2.length());
        System.out.println(name.substring(0,4));

        //Arrays
        int[] arr = new int[5];
        arr[0] = 34;
        arr[1] = 2;
        arr[2] = 45;
        arr[3] = 43;
        arr[4] = 6;

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        for (int j : arr) System.out.println(j);

        //2D array
        int[][] arr2 = {{1,2,3} , {4,5,6}};
        System.out.println(arr2[1][2]);

        //Casting
        int num1 = 34;
        double num2 = 3.4 + num1;         // 37.4
        System.out.println(num2);         // double + int can be stored in double
        int num3 = 3;
        //int num4 = 4.5 + num3;         //error
        int num4 = (int)4.5 + num3 ;
        System.out.println(num4);        // 7


        //final keyword --> constant
        final double PI = 3.17;

        System.out.println(Math.max(5,6));
        System.out.println(Math.random());      //returns number between 0.0 to 1.0
        System.out.println((int)(Math.random() * 100));


        //How to take input?
        Scanner sc = new Scanner(System.in);

        System.out.println("Input your age : ");
        int age = sc.nextInt();
        System.out.println(age);

        System.out.println("Input your marks : ");
        float marks = sc.nextFloat();
        System.out.println(marks);

        System.out.println("Input your name : ");
        String str = sc.next();
        System.out.println(str);

        System.out.println("Input your line : ");
        String line = sc.nextLine();    //to input a line , strings with space
        System.out.println(line);

        //Exception handling (try catch)
        int[] ages = {43, 45, 21};
        try {
            System.out.println(ages[4]);
        } catch (Exception ex) {
            System.out.println("Exception Handling");
        }
        System.out.println("Line after try catch block");
    }
}