package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main romb = new Main();
        String b;
        int a;
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите ширину ромба: ");
        b = scn.nextLine();
        try {
            a = Integer.parseInt(b);
            romb.start(a);
        }
        catch (Exception e)
        {
            System.out.println("Некорректный символ");
        }


    }

    String star = "*";
    String space = " ";

    public void string(int x, int spaces) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(space);
        }
        for (int i = 1; i <= x; i++) {
            System.out.print(star);
        }

        System.out.println();
    }

    public void start(int x) {
        int spaces = (x-1)/2;

        for(int i = 1; i <= x; i += 2) {
            string(i, spaces);
            if(spaces != 0) spaces--;
        }
       for(int i = x-2; i >= 0; i -= 2) {
            string(i, spaces+1);
            spaces++;
        }

    }
}