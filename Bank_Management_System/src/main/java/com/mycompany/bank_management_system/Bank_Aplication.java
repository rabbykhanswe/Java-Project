package com.mycompany.bank_management_system;

public class Bank_Aplication {
    
    static float balance;
    
    
    public static void ClearScreen()
    {
        for(int i = 0; i < 70; i++)
        {
            System.out.println();
        }
    }
    
    
    float check_balance()
    {
        return balance;
    }
    
    
    
    void deposit(float amount)
    {
        if(amount != 0)
        {
            balance = balance + amount;
            System.out.println("\n\nSuccessfully Deposite...");
        }
    }
    
    
    
    void withdraw(float amount)
    {
        if(balance < amount)
        {
            System.out.println("\n\nInsufficient Balance...");
        }
             
        else if(amount != 0)
        {
            balance = balance - amount;
            System.out.println("\n\nWithdraw Successful...");
        }
    }
    
    void loading() throws InterruptedException
    {
        String []st = {".",".",".",".","."};
                        for(int i = 0; i < st.length; i++)
                        {
                            System.out.printf("%s",st[i]);
                            Thread.sleep(1000);
                        }
    }
    
    
    
    
}
