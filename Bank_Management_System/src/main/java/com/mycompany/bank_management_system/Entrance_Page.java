package com.mycompany.bank_management_system;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Entrance_Page {
    
    Entrance_Page() throws IOException, InterruptedException, SQLException
    {
        int choice;
        
        //Home Page 1 Menu2
        
        Bank_Aplication.ClearScreen();
        System.out.println("1. Crteate a Bank Account");
        System.out.println("2. Log In");
        System.out.println("3. Exit");
        
        Scanner input_choice = new Scanner(System.in);
        System.out.print("\n\nEnter Your Choice : ");
        choice = input_choice.nextInt();
        
        switch(choice)
        {
            case 1:
                {
                    Bank_Aplication.ClearScreen();
                
                    Register R = new Register();

                
                
                    System.out.println("\n\n\nPress any key to Home Page...");
                    System.in.read();
                    new Entrance_Page();
                
                    break;
                }
            
            case 2:
                {
                    Bank_Aplication.ClearScreen();
                
                
                    // after log in
                    new Log_In();
               
                    break;
                }
            
            case 3:
                {
                    Bank_Aplication.ClearScreen();
                    System.exit(0);
                    break;
                }
    
        }
    }
}
