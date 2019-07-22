package com.company;

import com.company.fireDepartment.WorkFireDepartment;
import com.company.server.RequestGenerator;

import java.util.Scanner;

public class AppRunner {
    static final int START_WORK_FIRE_DEPARTMENT = 1;
    static final int START_WORK_SERVER = 2;
    static final int EXIT = 3;


    public static void run() {
        System.out.println("Write 1, if you want check how work fire department ");
        System.out.println("Write 2, if you want check how work server ");
        System.out.println("Write 3, if you want exit");


        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        while (input != EXIT) {
            switch (input) {
                case START_WORK_FIRE_DEPARTMENT:
                    WorkFireDepartment.run();
                    break;
                case START_WORK_SERVER:
                    RequestGenerator requestGenerator = new RequestGenerator();
                    requestGenerator.generateRequest();
                    break;
                default:
                    System.out.println("Dude, this is error case");
                    break;
            }
            input = scan.nextInt();
        }
    }
}
