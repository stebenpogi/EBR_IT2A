package com.scc;


import dao.userDao;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static final userDao userDao = new userDao();

    public static void main(String[] args) {

        System.out.println("\n==============================");
        System.out.println(" EBIKE RECORDS MANAGEMENT");
        System.out.println("==============================");
        System.out.println("1. LogIn");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.print(" CHOOSE AN OPTION: ");
        String choice = sc.nextLine();

        switch (choice) {
            case "1":
                break;
                case "2":
                    System.out.print("Enter your username: ");
                    String username = sc.nextLine();
                    System.out.print("Enter your password: ");
                    String password = sc.nextLine();

                    System.out.println("Select Role [1] TEACHER [2] ADMIN: ");
                    int roleChoice = sc.nextInt();
                    String role;
                    switch (roleChoice) {
                        case 1:
                            role = "USER";
                            break;
                            case 2:
                                role = "ADMIN";
                                break;
                                default:
                                    role = null;

                    }

                    if(role != null) {
                        userDao.registerUser(username, password, role);

                    }else  {

                            System.out.println("Invalid Input");
                    }
                    break;
        }

    }
}
