package mypackage;

import java.util.Date;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
    	Date d=new Date();
        AtmOperationinter op=new AtmOperation();
        
        Scanner s=new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !!!");
        System.out.println("Insert your card...");
       
    	
    
       System.out.println("Enter your atm pin:");
       int atmnumber =s.nextInt();
       
        if((atmnumber==1111 || atmnumber==2222 || atmnumber==3333 || atmnumber ==4444)){
            while(true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Transfer\n6.Exit");
                System.out.println("Enter Choice : ");
                int ch=s.nextInt();
                if(ch==1){
                    op.viewBalance();
                    d.getDate();
                }
                else if(ch==2){
                    System.out.println("Enter amount to withdraw ");
                    double withdrawAmount=s.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                }
                else if(ch==3){
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount=s.nextDouble();
                    op.depositAmount(depositAmount);


                }
                else if(ch==4){
                    op.viewMiniStatement();

                }
                else if(ch==5){
                	
                	System.out.println("Enter the A/C Number:");
                	long accno=s.nextLong();
                	
                	System.out.println("Enter the Amount you want to transfer");
                	Double transferAmount=s.nextDouble();
                	/*if(amount>=20000 ){
                		System.err.println("DAILY LIMIT EXCEEDED");
                		
                	}
                	System.out.println(amount+ "Amount Transfer Successfully");*/
                	op.transferAmount(transferAmount);
                	
                }
               
                
                else if(ch==6){
                	  System.out.println("Collect your ATM Card Thank you for using ATM Machine!!");
                      System.exit(0);
                	
                }
               
                else
                {
                    System.out.println("Please enter correct choice");
                }
                
            }
        }
        
       else{
            System.out.println("Incorrect Pin Number");
            System.exit(0);
        }


    }
   
}

