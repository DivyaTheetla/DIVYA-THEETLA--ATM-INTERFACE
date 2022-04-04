package mypackage;

public class ATM {
    private double balance=5000;
    private double depositAmount;
    private double withdrawAmount;
    private double transferAmount;
    
    

    
   // public ATM(){

    //}

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
 public void  setTransferAmount(){
    	this.transferAmount = transferAmount;
    }
    public double getTransferAmount(){
    	return transferAmount;
    	
    }
    	
    }

