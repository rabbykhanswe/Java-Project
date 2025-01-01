package com.mycompany.bank_management_system;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Home_Page 
{
    
    int choice1;
    float damount,wamount;
    int account_number;
    String args[];
   
    //throws IOException(For System.in.read()) and throws InterruptedException(For Thread.sleep(3000))
    Home_Page() throws IOException, InterruptedException, SQLException
    {
        
        //Home Page 2 Menu
        Bank_Aplication.ClearScreen();
        System.out.println("1. Check Balance");
        System.out.println("2. Deposite Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Emergency Contract");
        System.out.println("5. Log Out");
        
        Scanner input = new Scanner(System.in);
        Bank_Aplication AP = new Bank_Aplication();
        
        System.out.print("\n\nEnter Your Choice : ");
        choice1 = input.nextInt();
        
        switch(choice1)
        {
            case 1:
            {
                Bank_Aplication.ClearScreen();
                System.out.println("Your Balance is : "+AP.check_balance()+" Tk");
                System.out.println("\n\n\nPress any key to Home Page...");
                System.in.read();
                Home_Page hp = new Home_Page();
            }
            
            case 2:
            {
                Bank_Aplication.ClearScreen();
                System.out.print("Enter Your Deposite Amount : ");
                damount = input.nextFloat();
                AP.deposit(damount);
                
                System.out.println("\n\n\nPress any key to Home Page...");
                System.in.read();
                Home_Page hp = new Home_Page();
                break;
            }
            
            case 3:
            {
                Bank_Aplication.ClearScreen();
                System.out.print("Enter Your Withdraw Amount : ");
                damount = input.nextFloat();
                AP.withdraw(damount);
                
                System.out.println("\n\n\nPress any key to Home Page...");
                System.in.read();
                Home_Page hp = new Home_Page();
                break;
            }
            
            
            case 4:
            {
                Bank_Aplication.ClearScreen();
                Contract C = new Contract();
                
            }
            
            case 5:
            {
               
                Bank_Aplication.ClearScreen();
                new Entrance_Page();
                break;
            }
            
            default :
            {
                System.out.println("\n\nInvalid option...");
                Thread.sleep(3000);
                Home_Page hp = new Home_Page();
                break;
                
            }
        
        
        
        
        
        }
        
    }
    
}


