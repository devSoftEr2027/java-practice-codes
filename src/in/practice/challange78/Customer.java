package in.practice.challange78;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount ("750595705465", " Narayan Dev");
        account.depositMoney ( 300 );
        System.out.println (account.withdrawMoney ( 200 ));
        account.depositMoney ( -40 );
        account.withdrawMoney ( 35 );
        System.out.println (account.withdrawMoney ( 70 ));
    }
}
