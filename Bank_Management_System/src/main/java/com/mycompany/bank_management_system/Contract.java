package com.mycompany.bank_management_system;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
public class Contract {
    
    Scanner input = new Scanner(System.in);
    
    Contract() throws IOException, InterruptedException, SQLException
    {
    
        int contact, choice2;
                System.out.println("1. Contract With Bank Manager");
                System.out.println("2. Police Help Line");
                System.out.println("3. Go to Previous Menu");
                
                System.out.print("\n\nEnter Your Choice : ");
                choice2 = input.nextInt();
                
                
                switch (choice2)
                {
                    case 1:
                    {
                        Bank_Aplication.ClearScreen();
                        System.out.println("\t\t\t\t\t< < < Bank Manageer Information > > >\n\n\n\n");
                        System.out.println("Name            : Md. Rabby Khan");
                        System.out.println("Phone           : +880 1611-135313");
                        System.out.println("E-mail          : rabbykhanswe@gmail.com");
                        System.out.println("Meet Shedule    : 2:30 PM - 4:00 PM");
                        System.out.println("Branch Address  : Nabinagar, Ashuliya, Savar, Dhaka");
                        System.out.println("\n\n\t\t\t\t\t  < < < Have A Good Day > > >\n\n\n\n");
                        System.out.println("\n\n\nPress any key to Home Page...");
                        System.in.read();
                        Home_Page hp = new Home_Page();
                        break;
                    }
                    
                    case 2:
                    {
                        Bank_Aplication.ClearScreen();
                        System.out.println("\t\t\t\t\t< < < Police Help Line > > >\n\n\n\n");
                        System.out.println("Redirecting to Emergency Police Call on '999'.....");
                        Thread.sleep(3000);
                        System.out.print("\n\nRinging");
                        Bank_Aplication BA = new Bank_Aplication();
                        BA.loading();
                        System.out.println("Wait for Call Recieved.");
                        
                        Thread.sleep(3000);
                        System.out.println("\n\nIf You want to cancel Police Call Press any key");
                        System.in.read();
                        System.out.println("\n\nCanceled Call");
                        System.out.println("\n\n\nPress any key to Home Page...");
                        System.in.read();
                        Home_Page hp = new Home_Page();
                        break;
                    }
                    
                    case 3:
                    {
                        Bank_Aplication.ClearScreen();
                        Home_Page hp = new Home_Page();
                    }
                    
                    default :
                    {
                        Bank_Aplication.ClearScreen();
                        System.out.println("\n\nInvalid option...");
                        Thread.sleep(3000);
                        Contract c = new Contract();
                    }
                }
    }            
}
