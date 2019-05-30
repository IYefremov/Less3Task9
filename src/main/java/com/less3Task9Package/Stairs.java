//Write a program which prints the next figure to the console:
//        *
//        **
//        ***
//        ****
//        *****
//        ******
//        *******

package com.less3Task9Package;

import java.util.Scanner;

public class Stairs {

    public static void paintStars(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // вводим значения строк
        System.out.print("Input a number of lines: ");
        String str1 = in.nextLine();


        // проверяем введены ли цифры, если нет - программа прекращает работу
        try {
            Integer.parseInt(str1);

        } catch (Exception e) {
            System.out.println("Entered values is not a digit or digit is too big");
            System.exit(0);
        }
        int line = Integer.parseInt(str1);

        if (line < 1 ) {
            System.out.println("Entered values must be more then 0");
            System.exit(0);
        }

        paintStars(line);

    }

}

