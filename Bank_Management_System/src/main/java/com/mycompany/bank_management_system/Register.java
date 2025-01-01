package com.mycompany.bank_management_system;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Formatter;
import java.util.Scanner;

public class Register 
{
    String FirstName;
    String LastName;
    String Email;
    int PhoneNumber;
    String Address;
    String Password;
    String DateOfBirth;
    long NIDNumber;
    float FirstDeposit;
    static int AccountNumber = 135313;
    float balance = 0;
    
    Scanner input = new Scanner(System.in);
    
    Register()
    {
        System.out.print("\nEnter Your First Name                : ");
        FirstName = input.nextLine();
        
        System.out.print("\nEnter Your Last Name                 : ");
        LastName = input.nextLine();
        
        System.out.print("\nEnter Your E-mail Address            : ");
        Email = input.nextLine();
        
        System.out.print("\nEnter Your Phone Number              : +88 ");
        PhoneNumber = input.nextInt();
        
        input.nextLine();
        
        System.out.print("\nEnter Your Living Address            : ");
        Address = input.nextLine();
        
        System.out.print("\nEnter Your Password                  : ");
        Password = input.nextLine();
        
        System.out.print("\nEnter Your Date of Birth (DD/MM/YY)  : ");
        DateOfBirth = input.nextLine();
        
        System.out.print("\nEnter Your NID Number                : ");
        NIDNumber = input.nextLong();
        
        System.out.print("\nEnter Your First Deposite Amount     : ");
        FirstDeposit = input.nextFloat();
        input.nextLine();
        
        
        try(FileWriter Registration = new FileWriter("D:/SWE Project/Java/Bank_Management_System/Directory/Registration.txt", true);FileWriter Users = new FileWriter("D:/SWE Project/Java/Bank_Management_System/Directory/Users.txt", true); FileWriter Account = new FileWriter("D:/SWE Project/Java/Bank_Management_System/Directory/Account.txt", true))
        {
            AccountNumber ++;
            
            Registration.write(String.format("%d %s %s %s %d %s %s %d %.2f\r\n",AccountNumber, FirstName, LastName, Email,PhoneNumber, Address, DateOfBirth, NIDNumber, FirstDeposit));
            Users.write(String.format("%s %s\r\n",Email, Password));
            
            balance = balance + FirstDeposit;
            Account.write(String.format("%d %s %d %.2f\r\n",AccountNumber, Email, NIDNumber, balance));
            
            
            System.out.println("\n\n\n<< << << Account Registration Successful >> >> >>");
        }
        catch(Exception E)
        {
            System.out.println("\n");
            System.out.println(E);
        }
        
        
       
    }
    

}






