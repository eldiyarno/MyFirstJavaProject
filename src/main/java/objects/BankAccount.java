package objects;

public class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;
    double dailyWithdrawLimit = 5000;

    public void deposit(double amount){
        balance = balance+amount;

    }
    public boolean withdraw(double amount){

        if(balance<0){
            System.out.println("The balance is insufficient!");
            return false;
        }if (amount>0&& amount<=balance&&amount<=dailyWithdrawLimit&&dailyWithdrawLimit+amount<=dailyWithdrawLimit){
            System.out.println("Transaction is approved.Withdrawing:"+amount+"s");
            balance -=amount;
            dailyWithdrawLimit +=amount;
            return true;
        }if (amount<balance){
            System.out.println("Withdrawal money should not exceed 5000$");
            return false;
        }
        System.out.println("The balance is sufficient!");
        return true;
    }
    public void setAccountNumber(String accountNumber){
        boolean isValidAccountNumber = true;
        if(accountNumber.length()==8){
            for (int i=0; i<8; i++){
                if(!Character.isDigit(accountNumber.charAt(i))){
                    System.out.println("WARNING: The account number must only contain digits.");
                    isValidAccountNumber = false;
                    break;
                }else {
                    System.out.println("WARNING: The length of account number must be 8 digits");
                    isValidAccountNumber = false;
                }
                if (isValidAccountNumber){
                    System.out.println("Success, account number is valid");
                   this.accountNumber=accountNumber;
                }else {
                    System.out.println("Failure: The provided account number is not valid");
                }
            }
        }
    }
    public String getAccountNumber(){
        System.out.println("Account number: "+accountNumber);
        return accountNumber;
    }
    public void setAccountHolderName(String accountHolderName){
        boolean isValidAccountHolderName = true;
        if (accountHolderName.equals(null)||accountHolderName.isEmpty()||accountHolderName.trim().length()==0|| accountHolderName.length()>256){
            isValidAccountHolderName = false;
        }if (isValidAccountHolderName){
            System.out.println("Success: Account holder name is valid");
            this.accountHolderName = accountHolderName;
        }

    }
    public String getAccountHolderName(){
        return getAccountHolderName();
    }
    public double getBalance(){
        return balance;
    }
    public void String(){
        String str = "Account holder's name: "+
                accountHolderName+"\n"+"Account number: "+
                accountNumber+"\n"+"Current balance: "+
                balance+"\n"+"Today withdrawed: "+dailyWithdrawLimit+"$";
        System.out.println();
    }
}
