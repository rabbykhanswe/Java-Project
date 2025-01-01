package com.mycompany.bank_management_system;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Log_In {
    String Email, Password;

    Log_In() throws IOException, InterruptedException, SQLException {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your E-mail         : ");
        Email = input.nextLine();

        System.out.print("Enter Your Password       : ");
        Password = input.nextLine();

       
        String filePath = "D:/SWE Project/Java/Bank_Management_System/Directory/Users.txt";
        boolean isAuthenticated = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] credentials = line.split(" ");
                if (credentials.length == 2) {
                    String storedEmail = credentials[0];
                    String storedPassword = credentials[1];

                    if (storedEmail.equals(Email) && storedPassword.equals(Password)) {
                        isAuthenticated = true;
                        break;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading user data: " + e.getMessage());
        }

        if (isAuthenticated) {
            System.out.println("\n\n\t\t\t----- Successfully Logged In -----");
            Thread.sleep(2000);
            new Home_Page(); 
        } else {
            System.out.println("\n\n\t\t\t===== Invalid Log In Credential =====");
            System.out.println("\n\n\nPress any key to Try Again...");
            System.in.read();
            Bank_Aplication.ClearScreen();
            new Log_In(); 
        }
    }
}
