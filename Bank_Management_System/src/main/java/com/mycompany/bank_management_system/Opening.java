package com.mycompany.bank_management_system;

public class Opening {
    
     Opening() throws InterruptedException {
        
        String open = ">>>";
        String end = ">>>";

       
        int length1 = open.length();
        int length2 = end.length();

        
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\t\t\t>>> ");

        
        for (int i = 0; i < length1; i++) {
            System.out.print(open.charAt(i));
             try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }

       
        System.out.print("  O P E N I N G  ");

        
        for (int j = 0; j < length2; j++) {
            System.out.print(end.charAt(j));
             try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

       
        System.out.println(" >>>\n\n\t\t\t\t    99%...");
        Thread.sleep(2000);
    }

}




