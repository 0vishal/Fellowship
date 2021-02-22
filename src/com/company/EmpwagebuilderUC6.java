package com.company;

import java.util.Scanner;

public class EmpwagebuilderUC6 {

    public static void main(String args[]) {
        int EMPWAGEPERHOUR = 20;
        int EMPTIME = 8;
        int WAGE = 0, i = 0;

        while(i<100) {
            WAGE = (EMPTIME * EMPWAGEPERHOUR);
            i = i + EMPTIME;
        }

        System.out.println(WAGE);
    }
}
