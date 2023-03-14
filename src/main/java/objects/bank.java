package objects;

public class bank {
    public static void main(String[] args) {
        BankAccount client1 = new BankAccount();
        BankAccount client2 = new BankAccount();

        client1.setAccountNumber("1235445");
        client2.setAccountNumber("123455667");
       client1.setAccountHolderName("Johny Davis");
       client2.setAccountHolderName("Pony Goggins");
       client1.deposit(1500);
       client2.deposit(1100);
       client1.withdraw(500);
       client2.withdraw(400);
        System.out.println(client1.getBalance());

    }
}
